Feature: Login to QAClickAcademy
  Scenario Outline: Login to QAClickAcademy and verify successful login
    Given Firefox Browser is Initiated
    And Navigate to the url "http://www.qaclickacademy.com/"
    And Click on Login Link on the HomePage
    When User enters username <username> and password <password> and clicks login button
    Then Verify user is successfully logged in
    And Quit Browser

    Examples:
    |username               |password     |
    |test99@gmail.com       |123456       |