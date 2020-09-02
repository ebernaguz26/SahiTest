# language: es
@SahiTest
Característica: SahiTest training
  Yo Edison como estudiante del training automation
  Quiero realizar varios flujos automatizados de la pagina SahiTest
  Para terminar mi curso de training automation

  @SahiTest @SahiTest1
  Escenario: Abrir la pagina sahiTest
    Dado que Edison quiere abrir la pagina principal de sahiTest
    Cuando Edison despliega el navegador chrome
    Entonces se abre el navegador web en la pagina indicada

  @SahiTest @Sahitest2

  Escenario: Autenticarse en el sito de SahiTest
    Dado que Edison abrió la pagina el sitio web de SahiTest
    Cuando Edison ingrese los datos y accione el boton para autenticar
    Entonces se abrirá el home para la compra de sahiTest


  @SahiTest @Sahitest3

  Escenario: Registrarse en el sito de SahiTest
    Dado que la pagina el sitio web de SahiTest se encuentra abierta
    Cuando Edison haga click en el link para registrarse
    Entonces podrá llenar los datos y accionar el boton de registro

    @Sahitest @Sahitest4

      Escenario: Realizar la compra de un libro
      Dado que Edison tiene abierta la web de Sahitest
      Cuando Llene los datos de la compra
      Entonces La compra finaliza de manera exitosa
