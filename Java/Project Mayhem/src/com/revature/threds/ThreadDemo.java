package com.revature.threds;

public class ThreadDemo {
	/*
	 * 2 ways to spin up a thread extend Thread class implement Runnable and
	 * override run() method of thread threads are competing for information
	 * 
	 * Starvation - more consumers of data than producers Saturation - more
	 * producers of data than consumers More effort in producing the data than in
	 * consuming it
	 * 
	 * Each created thread gets its own stack in the memory. 
	 */
	public static void main(String[] args) {
		// creates new threads
//		Thread extendThread = new ExtendedThread(); // Type Saftey
//		Thread implementThread = new Thread(new ImplementRunnable()); // tells the thread what to do
//		implementThread.setPriority(10);
		
		// Thread State- start
		// among other methods, start invokes run();
//		extendThread.start();
//		implementThread.start();

		// this specific instance starts 5 threads
//		for (int i = 0; i < 100; i++) {
//			System.out.println("Hey-Driver");  //println is synchronized so threads are fighting over it
//		}

	}
}
