package com.Problem.Solving;


	import java.io.*;
	import java.util.*;

	public class endoffile {

	    public static void main(String[] args) {
	        // Initialize the scanner to read from standard input
	        Scanner scanner = new Scanner(System.in);
	        int lineNumber = 1;
	        
	        // Loop runs until End-Of-File (EOF) is reached
	        while (scanner.hasNext()) {
	            // Read the next complete line
	            String line = scanner.nextLine();
	            
	            // Print the line number and the line content
	            System.out.println(lineNumber + " " + line);
	            
	            // Increment the line counter for the next iteration
	            lineNumber++;
	        }
	        
	        // Close the scanner to prevent memory leaks
	        scanner.close();
	    }
	}

