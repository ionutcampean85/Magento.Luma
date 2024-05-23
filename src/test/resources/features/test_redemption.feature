Feature: Test scenarios for Luma web-site

  Scenario: Successful product redemption
    Given I access the homepage
    When I click on 'Men' top header menu option
    Then I should be on the Men articles page
    And click on 'Shop Tees' tile
    And click on first item from the list