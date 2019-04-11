$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/GoogleSearchWhitDataFeature.feature");
formatter.feature({
  "name": "Buscar en Google con datos desde la feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "Diana esta en el sitio google",
  "keyword": "Given "
});
formatter.step({
  "name": "el busca la palabra \"\u003cpalabra\u003e\" y \"\u003cpalabrados\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "el verifica que la palabra \"\u003cpalabra\u003e\" este en los resultados",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "palabra",
        "palabrados"
      ]
    },
    {
      "cells": [
        "switch",
        "datos"
      ]
    },
    {
      "cells": [
        "sophos",
        "empresa"
      ]
    },
    {
      "cells": [
        "camara",
        "palabra"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Diana esta en el sitio google",
  "keyword": "Given "
});
formatter.match({
  "location": "GoogleSearchWhitDataStepDefinitions.dianaEstaEnElSitioGoogle()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el busca la palabra \"switch\" y \"datos\"",
  "keyword": "When "
});
formatter.match({
  "location": "GoogleSearchWhitDataStepDefinitions.elBuscaLaPalabraY(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el verifica que la palabra \"switch\" este en los resultados",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSearchWhitDataStepDefinitions.elVerificaQueLaPalabraEsteEnLosResultados(String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[cucumber Selenium Serenity] - Buscar con Google\u003e but was:\u003c[switchdatos] - Buscar con Google\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat co.com.google.qa.googlesearchwhitdatafeature.stepdefinitions.GoogleSearchWhitDataStepDefinitions.elVerificaQueLaPalabraEsteEnLosResultados(GoogleSearchWhitDataStepDefinitions.java:59)\r\n\tat ✽.el verifica que la palabra \"switch\" este en los resultados(file:src/test/resources/Feature/GoogleSearchWhitDataFeature.feature:28)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Diana esta en el sitio google",
  "keyword": "Given "
});
formatter.match({
  "location": "GoogleSearchWhitDataStepDefinitions.dianaEstaEnElSitioGoogle()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el busca la palabra \"sophos\" y \"empresa\"",
  "keyword": "When "
});
formatter.match({
  "location": "GoogleSearchWhitDataStepDefinitions.elBuscaLaPalabraY(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el verifica que la palabra \"sophos\" este en los resultados",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSearchWhitDataStepDefinitions.elVerificaQueLaPalabraEsteEnLosResultados(String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[cucumber Selenium Serenity] - Buscar con Google\u003e but was:\u003c[sophosempresa] - Buscar con Google\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat co.com.google.qa.googlesearchwhitdatafeature.stepdefinitions.GoogleSearchWhitDataStepDefinitions.elVerificaQueLaPalabraEsteEnLosResultados(GoogleSearchWhitDataStepDefinitions.java:59)\r\n\tat ✽.el verifica que la palabra \"sophos\" este en los resultados(file:src/test/resources/Feature/GoogleSearchWhitDataFeature.feature:28)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Diana esta en el sitio google",
  "keyword": "Given "
});
formatter.match({
  "location": "GoogleSearchWhitDataStepDefinitions.dianaEstaEnElSitioGoogle()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el busca la palabra \"camara\" y \"palabra\"",
  "keyword": "When "
});
formatter.match({
  "location": "GoogleSearchWhitDataStepDefinitions.elBuscaLaPalabraY(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el verifica que la palabra \"camara\" este en los resultados",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSearchWhitDataStepDefinitions.elVerificaQueLaPalabraEsteEnLosResultados(String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003cc[ucumber Selenium Serenity] - Buscar con Google\u003e but was:\u003cc[amarapalabra] - Buscar con Google\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat co.com.google.qa.googlesearchwhitdatafeature.stepdefinitions.GoogleSearchWhitDataStepDefinitions.elVerificaQueLaPalabraEsteEnLosResultados(GoogleSearchWhitDataStepDefinitions.java:59)\r\n\tat ✽.el verifica que la palabra \"camara\" este en los resultados(file:src/test/resources/Feature/GoogleSearchWhitDataFeature.feature:28)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});