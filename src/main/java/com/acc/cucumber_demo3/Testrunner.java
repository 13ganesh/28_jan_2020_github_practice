package com.acc.cucumber_demo3;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:target/cucumber.json"}
		,features = "Feature99"
		,glue = "step_defination99"
		//,tags = {"@SmokeTest"}
		//,tags = {"@RegressionTest"}
		//,tags = {"@FunctionalTest"}
		//,tags = {"@SmokeTest,@RegressionTest"} //or tagged
		//,tags = {"@SmokeTest","@RegressionTest"} // and tagged
		//,tags = {"@SmokeTest","~@RegressionTest"} // ignoring regressionTest
		,tags = {"~@SmokeTest","~@RegressionTest","~@End2End"} // without tag scenario
		)


public class Testrunner {

}
