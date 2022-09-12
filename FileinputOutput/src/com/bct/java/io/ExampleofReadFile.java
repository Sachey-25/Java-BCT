package com.bct.java.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExampleofReadFile {
	/*
	 * Reading the file using java.
	 */

	public static void main(String[] args) throws IOException {
		
		//Create new file 
		File file=new File("C:\\Program Files\\Example.txt");
		BufferedInputStream bis = null;
		FileInputStream fis=null;
		
		
		try {
			//FileInputStream to read the file. 
			fis=new FileInputStream(file); // open the file.
			
			bis=new BufferedInputStream(fis);
			
			while( bis.available() > 0) {
				System.out.println( (char) bis.read());
			}
			
		}catch (FileNotFoundException F) {
			System.out.println("The specified file not found.");
			
		}catch (IOException IOE) {
			System.out.println("I/O Exception : " + IOE);
			
		}finally {
			
			try {
				
				if(bis !=null && fis != null) {
					fis.close();
					bis.close();
				}
			}catch(IOException E) {
				System.out.println("Error in InputStream close(): " + E);
			}
		}
		
	}
}