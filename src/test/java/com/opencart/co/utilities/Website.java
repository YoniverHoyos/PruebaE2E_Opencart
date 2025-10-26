package com.opencart.co.utilities;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class Website {
    @Steps(shared = true)
    PageObject opencart;

    @Step("Navegar a la pagina principal de Opencart")
    public void navigateTo(String url){
        opencart.setDefaultBaseUrl(url);
        opencart.open();
    }
}
