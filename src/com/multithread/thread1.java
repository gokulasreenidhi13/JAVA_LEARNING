package com.multithread;

public class thread1 extends Thread {
	table t;
	public thread1(table t) {
		this.t=t;
	}


	public void run(){
		t.printtable(5);
		//table.printtable(5);
	
	
	/*public void run() {
        for(int i=1;i<=5;i++) {
            System.out.println(Thread.currentThread().getName());
            try {
				sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        }*/
    }
}


