Feature: Calculate the greatest common divisor of each fraction
  In order to mix your cough syrup properly
  As a person who feels sick
  I want to calculate the greatest common divisor for each fraction

  Scenario Outline:
    When I calculate the common divisor for <numerator> / <denominator>
    Then the greatest common divisor should be <GCD>

  Examples:
    | numerator | denominator | GCD |
    | 123       | 246         | 123 |
    | 50        | 125         | 25  |
    | 0         | 488         | 488 |
    | 113       | 311         | 1   |
    | 12        | 8           | 4   |
    | 23        | 230         | 23  |
    | 240       | 680         | 40  |
