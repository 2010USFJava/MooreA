package com.revature.varargs;

public class FunWithVarargs {

	public static void main(String[] args) {
	vaTest("we ", 10);
		//vaTest();
	}
	
	static void vaTest(String s,int ... v ) {
		System.out.println("The number of args is : " + v.length + " contents: ");
		for(int x:v){
			System.out.println(x);
		}
	}

}
  