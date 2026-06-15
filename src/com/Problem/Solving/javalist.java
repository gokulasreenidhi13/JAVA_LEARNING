package com.Problem.Solving;


	import java.io.*;
	import java.util.*;
	public class javalist {

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        
	        int N = scan.nextInt();
	        List<Integer> list = new LinkedList<>();
	        for (int i = 0; i < N; i++) {
	            list.add(scan.nextInt());
	        }
	        
	        int Q = scan.nextInt();
	        for (int i = 0; i < Q; i++) {
	            String queryType = scan.next();
	            if (queryType.equalsIgnoreCase("Insert")) {
	                int index = scan.nextInt();
	                int value = scan.nextInt();
	                if (index >= 0 && index <= list.size()) {
	                    list.add(index, value);
	                }
	            } else if (queryType.equalsIgnoreCase("Delete")) {
	                int index = scan.nextInt();
	                if (index >= 0 && index < list.size()) {
	                    list.remove(index);
	                }
	            }
	        }
	        scan.close();
	        
	        for (int i = 0; i < list.size(); i++) {
	            System.out.print(list.get(i) + (i == list.size() - 1 ? "" : " "));
	        }
	    }
	}

