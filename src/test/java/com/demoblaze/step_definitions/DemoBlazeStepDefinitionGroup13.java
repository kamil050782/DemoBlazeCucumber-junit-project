package com.demoblaze.step_definitions;

import com.demoblaze.pages.DemoBlazePage;
import com.demoblaze.utilities.ConfigurationReader;
import com.demoblaze.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;

public class DemoBlazeStepDefinitionGroup13 {
    DemoBlazePage demoBlazePage = new DemoBlazePage();

    @Given("Customer navigation through product categories: Phones, Laptops and Monitors")
    public void customer_navigation_through_product_categories_phones_laptops_and_monitors() {
        Driver.getDriver().get(ConfigurationReader.getProperty("demoBlaze.url"));
    }

    @When("Navigate  Laptops → Dell  and click on Add to cart. Accept pop up confirmation.")
    public void navigate_laptops_dell_and_click_on_add_to_cart_accept_pop_up_confirmation() throws InterruptedException {
        Thread.sleep(3000);
        demoBlazePage.laptops.click();
        demoBlazePage.dell.click();
        demoBlazePage.addCartBtn.click();
        Thread.sleep(3000);
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();
    }

    @When("Navigate to Phones → Sony Xperia  and click on Add to cart. Accept pop up confirmation.")
    public void navigate_to_phones_sony_xperia_and_click_on_add_to_cart_accept_pop_up_confirmation() throws InterruptedException {
        demoBlazePage.productStore.click();
        demoBlazePage.phones.click();
        demoBlazePage.sonyXperia.click();
        demoBlazePage.addCartBtn.click();
        Thread.sleep(3000);
        Alert alert1 = Driver.getDriver().switchTo().alert();
        alert1.accept();

    }

    @When("Navigate to the Monitors → Asus monitor  and click on Add to cart. Accept pop up confirmation.")
    public void navigate_to_the_monitors_asus_monitor_and_click_on_add_to_cart_accept_pop_up_confirmation() throws InterruptedException {
        demoBlazePage.productStore.click();
        demoBlazePage.monitors.click();
        demoBlazePage.asusMonitor.click();
        demoBlazePage.addCartBtn.click();
        Thread.sleep(3000);
        Alert alert2 = Driver.getDriver().switchTo().alert();
        alert2.accept();
    }

    @When("Navigate to the Cart → Delete Asus monitor  from cart.")
    public void navigate_to_the_cart_delete_asus_monitor_from_cart() {

    }

    @When("Navigate to the Cart → Delete Sony Xperia z5  from cart.")
    public void navigate_to_the_cart_delete_sony_xperia_z5_from_cart() {

    }

    @Then("Click on Place order")
    public void click_on_place_order() {

    }

    @Then("Fill in all web form fields.")
    public void fill_in_all_web_form_fields() {

    }

    @Then("Click on Purchase")
    public void click_on_purchase() {

    }

    @Then("Assert purchase amount  expected.")
    public void assert_purchase_amount_expected() {

    }

    @Then("Click Ok button")
    public void click_ok_button() {

    }

    @Then("Verify that there is no product in the cart")
    public void verify_that_there_is_no_product_in_the_cart() {

    }

}



















