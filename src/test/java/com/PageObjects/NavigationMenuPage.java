package com.PageObjects;

import com.Infrastructure.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NavigationMenuPage {

    public static WebElement navBar = WebDriverUtil.getDriver().findElement(By.xpath("//nav[contains(@class, 'navbar-default')]"));

    public static WebElement careersItem = WebDriverUtil.getDriver().findElement(By.xpath("//li[a[text() = 'Careers']]"));
    public static WebElement vacanciesItem = careersItem.findElement(By.xpath("//ul//a[text()='Vacancies']"));

}
