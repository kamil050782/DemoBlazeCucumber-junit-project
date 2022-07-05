package com.demoblaze.step_definitions;

import com.demoblaze.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before
    public void setUpScenario() {
        System.out.println("Before Scenario is running");
    }

    @After
    public void tearDownScenario(Scenario scenario) {
        System.out.println("After Scenario is running");

        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

       // Driver.closeDriver();
    }
}