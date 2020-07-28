package com.automation.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Baseclass;
import com.automation.helper.ProjectObjectmanager;
import com.automation.runner.Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition3 extends Baseclass {
	
	public static WebDriver driver = Runner.driver;
	public static ProjectObjectmanager pom = new ProjectObjectmanager(driver);
	
	
	@Given("^user check the product summary and proceed to checkout$")
	public void user_check_the_product_summary_and_proceed_to_checkout() throws Throwable {
	  MouseClick(pom.getPo().getSumproceed());
	  Thread.sleep(3000);
	}

	@When("^user choose the delivery address and proceed to checkout$")
	public void user_choose_the_delivery_address_and_proceed_to_checkout() throws Throwable {
		MouseClick(pom.getPo().getAddproceed());
		Thread.sleep(3000);
	}

	@When("^user agree the terms and conditions$")
	public void user_agree_the_terms_and_conditions() throws Throwable {
		MouseClick(pom.getPo().getAgreeterms()); 
		Thread.sleep(1000);
	}

	@When("^user proceeds the order$")
	public void user_proceeds_the_order() throws Throwable {
		MouseClick(pom.getPo().getShipproceed());
		Thread.sleep(1000);
	}

	@When("^user select the payment options$")
	public void user_select_the_payment_options() throws Throwable {
		MouseClick(pom.getPo().getPayment());
		Thread.sleep(1000);
	}

	@When("^finally user place the order$")
	public void finally_user_place_the_order() throws Throwable {
		MouseClick(pom.getPo().getConfirmorder());
		Thread.sleep(1000);
	}
	@Then("^user logout from account$")
	public void user_logout_from_account() throws Throwable {
		MouseClick(pom.getPo().getLogout());
	}

	
}
