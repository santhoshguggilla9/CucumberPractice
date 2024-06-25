Feature: Check Login and Dashboard

  Background: 
    Given user is on the login page
    Then user should click on the login link

  Scenario: Login with valid credentials
  	When user enter valid <username> and <password>
    Then user should able to see the dashboard
    And user should click on logout button
    Then user should able to see the login page

	Examples:
    | username | password |
    | infopath9@gmail.com | Tosca1234! |
    
  Scenario: Login with Invalid credentials
  	When user enter invalid <username> and <password>
    Then user should able to see error message
    
    Examples:
    | username | password |
    | iamsan@gmail.com | Tosca12 |
