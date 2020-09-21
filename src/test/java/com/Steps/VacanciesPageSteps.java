package com.Steps;

import com.PageObjects.VacanciesPage;
import cucumber.api.java.en.And;

public class VacanciesPageSteps {
    @And("^Open vacancy \"([^\"]*)\"$")
    public void openMenu(String vacancy) throws InterruptedException {
        VacanciesPage.clickVacanciesByName(vacancy);
    }
}
