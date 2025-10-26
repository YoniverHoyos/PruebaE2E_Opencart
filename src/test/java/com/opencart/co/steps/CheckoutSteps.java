package com.opencart.co.steps;

import com.opencart.co.pages.Checkout;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CheckoutSteps extends Checkout {

    @Step("Iniciar checkout")
    public void userStartCheckout() throws InterruptedException {
        continueCheckoutButton.waitUntilVisible();
        guestCheckoutRdn.click();
        Thread.sleep(1000);
        continueCheckoutButton.click();
    }
    @Step("Llenar datos del cliente")
    public void userFillData(String name,String Lname, String email, String telephone, String address, String city, String Pcode) throws InterruptedException {
        firstname_txt.waitUntilVisible();
        evaluateJavascript("arguments[0].scrollIntoView(true);",continueCheckoutButton2);
        Thread.sleep(1000);
        firstname_txt.sendKeys(name);
        lastname_txt.sendKeys(Lname);
        email_txt.sendKeys(email);
        telephone_txt.sendKeys(telephone);
        address_txt.sendKeys(address);
        city_txt.sendKeys(city);
        post_txt.sendKeys(Pcode);
        selectFromDropdown(state_drp,"Angus");
        Thread.sleep(1000);
        continueCheckoutButton2.click();
    }

    @Step("Aceptar metodo de envio")
    public void userAcceptDeliveryMethod() throws InterruptedException {
        continueCheckoutButton3.waitUntilVisible();
        evaluateJavascript("arguments[0].scrollIntoView(true);",continueCheckoutButton3);
        Thread.sleep(1000);
        continueCheckoutButton3.click();
    }
    @Step("Aceptar terminos y condiciones")
    public void userAcceptTermsAndCondtions() throws InterruptedException {
        paymentTerms_rdn.waitUntilVisible();
        evaluateJavascript("arguments[0].scrollIntoView(true);",continueCheckoutButton4);
        Thread.sleep(1000);
        paymentTerms_rdn.click();
        Thread.sleep(1000);
        continueCheckoutButton4.click();
    }

    @Step("Usuario confirma la orden")
    public void userConfirmOrder() throws InterruptedException {
        confirmButton.waitUntilVisible();
        evaluateJavascript("arguments[0].scrollIntoView(true);",confirmButton);
        Thread.sleep(1000);
        confirmButton.click();
    }

    @Step("Usuario obtiene mensaje de confirmacion")
    public void userSeeConfirmationMsg() throws InterruptedException {
        confirmationMsg.waitUntilVisible();
        Assert.assertTrue(confirmationMsg.isVisible());
        Thread.sleep(1000);
    }
}
