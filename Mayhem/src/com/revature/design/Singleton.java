package com.revature.design;

/*
 * Singleton Design Pattern
 * ensure a class has only one instance and provides
 * a global access to it- (every thing in app can access it)
 */

public class Singleton {
	
	//private static instance of the self class
	private static Singleton instance;
	
	//private constructor
	private Singleton(){
		//logic here
		
	}
	
	
	//public static synchronized method to get a unique instance--if it does not exist,
	//we will create it
	
	public static synchronized Singleton getInstance() {
		if(instance ==null) {
			instance= new Singleton();
			
		}
		return instance;
	}
	
	public void doSomething() {
		//what object should do
	}
	
	
	
}
