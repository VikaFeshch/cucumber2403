Feature: Certificate

  @ChCS
  Scenario: Checking certificate
    When send certificate "45924126"
    Then checking result "true"

  @ChCS
    Scenario Outline: Checking certificates
      When send certificate "<number>"
      Then checking result "<result>"
      Examples:
        | number   | result |
        | 45924126 | true   |
        | 45871    | false  |
        | 78008248 | true   |
        | 12345677 | false  |