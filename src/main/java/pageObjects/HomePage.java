package pageObjects;


import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseTest
{
    WebDriver driver;

    @FindBy(linkText = "Register") public WebElement registerLink;

    //@FindBy(id="") public WebElement nameofWebElement; (syntax)

    @FindBy(linkText = "Log in") public WebElement loginLink;

    @FindBy(className = "ico-wishlist") public WebElement wishListLink;

    @FindBy(css = "a.ico-cart") public WebElement shoppingCartLink;

    @FindBy(id = "small-searchterms") public WebElement searchTextBox;

    @FindBy(xpath = "//input[@class='button-1 search-box-button']") public WebElement searchBtn;

    @FindBy(linkText = "Log out") public WebElement logoutLink;

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);


    }

    public void navigateToUrl(String url)
    {
        driver.navigate().to(url);

    }

    public void clickRegisterLink()
    {
        registerLink.click();
    }

    public void clickLoginLink()
    {
        loginLink.click();
    }

    public void clickWishlistLink()
    {
        wishListLink.click();

    }

    public void clickShoppingCartLink()
    {
        shoppingCartLink.click();
    }

    public void enterSearchText(String searchText)
    {
        searchTextBox.sendKeys(searchText);
    }

    public void clickSearchButton()
    {
        searchBtn.click();
    }

    public void clickLogoutLink()
    {
        logoutLink.click();
    }

    public boolean verifyLogin()
    {
        return logoutLink.isDisplayed();

    }


}


