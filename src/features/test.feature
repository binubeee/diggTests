Feature: diggtests

  Scenario: verify Digg Search functionality returns valid results
    Given User is on Digg home page
    When User enters a search criteria "test"
    And Hits Enter
    Then Search results containing keyword "test" should be displayed in new tab
    And Verify the results against backend

  Scenario: verify Digg Search functionality returns valid message when no results found
    Given User is on Digg home page
    When User enters a search criteria "invalidsearchcriteria"
    And Hits Enter
    Then Search results containing keyword "invalidsearchcriteria" should be displayed in new tab


  Scenario: verify user can successfully navigate by clicking on search results
    Given User is on Digg home page
    And User enters a search criteria "test"
    And Hits Enter
    And Search results containing keyword "test" should be displayed in new tab
    When User clicks on a result
    Then Result should open in a new tab

  Scenario: Verify Digg sub headings
    Given User is on Digg home page
    And subheadings are displayed as expected
    When User clicks on "TECHNOLOGY"
    Then Technology page should be launched



