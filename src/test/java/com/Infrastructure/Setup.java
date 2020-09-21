package com.Infrastructure;

import cucumber.api.java.Before;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Setup {

    private WebDriver driver;

    @Before
    public void setWebDriver() {

        String browser = System.getProperty("browser");
        if (browser == null) {
            browser = "chrome";
        }
        switch (browser) {
            case "chrome":
                System.out.println("Chrome Driver Starting...");
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("start-maximized");
                System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
                driver = new ChromeDriver(chromeOptions);
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                break;
            case "firefox":
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                break;
            default:
                throw new IllegalArgumentException("Browser \"" + browser + "\" isn't supported.");
        }
        WebDriverUtil.SetDriver(driver);
    }
}
