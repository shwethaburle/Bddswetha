Feature: Register new user and Login to nop commerce

  Background: navigate to url
    Given I navigate to url "https://demo.nopcommerce.com/"
    Then  I should be navigated to home page

  Scenario: Register new user by providing in all mandatory fields

    When I click on register link
    Then I should be navigated to register page
    When I select gender
    And  I enter firstName lastName email password confirmPassword
      | firstName | lastName |  email          | password | confirmPassword|
      | team      | moon     |teammoon51@qa.com | abcs456  |  abcs456       |

    And I click on register button
    Then registration should be successful


  Scenario: Verify login with valid credentials

    When  I click on login link from navbar
    Then  I should be able to navigated to login page
    When  I enter email 'teammoon51@qa.com'
    And   I enter password 'abcs456'
    And   I click on login button
    Then  I should be logged in successfully
