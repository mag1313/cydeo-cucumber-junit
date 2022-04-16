
Feature: Calculator should work for simple math
  As a user I should be able to do simple math


  Scenario Outline: Should be able to add two numbers

    Given Calculator is open
    When I add <firstNumber> with <secondNumber>
    Then I should get <finalResult>

    Examples:
      | firstNumber | secondNumber | finalResult |
      | 2           | 3            | 5           |
      | 10          | 5            | 15          |
      | 20          | 25           | 45          |
      | 11          | 12           | 23          |