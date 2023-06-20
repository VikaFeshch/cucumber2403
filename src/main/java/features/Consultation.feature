Feature: consult
  Scenario: confirm form
    When I click consultation button
    And Fill in the form
      | name | email                | telegram  | viber     | telephone | course     |  |
      | Vika | vikafeshch@gmail.com | @feshviki | 660478391 | 660478391 | Java Basic |  |
    Then Check confirm button