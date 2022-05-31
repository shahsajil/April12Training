Feature: Test Login functionality

Scenario: Verify login is successful with valid credentials
Given browser is open
And user click in signin tab
When user is on login page
When user enters username and password
And click signin button 
Then user is navigated to the myaccount page