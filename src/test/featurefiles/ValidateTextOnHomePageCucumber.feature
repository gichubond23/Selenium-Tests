Feature: HomePage Text Validation
  Scenario Outline: Validate Text on HomePage
    Given Firefox Browser will be Initiated
    When User is navigated to the url <url>
    Then Validate the Text on the home page

    Examples:
    |url                              |
    |http://www.qaclickacademy.com/   |

