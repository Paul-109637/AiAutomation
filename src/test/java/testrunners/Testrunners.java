package testrunners;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features="Featurefiles/RecruiterAiFeatures.feature",glue="stepdefinitions",
dryRun=false,plugin={"com.cucumber.listener.ExtentCucumberFormatter:Reports/reports.html"},
tags={"@RecruiterAiLogin,@RecruiterAiLogout,@CreateNewJob"})
public class Testrunners extends AbstractTestNGCucumberTests
{

}
