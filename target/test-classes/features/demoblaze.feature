Feature: Demo Blaze Functionality
  User story: As a user, when i am on the demo blaze page
  I should be able go through product categories and see relevant information

  @wip
  Scenario: User can go through product categories
    Given Customer navigation through product categories: Phones, Laptops and Monitors
    When Navigate  Laptops → Sony vaio i5 and click on Add to cart. Accept pop up confirmation.
    When Navigate to Phones → Samsung galaxy s6 and click on Add to cart. Accept pop up confirmation.
    And Navigate to the Monitors → Apple monitor  and click on Add to cart. Accept pop up confirmation.
    And Navigate to Cart → Delete Apple monitor  from cart.
    Then Click on Place order
    Then Fill in all web form fields.
    Then Click on Purchase
    Then Assert purchase amount  expected.
    Then Click Ok button
    Then Verify that there is no product in the cart
