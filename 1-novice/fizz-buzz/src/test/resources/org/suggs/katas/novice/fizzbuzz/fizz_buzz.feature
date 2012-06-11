Feature: Make people happy with a drinking game
  In order to settle a difference of opinion in a fun way
  As someone who wants to have a challenge
  I want a drinking game that I can play with someone

  Scenario Outline:
    When it is my turn to state the number <number>
    Then my response should be <response>

  Examples:
    | number | response |
    | 1      | 1        |
    | 3      | fizz     |
    | 5      | buzz     |
    | 6      | fizz     |
    | 7      | 7        |
    | 15     | fizzbuzz |
    | 30     | fizzbuzz |
