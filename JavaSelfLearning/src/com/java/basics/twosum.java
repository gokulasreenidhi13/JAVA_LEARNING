package com.java.basics;
import java.util.*;
public class twosum {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Name:");
		String a=sc.nextLine();
		
		System.out.println("Enter score of 100:");
		double b=sc.nextDouble();sc.nextLine();
		
		System.out.println("Department:");
		
		String c=sc.nextLine();
		
		double outof10=b/10;
		System.out.println("Name:"+a);
	    System.out.println("Score:"+outof10+"/10");
	    System.out.println("Department:"+c);
	}

}
