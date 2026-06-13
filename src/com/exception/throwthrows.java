package com.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class throwthrows {
	
	    public static void main(String[] args) {

	        /*int age = 15;

	        if(age < 18) {
	         
	        	throw new ArithmeticException("Not eligible");
	        }*/
	    m1();	
	    static void  m1() throws FileNotFoundException{
	    	FileReader f =new FileReader("D:\\JAVA\\Java_Learning\\JavaTraining\\src\\com\\exception\name");
	    	System.out.println("File Opened");
	    }
	    	
	    	
	    	
	    }

	

}

