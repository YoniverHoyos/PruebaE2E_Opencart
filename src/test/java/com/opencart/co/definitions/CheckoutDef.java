package com.opencart.co.definitions;

import com.opencart.co.steps.CheckoutSteps;
import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;

public class CheckoutDef {
    @Steps(shared = true)
    CheckoutSteps checkout;

    @And("Usuario completa un checkout como invitado")
    public void userViewCart() throws InterruptedException {
        checkout.userStartCheckout();
        checkout.userFillData("Sam","Smith","sad@example.com","3243423255","Colombia","Londres","102929292");
        checkout.userAcceptDeliveryMethod();
        checkout.userAcceptTermsAndCondtions();
        checkout.userConfirmOrder();
    }

    @And("Usuario observa el mensaje de confirmacion de la compra")
    public void userViewConfirmationMsg() throws InterruptedException {
        checkout.userSeeConfirmationMsg();
    }
}
