package com.Problem.Solving;
import java.util.Scanner;

public class exceptionHandling {
	
	class MyCalculator {
	    /*
	    * Create the method long power(int, int) here.
	    */
	    public long power(int n, int p) throws Exception {
	        // Condition 1: If either n or p is negative
	        if (n < 0 || p < 0) {
	            throw new Exception("n or p should not be negative.");
	        }
	        
	        // Condition 2: If both n and p are zero
	        if (n == 0 && p == 0) {
	            throw new Exception("n and p should not be zero.");
	        }
	        
	        // If constraints are passed, calculate and return n raised to power p
	        return (long) Math.pow(n, p);
	    }
	}

	public class Solution {
	    // FIXED: Changed System.class to System.in
	    public static final MyCalculator my_calculator = new MyCalculator();
	    public static final Scanner in = new Scanner(System.in); 
	    
	    public static void main(String[] args) {
	        while (in.hasNextInt()) {
	            int n = in.nextInt();
	            int p = in.nextInt();
	            
	            try {
	                System.out.println(my_calculator.power(n, p));
	            } catch (Exception e) {
	                System.out.println(e);
	            }
	        }
	    }
	}

}
