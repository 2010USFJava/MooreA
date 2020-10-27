package com.revature.constructor;

public class ConstructorDemo {

	public static void main(String[] args) {
	
		//C c = new C();
	}
	
 class A{
	A(){
	System.out.println("in A");	
	}

}

 class B extends A{
	 B(){
		 System.out.println("in B");
	 }
	
}

 class C extends B{
	C(){
	System.out.println("in C");	
	}
}
}
