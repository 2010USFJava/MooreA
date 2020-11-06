package com.revature.design.funfactory;

public class Driver {
	
	static HondaFactory hf= new HondaFactory();
	
	public static void main(String[] args){
		
		Car c1=hf.getcar("civic", "blue");
		Car c2=hf.getcar("crv", "linme green");
		Car c3= hf.getcar("potato", "clear");
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}

}