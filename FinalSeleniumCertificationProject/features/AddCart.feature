#Author: your.email@your.domain.com
@tag
Feature: Verify an item is added to cart

  @tag1
  Scenario: Add an item into cart
    Given Open demoblaze
    Then Click on item samsung galaxy
    And Click on add to cart
    Then Confirmation will be displayed
    Then Click ON CART
