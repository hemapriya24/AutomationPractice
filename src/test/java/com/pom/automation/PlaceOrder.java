package com.pom.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrder {
	
	public static WebDriver driver;
	
	public PlaceOrder(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"center_column\"]/p[2]/a[1]/span")
private WebElement sumproceed;
	
	@FindBy (xpath ="//*[@id=\"center_column\"]/form/p/button/span")
	private WebElement addproceed;
	
	@FindBy (xpath ="//*[@id=\"cgv\"]")
	private WebElement agreeterms;
	
	@FindBy (xpath ="//*[@id=\"form\"]/p/button/span")
	private WebElement shipproceed;
	
	@FindBy (xpath ="//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a/span")
	private WebElement payment;
	
	@FindBy (xpath ="//*[@id=\"cart_navigation\"]/button/span")
	private WebElement confirmorder;
	
	@FindBy (xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")
	private WebElement logout;
	
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getSumproceed() {
		return sumproceed;
	}

	public WebElement getAddproceed() {
		return addproceed;
	}

	public WebElement getAgreeterms() {
		return agreeterms;
	}

	public WebElement getShipproceed() {
		return shipproceed;
	}

	public WebElement getPayment() {
		return payment;
	}

	public WebElement getConfirmorder() {
		return confirmorder;
	}

	public WebElement getLogout() {
		return logout;
	}
	
}
