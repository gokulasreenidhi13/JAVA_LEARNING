package com.multithread;

public class thread2  extends Thread{
	/*public void run() {
        for(int i=1;i<=5;i++) {
            System.out.println(Thread.currentThread().getName());
        } }*/
	
	table t;
	public thread2(table t) {
		this.t=t;
	}
	
	public void run(){
		t.printtable(10);
		//table.printtable(10);
	}
	}
