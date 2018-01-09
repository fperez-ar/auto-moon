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
  "name": "cheapest result contains: \"\u003cresult\u003e\"",
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
  "duration": 4579709623,
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
  "name": "cheapest result contains: \"Sailor Moon 7\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Search.user_navigates_homepage()"
});
formatter.result({
  "duration": 2649939570,
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
  "duration": 1540470677,
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
  "duration": 1208451629,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sailor Moon 7",
      "offset": 27
    }
  ],
  "location": "Search.cheapest_result_contains(String)"
});
formatter.result({
  "duration": 6718002502,
  "status": "passed"
});
formatter.write("* Cheapest price found: ARS$251,21");
formatter.write("* See https://www.bookdepository.com/Sailor-Moon-Vol-7-Naoko-Takeuchi/9781612620039?ref\u003dgrid-view\u0026qid\u003d1515518857488\u0026sr\u003d1-2");
formatter.after({
  "duration": 81262407,
  "status": "passed"
});
});