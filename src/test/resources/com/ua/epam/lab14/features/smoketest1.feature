Feature: smoke test
  Scenario: log in in gmail with right login and password

    #actions at first page
    Given open https://www.google.com/intl/ru/gmail/about/
    When press "Sign in" button
    And type to input with type "identifierId" text: "anton"
    And press element with value "Далее"
    And type to input with name "password" text: "3103306910fyn1jy"
    And press element with value "Далее"
    Then should be opened https://mail.google.com/mail/u/0/#inbox
