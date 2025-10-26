package com.opencart.co.definitions;

import com.opencart.co.steps.InitialPageSteps;
import com.opencart.co.utilities.Website;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class InitialPageDef {
    @Steps(shared = true)
    Website url;

    @Steps(shared = true)
    InitialPageSteps initial;

    @Given("Usuario navega al sitio web de opencart")
    public void userNavigateTo(){
        url.navigateTo("http://opencart.abstracta.us/");
    }
    @When("Usuario agrega dos objetos al carrito de compras")
    public void userAddObjectsToCart() throws InterruptedException {
        initial.addMacbookCart();
        initial.addiPhoneCart();
    }


}
