package com.revature.menu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.revature.bank.Account;
import com.revature.bank.Customer;
import com.revature.bank.Transactions;
import com.revature.bank.User;

import com.revature.util.Lists;
import com.revature.util.LogThis;

public class Menu {
	

	

	public static void mainMenu() {
		
		
		
		System.out.println("|------------------------------|");
		System.out.println("|       Sunshine Bank          |");
		System.out.println("|      Sign In/Register        |");
		System.out.println("|      ---------------         |");
		System.out.println("|      Choose an option:       |");
		System.out.println("|    ---------------------     |");
		System.out.println("|    1. Sign In                |");
		System.out.println("|    2. Register               |");
		System.out.println("|    3. Exit                   |");
		System.out.println("|------------------------------|");
		
	
		 Scanner scan = new Scanner(System.in);
		 int option=scan.nextInt();
		 User user = new User();
		 Customer customer=new Customer();
			
		switch(option) {
				
				case 1:
					user.searchForUser();
				
			    break;
			case 2:
				
				createCustomer();
				
				break;
			case 3:
				System.out.println(" Good Bye!");
				break;
			
			default:
				System.out.println("Invalid choice, choose again");
				Menu.mainMenu();
				break;
				
				
				}
		}
	
		
	
	
	
	public static  void accountTrans() {
		
		
		
	System.out.println("|------------------------------|");
	System.out.println("|       Sunshine Bank          |");
	System.out.println("|     Account Transcations     |");
	System.out.println("|      ---------------         |");
	System.out.println("|      Choose an option:       |");
	System.out.println("|    ---------------------     |");
	System.out.println("|    1. Check Balance          |");
	System.out.println("|    2. Deposit                |");
	System.out.println("|    3. Withdraw               |");
	System.out.println("|  	 4. Tranfer                |");
	System.out.println("|    5. Exit                   |");
	System.out.println("|------------------------------|");
	
	 Scanner scan = new Scanner(System.in);
	 int option=scan.nextInt();
	 Transactions trans = new Transactions();
	
	switch(option) {
		case 1:
			 
			  break;
		case 2:
			trans.depositMoney();
			break;
		case 3:
			trans.withdrawMoney();
			break;
		case 4:
			trans.transferMoney();
			break;
		case 5:
			System.out.println(" Good Bye!");
			break;
		
		default:
			System.out.println("Invalid choice");
			
	scan.close();
	     }
	  }
	


	public static void createCustomer() {
		 Scanner scan = new Scanner(System.in);
	
		 Customer customer= new Customer();
		System.out.println("Enter username:");
		String user=scan.nextLine();
		System.out.println("Enter password");
		String passwd=scan.nextLine();
		
		Customer cust1 =new Customer(user, passwd );
		Map<String, Customer> map = new HashMap<>();
		map.put(cust1.getUsername(), cust1);
		
		System.out.println("Enter an email");
		String email=scan.nextLine();
		System.out.println("Enter first name");
		String fName=scan.nextLine();
		System.out.println("Enter last name");
		String lName=scan.nextLine();
		System.out.println("Enter address");
		String address=scan.nextLine();
		System.out.println("Enter city");
		String city=scan.nextLine();
		System.out.println("Enter state");
		String state=scan.nextLine();
		System.out.println("Enter zip code");
		int zip=Integer.parseInt(scan.nextLine());
		System.out.println("Enter phone(no dashes)");
		int phone=Integer.parseInt(scan.nextLine());
		System.out.println("Enter you social security number(no dashes)");
		int ssn=Integer.parseInt(scan.nextLine());
		
		
		Customer cust = new Customer(user, passwd, email, fName, lName, address, city, state, zip, ssn, phone);
		LogThis.LogIt("info"," Customer , " + cust.getfName() + cust.getlName() + " created an user account");
		System.out.println(Lists.customerList.toString());
		
		System.out.println("would you like to add another customer to the account? (y/n)");
		String choice=scan.nextLine();
		if(choice.equalsIgnoreCase("y")){
			createCustomer();
		}else if(choice.equalsIgnoreCase("n")){
			
			Account.openAccount();
			
		}else {
			System.out.println("go back to main menu ");
			Menu.mainMenu();
		}
	}
	
	
	}

