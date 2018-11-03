Feature: QAClickAcademyHomePage
  Scenario Outline: Get Count of links in header and navigate to any two links in QAClickAcademyHomePage
    Given Firefox Browser Initiated
    And User navigates to url <url>
    When User gets the count of links in header
    And Navigates to first link
    Then Validate the navigation to the first link page
    And Navigates to the second link
    Then Validate the navigation to the second link page

    Examples:
    |url                              |
    |http://www.qaclickacademy.com/   |