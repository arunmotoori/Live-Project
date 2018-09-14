package com.tutorialsninja.automation.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"html:target/cucumber_html_report"}, features="classpath:FeatureFiles", glue="classpath:com.tutorialsninja.automation.stepdef")
public class Runner {

}
