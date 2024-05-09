package com.bdd.web.path;

public class LoginPath {
//linio



    public static String txtFirstName = "//input[@id='customer.firstName']";
    public static String txtLastName="//input[@id='customer.lastName']";
    public static String txtAddress="//input[@id='customer.address.street']";
    public static String txtCity="//input[@id='customer.address.city']";
    public static String txtState="//input[@id='customer.address.state']";
    public static String txtZipCode="//input[@id='customer.address.zipCode']";
    public static String txtPhone="//input[@id='customer.phoneNumber']";
    public static String txtSSN="//input[@id='customer.ssn']";

    public static String txtUsername="//input[@id='customer.username']";
    public static String txtPassword="//input[@id='customer.password']";
    public static String txtUsernamelogin="//input[@name='username']";
    public static String txtPasswordlogin="//input[@name='password']";
    public static String txtConfirm="//input[@id='repeatedPassword']";

    public static String BtnRegister="//input[@value='Register']";
    public static String linkRegister="//*[@id=\"loginPanel\"]/p[2]/a";
    public static String Retroceder="//*[@id=\"leftPanel\"]/ul/li[8]/a";
    public static String Login="//input[@value='Log In']";
}
