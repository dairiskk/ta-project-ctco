package com.Steps;

import com.Elements.ElementActions;
import com.PageObjects.NavigationMenuPage;
import com.PageObjects.VacanciesPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class VacanciesPageSteps {
    @And("^Open vacancy \"([^\"]*)\"$")
    public void openMenu(String vacancy) throws InterruptedException {
        VacanciesPage.clickVacanciesByName(vacancy);
    }
}
