

package com.automation.stepdefinition;
import java.io.IOException;

import com.adactin.baseclass.Baseclass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Baseclass{
@Before
public void beforeHooks(Scenario scenario) {
	String name =scenario.getName();
	System.out.println("scenario name:" +name);
}
@After
public void afterHooks(Scenario scenario) throws IOException {

String status=scenario.getStatus();
System.out.println("status:"+status);
if(scenario.isFailed()) {
	ScreenShot(scenario.getName());
}
}
}
