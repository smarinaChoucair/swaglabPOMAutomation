package com.co.choucair.swag.steps;

import com.co.choucair.swag.models.UserData;
import com.co.choucair.swag.pageobjects.SerenityLoginPage;
import com.co.choucair.swag.pageobjects.SerenityProductsPage;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.core.Serenity.getDriver;

public class SerenityLoginSteps {

    SerenityLoginPage loginPage = new SerenityLoginPage();

    @Step
    public void OpenWebSite(String url){
        getDriver().get(url);
    }

    @Step
    public void login(UserData userData){
        loginPage.getDriver().findElement(SerenityLoginPage.getTxtUser()).clear();
        loginPage.getDriver().findElement(SerenityLoginPage.getTxtPass()).clear();

        loginPage.getDriver().findElement(SerenityLoginPage.getTxtUser()).sendKeys(userData.getUser());
        loginPage.getDriver().findElement(SerenityLoginPage.getTxtPass()).sendKeys(userData.getPass());

        loginPage.getDriver().findElement(SerenityLoginPage.getBtnLogin()).click();
    }

    @Step
    public void validateTextOnScreen(String text){
        assert loginPage.getDriver().findElement(SerenityProductsPage.getTitleMain()).getText().contains(text);
    }

}
