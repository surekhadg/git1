@tag
Feature: Login to Facebook

  @tag1
  Scenario: Verify Facebook login with valid credentials
    Given User launch Chrome browser
    And User enters URL
    Then User enters Username and password
    And User click login

   @tag2
  Scenario: Parameter credentials
    Given User launch Chrome browser
    And User enters URL
    Then User enters "surekha" and "pass"
    And User click login
    
     @tag3
  Scenario: Parameter credentials
    Given User launch Chrome browser
    And User enters URL
    Then User enters "<username>" and "<password>"
    And User click login
    
    Examples:
    |username|password|
    |surekha |pass1   |
    |saranya |pass2   |
    |navya   |pass3   |