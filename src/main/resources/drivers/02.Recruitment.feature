Feature: Recruitment

  Scenario: Admin input valid Recruitment
    When Admin
    And User click button Recruitment
    Then User invalid credentials

  Scenario: User invalid search
      When User go to Web HRM
      And User click button Recruitment
      Then User invalid credentials

  Scenario: User valid add cart
    When User click button product valid
    And User click button add to cart valid
    Then User valid credentials
