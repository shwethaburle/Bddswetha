package pageObjects;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTest {
    @FindBy(id = "Email")
    public WebElement emailTextbox;

    @FindBy(id = "Password")
    public WebElement passwordTextBox;

    @FindBy(className = "login-button")
    public WebElement loginBtn;

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterEmail(String em)
    {
        emailTextbox.sendKeys(em);
    }

    public void enterPassword(String pw)
    {
        passwordTextBox.sendKeys(pw);
    }

    public void clickLoginBtn()
    {
        loginBtn.click();
    }


}


