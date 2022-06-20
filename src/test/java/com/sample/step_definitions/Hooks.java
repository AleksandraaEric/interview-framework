package com.sample.step_definitions;

import com.sample.pages.DashboardPage;
import com.sample.utilities.BrowserUtils;
import com.sample.utilities.ConfigurationReader;
import com.sample.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before("@ui")
    public void uiSetup() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After("@ui")
    public void uiTearDown(Scenario scenario) {

        // check if scenario failed or not
        if(scenario.isFailed()){
            //this is how we take screenshot in selenium
            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
            // scenario.attach(screenshot,"image/png","what ever we want");
            scenario.attach(screenshot,"image/png","Image for failed step");
        }
        Driver.closeDriver();
    }

}
