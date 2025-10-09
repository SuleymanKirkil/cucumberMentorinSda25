@negativeLogin
Feature: Negative Login Scenarios
  As a user
  I want to verify invalid login attempts
  So that proper error messages are displayed
@ScenarioOutline

@githubFix
  Scenario: Empty username
  Given user goes to "https://claruswaysda.github.io/signIn.html"
  When user enters "" as username
  And user enters "123" as password
  And user clicks the Sign Up button
  Then user should see "Please Fill Out This Field" error message on username
  And user closes driver
