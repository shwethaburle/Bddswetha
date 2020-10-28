package base;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.RegisterPage;

import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class BaseTest
{
    public static WebDriver driver;

    public static HomePage homePage;

    public static RegisterPage registerPage;

    public static LoginPage loginPage;

    public static final String AUTOMATE_USERNAME = "swethaswetha1";
    public static final String AUTOMATE_ACCESS_KEY = "xvCkSoePNcYYgjgoRtk2";
    public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";




    @BeforeAll
    public static void setUp() throws MalformedURLException {


        /*
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

         */

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "7");
        caps.setCapability("browser", "Chrome");
        caps.setCapability("browser_version", "latest");
        caps.setCapability("browserstack.local", "false");
        caps.setCapability("browserstack.selenium_version", "3.14.0");
        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);


        driver.navigate().to("https://demo.nopcommerce.com/");
        homePage = new HomePage(driver);
        registerPage = new RegisterPage(driver);
        loginPage = new LoginPage(driver);

    }

    @AfterAll
    public static void tearDown()
    {
        driver.quit();
    }


    public String getPageTitle()
    {
        return driver.getTitle();

    }

    public void refresh()
    {
        driver.navigate().refresh();

    }

    public void navigateToUrl(String url)
    {
        driver.navigate().to(url);
    }
}

