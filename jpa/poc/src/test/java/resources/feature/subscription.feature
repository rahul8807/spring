Feature: Subscription Management

  Scenario: Create a new Subscription
    Given I have a Subscription id
    When I add the subscription
    Then Subscription should be added
