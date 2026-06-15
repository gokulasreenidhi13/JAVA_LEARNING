package com.Problem.Solving;


	import java.util.concurrent.Semaphore;

	class H2O {

	    private final Semaphore hSema = new Semaphore(2);
	    private final Semaphore oSema = new Semaphore(0); 
	    private int hCount = 0;

	    public H2O() {
	    }

	    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
	        hSema.acquire();
	        releaseHydrogen.run();
	        
	        synchronized(this) {
	            hCount++;
	            if (hCount == 2) {
	                oSema.release();
	            }
	        }
	    }

	    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
	        oSema.acquire();
	        releaseOxygen.run();
	        
	        synchronized(this) {
	            hCount = 0;
	        }
	        hSema.release(2);
	    }
	}

