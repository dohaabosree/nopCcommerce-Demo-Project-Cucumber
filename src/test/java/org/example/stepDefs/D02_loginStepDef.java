package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.example.pages.P02_login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {
    P02_login loginPage = new P02_login();
    SoftAssert softAssert = new SoftAssert();

    @Given("user go to login page")
    public void iGoToLoginPage() {
        loginPage.loginBtn().click();

    }

    @When("user login with  email {string}")
    public void iEnterEmailAddress(String email) {
        loginPage.emailAddress().sendKeys(email);

    }
    @And("user login with password {string}")
    public void iEnterPassword(String password) {
        loginPage.password().sendKeys(password);

    }
    @And("user click on forget remember me")
    public void iForgetPassword(String password) {
        loginPage.forgetPassword().click();

    }
    @And("user click on forget password")
    public void iClickOnRememberMe(String password) {
        loginPage.remember().click();

    }
    @Then("user press on login button")
    public void iPressOnLoginButton() {

        loginPage.loginButton().click();
    }
     /**   String uRL =Hooks.driver.getCurrentUrl();
        if(uRL.equals(  "https://demo.nopcommerce.com/")) {
            softAssert.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/");
            System.out.println(Hooks.driver.getCurrentUrl());
            softAssert.assertTrue(loginPage.myAccount().isDisplayed());  // pass
        }
        else {
            String errorMessage = "Login was unsuccessful. " ;
            WebElement Text=Hooks.driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]"));
            String actualText = Text.getText();
            // softAssert.assertEquals(actualText,errorMessage);
            softAssert.assertTrue(actualText.contains(errorMessage));
            System.out.println(Hooks.driver.getCurrentUrl());
            String RGB= Text.getCssValue("color");
            System.out.println(RGB);
            String c = Color.fromString(RGB).asHex();
            System.out.println("Hex code for color:"+c);

        } ***/

      /**  boolean x=loginPage.myAccount().isDisplayed();
        if(!x){
            System.out.println("Pass");}
        else {
            System.out.println("Fail");
       **/


    @Then("user able to login successfully")
    public void userAbleToLoginSuccessfully() {
        softAssert.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/");
        System.out.println(Hooks.driver.getCurrentUrl());
        softAssert.assertTrue(loginPage.myAccount().isDisplayed());
        softAssert.assertAll();
    }



    @Then("user should see error message")
    public void userShouldSeeErrorMessage() {
        String errorMessage = "Login was unsuccessful. " ;
        WebElement Text=Hooks.driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]"));
        String actualText = Text.getText();
        // softAssert.assertEquals(actualText,errorMessage);
        softAssert.assertTrue(actualText.contains(errorMessage));
        System.out.println(Hooks.driver.getCurrentUrl());
        String RGB= Text.getCssValue("color");
        System.out.println(RGB);
        String c = Color.fromString(RGB).asHex();
        System.out.println("Hex code for color:"+c);
        softAssert.assertAll();
    }
}






