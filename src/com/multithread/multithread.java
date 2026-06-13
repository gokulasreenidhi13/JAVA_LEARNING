package com.multithread;

public class multithread{
	 public static void main(String[] args) {
   table t=new table();
   
	        thread1 t1 = new thread1(t);
	         t1.start();
	        
	        thread2 t2 = new thread2(t);
	        t2.start();

}
	 }
