package com.co.choucair.swag.stepdefinitions;

import com.co.choucair.swag.models.UserData;
import com.co.choucair.swag.steps.SerenityLoginSteps;
import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;

import static com.co.choucair.swag.utils.GlobalData.URL_SWAGLABS;

public class LoginOnSwagSiteStepdefinitions {

    @Steps
    protected SerenityLoginSteps loginSteps;

    @Given("that the user was on the website")
    public void thatTheUserWasOnTheWebsite() {
        loginSteps.OpenWebSite(URL_SWAGLABS);
    }

    @When("attemps to login with credentials")
    public void attempsToLoginWithCredentials(io.cucumber.datatable.DataTable dataTable) {
        loginSteps.login(UserData.setData(dataTable).get(0));
    }

    @Then("^he will see the title (.*) on screen$")
    public void heWillSeeTheTitleProductsOnScreen(String text) {
        loginSteps.validateTextOnScreen(text);
    }


}
