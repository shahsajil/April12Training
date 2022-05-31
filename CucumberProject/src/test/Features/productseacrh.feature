Feature: Test Product Search functionality

Scenario: Verify user can seacrch the product with valid keywords
Given website browser is open
And navigate to the website url
When user enter product keyword in search field
And click search icon
Then user is navigated to the Dresses Page