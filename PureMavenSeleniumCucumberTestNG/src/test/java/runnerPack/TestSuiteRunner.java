package runnerPack;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= "src/test/java/featurePack",
tags= {"@man"},
glue= "stepdefinitionPack", 
monochrome=true,
plugin= {"pretty:true", "html:target/cucumber", "json:target/cucumber-json/cucumber.json"})
//"com.cucumber.listener.ExtentCucumberFormatter:target/report.html"


//Instead of (@Runs with) we are extending AbstractTestNGCucumberTests of TestNG class
//we can also use TestNGCucumberRunner instead of AbstractTestNGCucumberTests 
public class TestSuiteRunner extends AbstractTestNGCucumberTests {

}
