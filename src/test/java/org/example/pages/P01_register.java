package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class P01_register {

    By registerBtnField = By.cssSelector("a[href=\"/register?returnUrl=%2F\"]");
    By maleRadioElement = By.id("gender-male");
    By femaleRadioElement = By.id("gender-female");
    By firstnameField = By.id("FirstName");
    By lastnameField = By.id("LastName");
    By dateOfBirthDayField = By.cssSelector("select[name=\"DateOfBirthDay\"]");
    By dateOfBirthMonthField = By.cssSelector("select[name=\"DateOfBirthMonth\"]");
    By dateOfBirthYearField = By.cssSelector("select[name=\"DateOfBirthYear\"]");
    By emailField = By.id("Email");
    By companyNameField = By.id("Company");
    By newsletterField = By.id("Newsletter");
    By passwordField = By.id("Password");
    By confirmPasswordField = By.id("ConfirmPassword");
    By registerButtonField = By.id("register-button");


    public WebElement registerBtn() {
       return Hooks.driver.findElement(registerBtnField);

    }

    public WebElement maleGender() {
        return Hooks.driver.findElement(maleRadioElement);

    }
    public WebElement femaleGender() {
        return Hooks.driver.findElement(femaleRadioElement);

    }
    public WebElement firstName() {
        return Hooks.driver.findElement(firstnameField);

    }
    public WebElement lastName() {
        return Hooks.driver.findElement(lastnameField);

    }

    public WebElement dateOfBirthDay() {
        return Hooks.driver.findElement(dateOfBirthDayField);

    }
    public WebElement dateOfBirthMonth() {
        return Hooks.driver.findElement(dateOfBirthMonthField);

    }

    public WebElement dateOfBirthYear() {
        return Hooks.driver.findElement(dateOfBirthYearField);

    }
    public WebElement email() {
        return Hooks.driver.findElement(emailField);

    }
    public WebElement newsLetter() {
        return Hooks.driver.findElement(newsletterField);

    }
    public WebElement password() {
        return Hooks.driver.findElement(passwordField);

    }
    public WebElement confirmPassword() {
        return Hooks.driver.findElement(confirmPasswordField);

    }
    public WebElement registerButton() {
        return Hooks.driver.findElement(registerButtonField);

    }

}