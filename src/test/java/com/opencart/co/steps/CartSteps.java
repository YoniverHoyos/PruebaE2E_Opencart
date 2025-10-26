package com.opencart.co.steps;

import com.opencart.co.pages.Cart;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CartSteps extends Cart {
    @Step("Agregar Mackbook al carrito")
    public void userSeeCart() throws InterruptedException {
        cart_Image.waitUntilVisible();
        Assert.assertTrue(cart_Image.isVisible());
    }
    @Step("Agregar iPhone al carrito")
    public void clickCheckoutButton() throws InterruptedException {
        Thread.sleep(1000);
        evaluateJavascript("arguments[0].scrollIntoView(true);",checkout_Button);
        Thread.sleep(1000);
        checkout_Button.click();
    }

}
