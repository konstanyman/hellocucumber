Feature: Adding products in quantities
  As a customer
  I want to add a product in multiple quantities
  so that I can order them

  Scenario: Add 10 quantities of a product
    Given the shop exists
    And the product is available
    When I add 10 of the product to cart
    Then The product should appear in the cart with a quantity of 10

  Scenario: Add -1 quantities of a product
    Given the shop exists
    And the product is available
    When I add -1 of the product to cart
    Then an error should appear

  Scenario: Add 10 products when only 5 in stock
    Given the shop exists
    And there are 5 of the product in stock
    When I add 10 of the product to cart
    Then an error should appear