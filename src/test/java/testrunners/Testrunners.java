package testrunners;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features="Featurefiles/RecruiterAiFeatures.feature",glue="stepdefinitions",
format= {"pretty","html:test-output_1",
                "json:target/cucumber-reports/CucumberTestReport.json"},
plugin={"json:target/cucumber-reports/CucumberTestReport.json"},dryRun=false,
tags={"@RecruiterAiLogin,@RecruiterAiLogout,@CreateNewJob"})
public class Testrunners extends AbstractTestNGCucumberTests
{

}
