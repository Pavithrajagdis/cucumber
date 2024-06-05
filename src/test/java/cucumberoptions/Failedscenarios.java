package cucumberoptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="@target/failed_scenario.txt",
glue={"stepdefinitions"}, monochrome=true,  
plugin= {"pretty", "html:target/cucumber.html","json:target/cucumber.json",
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "rerun:target/failed_scenario.txt"})
public class Failedscenarios extends AbstractTestNGCucumberTests {

	@Override                 //bcz we ahve two mthods scenarios() which have same method names.
	@DataProvider(parallel=true)
	public Object[][] scenarios(){
	return super.scenarios();   //means we are asking to execute the scenarios() method present in parent[AbstractTestNGCucumbrtests] class.
}

}
