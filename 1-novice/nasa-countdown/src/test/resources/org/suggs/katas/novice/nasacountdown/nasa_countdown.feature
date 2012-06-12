Feature: Countdown from any number to zero
  In order to allow the the space shuttle to take off
  As a take off coordinator
  I want a countdown sequence from any given number

  Scenario:
    When I request a countdown from 21
    Then I expect an array with 21 numbers
    And the array countdown in order from 21 to 0
