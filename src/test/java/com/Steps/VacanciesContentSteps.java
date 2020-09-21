package com.Steps;

import com.PageObjects.VacanciesContentPage;
import com.PageObjects.VacanciesPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class VacanciesContentSteps {
    @Then("^Verify that paragraph under \"([^\"]*)\" contains exactly \"([^\"]*)\" skills$")
    public void openMenu(String section, String skillCount) {
        Assert.assertEquals(Integer.parseInt(skillCount), VacanciesContentPage.getBreaksCount(section)+1);
    }
}
