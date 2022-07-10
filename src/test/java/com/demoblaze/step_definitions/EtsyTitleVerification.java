package com.demoblaze.step_definitions;

import com.demoblaze.pages.EtsyPage;
import com.demoblaze.utilities.ConfigurationReader;
import com.demoblaze.utilities.Driver;
import com.demoblaze.pages.EtsyPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EtsyTitleVerification {
    EtsyPage etsyPage=new EtsyPage();
    @Given("User is on the etsy page")
    public void userIsOnTheEtsyPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("etsy.url"));
    }

    @Then("User sees title is as expected.Expected: Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone")
    public void user_sees_title_is_as_expected_expected_etsy_shop_for_handmade_vintage_custom_and_unique_gifts_for_everyone() {
        Assert.assertEquals("Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone",Driver.getDriver().getTitle());

    }


    @When("User types Wooden Spoon in the search box")
    public void userTypesWoodenSpoonInTheSearchBox() {
        etsyPage.searchBox.sendKeys("Wooden Spoon");
    }

    @Then("User clicks search button")
    public void userClicksSearchButton() {
        etsyPage.searchBtn.click();
    }



    @And("User sees Wooden spoon - Etsy is in the title")
    public void userSeesWoodenSpoonEtsyIsInTheTitle() {
        Assert.assertEquals("Wooden spoon - Etsy",Driver.getDriver().getTitle());
    }

    @When("User types {string} in the search box")
    public void userTypesInTheSearchBox(String searchKeyWord) {
        etsyPage.searchBox.sendKeys(searchKeyWord);
    }

    @And("User sees {string} is in the title")
    public void userSeesIsInTheTitle(String expectedTitle) {
        Assert.assertEquals(expectedTitle,Driver.getDriver().getTitle());
    }
}
