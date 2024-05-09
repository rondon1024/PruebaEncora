package com.bdd.web.page;

import com.bdd.FrontEnd.BaseClass;
import com.bdd.FrontEnd.Hook;
import com.bdd.FrontEnd.utility.ExcelReader;
import com.bdd.FrontEnd.utility.ExtentReportUtil;
import com.bdd.FrontEnd.utility.GenerateWord;
import com.bdd.web.model.ExcelModel;
import com.bdd.web.path.LoginPath;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BaseClass {

    private WebDriver driver;
    static GenerateWord generateWord = new GenerateWord();

    public LoginPage() {
        driver = Hook.getDriver();
    }


//LINIO
    public void accederWebFE(String IDTest) throws Throwable {
        try {
            int valor = Integer.parseInt(IDTest) - 1;
            String url = getData().get(valor).get(ExcelModel.URL);
            driver.get(url);
            sleep(2000);
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se inició correctamente la página parabank");
            generateWord.sendText("Se inició correctamente la página parabak");
            generateWord.addImageToWord(driver);
        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
            driver.close();
            throw e;
        }
    }



    public void ingreso_Session(String IDTest) throws Throwable {
        try {
            int valor = Integer.parseInt(IDTest) - 1;
            String Username =getData().get(valor).get(ExcelModel.Username);
            sendKeyValue(driver, "xpath", LoginPath.txtUsernamelogin, Username);

            String Password =getData().get(valor).get(ExcelModel.Password);
            sendKeyValue(driver, "xpath", LoginPath.txtPasswordlogin, Password);

            click(driver, "xpath", LoginPath.Login);



            sleep(5000);
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se Ingresa el dato : " + Password);
            generateWord.sendText("Se Ingresa el ultimo dato: " + Password);
            generateWord.addImageToWord(driver);
        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
            driver.close();
        }
    }

    //linio
    public void Ingreso_Datos_Personales(String IDtest)throws Throwable {
        try {
            int valor = Integer.parseInt(IDtest) - 1;

            click(driver, "xpath", LoginPath.linkRegister);

            String FirstName =getData().get(valor).get(ExcelModel.FirstName);
            sendKeyValue(driver, "xpath", LoginPath.txtFirstName, FirstName);

            String LastName =getData().get(valor).get(ExcelModel.LastName);
            sendKeyValue(driver, "xpath", LoginPath.txtLastName, LastName);

            String Address =getData().get(valor).get(ExcelModel.Address);
            sendKeyValue(driver, "xpath", LoginPath.txtAddress, Address);

            String City =getData().get(valor).get(ExcelModel.City);
            sendKeyValue(driver, "xpath", LoginPath.txtCity, City);

            String State =getData().get(valor).get(ExcelModel.State);
            sendKeyValue(driver, "xpath", LoginPath.txtState, State);

            String ZipCode =getData().get(valor).get(ExcelModel.ZipCode);
            sendKeyValue(driver, "xpath", LoginPath.txtZipCode, ZipCode);

            String Phone =getData().get(valor).get(ExcelModel.Phone);
            sendKeyValue(driver, "xpath", LoginPath.txtPhone, Phone);

            String SSN =getData().get(valor).get(ExcelModel.SSN);
            sendKeyValue(driver, "xpath", LoginPath.txtSSN, SSN);



            sleep(5000);
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se Ingresa el dato : " + SSN);
            generateWord.sendText("Se Ingresa el ultimo dato: " + SSN);
            generateWord.addImageToWord(driver);
        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
            driver.close();
        }
    }
    //linio
    public void Ingreso_Datos_Cuenta(String IDTest) throws Throwable {
        try {
            int valor = Integer.parseInt(IDTest) - 1;
            String Username =getData().get(valor).get(ExcelModel.Username);
            sendKeyValue(driver, "xpath", LoginPath.txtUsername, Username);

            String Password =getData().get(valor).get(ExcelModel.Password);
            sendKeyValue(driver, "xpath", LoginPath.txtPassword, Password);

            String Confirm =getData().get(valor).get(ExcelModel.Confirm);
            sendKeyValue(driver, "xpath", LoginPath.txtConfirm, Confirm);







            sleep(2000);
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se Ingresa el dato : " + Confirm);
            generateWord.sendText("Se Ingresa el ultimo dato: " + Confirm);
            generateWord.addImageToWord(driver);
        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
            driver.close();
        }
    }


    //linio
    public void Clic_Boton_Registrar() throws Throwable {
        try {
            sleep(1000);
          click(driver, "xpath", LoginPath.BtnRegister);
            click(driver, "xpath", LoginPath.Retroceder);
        } catch (Exception e) {
            driver.close();
        }
    }



















}
