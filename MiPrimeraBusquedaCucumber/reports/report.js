$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/BuscarEnGoogle.feature");
formatter.feature({
  "name": "Google Search",
  "description": "  I want to search a word in google",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "successful search in google",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Diana is on google home page",
  "keyword": "Given "
});
formatter.match({
  "location": "BuscarEnGoogleStepDefinitions.diana_is_on_google_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "She make the search",
  "keyword": "When "
});
formatter.match({
  "location": "BuscarEnGoogleStepDefinitions.she_make_the_search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "she validate that the result successful",
  "keyword": "Then "
});
formatter.match({
  "location": "BuscarEnGoogleStepDefinitions.she_validate_that_the_result_successful()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});