package com.revature.varargs;

public class FunWithVarargs {

	public static void main(String[] args) {
	//	vaTest(10,6,78,321,51436,14354153,5);
		//vaTest();
	}
	
	static void vaTest(String s,int ... v ) {
		System.out.println("The number of args is : " + v.length + " contents: ");
		for(int x:v){
			System.out.println(x);
		}
	}

}
  