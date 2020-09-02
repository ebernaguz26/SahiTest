package com.avaldigitallabs.layer.features.sahiTest.pages;

import com.avaldigitallabs.layer.SahiTestBase.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComprarPage extends Base {
    By botonClean = By.xpath("//*[@id='available']/input[2]");
    By libro1 = By.xpath("//*[@id='listing']/tbody/tr[2]/td[4]/input"); // ok
    By libro2 = By.xpath("/html/body/center/form/div/table/tbody/tr[3]/td[4]/input");
    By libro3 = By.xpath("//*[@id='listing']/tbody/tr[4]/td[4]/input");
    By botonComprar = By.xpath("//*[@id='available']/input[1]");


    public ComprarPage(WebDriver driver) {
        super(driver);
    }


    ///Metodo para realizar una compra
    /// Primero

    public void llenaCarrito(){
        clickea(botonClean);
        type("3",libro1);
        type("4",libro2);
        type("5",libro3);
        clickea(botonComprar);

    }

}
