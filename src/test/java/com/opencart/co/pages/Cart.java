package com.opencart.co.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class Cart extends PageObject {
    @FindBy(xpath = "//*[@id=\"content\"]/div[3]/div[2]/a")
    protected WebElementFacade checkout_Button;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/table/tbody/tr/td[1]/a/img")
    protected WebElementFacade cart_Image;

}
