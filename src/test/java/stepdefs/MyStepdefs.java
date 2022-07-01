package stepdefs;

import Helpers.LoginHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.SeleniumDriver;

public class MyStepdefs {


    LoginHelper loginHelper;

    public MyStepdefs() {
        loginHelper = new LoginHelper();
    }



    @Given("I navigate to Jetbrains app")
    public void iNavigateToJetbrainsApp() {
        SeleniumDriver.openPage("https://www.jetbrains.com/help/pycharm/creating-step-definition.html#tips=tricks");

    }

    @Given("I navigate to FB app")
    public void iNavigateToFBApp() {
        SeleniumDriver.openPage("https://www.facebook.com/");

    }

    @Then("I login with {string} and password {string}")
    public void iLoginWithAndPassword(String userName, String Password) {
        loginHelper.LoginFlipkart(userName, Password);
    }
}
