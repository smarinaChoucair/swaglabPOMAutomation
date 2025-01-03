package com.co.choucair.swag.pageobjects;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;

public class SerenityLoginPage extends PageObject {

    private static final By FIELD_USER = By.xpath("//input[@id='user-name']");
    private static final By FIELD_PASS = By.xpath("//input[@id='password']");
    private static final By BTN_LOGIN = By.xpath("//input[@id='login-button']");
    private static final By MSG_ERROR = By.xpath("//h3[contains(text(), 'Epic sadface')]");

    public static By getTxtUser() {return FIELD_USER;}

    public static By getTxtPass() {return FIELD_PASS;}

    public static By getBtnLogin() {return BTN_LOGIN;}

    public static By getTxtError() {return MSG_ERROR;}
}
