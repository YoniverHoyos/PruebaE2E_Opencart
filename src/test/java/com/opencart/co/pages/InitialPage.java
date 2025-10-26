package com.opencart.co.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class InitialPage extends PageObject {
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]/div/div[3]/button[1]")
    protected WebElementFacade addCart_Mackbook_Button;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div[3]/button[1]")
    protected WebElementFacade addCart_iPhone_Button;

    @FindBy(xpath = "//*[@id=\"cart\"]/button")
    protected WebElementFacade cart_Button;

    @FindBy(xpath = "//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]")
    protected WebElementFacade viewCart_Button;

}
