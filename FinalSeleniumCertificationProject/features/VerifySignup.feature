Feature: Signup on DemoBlaze
@Tag1
  Scenario: User signs up successfully
    Given user opens "https://demoblaze.com/index.html" through google browser2
    When  clicks on the signup button
    And enters username "bhb"
    And  enters password "hhj"
    Then  clicks on the signup button2
    Then should see a signup confirmation message
    
@Tag2
 Scenario: Existing user exits
     Scenario: Existing user exits
    Given user opens "https://demoblaze.com/index.html" through google browser2
    When  clicks on the signup button
    And enters username "<username>"
    And  enters password "<password>"
    Then  clicks on the signup button2
    Then should see a Existing user message
   
    
     Examples:
    | url                       | username | password   |
    | https://demoblaze.com    | Sanjana  | San@123    |
    | https://demoblaze.com    | Alex     | Pass@456   |
    | https://demoblaze.com    | John     | Test@789   |
    
 
   
    
   
   
