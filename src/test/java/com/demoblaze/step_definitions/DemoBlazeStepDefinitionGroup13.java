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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
        Thread.sleep(3000);
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
    public void navigate_to_the_cart_delete_asus_monitor_from_cart() throws InterruptedException {
        Thread.sleep(3000);
        demoBlazePage.productStore.click();
        demoBlazePage.cartBtn.click();
        demoBlazePage.asusDeleteBtn.click();
    }

    @And("Navigate  the Cart → Delete Sony Xperia   from cart.")
    public void navigateTheCartDeleteSonyXperiaFromCart() throws InterruptedException {
        Thread.sleep(3000);
        demoBlazePage.productStore.click();
        demoBlazePage.cartBtn.click();
        demoBlazePage.sonyDeleteBtn.click();
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
    public void assert_purchase_amount_expected() {
        Assert.assertTrue(demoBlazePage.confirmationText.getText().contains("Amount: 700 USD"));
    }

    @Then("Click Ok button")
    public void click_ok_button() {
        demoBlazePage.okBtn.click();
    }





}



















