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
  "duration": 4671219000,
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
  "duration": 1692524700,
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
  "duration": 1299345600,
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
  "duration": 94220899,
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
  "duration": 1403098800,
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
  "duration": 407057700,
  "status": "passed"
});
formatter.after({
  "duration": 645364200,
  "status": "passed"
});
});