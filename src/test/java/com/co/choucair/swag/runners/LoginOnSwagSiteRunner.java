package com.co.choucair.swag.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src\\test\\resources\\features\\loginOnSwagSite.feature",
        glue = "com.co.choucair.swag.stepdefinitions",
        //tags = "",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class LoginOnSwagSiteRunner {
}
