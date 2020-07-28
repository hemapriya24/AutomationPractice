package com.automation.runner;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Baseclass;
import com.automation.helper.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\automation\\feature", 
glue="com\\automation\\stepdefinition",

monochrome = true, 
dryRun = false, 
strict = true)

public class Runner 
{
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() throws IOException
	{
		
String browserName=FileReaderManager.getInstance().getcrInstance().getBrowserName();
driver=Baseclass.browserLaunch(browserName);
	}
	@AfterClass
	public static void tearDown() {
		driver.close();
	}
}
