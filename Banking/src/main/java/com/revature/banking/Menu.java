package com.revature.banking;

import java.util.Scanner;

import com.revature.util.Files;

public class Menu {

	
	static Scanner scan = new Scanner(System.in);
	static int option=scan.nextInt();
	
	static Account acct = new Account();
	static Transactions trans = new Transactions();
	static User user = new User();
	

	public static void MainMenu() {
		
		
		
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
		
		
		
		Customer cust= new Customer();
		
		switch(option) {
				
				case 1:
					user.getUser();
				
			    break;
			case 2:
				
				cust.createCustomer();
				
				break;
			case 3:
				System.out.println(" Good Bye!");
				break;
			
			default:
				System.out.println("Invalid choice, choose again");
				Menu.MainMenu();
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
	
	
	
	switch(option) {
		case 1:
			 acct.acctBalance();
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
	
	

}
