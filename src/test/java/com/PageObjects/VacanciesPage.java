package com.PageObjects;

import com.ElementActions;
import com.Infrastructure.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VacanciesPage {
    public static WebElement vacanciesPage = WebDriverUtil.getDriver().findElement(By.xpath("//div[contains(@class, 'vacancies-menu-block') and (contains(@class,'table-cell-display'))]"));

    public static void clickVacanciesByName(String vacancyName){
        ElementActions.clickElement(vacanciesPage.findElement(By.xpath("//a[text() = '"+vacancyName+"']")));
    }
}
