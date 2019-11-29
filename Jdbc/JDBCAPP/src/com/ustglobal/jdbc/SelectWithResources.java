package com.ustglobal.jdbc;
import java.io.FileReader;
import java.util.Properties;

public class SelectWithResources {
	
	public static void main(String[] args) {
		
	try(FileReader reader = new FileReader("db.properties")){
		
		Properties prop = new Properties();
		prop.load(reader);
		
		Class.forName(prop.getProperty("driver-class-name"));
		String url = prop.getProperty("url");
		//String 
	}
	catch(Exception e) {
		e.printStackTrace();
	}
 }
}
