package com.revature.beans;

public class Driver {

	public static void main(String[] args) {
		
		Dog dog = new Dog("Shadow", 7);
		System.out.println(dog);
		
		Dog dog1 = new Dog();
		System.out.println(dog1);
		
		Breed breed = new Breed();
		System.out.println(breed);
		
		Breed breed1 = new Breed("pompoo", "black");
		System.out.println(breed1);
		
		
	}

}
