package com.revature.threadz;

public class ThreadDemo {

	// 2 ways to spin a thread
	//1-extend thread and overwrite Run(0
	//2-implement and Runnable interface and overwrite run()
	// main, garbage collector, thread scheduler -- 3 threads that start every time 
	
	public static void main(String[] args) {
		
		Thread extendThread = new ExtendThread();
		Thread implementThread = new Thread(new ImplementRunnable());//this is what we want the thread to do
		
		implementThread.setPriority(10);
		extendThread.start();// in state runnable
		implementThread.start();//in  new state
		
		for(int i = 0; i<20; i++) {
			System.out.println("Hey-Driver");
			
		}
	}

}
