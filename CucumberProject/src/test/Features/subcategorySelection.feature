Feature: Test Dresses product SubcategorySelection

Scenario: Verify that user can select summer dresses subcategory
Given WebBrowser is open
And navigate to the URL
When user select dresses keyword in homepage
And Select the Summer Dresses in subcategory
Then User should able to see the Summer Dresses in a page title