/**
 * Grupo Aval Acciones y Valores S.A. CONFIDENTIAL
 *
 * <p>Copyright (c) 2018 . All Rights Reserved.
 *
 * <p>NOTICE: This file is subject to the terms and conditions defined in file 'LICENSE', which is
 * part of this source code package.
 */
package com.avaldigitallabs.layer.features.sahiTest.steps;

import com.avaldigitallabs.layer.features.sahiTest.pages.ComprarPage;
import com.avaldigitallabs.layer.features.sahiTest.pages.RegistroPage;
import com.avaldigitallabs.layer.features.sahiTest.pages.SahiTestLoginPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class SahiTestSteps {
    SahiTestLoginPage sahiTestLoginPage;
    RegistroPage registroPage;
    ComprarPage comprarPage;
    WebDriver driver;

    @Step
    public void abrirSite() {
        sahiTestLoginPage = new SahiTestLoginPage(driver);
        driver = sahiTestLoginPage.chromeDriverConection();
        sahiTestLoginPage.abrirUrl("http://sahitest.com/demo/training/login.htm");

    }

    @Step
    public void autenticarse() {
        sahiTestLoginPage.logueaUsuario();
    }

    @Step
    public void registrarse() throws InterruptedException {
        registroPage = new RegistroPage(driver);
        registroPage.registroUsuario();
    }


    @Step
    public void comprarLibros(){
        comprarPage = new ComprarPage(driver);
        comprarPage.llenaCarrito();

    }

}
