#Author: your.email@your.domain.com
Feature: To verify  that the user enters the valid user name

  @Tag1
  Scenario: User logs into the page with correct username and password

  Scenario Outline: Verify error message when logged in with invalid credentials
    Given User opens demoblaze through google
    Then Click on Login
    Then Enter username "san"
    And Enter password "san"
    Then Click on Login button

  @Tag2
  Scenario: User enter wrong password
    Given User opens demoblaze through google
    Then Click on Login
    Then Enter username "san"
    And Enter password "yg"
    Then Click on Login button
    And Password incorrect message should be displayed

  @Tag3
  Scenario: User enter wrong password
    Given User opens demoblaze through google
    Then Click on Login
    Then Enter username "yg"
    And Enter password "san"
    Then Click on Login button
    And Username incorrect message should be displayed
