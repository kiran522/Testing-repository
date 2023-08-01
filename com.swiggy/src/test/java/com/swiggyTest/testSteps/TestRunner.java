package com.swiggyTest.testSteps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "Features//OrderSwiggy.feature",
				glue= "com.swiggyTest.testSteps")
			
public class TestRunner extends AbstractTestNGCucumberTests {

}
