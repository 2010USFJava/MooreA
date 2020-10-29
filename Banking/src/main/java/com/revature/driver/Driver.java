package com.revature.driver;

import java.util.Scanner;

import com.revature.banking.Customer;
import com.revature.banking.Menu;



public class Driver implements Menu{

	
	
	public static void main(String[] args) {
		
		System.out.println("|------------------------------|");
		System.out.println("|       Sunshine Bank          |");
		System.out.println("|      Sign In/Register        |");
		System.out.println("|      ---------------         |");
		System.out.println("|         Options:             |");
		System.out.println("|    ---------------------     |");
		System.out.println("|        1. Sign In            |");
		System.out.println("|        2. Register           |");
		System.out.println("|        3. Exit               |");
		System.out.println("|------------------------------|");
		System.out.println("Enter 1, 2, or 3");
		
		Scanner scan = new Scanner(System.in);
		int option;
		option=scan.nextInt();
		
			Customer cust= new Customer();
			System.out.println("Enter 1, 2, or 3");
			
		switch(option) {
		
				case 1:
					
				Menu.SignIn();
				
			    break;
			case 2:
				
				cust.createCustomer();
				
				break;
			case 3:
				System.out.println(" Good Bye!");
				break;
			
			default:
				System.out.println("Invalid Choice");
				
		scan.close();
				}
		}
	
		
	
	}

