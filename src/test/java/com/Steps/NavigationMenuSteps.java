package com.Steps;

import com.ElementActions;
import com.PageObjects.NavigationMenuPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

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
