package com.opencart.co.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class Checkout extends PageObject {
    @FindBy(xpath = "//*[@id=\"button-account\"]")
    protected WebElementFacade continueCheckoutButton;

    @FindBy(xpath = "//*[@id=\"collapse-checkout-option\"]/div/div/div[1]/div[2]/label/input")
    protected WebElementFacade guestCheckoutRdn;

    @FindBy(name = "firstname")
    protected WebElementFacade firstname_txt;

    @FindBy(name = "lastname")
    protected WebElementFacade lastname_txt;

    @FindBy(xpath = "//*[@id=\"input-payment-email\"]")
    protected WebElementFacade email_txt;

    @FindBy(name = "telephone")
    protected WebElementFacade telephone_txt;

    @FindBy(name = "address_1")
    protected WebElementFacade address_txt;

    @FindBy(name = "city")
    protected WebElementFacade city_txt;

    @FindBy(name = "postcode")
    protected WebElementFacade post_txt;

    @FindBy(name = "zone_id")
    protected WebElementFacade state_drp;

    @FindBy(xpath = "//*[@id=\"button-guest\"]")
    protected WebElementFacade continueCheckoutButton2;

    @FindBy(xpath = "//*[@id=\"collapse-payment-method\"]/div/div[3]/div/input[1]")
    protected WebElementFacade paymentTerms_rdn;

    @FindBy(xpath = "//*[@id=\"button-payment-method\"]")
    protected WebElementFacade continueCheckoutButton4;

    @FindBy(xpath = "//*[@id=\"button-shipping-method\"]")
    protected WebElementFacade continueCheckoutButton3;

    @FindBy(xpath = "//*[@id=\"button-confirm\"]")
    protected WebElementFacade confirmButton;

    @FindBy(xpath = "//*[@id=\"content\"]/h1")
    protected WebElementFacade confirmationMsg;
}
