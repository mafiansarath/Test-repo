Feature: Google Search Functionality

  Scenario: Validate Google Search box
    Given I launch the Google homepage
    When I enter search data in the search box
    And I submit the search query
    Then I validate if the search results are relevant


  #Scenario Outline: Title of your scenario outline
#    Given I want to write a step with <name>
 #   When I check for the <value> in step
  #  Then I verify the <status> in step

#    Examples: 
 #     | name  | value | status  |
  #    | name1 |     5 | success |
   #   | name2 |     7 | Fail    |
