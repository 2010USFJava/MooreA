package com.revature.generics;



public class Gen1<T> {

	//DECLARE AN OBJECT OF TYPE
	T object;
	
	//pass the constructor a reference to an object of type T
	Gen1(T objectParameter){
		object=objectParameter;
		
	}
	
	//return object
	T getObject() {
		return object;
	}
	
	//show the type of T
	void showType() {
		System.out.println("Type of T is: " + object.getClass().getName());
		
	}
}
