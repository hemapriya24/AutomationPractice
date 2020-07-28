package com.automation.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Baseclass;
import com.automation.helper.FileReaderManager;
import com.automation.helper.ProjectObjectmanager;
import com.automation.runner.Runner;

import cucumber.api.java.en.*;

public class StepDefinition extends Baseclass {

	public static WebDriver driver = Runner.driver;
	public static ProjectObjectmanager pom = new ProjectObjectmanager(driver);
	
	@Given("^user launch the application$")
	public void user_launch_the_application() throws Throwable {
		String url = FileReaderManager.getInstance().getcrInstance().getUrl();
		driver.get(url);
		System.out.println("URL Loaded");
		Thread.sleep(3000);
	}
	@When("^user click login button$")
	public void user_click_login_button() throws Throwable {
		MouseClick(pom.getHp().getLogin());
		System.out.println("Login btn click");
		Thread.sleep(3000);
	}
	@And("^user enter valid username in username field$")
	public void user_enter_valid_username_in_username_field() throws Throwable {
		System.out.println(pom.getLi().getEmail());
		SendKeys(pom.getLi().getEmail(), "156@gmail.com");
		Thread.sleep(3000);
	}
	@And("^user enter valid password in password field$")
	public void user_enter_valid_password_in_password_field() throws Throwable {
		SendKeys(pom.getLi().getPasswd(), "deeksha16");
		Thread.sleep(3000);
	}
	@And("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
		MouseClick(pom.getLi().getSubmit());
		System.out.println("After click");
		Thread.sleep(3000);
	}
	@Then("^user confirm whether it navigates to homepage screen$")
	public void user_confirm_whether_it_navigates_to_homepage_screen() throws Throwable {
		System.out.println("homepage displayed");
		Thread.sleep(3000);
	}

}
