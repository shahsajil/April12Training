Feature: Test Dresses product SummersubcategorySelection

  Scenario: Verify that user can select summer dresses subcategory
    Given WebBrowser is open
    And navigate to the Website URL
    When user select dresses tab in homepage
    And click Summer Dresses subcategory in dressesPage
    Then user should able to see the Summer Dresses in pagetitle
