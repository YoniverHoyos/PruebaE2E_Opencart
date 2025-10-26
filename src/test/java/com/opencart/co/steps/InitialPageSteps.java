package com.opencart.co.steps;

import com.opencart.co.pages.InitialPage;
import net.thucydides.core.annotations.Step;

public class InitialPageSteps extends InitialPage {

    @Step("Agregar Mackbook al carrito")
    public void addMacbookCart() throws InterruptedException {
        cart_Button.waitUntilVisible();
        evaluateJavascript("arguments[0].scrollIntoView(true);",addCart_Mackbook_Button);
        Thread.sleep(2000);
        addCart_Mackbook_Button.click();
    }
    @Step("Agregar iPhone al carrito")
    public void addiPhoneCart() throws InterruptedException {
        Thread.sleep(1000);
        evaluateJavascript("arguments[0].scrollIntoView(true);",addCart_Mackbook_Button);
        Thread.sleep(1000);
        addCart_iPhone_Button.click();
    }
    @Step("Previsualizar carrito")
    public void clickCartButton() throws InterruptedException {
        Thread.sleep(1000);
        cart_Button.waitUntilVisible();
        cart_Button.click();
    }
    @Step("Ver carrito")
    public void clickViewCartButton() throws InterruptedException {
        Thread.sleep(2000);
        viewCart_Button.click();
    }
}
