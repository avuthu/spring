package com.util.service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileFunctions {
	
	
	public static Scanner readFromFile(String filepath)
	{
		File f = new File(filepath);
		
	Scanner scan=null;
			try {
				 scan = new Scanner(f);
				
				return scan;
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("File not found");
				e.printStackTrace();
			}
			
			return scan;
		
	}
	public static String writeToFileInAppend(String filePath,String message)
	{
		 
	        try {
	            File file = new File(filePath);
	            BufferedWriter    output = new BufferedWriter(new FileWriter(file,true));
	            output.write(message);
	            
	            output.close();
	            
	            
	            
	            
	            
	            
	            
	        } catch ( IOException e ) {
	            e.printStackTrace();
	        } 
	        
		
		
		return " File has been successfully written";
	}
	public static String writeToFile(String filePath,String message)
	{
		 
	        try {
	            File file = new File(filePath);
	            BufferedWriter    output = new BufferedWriter(new FileWriter(file));
	            output.write(message);
	            
	            output.close();
	            
	            
	            
	            
	            
	            
	            
	        } catch ( IOException e ) {
	            e.printStackTrace();
	        } 
	        
		
		
		return " File has been successfully written";
	}


}
