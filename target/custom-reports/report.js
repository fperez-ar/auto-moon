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
  "duration": 947274548,
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
  "duration": 2314607231,
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
  "duration": 1378406227,
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
  "duration": 1023861824,
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
  "duration": 5458964394,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"class name\",\"selector\":\"price\"}\n  (Session info: chrome\u003d63.0.3239.108)\n  (Driver info: chromedriver\u003d2.34.522913 (36222509aa6e819815938cbf2709b4849735537c),platform\u003dLinux 4.10.0-40-generic x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.7.1\u0027, revision: \u00278a0099a\u0027, time: \u00272017-11-06T21:01:39.354Z\u0027\nSystem info: host: \u0027asset1860\u0027, ip: \u0027127.0.1.1\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00274.10.0-40-generic\u0027, java.version: \u00271.8.0_151\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptSslCerts: true, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.34.522913 (36222509aa6e81..., userDataDir: /tmp/.org.chromium.Chromium...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: LINUX, platformName: LINUX, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 63.0.3239.108, webStorageEnabled: true}\nSession ID: b381a4863c64335bad13f55dbf8c0caf\n*** Element info: {Using\u003dclass name, value\u003dprice}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:600)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:279)\n\tat org.openqa.selenium.remote.RemoteWebElement.findElement(RemoteWebElement.java:179)\n\tat org.openqa.selenium.remote.RemoteWebElement.findElementByClassName(RemoteWebElement.java:239)\n\tat org.openqa.selenium.By$ByClassName.findElement(By.java:391)\n\tat org.openqa.selenium.remote.RemoteWebElement.findElement(RemoteWebElement.java:175)\n\tat test.pageObjects.SearchResults.getCheapest(SearchResults.java:58)\n\tat test.steps.Search.topmost_result_is(Search.java:74)\n\tat ✽.Then topmost result is: \"Sailor Moon 7\"(search.feature:7)\n",
  "status": "failed"
});
formatter.write("https://www.bookdepository.com/search?searchTerm\u003dSailor+Moon+7\u0026ageRangesTotal\u003d1\u0026searchSortBy\u003dprice_low_high");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 248398693,
  "status": "passed"
});
});