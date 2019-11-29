package com.ustglobal.filehandling;

import java.io.FileReader;
import java.io.IOException;

public class FileReadingClass {
	
	public static void main(String[] args) {
		
		String path = "C:\\Users\\HARI VAKKALA\\Desktop\\test.txt";
		FileReader reader = null;
		try {
			   reader = new FileReader(path);
//			   int i = reader.read();
//			   
//			   
//			   char ch = (char)i;
//			   System.out.println(ch);
//     		   System.out.println(i);
//			   
			     int i;
				while((i=reader.read())!=-1)
                 {
				              System.out.print((char)i);
			   }
		} 
		catch(IOException e) {
			
			e.printStackTrace();
		}
		
	}//end of main
}//end of file reading
