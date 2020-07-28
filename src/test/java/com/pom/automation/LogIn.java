package com.pom.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn {
	public static WebDriver driver;
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/div[1]/input")
	private WebElement email;
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/div[2]/span/input")
	private WebElement passwd;
	
	@FindBy(xpath="//button[@id='SubmitLogin']")
	private WebElement submit;
	
	public LogIn(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		}
	
	public WebElement getEmail() {
		return email;
	}

	public WebElement getPasswd() {
		return passwd;
	}

	public WebElement getSubmit() {
		return submit;
	}}
