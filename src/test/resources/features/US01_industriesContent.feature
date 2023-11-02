Feature: Industries Dropdown

  @us01
  Scenario: Verify Industries Dropdown Table Content
    Given the user is on the main page
    When the user clicks on the industries dropdown
    Then the user should observe the dropdown content
      | Financial Services |
      | Insurance          |
      | ECommerce          |
      | Higher Education   |
      | Foodservices       |
      | Logistics          |
      | Manufacturing      |
      | Retail             |
    And clicks the logistics link
    Then user should be able to see the link content




