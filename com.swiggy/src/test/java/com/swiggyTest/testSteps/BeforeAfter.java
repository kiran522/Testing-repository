package com.swiggyTest.testSteps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BeforeAfter extends Tool1{
	
@Before
public void setUp(Scenario scenario) {
	Driver2.init();
}

@After
public void tearDown() {
	driver.quit();
}
}
