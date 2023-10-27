Feature: Main Menu Navigation

  @us02
  Scenario: User Explores Main Menu Options
    Given a user is on the homepage
    When the user selects the main menu
    And all options should be accurately labeled and relevant

      | Mortgage Assistance Programs |
      | F A Qs                       |
      | Common Banking Tasks         |
      | Locations & ATMs             |
      | About M&T                    |
      | Banking Security             |
      | Careers                      |

    Then user clicks on About M&T option