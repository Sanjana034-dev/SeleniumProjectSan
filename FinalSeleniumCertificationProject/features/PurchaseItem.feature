#Author: your.email@your.domain.com
@tag
Feature: Purchase item from cart which was added

  @tag1
  Scenario: Purchase item
    Given Open demoblazesite
    And add item to cart
    Then Click on cart
    And Click on place order
    And Add all the details
    And click Purchase
    Then Pop up confirmation will be displayed and click on OK
