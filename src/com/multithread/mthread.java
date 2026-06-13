package com.multithread;

public class mthread {

	 public static void main(String[] args) {

		 implmethod obj = new implmethod();

	        Thread t1 = new Thread(obj);

	        t1.start();
}}