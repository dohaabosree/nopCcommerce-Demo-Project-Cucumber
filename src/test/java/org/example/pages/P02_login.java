package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login {

    By loginBtnField = By.cssSelector("a[href=\"/login?returnUrl=%2F\"]");
    By emailAddressField = By.cssSelector("input[class=\"email\"]");
    By loginPasswordField = By.id("Password");
    By rememberMeField = By.id("id=\"RememberMe\"");
    By forgotPasswordField = By.cssSelector("a[href=\"/passwordrecovery\"]");
    By loginButtonField = By.cssSelector("button[class=\"button-1 login-button\"]");

    By myAccountField = By.cssSelector("a[href=\"/customer/info\"]");



    public WebElement loginBtn() {
        return Hooks.driver.findElement(loginBtnField);

    }
    public WebElement emailAddress() {
        return Hooks.driver.findElement(emailAddressField);

    }
    public WebElement password() {
        return Hooks.driver.findElement(loginPasswordField);

    }
    public WebElement remember() {
        return Hooks.driver.findElement(rememberMeField);

    }
    public WebElement forgetPassword() {
        return Hooks.driver.findElement(forgotPasswordField);

    }


    public WebElement loginButton() {
        return Hooks.driver.findElement(loginButtonField);

    }
    public WebElement myAccount() {
        return Hooks.driver.findElement(myAccountField);

    }
}
