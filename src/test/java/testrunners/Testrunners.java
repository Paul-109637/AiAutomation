package testrunners;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features="Featurefiles/RecruiterAiFeatures.feature",glue="stepdefinitions",
plugin={"com.cucumber.listener.ExtentCucumberFormatter:Reports/aireports.html"},dryRun=false,
tags={"@RecruiterAiLogin,@RecruiterAiLogout,@CreateNewJob"})
public class Testrunners
{

}
