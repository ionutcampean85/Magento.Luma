Feature: Test scenarios for Test web-site

  Scenario: Successful product redemption
    Given I access the homepage
    When I click on 'Men' top header menu option
    Then I should be on the Men articles page
    And click on 'Shop Tees' tile
    And click on first item from the list
    And choose colour 'Red'
    And choose 'XL' size
    And add product to the cart
    And proceed to checkout
    And I fill in the shipping page with folowing:
      | Email Address   | icampean85@gmail.com |
      | First Name      | john                 |
      | Last Name       | smith                |
      | Street Address  | 24 East              |
      | City            | Cluj-NApoca          |
      | State/Province  | Cluj                 |
      | Zip/Postal Code | 12345                |
      | Country         | United Kingdom       |
      | phone number    | 0757553050           |
    And select 'Flat Rate' shipping method
    And I click 'Next'
    Then I should see my entered details in the summary:
      | First Name   | john           |
      | City         | Cluj-Napoca    |
      | Country      | United Kingdom |
      | Phone Number | 0757553050     |
      | Order Total  | 44             |
    And 'Flate Rate' should be the shipping method
    When click on 'Place Order' button
    Then I should see the text "Thank you for your purchase!"





