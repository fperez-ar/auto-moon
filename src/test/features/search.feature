Feature:

 Scenario Outline: Search
  Given User navigates to Homepage
  When User searches: "<search_term>"
  And User sorts results by: "<sort_criteria>"
  Then topmost result is: "<result>"

 Examples:
  | search_term    | sort_criteria 		| result        |
  | Sailor Moon 7  | Price, low to high | Sailor Moon 7 |
