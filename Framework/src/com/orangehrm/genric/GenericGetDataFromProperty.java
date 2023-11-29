package com.orangehrm.genric;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GenericGetDataFromProperty implements Framework_Constants{

	public static String getData(String key) throws IOException {
		
		FileInputStream fis=new FileInputStream(PROPERTY_PATH);
		
		Properties prop=new Properties();
		
		prop.load(fis);
		
		String value = prop.getProperty(key);
		
		return value;
	}
}
