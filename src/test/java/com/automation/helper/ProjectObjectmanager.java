package com.automation.helper;

import org.openqa.selenium.WebDriver;

import com.pom.automation.AddCart;
import com.pom.automation.HomePage;
import com.pom.automation.LogIn;
import com.pom.automation.PlaceOrder;

public class ProjectObjectmanager {
public static WebDriver driver;
public static HomePage hp;
public static LogIn li;
public static AddCart at;
public static PlaceOrder po;



public ProjectObjectmanager(WebDriver driver1) {
	this.driver=driver1;
}

public HomePage getHp() {
	hp = new HomePage(driver);
	return hp;
}
public  LogIn getLi() {
	li  = new LogIn(driver);
	return li;
}
public  AddCart getAt() {
	at = new AddCart(driver);
	return at;
}

public PlaceOrder getPo() {
	po = new PlaceOrder(driver);
	return po;
}



}
