package com.Infrastructure;

import org.openqa.selenium.WebDriver;

import java.sql.DriverManager;


public class WebDriverUtil {
    private static WebDriver driver;

    public static void SetDriver(WebDriver currentDriver) {
        driver = currentDriver;
    }

    public static WebDriver getDriver() {

        return driver;
    }
}
