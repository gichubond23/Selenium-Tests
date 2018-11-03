Feature: Contact Page Form Filling
  Scenario Outline: Fill the Contact Page form
    Given Firefox Browser is being initiated
    And User navigates to the testing url <url>
    And Navigates to contact page
    When User fills the Contact details like <name>, <mobile no>, <country>, <email>, <description>
    Then Validate the entered <name>, <mobile no>, <country>, <email>, <description> fields

    Examples:
    |url                               |name       |mobile no        |country       |email         |description          |
    |http://www.qaclickacademy.com/    |abcd       |9876543215       |USA           |abc@yahoo.com |Discount on courses  |