package com.jbk.bdd.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true,
		format = {"pretty","json:target/cucumber-reports/cucumber.json",
			     "junit:target/cucumber-reports/cucumber.xml",
			     "html:target/cucumber-reports"},
		glue = "com.jbk.bdd.steps",
		features = "classpath:com/resources/features/login.feature",
		dryRun = false
		)

public class AllRunTest {

}
