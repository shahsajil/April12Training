Feature: Test account registration functionality

  Scenario Outline: Verify user can register a new account
    Given newbrowser is open
    When user enter website url
    And user click on signintab
    When user enter validnew <emailaddress>
    And click create an account
    And click title radio button Mr
    And Enter Personl information <firstname>,<lastname> and <password>
    And select day month year from dropdown option
    And Click Resgister tab
    Then user should see the message like Your account has been created

    Examples: 
      | emailaddress    | firstname | lastname | password |
      | asdfga@gmail.com | asdfg     | gfdsa    | asdfg    |
      | qwerta@gmail.com | qwert     | trewq    | qwert    |
