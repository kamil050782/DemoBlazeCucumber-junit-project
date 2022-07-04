package com.demoblaze.step_definitions;

import com.demoblaze.pages.DemoBlazePage;
import com.demoblaze.utilities.ConfigurationReader;
import com.demoblaze.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class DemoBlazeStepDefinition {
   DemoBlazePage demoBlazePage=new DemoBlazePage();
    @Given("Customer navigation through product categories: Phones, Laptops and Monitors")
    public void customer_navigation_through_product_categories_phones_laptops_and_monitors() {
     Driver.getDriver().get(ConfigurationReader.getProperty("demoBlaze.url"));
    }
    @When("Navigate  Laptops → Sony vaio i5 and click on Add to cart. Accept pop up confirmation.")
    public void navigate_laptops_sony_vaio_i5_and_click_on_add_to_cart_accept_pop_up_confirmation() throws InterruptedException {
        Thread.sleep(3000);
        demoBlazePage.laptops.click();
        demoBlazePage.sonyVaio.click();
        demoBlazePage.addCartBtn.click();
        Thread.sleep(3000);
        Alert alert=Driver.getDriver().switchTo().alert();
        alert.accept();
    }
    @When("Navigate to Phones → Samsung galaxy s6 and click on Add to cart. Accept pop up confirmation.")
    public void navigate_to_phones_samsung_galaxy_s6_and_click_on_add_to_cart_accept_pop_up_confirmation() throws InterruptedException {
        demoBlazePage.productStore.click();
        demoBlazePage.phones.click();
        demoBlazePage.samsungGalaxy.click();
        demoBlazePage.addCartBtn.click();
        Thread.sleep(3000);
        Alert alert1=Driver.getDriver().switchTo().alert();
        alert1.accept();
    }
    @And("Navigate to the Monitors → Apple monitor  and click on Add to cart. Accept pop up confirmation.")
    public void navigateToTheMonitorsAppleMonitorAndClickOnAddToCartAcceptPopUpConfirmation() throws InterruptedException {
        demoBlazePage.productStore.click();
        demoBlazePage.monitors.click();
        demoBlazePage.appleMonitor.click();
        demoBlazePage.addCartBtn.click();
        Thread.sleep(3000);
        Alert alert2=Driver.getDriver().switchTo().alert();
        alert2.accept();
    }

    @And("Navigate to Cart → Delete Apple monitor  from cart.")
    public void navigateToCartDeleteAppleMonitorFromCart() {
        demoBlazePage.productStore.click();
        demoBlazePage.cartBtn.click();
        demoBlazePage.deleteBtn.click();
    }

    @Then("Click on Place order")
    public void click_on_place_order() throws InterruptedException {
        Thread.sleep(3000);
        demoBlazePage.placeOrderBtn.click();
    }
    @Then("Fill in all web form fields.")
    public void fill_in_all_web_form_fields() {
        Faker faker=new Faker();
        demoBlazePage.name.sendKeys(faker.name().fullName());
        demoBlazePage.country.sendKeys(faker.country().name());
        demoBlazePage.city.sendKeys(faker.address().cityName());
        demoBlazePage.card.sendKeys(faker.finance().creditCard());
        demoBlazePage.month.sendKeys(faker.numerify("11"));
        demoBlazePage.year.sendKeys(faker.numerify("2027"));
    }
    @Then("Click on Purchase")
    public void click_on_purchase() {
        demoBlazePage.purchaseBtn.click();
    }

    @Then("Assert purchase amount  expected.")
    public void assertPurchaseAmountExpected() {
        Assert.assertTrue(demoBlazePage.confirmationText.getText().contains("Amount: 1150 USD"));
    }
    @Then("Click Ok button")
    public void click_ok_button() throws InterruptedException {
        Thread.sleep(3000);
        demoBlazePage.okBtn.click();
    }

    @Then("Verify that there is no product in the cart")
    public void verify_that_there_is_no_product_in_the_cart() {
        demoBlazePage.cartBtn.click();
        Assert.assertTrue(demoBlazePage.emptyCart.getText().contentEquals(""));
    }



}
