package com.Elements;

import com.Infrastructure.Wait;
import com.Infrastructure.WebDriverUtil;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;


public class BaseElement {
   public static WebElement elem;
    BaseElement(WebElement elementLocator) {
        elem = elementLocator;
    }
    public void Click() {
        Wait.forElementToBeVisible(elem);
        elem.click();
    }
    public boolean isDisplayed()  {
        Wait.forElementToBeVisible(elem);
       return elem.isDisplayed();
    }
    public void MouseOver(){
        Wait.forElementToBeVisible(elem);
        Actions action = new Actions(WebDriverUtil.getDriver());
        action.moveToElement(elem).perform();
    }
}
