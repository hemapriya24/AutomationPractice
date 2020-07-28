
package com.pom.automation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
public static WebDriver driver;

@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
private WebElement login;


public  HomePage(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
}
public WebElement getLogin() {
	return login;
}





}
