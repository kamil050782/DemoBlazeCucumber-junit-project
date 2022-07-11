Feature: Etsy Title Verification

  User story: As a user, when i am on the etsy page
  I should be able search whatever i want and see relevant information

  Background:
    Given User is on the etsy page

  @etsy
  Scenario: Etsy title verification
    Then User sees title is as expected.Expected: Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone
  @withParam
  Scenario: Search functionality  result title Verification(without parameterization)
    When User types Wooden Spoon in the search box
    Then User clicks search button
    And User sees Wooden spoon - Etsy is in the title
 @withoutParam
  Scenario: Search functionality  result title Verification(with parameterization)
    When User types "Wooden Spoon" in the search box
    Then User clicks search button
    And User sees "Wooden spoon - Etsy" is in the title
