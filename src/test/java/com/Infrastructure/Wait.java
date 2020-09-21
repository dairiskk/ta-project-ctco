package com.Infrastructure;

import com.PageObjects.NavigationMenuPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Collections;
import java.util.List;

public class Wait {
    private static int timeout = 20;
    public static void forElementToBeVisible(WebElement elem) {
        WebDriverWait wait = new WebDriverWait(WebDriverUtil.getDriver(), timeout);
        wait.until(ExpectedConditions.visibilityOf(elem));
    }
}
