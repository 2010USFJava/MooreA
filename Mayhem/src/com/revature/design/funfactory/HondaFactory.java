package com.revature.design.funfactory;

// factories create an object w/o exposing the creation logic to client

public class HondaFactory {
	
	/*
	 * use a factory method to return a car model based on what 
	 * a string is given
	 * if method is given a parameter of something besides 
	 * crv or civic it will return null
	 */

	public Car getcar(String whatCar, String color) {
		
		if(whatCar.equals("civic")) {
			return new Car("Honda", 2020, "Civic",color) ;
			}else if(whatCar.equals("crv")) {
				return new Car("Honda",2020,"CRV",color);
			}
		return null;
	}
	}

