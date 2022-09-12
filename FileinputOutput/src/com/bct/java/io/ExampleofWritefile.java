package com.bct.java.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExampleofWritefile {

	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		File file; // Object creation  --- Autowire //Wrapper class.
		
		
		String message = "**************** this is overwritten text************** " +
					"Welcome to java I/O programming.";
		
		try {
			//Specify the file path
			file=new File("C:\\Users\\sachi\\Example.txt");
			fos=new FileOutputStream(file);
			
			/*
			 * this logic will check whether the file exists or not.
			 * If the file is not found at the specified location, it would create 
			 * new file.
			 */
			if(!file.exists()) {
				file.createNewFile();
			}
			/*
			 * String content cannot be directly eritten into a file.
			 * It needs to be converted into bytes.
			 * 
			 */
			
			byte[] bytesArray=message.getBytes();
			
			fos.write(bytesArray);
			fos.flush();
			System.out.println("File written successfully");
			
			
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}finally {
			
			try {
				
				if(fos!= null) {
					fos.close();
				}
			}catch(IOException E) {
				System.out.println("Error in closing the close: " + E);
			}
		}
	}
}
