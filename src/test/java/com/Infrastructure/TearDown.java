package com.Infrastructure;




import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TearDown {

    private WebDriver driver;

    public TearDown() {
        this.driver = WebDriverUtil.getDriver();
    }

    @After
    public void quitDriver(Scenario scenario){
        if(scenario.isFailed()){
           saveScreenshotsForScenario(scenario);
        }
        this.driver.quit();
    }

    private void saveScreenshotsForScenario(final Scenario scenario) {

         byte[] screenshot = ((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot, "image/png");

    }
}
