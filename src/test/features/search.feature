Feature:

 Scenario Outline: Search
  Given User navigates to Homepage
  When User searches: "<search_term>"
  And User sorts results by: "<sort_criteria>"
  Then cheapest title contains: "<result_title>"
  And author is: "<result_author>"

 Examples:
  | search_term    | sort_criteria      | result_title  	 | result_author |
  | Sailor Moon 7  | Price, low to high | Sailor Moon Vol. 7 | Naoko Takeuchi|
