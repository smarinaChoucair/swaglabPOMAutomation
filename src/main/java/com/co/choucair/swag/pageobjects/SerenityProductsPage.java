package com.co.choucair.swag.pageobjects;

import org.openqa.selenium.By;

public class SerenityProductsPage {
    private static final By TITLE_MAIN = By.xpath("//div[@class=\"product_label\" and contains(text(), \"Products\")]");

    public static By getTitleMain(){return TITLE_MAIN;}
}
