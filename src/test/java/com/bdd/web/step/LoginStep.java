package com.bdd.web.step;

import com.bdd.web.page.LoginPage;

public class LoginStep {

    LoginPage loginPage = new LoginPage();

    public void accederWebFE(String IDTest) throws Throwable {
        loginPage.accederWebFE(IDTest);
    }


    public void ingresoDatosPersonales(String IDTest) throws Throwable {
        loginPage.Ingreso_Datos_Personales(IDTest);
    }

    public void IngresoDatosCuenta(String IDTest) throws Throwable {
       loginPage.Ingreso_Datos_Cuenta(IDTest);
    }

    public void ingresoSession(String IDTest) throws Throwable {
        loginPage.ingreso_Session(IDTest);
    }

    public void  ClicBotonRegistrar( ) throws Throwable {
        loginPage.Clic_Boton_Registrar();
    }





}
