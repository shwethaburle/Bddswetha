package pageObjects;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends BaseTest
{
    WebDriver driver;

    @FindBy(id = "gender-male")
    public WebElement maleRadioBtn;

    @FindBy(id = "gender-female")
    public WebElement femaleRadioBtn;

    @FindBy(id = "FirstName")
    public WebElement firstNameTextBox;

    @FindBy(name = "LastName")
    public WebElement lastNameTextBox;

    @FindBy(id = "Email")
    public WebElement emailTextBox;

    @FindBy(id = "Password")
    public WebElement passwordTextBox;

    @FindBy(id = "ConfirmPassword")
    public WebElement confirmTextBox;

    @FindBy(id = "register-button")
    public WebElement registerBtn;

    @FindBy(name = "DateOfBirthDay")
    public WebElement dobDropDown;
    @FindBy(name = "DateOfBirthMonth")
    public WebElement monthDropDown;
    @FindBy(name = "DateOfBirthYear")
    public WebElement yearDropDown;
    @FindBy(css = "div.result")
    public WebElement resultText;


    public RegisterPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickMaleRadioBtn()
    {
        maleRadioBtn.click();
    }

    public void clickFemaleRadioBtn()
    {
        femaleRadioBtn.click();
    }

    public void enterFirstName(String enterFN)
    {
        firstNameTextBox.sendKeys(enterFN);
    }

    public void enterLastName(String enterLN)
    {
        lastNameTextBox.sendKeys(enterLN);
    }

    public void enterEmail(String enterEmail)
    {
        emailTextBox.sendKeys(enterEmail);
    }

    public void enterPassword(String enterPw)
    {
        passwordTextBox.sendKeys(enterPw);
    }

    public void enterConfirmPassword(String enterConfPw) {
        confirmTextBox.sendKeys(enterConfPw);
    }

    public void clickRegisterBtn()
    {
        registerBtn.click();
    }

    public void selectDate()
    {
        Select a = new Select(dobDropDown);
        a.selectByIndex(1);
    }

    public void selectMonth()
    {
        Select b = new Select(monthDropDown);
        b.selectByValue("5");
    }

    public void selectYear()
    {
        Select c = new Select(yearDropDown);
        c.selectByValue("1992");

    }

    public String getRegisterConfMsg()
    {
        return resultText.getText();
    }
}


