Feature: Contact Page Text Validation
  Scenario Outline: Validate the header text when navigated to contact page
    Given Firefox Browser is going to be initiated
    And User navigates to the website url <url>
    When User navigates to contact page
    Then Verify the text on the contact page

    Examples:
    |url                              |
    |http://www.qaclickacademy.com/   |