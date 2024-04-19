Feature: Query of the shopping cart
  As a customer
  I want to see the items in my shopping cart
  so that I know what I'm ordering

  Scenario: Open the shopping cart listing
    Given the shopping cart is non-empty
    When I query for the listing
    Then each item in the cart should be listed
    And quantities should be displayed respectively

  Scenario: Open an empty shopping cart
    Given the cart is empty
    When I query for the listing
    Then I should be told that the shopping cart is empty