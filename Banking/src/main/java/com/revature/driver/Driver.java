package com.revature.driver;

import java.util.Scanner;

import com.revature.banking.*;

public class Driver {

	public static void main(String[] args) {
		
	

	
		
		System.out.println("|------------------------------|");
		System.out.println("|       Sunshine Bank          |");
		System.out.println("|      Log In/Register         |");
		System.out.println("|      ---------------         |");
		System.out.println("|      Choose an option:       |");
		System.out.println("|    ---------------------     |");
		System.out.println("|    1. Customer Sign In       |");
		System.out.println("|    2. Employeee Sign In      |");
		System.out.println("|    3. Admin Sign In          |");
		System.out.println("|    4. Register               |");
		System.out.println("|    5. Exit                   |");
		System.out.println("|------------------------------|");
		
		Scanner scan = new Scanner(System.in);
		int option;
		option=scan.nextInt();
	
		
			switch(option) {
			case 1:
					//custUser();
				  break;
			case 2:
					//empUser();
				break;
			case 3:
				  //  adminUser();
				break;
			case 4:
				//	createCustomer();
					break;
			case 5:
				System.out.println(" Good Bye!");
				break;
			default:
				System.out.println("INVALID CHOICE! CHOOSE AGAIN");
				
		scan.close();
				}
		}

	}

