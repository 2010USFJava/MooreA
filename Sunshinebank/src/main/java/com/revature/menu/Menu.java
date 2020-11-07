package com.revature.menu;

import java.util.HashMap;
import java.util.Scanner;

import com.revature.bank.Customer;
import com.revature.bank.Employee;
import com.revature.bank.Transactions;
import com.revature.bank.User;
import com.revature.util.Lists;
import com.revature.util.LogThis;

public class Menu {
	

	

	public static void mainMenu() {

		System.out.println("|------------------------------|");
		System.out.println("|    Welcome to Sunshine Bank  |");
		System.out.println("|           Sign In            |");
		System.out.println("|      ---------------         |");
		System.out.println("|      Choose an option:       |");
		System.out.println("|    ---------------------     |");
		System.out.println("|    1. Customer Sign In       |");
		System.out.println("|    2. Employee Sign In       |");
		System.out.println("|    3. Exit                   |");
		System.out.println("|------------------------------|");
		
		Employee emp= new Employee();
		 Scanner scan = new Scanner(System.in);
		 int option=scan.nextInt();
		  switch(option) {
				
			case 1:
				custSignIn();
				break;
			case 2:
				emp.empLogIn();
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
	
		
		public static void custSignIn() {
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
			 trans.checkBalance();
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
	
		System.out.println("Enter username:");
		String user=scan.nextLine();
		System.out.println("Enter password");
		String passwd=scan.nextLine();
		
		Customer cust1 =new Customer(user, passwd );
		HashMap<String, String> map = new HashMap<String, String>();
		map.put(user, passwd);
		map.get(user);
		LogThis.LogIt("info", "HashMap for username  " + cust1 + " is key: " + user + " - password: " + passwd);
		
		System.out.println("Enter  email");
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
		
		Customer.createAccountNum(user);
		System.out.println(Customer.accountNum);
		
		HashMap<String, Integer> numMap = new HashMap<String, Integer>();
		numMap.put(user, Customer.accountNum);
		numMap.get(user);
		LogThis.LogIt("info", "HashMap for  " + cust1 + " is username key: " + user + " - account number: " + Customer.accountNum);
		
		
		
		Customer cust = new Customer( user, passwd, Customer.accountNum,email, fName, lName, address, city, state, zip, phone, ssn);
		LogThis.LogIt("info"," Customer , " + cust.getfName() + cust.getlName() + " created an user account, with account number " + Customer.accountNum);
		System.out.println(Lists.customerList.toString());
		
		System.out.println("would you like to add another customer to the account? (y/n)");
		String choice=scan.nextLine();
		if(choice.equalsIgnoreCase("y")){
			jointAcct();
		}else if(choice.equalsIgnoreCase("n")){
			System.out.println(" you are returning to the main menu to sign in");
			
			custSignIn();
		}	
		}
		
	
	
	public static void jointAcct() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter  email");
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
		
		Customer joint = new Customer( email, fName, lName, address, city, state, zip, phone, ssn);
		LogThis.LogIt("info"," Customer , " + joint.getfName() + joint.getlName() + " was added to user account");
		System.out.println(Lists.customerList.toString());
		
		System.out.println("would you like to add another customer to the account? (y/n)");
		String choice=scan.nextLine();
		if(choice.equalsIgnoreCase("y")){
			jointAcct();
		}else if(choice.equalsIgnoreCase("n")){
			System.out.println(" you are returning to the main menu to sign in");
			
			custSignIn();
			
		}
		}
	

}


