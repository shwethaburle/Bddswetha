Feature: Register new user

  Scenario: Register new user by providing in all mandatory fields
    Given I navigate to url "https://demo.nopcommerce.com/"
    When I click on register link
    Then I should be navigated to register page
    When I select gender
    And  I enter firstName lastName email password confirmPassword
    | firstName | lastName |  email          | password | confirmPassword|
    | team      | moon     |teammoon22@qa.com | abcs456  |  abcs456       |

    And I click on register button
    Then registration should be successful

