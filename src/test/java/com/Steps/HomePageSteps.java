package com.Steps;

import com.Infrastructure.Helpers;
import com.Infrastructure.WebDriverUtil;
import cucumber.api.java.en.Given;

public class HomePageSteps {
    public static String HOME_PAGE = Helpers.getFromConfig("app.page");

    @Given("^Navigate to \"([^\"]*)\"$")
    public void navigateTo(String url) throws Exception {
        if (url.toLowerCase().equals(HOME_PAGE)) {
            WebDriverUtil.getDriver().get(HOME_PAGE);
        } else {
            throw new Exception("web page link not supported");
        }
    }
}
