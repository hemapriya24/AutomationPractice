package com.automation.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class ConfigurationReaderManager {
	public static Properties p;
	public ConfigurationReaderManager() throws IOException {
	File f=new File("C:\\GreensWorkspace\\Cucumber\\src\\test\\java\\com\\configuration\\properties\\configurationproperties");
	
	FileInputStream fis=new FileInputStream(f);
	p=new Properties();
	p.load(fis);	
}
public String getBrowserName() {
	
String browserName=p.getProperty("browserName");
	return browserName;
	
}
public String getUrl()
{
	String url=p.getProperty("url");
	return url;
	
}
}
