package com.demoblaze.step_definitions;

import com.demoblaze.pages.DemoBlazePage;
import com.demoblaze.utilities.ConfigurationReader;
import com.demoblaze.utilities.Driver;
import io.cucumber.java.en.Given;

public class DemoBlazeStepDefinitionGroup13 {
    DemoBlazePage demoBlazePage=new DemoBlazePage();
    @Given("Customer navigation through product categories: Phones, Laptops and Monitors")
    public void customer_navigation_through_product_categories_phones_laptops_and_monitors() {
        Driver.getDriver().get(ConfigurationReader.getProperty("demoBlaze.url"));
    }


}
