Feature: Change quantity of a product in the shopping cart
  As a customer
  I want to change the quantity of a product in my shopping cart
  so that I don't have to delete and re-order if I made a mistake

  Scenario: Change quantity from 1 to 5 when product is available
    Given there are 5 or over items of the product in stock
    And I have the product in my shopping cart with quantity 1
    When I change the quantity of the product to 5
    Then the quantity of the product in my cart should update to 5

  Scenario: Change quantity to -1
    Given I have the product in my cart
    When I change the quantity of the product to -1
    Then an error should appear
    And the product should remain in my cart with original quantity

  Scenario: Change quantity from 1 to 5 when product is not available
    Given there are less than 5 items of the product in stock
    And I have the product in my shopping cart with quantity 1
    When I change the quantity of the product to 5
    Then I should be told the stock of the product
    And asked if I want to add available items to cart