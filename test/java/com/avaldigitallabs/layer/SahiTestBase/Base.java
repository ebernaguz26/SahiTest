package com.avaldigitallabs.layer.SahiTestBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Base {
    /// Aca vamos a colocar todos los metodos que necesitemos utilizar en el proyecto
    private WebDriver driver;


    /// Constructor de la clase
    public Base(WebDriver driver) {
        this.driver = driver;
    }

/// Metodo para la conexion con chromedriver
/// Llamamos al chromedriver que es el ejecutable q permite crear una instancia de chrome. Permite el llamdo de la pagina web

    public WebDriver chromeDriverConection() {
        System.setProperty("webdriver.chrome.driver", "/Users/edison.bernate/Documents/Proyectos Edison/Develop/Drivers/chromedriver");
        driver = new ChromeDriver();
        return driver;
    }

    /// realizamos un wrappin o envoltura de los elementos de selenium que vamos a necesitar
    public WebElement findElement(By locator) {
        return driver.findElement(locator); // Llammos a metodo de Selenium para crear un envoltorio (Wrapper o wrapping)
    }


    /// Llamamos dentro de nuestros metodos, los metodos de selenium, para efectos de cambios en Selenium
    public List<WebElement> findElements(By locator) {
        return driver.findElements(locator);
    }


    public String getText(WebElement element) {
        return element.getText();
    }


    /// Sobre cargamos el metodo anterior para devolver el texto del elemento atravez del localizador
    public String getText(By locator) {
        return driver.findElement(locator).getText();
    }

    ///Metodo para enviar textos
    public void type(String inputText, By locator) {
        driver.findElement(locator).sendKeys(inputText);
    }


    ///Metodo para hacer click
    public void clickea(By locator) {
        driver.findElement(locator).click();
    }


    /// metodo para saber si l elemento e encuentra listo para ser mostrado
    public Boolean seMuestra(By locator) {
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }


    /// Metodo para recibir la url y abrir la pagina
    public void abrirUrl(String url) {
        driver.get(url);
    }

}
