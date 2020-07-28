package com.automation.helper;

import java.io.IOException;

public class FileReaderManager {
	private FileReaderManager() {
	
	}
public static FileReaderManager getInstance() {
	FileReaderManager fr=new FileReaderManager();
	return fr;

}
public ConfigurationReaderManager getcrInstance() throws IOException {
	ConfigurationReaderManager cr= new ConfigurationReaderManager();
	
	return cr;

}
}