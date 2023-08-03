package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P03_homePage {
    By searchField = By.cssSelector("input[class=\"search-box-text ui-autocomplete-input\"]");
    By searchButtonField = By.cssSelector("button[class=\"button-1 search-box-button\"]");
    By facebookBtnField = By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]");
    By twitterBtnField = By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]");
    By newsBtnField = By.cssSelector("a[href=\"/news/rss/1\"]");
    By youtubeBtnField = By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]");


    public WebElement searchKey() {
        return Hooks.driver.findElement(searchField);

    }

    public WebElement search() {
        return Hooks.driver.findElement(searchButtonField);

    }

    public WebElement Facebook() {
        return Hooks.driver.findElement(facebookBtnField);

    }
    public WebElement Twitter() {
        return Hooks.driver.findElement(twitterBtnField);

    }

    public WebElement News() {
        return Hooks.driver.findElement(newsBtnField);

    }
    public WebElement YouTube() {
        return Hooks.driver.findElement(youtubeBtnField);

    }

}