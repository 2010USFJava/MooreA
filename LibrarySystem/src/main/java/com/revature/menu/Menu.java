package com.revature.menu;

import java.util.Scanner;

import com.revature.beans.Customer;
import com.revature.beans.Library;
import com.revature.util.LogThis;

public class Menu {
	
	static Scanner scan = new Scanner(System.in);
	
	
	public static void mainMenu() {
		
		
		System.out.println("Welcome to the Library ");
		System.out.println("Enter first name");
		String firstName=scan.nextLine();
		System.out.println("Enter Last name");
		String lastName=scan.nextLine();
		
		Customer customer = new Customer(firstName, lastName);
		
		//LogThis.LogIt();
		
		
		System.out.println("Enter [c]heckout");
		System.out.println("Enter [r]eturn");
		System.out.println("Enter [q]uit);");
		
		String option=scan.nextLine();
		
		switch(option) {
		
		case "c":
			checkout();
			break;
		case "r":
			
			break;
			
		case "q":
			System.out.println("Thank you");
			
			
		}
				
	}	
	
	static Library library= new Library();
	public static void checkout() {
	System.out.println("Enter book title");
	String book=scan.nextLine();
	library.checkoutDate();
	}
	
	
	
}



