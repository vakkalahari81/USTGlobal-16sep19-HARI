package com.ustglobal.filehandling;

import java.io.FileReader;
import java.util.Properties;

public class PropertiesFileReader {
	
	public static void main(String[] args) {
		String str = "Text.propperties";
		
		FileReader reader = null;
		
		try {
				reader = new FileReader(str);
				Properties pro = new Properties();
				pro.load(reader);
				
				String name = pro.getProperty("url");
				String company = pro.getProperty("user");
				String gf = pro.getProperty("password");
				
				System.out.println("Name = "+name);
				System.out.println("Company = "+company);
				System.out.println("GF = "+gf);
		 }
		catch(Exception e) {
			
			e.printStackTrace();
		}
	}
}
