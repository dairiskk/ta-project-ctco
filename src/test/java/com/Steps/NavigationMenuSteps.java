package com.Steps;

import com.Elements.ElementActions;
import com.Elements.NavigationBar;
import com.Infrastructure.Helpers;
import com.Infrastructure.Wait;
import com.Infrastructure.WebDriverUtil;
import com.PageObjects.NavigationMenuPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavigationMenuSteps {
    @Then("^Open \"([^\"]*)\" menu$")
    public void openMenu(String menuItem) throws InterruptedException {
        if (menuItem.toLowerCase().equals("careers")) {
            ElementActions.hoverElement(NavigationMenuPage.careersItem);
        } else {
            Assert.fail("Menu item " + menuItem + " not supported");
        }
    }


    @And("^Click \"([^\"]*)\" from the list$")
    public void openMenuLink(String menuItem1) throws InterruptedException {
        if (menuItem1.toLowerCase().equals("vacancies")) {
            ElementActions.clickElement(NavigationMenuPage.vacanciesItem);
        } else {
            Assert.fail("Menu item " + menuItem1 + " not supported");
        }
    }
}
