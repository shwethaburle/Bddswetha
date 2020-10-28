Feature: Login to nop commerce application
  In order to login
  As a valid user
  I have to provide user name and password

  Scenario Outline: Verify login with valid credentials
    Given I navigate to url "https://demo.nopcommerce.com/"
    When  I click on login link from navbar
    Then  I should be able to navigated to login page
    When  I enter email "<email>"
    And   I enter password "<password>"
    And   I click on login button
    Then  I should be logged in successfully

    Examples:
    |   email          | password     |
    |teammoon9@qa.com  | abcs456      |
    |teammoon10@qa.com | abcs456      |