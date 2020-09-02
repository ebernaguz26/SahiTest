/**
 * Grupo Aval Acciones y Valores S.A. CONFIDENTIAL
 *
 * <p>Copyright (c) 2018 . All Rights Reserved.
 *
 * <p>NOTICE: This file is subject to the terms and conditions defined in file 'LICENSE', which is
 * part of this source code package.
 */
package com.avaldigitallabs.layer.features.sahiTest;

import com.avaldigitallabs.layer.features.sahiTest.steps.SahiTestSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class SahiTestDefinition {
    @Steps
    SahiTestSteps sahiTestSteps;

    /////
    @Dado("^que Edison quiere abrir la pagina principal de sahiTest$")
    public void queEdisonQuiereAbrirLaPaginaPrincipalDeSahiTest() {
        System.out.println("inicio prueba***************");
    }

    @Cuando("^Edison despliega el navegador chrome$")
    public void EdisonDespliegaElNavegadorChrome() {
        sahiTestSteps.abrirSite();
    }

    @Entonces("^se abre el navegador web en la pagina indicada$")
    public void SeAbreElNavegadorWebEnLaPaginaIndicada() {
        System.out.println("Se abrió el sitio web de SahiTest.com");
    }

/////

    @Dado("^que Edison abrió la pagina el sitio web de SahiTest$")
    public void aprturaSitioWeb() {
        sahiTestSteps.abrirSite();
        System.out.println("La pagina se encuentra abierta");
    }

    @Cuando("^Edison ingrese los datos y accione el boton para autenticar$")
    public void Edison_ingrese_los_datos_y_accione_el_boton_para_autenticar() {
        sahiTestSteps.autenticarse();
    }

    @Entonces("^se abrirá el home para la compra de sahiTest$")
    public void se_abrirá_el_home_para_la_compra_de_sahiTest() {
        System.out.println("Sitio de compra***");
    }

///

    @Dado ("^que la pagina el sitio web de SahiTest se encuentra abierta$")
    public void la_pagina_el_sitio_web_de_SahiTest_se_encuentra_abierta()  {
        sahiTestSteps.abrirSite();
        System.out.println("La pagina se encuentra abierta");
    }

    @Cuando ("^Edison haga click en el link para registrarse$")
    public void Edison_haga_click_en_el_link_para_registrarse() throws InterruptedException {
        System.out.println("Ingresando datos");
        sahiTestSteps.registrarse();
    }

    @Entonces ("^podrá llenar los datos y accionar el boton de registro$")
    public void podra_llenar_los_datos_y_accionar_el_boton_de_registro(){
        System.out.println("Registro completado");
    }

///

    @Dado ("^que Edison tiene abierta la web de Sahitest$")
    public void Edison_tiene_abierta_la_web_de_Sahitest () throws InterruptedException {
        sahiTestSteps.abrirSite();
        sahiTestSteps.autenticarse();
        Thread.sleep(2000);
    }

    @Cuando ("^Llene los datos de la compra$")
    public void Llene_los_datos_de_compra(){
        sahiTestSteps.comprarLibros();
    }

    @Entonces ("^La compra finaliza de manera exitosa$")
    public void La_compra_finaliza_de_manera_exitosa(){
        System.out.println("Compra finalizada**");
    }
}
