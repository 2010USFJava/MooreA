package com.revature.wrapperz;

public class Wrapperz {
	/*Wrappers -
	 * Character - char
	 * Boolean - boolean
	 * Byte -byte
	 * Short - short
	 * Long - long
	 * Float - float
	 * Double double
	 * 
	 * Auto-Boxing - expensive process! 
	 * boxing-implicit conversion from a primitive type to a wrapper class
	 * unboxing - implicit conversion from a wrapper to a primitive
	 * 
	 * Have utility methods!
	 */
	
	static int myInt=3;
	static Integer myInteger=5;
	static Double myDouble=45.93;
	
	public static int addEmUp(int a, int b) {
		return a+b;
	}
	
	
	public static void main(String[] args) {
		int result = addEmUp(myInt, myDouble.intValue());
		System.out.println(result);
		Integer i=0;
		i=i.MAX_VALUE;
		System.out.println(i);
	}

}
