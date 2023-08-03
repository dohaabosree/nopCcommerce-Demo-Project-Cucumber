package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import javax.swing.*;


public class D01_registerStepDef {

    P01_register registerPage = new P01_register();
    SoftAssert softAssert=new SoftAssert();
    JFrame fram = new JFrame();

    @Given("user go to register page")
    public void iOpenRegisterPage() {
        registerPage.registerBtn().click();


    }

    @When("user select gender type")
    public void iSelectGenderType() {
         boolean selectState = registerPage.femaleGender().isSelected();       //isDisplay() , isEnabled()
        if(!selectState) {
        registerPage.femaleGender().click();


        }
    }

    @And("user enter first name {string}")
    public void iEnterFirstName(String firstname) {
        registerPage.firstName().sendKeys(firstname);

    }

    @And("last name {string}")
    public void iEnterLastName(String lastname) {
        registerPage.lastName().sendKeys(lastname);
        JavascriptExecutor jave = (JavascriptExecutor) Hooks.driver;
        jave.executeScript("scroll(0,500)");

    }

    @And("user enter date of birth")
    public void iEnterDateOfBirth() throws InterruptedException {
        //registerPage.Day().click();
        Select dayList = new Select(registerPage.dateOfBirthDay());
        Thread.sleep(500);
        dayList.selectByVisibleText("5");
        Select monthList = new Select(registerPage.dateOfBirthMonth());
        Thread.sleep(500);
        monthList.selectByVisibleText("March");
        Select yearList = new Select(registerPage.dateOfBirthYear());
        Thread.sleep(500);
        yearList.selectByValue("1996");


    }

    @And("user enter email {string} field")
    public void iEnterEmailField(String email) {
        registerPage.email().sendKeys(email);


    }

    @And("user fills Password fields {string}")
    public void iFillsPasswordFields(String password) {
        registerPage.password().sendKeys(password);

    }

    @And("user fills ConfirmPassword fields {string}")
    public void iFillsConfirmPasswordFields(String confirmPassword) {
        registerPage.confirmPassword().sendKeys(confirmPassword);

    }

    @And("user clicks on register button")
    public void iClicksOnRegisterButton() {
        registerPage.registerButton().click();


    }

    @Then("user should see a success message")
    public void userShouldSeeASuccessMessage() {
        String uRl = Hooks.driver.getCurrentUrl();
       // https://demo.nopcommerce.com/register?returnurl=%2F
       // https://demo.nopcommerce.com/registerresult/1?returnUrl=/
        if(!uRl.equals("https://demo.nopcommerce.com/register?returnurl=%2F")) {
            String message=Hooks.driver.findElement(By.cssSelector("div[class='result']")).getText();
            softAssert.assertEquals(message, "Your registration completed");
            //softAssert.assertTrue(message.contains("Your registration completed"));
            System.out.println(Hooks.driver.getCurrentUrl());
            String RGB = Hooks.driver.findElement(By.cssSelector("div[class='result']")).getCssValue("color");
            System.out.println(RGB);
            String c = Color.fromString(RGB).asHex();
            System.out.println("Hex code for color:" + c);
           System.out.println();
        }
        else{
            System.out.println(Hooks.driver.getCurrentUrl());
            String errorMessage  = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/ul/li")).getText();
            softAssert.assertTrue(errorMessage.contains("The specified email already exists"));
            System.out.println(errorMessage);

        }
    }
}
