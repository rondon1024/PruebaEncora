package com.bdd.web.stepdefinition;

import com.bdd.web.step.LoginStep;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefintion {

    LoginStep loginStep = new LoginStep();


    @Given("^ingreso al sistema parabank \"([^\"]*)\"$")
    public void ElIngresoPagina(String IDTest) throws Throwable {
        loginStep.accederWebFE(IDTest);
        System.out.println("fin given");
    }






    @When("^ingreso datos personales al formulario \"([^\"]*)\"$")
    public void ingreso_datos_personales_al_formulario(String IDTest) throws Throwable {
        loginStep.ingresoDatosPersonales(IDTest);
    }

    @When("^ingreso datos cuenta al formulario \"([^\"]*)\"$")
    public void ingreso_datos_cuenta_al_formulario(String IDTest) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        loginStep.IngresoDatosCuenta(IDTest);
    }

    @When("^clic en el boton registrar$")
    public void clic_en_el_boton_registrar() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       loginStep.ClicBotonRegistrar();
    }

    @Then("^Valida que se despliega el mensaje de éxito$")
    public void valida_que_se_despliega_el_mensaje_de_éxito() throws Throwable {

    }

    @When("^ingreso la session con la cuenta creada \"([^\"]*)\"$")
    public void ingreso_la_session_con_la_cuenta_creada(String IDTest) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        loginStep.ingresoSession(IDTest);
    }



}