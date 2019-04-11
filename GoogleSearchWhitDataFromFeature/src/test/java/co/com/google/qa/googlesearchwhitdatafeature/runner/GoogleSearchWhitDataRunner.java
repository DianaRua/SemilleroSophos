package co.com.google.qa.googlesearchwhitdatafeature.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature",
                          glue = { "co.com.google.qa.googlesearchwhitdatafeature.stepdefinitions"},
                          snippets = SnippetType.CAMELCASE,
                          plugin = {"pretty", "html:reports", "json:reports/cucumber.json"})


public class GoogleSearchWhitDataRunner {

}
