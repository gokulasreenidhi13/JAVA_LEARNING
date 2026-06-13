package com.exception;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.*;
public class tryCatch {
	public static void main(String[]args) {
	/*Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		try
		{
			int c=a/b;
	
		System.out.println(c);
		
	}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}*/
		
		
		/*int[]arr= {10,20,30,40,50};
		try {
			System.out.println(arr[7]);
		}
		catch(ArrayIndexOutOfBoundsException e){
           System.out.println(e.getMessage());			
		}*/
		
	
	
		/*try {
			int n=-5;
			int []arr=new int[n];
		}
		catch(NegativeArraySizeException e){
           System.out.println(e.getMessage());			
		}
			*/
		
		/*try {
			int n=-5;
			int []arr=new int[n];
		}
		catch(NegativeArraySizeException e){
           System.out.println(e);			
		}
		*/
		
		
	/*try {
			int n=-5;
			int []arr=new int[n];
		}
		catch(NegativeArraySizeException e){
           e.printStackTrace();			
		}*/
		
try {
	FileReader f =new FileReader("/JavaTraining/src/com/exception/name.txt");
	System.out.println("File Opened");
}

catch(FileNotFoundException e) {
	System.err.println("File Not Found");
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}

}
