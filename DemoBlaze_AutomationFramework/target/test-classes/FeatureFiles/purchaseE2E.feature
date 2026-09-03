Feature: DemoBlaze WebSite Flow

Scenario: Complete purchase flow on DemoBlaze

    Given launched demoblaze website
    And User should be signed up
    And user is logged in
    When products are added to cart
    Then cart should contain added products
    And user places the order by entering purchase information
    Then purchase should be successful
    And user logs out