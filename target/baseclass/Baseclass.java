package com.adactin.baseclass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	public static WebDriver driver;

	public static WebDriver browserLaunch(String browserName) {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\GreensWorkspace\\Cucumber\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}

	public static WebDriver getUrl(String url) {
		driver.get(url);
		return driver;
	}

	public static void SendKeys(WebElement element, String str) {
		element.sendKeys(str);
	}

	public static void MouseClick(WebElement element) {
		element.click();
	}

	public void moveOtElement(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element);
	}

	public void mouseContextClick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.contextClick(element);
	}

	public void DropDownDay(WebElement element, int value) {
		Select d = new Select(element);
		d.selectByIndex(value);

	}

	public void DropDownMonth(WebElement element, int value) {
		Select m = new Select(element);
		m.selectByValue("value");
	}

	public void DropDownYear(WebElement element, int value) {
		Select y = new Select(element);
		y.selectByValue("value");
	}

	protected void ScreenShot(String fileName) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File srcfile=ts.getScreenshotAs(OutputType.FILE);
		File desfile=new File("C:\\GreensWorkspace\\SeleniumWork\\screenshot.png");
		FileHandler.copy(srcfile,desfile);
	

	}
}

