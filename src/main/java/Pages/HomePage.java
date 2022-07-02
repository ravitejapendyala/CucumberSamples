package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utils.SeleniumDriver;

public class HomePage {

    public HomePage()
    {
        PageFactory.initElements(SeleniumDriver.getDriver(), this);
    }


    @FindBy(how= How.XPATH,using="//div[@class='_2IX_2- VJZDxU']/input")
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
}
