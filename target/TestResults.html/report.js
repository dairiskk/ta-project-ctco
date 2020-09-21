$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Vacancies_Test.feature");
formatter.feature({
  "line": 2,
  "name": "Vacancies",
  "description": "",
  "id": "vacancies",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Vacancies"
    }
  ]
});
formatter.before({
  "duration": 4960783800,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Test Automation Engineer skill count",
  "description": "",
  "id": "vacancies;test-automation-engineer-skill-count",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@TA_SKILL_COUNT"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Navigate to \"https://www.ctco.lv/en\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Open \"Careers\" menu",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Click \"Vacancies\" from the list",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Open vacancy \"Test Automation Engineer\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Verify that paragraph under \"Professional skills and qualification:\" contains exactly \"5\" skills",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.ctco.lv/en",
      "offset": 13
    }
  ],
  "location": "HomePageSteps.navigateTo(String)"
});
formatter.result({
  "duration": 1743715000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Careers",
      "offset": 6
    }
  ],
  "location": "NavigationMenuSteps.openMenu(String)"
});
formatter.result({
  "duration": 1389507200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Vacancies",
      "offset": 7
    }
  ],
  "location": "NavigationMenuSteps.openMenuLink(String)"
});
formatter.result({
  "duration": 100743100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test Automation Engineer",
      "offset": 14
    }
  ],
  "location": "VacanciesPageSteps.openMenu(String)"
});
formatter.result({
  "duration": 1428658300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Professional skills and qualification:",
      "offset": 29
    },
    {
      "val": "5",
      "offset": 87
    }
  ],
  "location": "VacanciesContentSteps.openMenu(String,String)"
});
formatter.result({
  "duration": 442449700,
  "status": "passed"
});
formatter.after({
  "duration": 643425500,
  "status": "passed"
});
});