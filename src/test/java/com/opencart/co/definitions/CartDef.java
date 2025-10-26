package com.opencart.co.definitions;

import com.opencart.co.steps.CartSteps;
import com.opencart.co.steps.InitialPageSteps;
import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;

public class CartDef {

    @Steps(shared = true)
    CartSteps cart;
    InitialPageSteps initial;

    @And("Usuario visaliza el carrito")
    public void userViewCart() throws InterruptedException {
        initial.clickCartButton();
        initial.clickViewCartButton();
        cart.userSeeCart();
        cart.clickCheckoutButton();
    }
}
