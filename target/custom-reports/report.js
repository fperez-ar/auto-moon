$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("search.feature");
formatter.feature({
  "line": 1,
  "name": "",
  "description": "",
  "id": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Search",
  "description": "",
  "id": ";search",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User navigates to Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User searches: \"\u003csearch_term\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User sorts results by: \"\u003csort_criteria\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "topmost result is: \"\u003cresult\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": ";search;",
  "rows": [
    {
      "cells": [
        "search_term",
        "sort_criteria",
        "result"
      ],
      "line": 10,
      "id": ";search;;1"
    },
    {
      "cells": [
        "Sailor Moon 7",
        "Price, low to high",
        "Sailor Moon 7"
      ],
      "line": 11,
      "id": ";search;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1070414188,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Search",
  "description": "",
  "id": ";search;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User navigates to Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User searches: \"Sailor Moon 7\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User sorts results by: \"Price, low to high\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "topmost result is: \"Sailor Moon 7\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Search.user_navigates_homepage()"
});
formatter.result({
  "duration": 2498515660,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sailor Moon 7",
      "offset": 16
    }
  ],
  "location": "Search.user_searches(String)"
});
formatter.result({
  "duration": 1735068236,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Price, low to high",
      "offset": 24
    }
  ],
  "location": "Search.user_sorts_results_by(String)"
});
formatter.result({
  "duration": 1284116770,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sailor Moon 7",
      "offset": 20
    }
  ],
  "location": "Search.topmost_result_is(String)"
});
formatter.result({
  "duration": 279643266,
  "error_message": "java.lang.NumberFormatException: For input string: \"270,78\"\n\tat java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)\n\tat java.lang.Integer.parseInt(Integer.java:580)\n\tat java.lang.Integer.parseInt(Integer.java:615)\n\tat test.pageObjects.SearchResults.getCheapest(SearchResults.java:68)\n\tat test.steps.Search.topmost_result_is(Search.java:74)\n\tat ✽.Then topmost result is: \"Sailor Moon 7\"(search.feature:7)\n",
  "status": "failed"
});
formatter.write("https://www.bookdepository.com/search?searchTerm\u003dSailor+Moon+7\u0026ageRangesTotal\u003d1\u0026searchSortBy\u003dprice_low_high");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 353478024,
  "status": "passed"
});
});