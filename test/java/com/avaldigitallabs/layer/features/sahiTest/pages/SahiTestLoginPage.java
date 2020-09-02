/**
 * Grupo Aval Acciones y Valores S.A. CONFIDENTIAL
 *
 * <p>Copyright (c) 2018 . All Rights Reserved.
 *
 * <p>NOTICE: This file is subject to the terms and conditions defined in file 'LICENSE', which is
 * part of this source code package.
 */
package com.avaldigitallabs.layer.features.sahiTest.pages;

import com.avaldigitallabs.layer.SahiTestBase.Base;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.stream.Collectors;
/*
@DefaultUrl("page:sahiTest.page")
public class SahiTestLoginPage extends PageObject {
    @FindBy(xpath = "/html/body/center/div/b")
    private WebElementFacade titleLogin;
    public String getTitleLogin(){
        return titleLogin.getText();
    }
}*/


public class SahiTestLoginPage extends Base {
    By namelocator = By.name("user");
    By passlocator = By.name("password");
    By botonlocator = By.xpath("/html/body/center/div/form/table/tbody/tr[3]/td[2]/input");


    public SahiTestLoginPage(WebDriver driver) {
        super(driver);
    }

    ///Metodo para autenticar al usuario
    public void logueaUsuario() {
        type("test", namelocator);
        type("secret", passlocator);
        clickea(botonlocator);

    }
}
