Feature: Checkout

  Scenario: User invalid checkout
    When User go to Web HRM
    And User click button cart
    Then User invalid credentials

  Scenario: User invalid checkout
      When User go to cart
      And User click button place order
      Then User invalid credentials