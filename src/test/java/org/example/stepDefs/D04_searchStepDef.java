package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class D04_searchStepDef {
    P03_homePage homePage = new P03_homePage();
    SoftAssert softAssert =new SoftAssert();

    @When("user Enter {string} on search field")
    public void iEnterSearchProduct( String productName) {
        homePage.searchKey().sendKeys(productName);

    }

    @When("user search with using  {string} on search field")
    public void iEnterSearchWithUsingSKU(String serialNumber) {
        homePage.searchKey().sendKeys(serialNumber);

    }

    @And("user click on search button")
    public void iClickOnSearchButton() {
        homePage.search().click();

    }


    @Then("user should see search result {string}")
    public void iShouldSeeSearchResult(String productName) {

        String URl = "https://demo.nopcommerce.com/search?q=";
        softAssert.assertTrue(Hooks.driver.getCurrentUrl().contains(URl));
        List<WebElement>  searchResult = Hooks.driver.findElements(By.cssSelector("div[class=\"item-box\"]"));
        int NumOfItems = searchResult.size();
        System.out.println(NumOfItems);
        softAssert.assertTrue(NumOfItems>0);
        for (WebElement webElement : searchResult) {
            softAssert.assertTrue(webElement.getText().contains(productName.toLowerCase()), "Search result validation failed at instance [ + i + ].");
        }
    }

    @Then("user should see search result of SKU {string}")
    public void iShouldSeeSearchResultOfSKU(String serialNum) {
        Hooks.driver.findElement(By.cssSelector("div[class=\"item-box\"]")).click();
        Assert.assertEquals(Hooks.driver.findElement(By.cssSelector("span[class='value']")).getText(),serialNum);

    }
}