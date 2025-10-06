@firstFeature
Feature: First mentoring feature

  @duckduckgo
  Scenario: Duckduckgo scenario
    Given I visit "https://www.duckduckgo.com"
    Then I close driver

@google
  Scenario: Google scenario
    Given I visit "https://www.google.com"
    Then I close driver
