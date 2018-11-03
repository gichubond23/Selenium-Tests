Feature: QAClickAcademy Course Page
  Scenario Outline: Login to QAClickAcademy and validate the course curriculum page
    Given Firefox Browser was Initiated
    And User navigates to the url <url>
    And Clicks on Login Link on the HomePage
    And User enters his username <username> and password <password> and clicks login button
    When User clicks the course
    Then Verify the text on the course curriculum page

    Examples:
    |url                                      |username           |password   |
    |http://www.qaclickacademy.com/           |test99@gmail.com   |123456     |