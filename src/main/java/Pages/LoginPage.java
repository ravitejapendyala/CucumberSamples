package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utils.SeleniumDriver;

public class LoginPage {
    public LoginPage()
    {
        PageFactory.initElements(SeleniumDriver.getDriver(), this);
    }


    @FindBy(how= How.XPATH,using="//div[@class='_39M2dM JB4AMj']/input")
    public WebElement userName_txt;
    @FindBy(how=How.XPATH,using="//input[@type='password']")
    public WebElement password_txt;
    @FindBy(how=How.XPATH,using="//button//span[text()='Login']")
    public WebElement signIn_btn;


    public void EnterUserName(String userName)
    {
        userName_txt.sendKeys(userName);
    }

    public void EnterPassword(String password)
    {
        password_txt.sendKeys(password);
    }

    public void ClickLogin()
    {
        signIn_btn.click();
    }
}
