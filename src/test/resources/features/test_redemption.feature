Feature: Test scenarios for Luma web-site

  Scenario: Successful product redemption
    Given I am on "<Home>" page
    When I click on 'Men' top header menu option
    Then I should be on the Men page

    Given I am on "<Men>" page
    And I click on 'Shop Tees' tile
    Then 'Men Tees' are displayed

#    Given I am on "<Men Tees>" page
#    When I click on first item from the list
#    Then product with item 'Strike Endurance Tee' is displayed
#
#    Given I am on 'Strike Endurance Tee' page
#    When I choose colour 'Red'
#    And choose 'XL' size
#    And add product to the cart
#    And click the cart small icon
#    And click proceed to checkout
#    Then I should be on the 'Shipping address' page
#
#    Given I am on 'Shipping address' page
#    When I fill in the shipping page with folowing:
#      | Email Address   | icampean85gmail.com |
#      | First Name      | john                |
#      | Last Name       | smith               |
#      | Street Address  | 24 East             |
#      | City            | Cluj-NApoca         |
#      | State/Province  | Cluj                |
#      | Zip/Postal Code | 12345               |
#      | Country         | United Kingdom      |
#      | Phone Number    | 0757553050          |
#    And select 'Flat Rate' shipping method
#    And I click 'Next'
#    Then I am on 'Summary' page
#    And I should see my entered details in the summary:
#      | First NAme   | john           |
#      | City         | Cluj-Napoca    |
#      | Country      | United Kingdom |
#      | Phone Number | 0757553050     |
#      | Order Total  | 44             |
#    And 'Flat Rate' should be the shipping methode
#
#    Given I am on the 'Summary' page
#    When I click on 'Place Order' button
#    Then I should see the text 'Thank you for your purchase'

