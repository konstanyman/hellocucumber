Feature: Removing a product from shopping cart
  As a customer
  I want to remove a product from my shopping cart
  so that I can order the other products without starting over

  Scenario: Remove a product from the shopping cart
    Given I have the product in my shopping cart
    When I remove the product
    Then the product should be removed from the shopping cart