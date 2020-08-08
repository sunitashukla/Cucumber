package com.qtpselenium.Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)


@CucumberOptions
(
	dryRun=false,
	strict= false,
	monochrome=false,
	features= {"src/test/resources/"},
	glue={"com.qtpselenium.testCases"},
	plugin= {
			"html:target/site/cucumber-html",
			"json:target/cucumber1.json"},
	tags= {"@Login"}	
)


public class Runner
{

	
}
