Feature: Verification of Fulcrum Digital Virtual Events Titles

  @us02
  Scenario: User verifies virtual event titles
    Given the user is on the main page
    When the user clicks on the events section
    And selects virtual events
    Then the user should be presented with all virtual events

