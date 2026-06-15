package com.Problem.Solving;


	import java.util.Scanner;

	public class opformating {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("================================");
	        
	        // The problem statement guarantees exactly 3 lines of inputs
	        for (int i = 0; i < 3; i++) {
	            String s1 = sc.next();
	            int x = sc.nextInt();
	            
	            // %-15s left-justifies the string with 15 characters
	            // %03d pads the integer with leading zeros to a width of 3
	            System.out.printf("%-15s%03d%n", s1, x);
	        }
	        
	        System.out.println("================================");
	        
	        sc.close();
	    }
	}

