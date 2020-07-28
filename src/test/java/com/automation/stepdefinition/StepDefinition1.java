package com.automation.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Baseclass;
import com.automation.helper.ProjectObjectmanager;
import com.automation.runner.Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition1 extends Baseclass {
	
	public static WebDriver driver = Runner.driver;
	public static ProjectObjectmanager pom = new ProjectObjectmanager(driver);
	
	
	@Given("^user select the category$")
	public void user_select_the_category() throws Throwable {
		MouseClick(pom.getAt().getWomen());
		MouseClick(pom.getAt().getTshrt());
		System.out.println("Category selected");
		Thread.sleep(3000);
	    	}

	@When("^user select the product$")
	public void user_select_the_product() throws Throwable {
		MouseClick(pom.getAt().getProduct());
		System.out.println("product selected");
		Thread.sleep(3000);
	    
	}

	@When("^user add product into the cart$")
	public void user_add_product_into_the_cart() throws Throwable {
		MouseClick(pom.getAt().getQuantity());
		MouseClick(pom.getAt().getAddcart()); 
		System.out.println("product added to cart");
		Thread.sleep(3000);
	}

	@Then("^product proceed to checkout$")
	public void product_proceed_to_checkout() throws Throwable {
		MouseClick(pom.getAt().getProceed()); 
		Thread.sleep(3000);
	}


}
