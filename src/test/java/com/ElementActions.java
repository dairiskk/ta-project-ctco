package com.Elements;

import com.Infrastructure.Wait;
import com.Infrastructure.WebDriverUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ElementActions {
    public static void hoverElement(WebElement elem){
        Actions action = new Actions(WebDriverUtil.getDriver());
        action.moveToElement(elem).build().perform();
    }

    public static void clickElement(WebElement elem){
        Wait.forElementToBeVisible(elem);
        elem.click();
    }
}
