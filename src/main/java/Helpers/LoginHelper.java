package Helpers;

import Pages.LoginPage;

public class LoginHelper {

    LoginPage loginPage;
    public LoginHelper()

    {
        loginPage = new LoginPage();
    }


    public void LoginFlipkart(String userName,String Password)
    {
        loginPage.EnterUserName(userName);
        loginPage.EnterPassword(Password);
        loginPage.ClickLogin();
    }
}
