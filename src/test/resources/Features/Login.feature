Feature: Login Functionality of WSECU Online Banking
  @smoke @login
  Scenario: Negative testing login functionality
    Given User  navigates to the WSECU home page and clicks on sign in button
    And  User is redirected to WSECU Online Banking page
    When  User enter wrong credentials and clicks on sign in button
    Then an error message is received that states “Sorry, incorrect username.”