Feature: Examples of cucumber data table implementations

  Scenario: List of fruits I like
    Then user should see fruits i like
      | kiwi        |
      | banana      |
      | cucumber    |
      | mango       |
      | grape       |
      | pomegranate |

  @wip
  Scenario: User should be able to see all 12 months in months
  dropdown
    Given User is on the dropdowns page of practice tool
    Then User should see below info in month dropdown
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |
