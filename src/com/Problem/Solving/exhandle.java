package com.Problem.Solving;


	import java.io.*;
	import java.util.*;

	public class exhandle {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        try {
	            int x = sc.nextInt();
	            int y = sc.nextInt();
	            System.out.println(x / y);
	        } catch (InputMismatchException e) {
	            // HackerRank expects the fully qualified class name for this exception
	            System.out.println("java.util.InputMismatchException");
	        } catch (ArithmeticException e) {
	            // Printing the exception object directly yields "java.lang.ArithmeticException: / by zero"
	            System.out.println(e);
	        } finally {
	            sc.close();
	        }
	    }
	}


