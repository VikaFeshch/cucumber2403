Feature: Empty first running
  Scenario: Sout
    When sout my name
    And sout my surname
    Then sout my age

    Scenario: data
      When sout my name "Lera"
      And sout my surname "Feshch" and surname my daughter "Shel"