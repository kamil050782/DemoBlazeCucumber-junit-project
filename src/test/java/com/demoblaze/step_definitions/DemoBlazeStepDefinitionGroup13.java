package com.demoblaze.step_definitions;

import com.demoblaze.pages.DemoBlazePage;
import com.demoblaze.utilities.ConfigurationReader;
import com.demoblaze.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;

public class DemoBlazeStepDefinitionGroup13 {
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
    public void navigate_to_phones_samsung_galaxy_s6_and_click_on_add_to_cart_accept_pop_up_confirmation() {

    }
    @When("Navigate to the Monitors → Apple monitor  and click on Add to cart. Accept pop up confirmation.")
    public void navigate_to_the_monitors_apple_monitor_and_click_on_add_to_cart_accept_pop_up_confirmation() {

    }
    @When("Navigate to Cart → Delete Apple monitor  from cart.")
    public void navigate_to_cart_delete_apple_monitor_from_cart() {

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
