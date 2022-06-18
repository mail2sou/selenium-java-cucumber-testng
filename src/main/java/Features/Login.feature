Feature: Login feature

  Scenario Outline: Login to the website

    Given I navigate to the login page
    When I verify title
    Then user enters "<username>" and "<password>"
    Then Close the browser

    Examples:
    |username|password|
    |abc     |123     |