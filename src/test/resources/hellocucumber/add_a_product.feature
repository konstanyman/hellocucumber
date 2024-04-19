Feature: Adding a product
  As a customer
  I want to add a product to the shopping cart one by one
  so that I could order it/them

  Scenario: Adding a product to an empty cart
    Given the shop exists
    And the cart is empty
    And the product is available
    When I add a product to the cart
    Then the product should appear in the cart

  Scenario: Adding a product to a non-empty cart
    Given the shop exists
    And the cart is not empty
    And the product is available
    When I add a product to the cart
    Then the product should appear with already existing products

  Scenario: Adding out-of-stock products to a cart
    Given the shop exists
    And the product is out-of-stock
    When I add a product to the cart
    Then the addition should fail