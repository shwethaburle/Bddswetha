import base.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;

import java.net.MalformedURLException;

public class StepDefinitions extends BaseTest
{

    @Given("I navigate to url {string}")
    public void i_navigate_to_url(String url) throws MalformedURLException
    {
       setUp();

        // navigateToUrl(url);

    }


    @When("I click on login link from navbar")
    public void i_click_on_login_link_from_navbar()
    {
        homePage.clickLoginLink();

    }

    @Then("I should be able to navigated to login page")
    public void i_should_be_able_to_navigated_to_login_page()
    {
       String loginPageTitle = getPageTitle();
       System.out.println(loginPageTitle);
    }


    @When("I enter email {string}")
    public void i_enter_email(String email)
    {
          refresh();
          loginPage.enterEmail(email);
    }


    @When("I enter password {string}")
    public void i_enter_password(String pw)
    {
        loginPage.enterPassword(pw);
    }


    @When("I click on login button")
    public void i_click_on_login_button()
    {
        loginPage.clickLoginBtn();

    }

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully()
    {
        boolean login = homePage.verifyLogin();
        System.out.println(login);
        tearDown();

    }



    @When("I click on register link")
    public void i_click_on_register_link()
    {
        homePage.clickRegisterLink();

    }

    @Then("I should be navigated to register page")
    public void i_should_be_navigated_to_register_page()
    {
        String registerPageTitle = getPageTitle();
        System.out.println(registerPageTitle);

    }

    @When("I select gender")
    public void i_select_gender()
    {
        registerPage.clickFemaleRadioBtn();

    }

    @When("I enter firstName lastName email password confirmPassword")
    public void i_enter_first_name_last_name_email_password_confirm_password(io.cucumber.datatable.DataTable dataTable)
    {
        refresh();
        registerPage.enterFirstName(dataTable.cell(1,0));
        registerPage.enterLastName(dataTable.cell(1,1));
        registerPage.enterEmail(dataTable.cell(1,2));
        registerPage.enterPassword(dataTable.cell(1,3));
        registerPage.enterConfirmPassword(dataTable.cell(1,4));


    }

    @When("I click on register button")
    public void i_click_on_register_button()
    {
        registerPage.clickRegisterBtn();
    }


    @Then("registration should be successful")
    public void registration_should_be_successful()
    {
         String confMsg = registerPage.getRegisterConfMsg();
         System.out.println(confMsg);
         tearDown();

    }







}
