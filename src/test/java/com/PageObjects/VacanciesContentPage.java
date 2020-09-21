package com.PageObjects;

import com.Infrastructure.Wait;
import com.Infrastructure.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VacanciesContentPage {

    public static WebElement vacanciesContentPage = WebDriverUtil.getDriver().findElement(By.xpath("//div[contains(@class, 'vacancies-second-content-wrap')]"));


    public static int getBreaksCount(String sectionName) {
        Wait.forElementToBeVisible(vacanciesContentPage);
        return vacanciesContentPage.findElements(By.xpath("//p[strong[em[text() = '" + sectionName + "']]]/following-sibling::p[1]//br")).size();
    }
}
