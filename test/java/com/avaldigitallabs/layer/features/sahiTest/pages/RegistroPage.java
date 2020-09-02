package com.avaldigitallabs.layer.features.sahiTest.pages;

import com.avaldigitallabs.layer.SahiTestBase.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistroPage extends Base {

    By registerLinkLocator = By.linkText("Register");
    By llenarNombre = By.name("username");
    By password = By.id("pid");
    By password2 = By.name("password2");
    By registerButton = By.name("gender");
    By registerAddress = By.name("address");
    By billingAddress = By.name("billaddress");
    By stateName = By.name("state");
    By termConditions = By.name("agree");
    By botonRegistro = By.xpath("/html/body/center/div/form/input[2]");

    public RegistroPage(WebDriver driver) {
        super(driver);
    }

///Metodo para registrar al usuario
    public void registroUsuario() throws InterruptedException {
        clickea(registerLinkLocator);
        Thread.sleep(3000);
        type("Jair", llenarNombre);
        type("Administrador", password);
        type("Administrador", password2);
        clickea(registerButton);
        type("Calle Falsa 1 23", registerAddress);
        type("Calle Verdadera 1 23", billingAddress);
      //  Select estado = new Select((WebElement) stateName); // Metodo para seleccionar un DropDown List
        //estado.selectByVisibleText("Kerala");
        clickea(termConditions);
        clickea(botonRegistro);


    }

/// Metodo q recibe el mensaje de registro del usuario
    public String mensajeRegistro(){
        return "";
    }

}
