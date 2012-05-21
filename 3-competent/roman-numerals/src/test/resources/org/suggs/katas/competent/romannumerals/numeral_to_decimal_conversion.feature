Feature: Convert roman numerals to decimal
  In order to see the decimal value of roman numerals
  As a reader of roman numerals
  I want to convert roman numerals to decimal values

  Scenario Outline:
    When I convert the roman numeral <roman_numeral>
    Then the decimal value should be <decimal_value>

  Examples:
    | roman_numeral | decimal_value |
    | I             | 1             |
    | II            | 2             |
    | IV            | 4             |
    | VII           | 6             |
    | X             | 10            |
