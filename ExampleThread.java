package com.test;

class ExampleThread {
	public static void main(String[] args) {
		
		FirstExampleThread mt = new FirstExampleThread("A");
		Thread t1 = new Thread(mt);                            //Thread object is created
		t1.start();                                            //calling start method
		FirstExampleThread mt2 = new FirstExampleThread("B");
		Thread t2 = new Thread(mt2);
		t2.start();
		FirstExampleThread mt3 = new FirstExampleThread("C");
		Thread t3 = new Thread(mt3);
		t3.start();
	}
}
/* FirstExampleThread class implements Runnable*/

class FirstExampleThread implements Runnable {

	String msg;

	public void run() {                            //Overriding the run method
		System.out.println("Running " +  msg );
		try {
			for (int i = 1; i < 10; i++) {

				System.out.println("Thread: " + msg + ", " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Thread " + msg + " interrupted.");
			e.printStackTrace();
		}
		finally{
		System.out.println("Thread " + msg + " exiting.");
		}
	}

	FirstExampleThread(String m) {               
		msg = m;
		System.out.println("Creating " +  msg );

	}
}
