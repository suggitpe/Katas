Feature: Greet famous people correctly
  In order to ensure this is not my last hosting
  As the host of a party of famous people
  I want to greet my guests properly

  Scenario Outline:
    When their name is <name>
    And when their sex is <sex>
    And when their Knighted status is <isSir>
    Then my greeting should be <greeting>

  Examples:
    | name        | sex    | isSir | greeting              |
    | Shakespeare | male   | false | Hello Mr. Shakespeare |
    | Guinness    | male   | true  | Hello Sir Guinness    |
    | Ustinov     | male   | true  | Hello Sir Ustinov     |
    | Austen      | female | false | Hello Ms. Austen      |
    | Newton      | male   | true  | Hello Sir Newton      |
    | Orwell      | male   | false | Hello Mr. Orwell      |
    | Andrews     | female | false | Hello Ms. Andrews     |
    | Orwell      | male   | false | Hello Mr. Orwell      |