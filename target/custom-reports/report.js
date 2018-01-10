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
  "name": "cheapest title contains: \"\u003cresult_title\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "author is: \"\u003cresult_author\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": ";search;",
  "rows": [
    {
      "cells": [
        "search_term",
        "sort_criteria",
        "result_title",
        "result_author"
      ],
      "line": 11,
      "id": ";search;;1"
    },
    {
      "cells": [
        "Sailor Moon 7",
        "Price, low to high",
        "Sailor Moon Vol. 7",
        "Naoko Takeuchi"
      ],
      "line": 12,
      "id": ";search;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1136685409,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
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
  "name": "cheapest title contains: \"Sailor Moon Vol. 7\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "author is: \"Naoko Takeuchi\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Search.user_navigates_homepage()"
});
formatter.result({
  "duration": 26720297237,
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
  "duration": 72090913697,
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
  "duration": 14002173198,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sailor Moon Vol. 7",
      "offset": 26
    }
  ],
  "location": "Search.cheapest_title_contains(String)"
});
formatter.result({
  "duration": 11889105975,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Naoko Takeuchi",
      "offset": 12
    }
  ],
  "location": "Search.author_is(String)"
});
formatter.result({
  "duration": 85796264,
  "status": "passed"
});
formatter.write("* Cheapest price found: ARS$250,96");
formatter.write("* See https://www.bookdepository.com/Sailor-Moon-Vol-7-Naoko-Takeuchi/9781612620039?ref\u003dgrid-view\u0026qid\u003d1515591525188\u0026sr\u003d1-2");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 250845339,
  "status": "passed"
});
});