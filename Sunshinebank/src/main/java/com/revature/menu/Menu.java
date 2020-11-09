package com.revature.menu;

import java.util.Scanner;

import com.revature.bank.Account;
import com.revature.bank.Customer;
import com.revature.bank.Employee;
import com.revature.bank.Transactions;
import com.revature.bank.User;
import com.revature.driver.GetUser;
import com.revature.util.Lists;

public class Menu implements GetUser{
	

	

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
		System.out.println("|    3. Main Menu              |");
		System.out.println("|    4. Exit                   |");
		System.out.println("|------------------------------|");
		
	
		 Scanner scan = new Scanner(System.in);
		 int option=scan.nextInt();
		 User user = new User();
		 
		switch(option) {
				
			case 1:
					
					Lists.findAccountByUsername();
					break;
			case 2:
				GetUser.makeCust();
				break;
			case 3:
				mainMenu();
				break;
			case 4:
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
	System.out.println("|    1. Apply For Account      |");
	System.out.println("|    2. Check Balance          |");
	System.out.println("|    3. Deposit                |");
	System.out.println("|    4. Withdraw               |");
	System.out.println("|    5. Tranfer                |");
	System.out.println("|    6. Exit                   |");
	System.out.println("|------------------------------|");
	
	 Scanner scan = new Scanner(System.in);
	 int option=scan.nextInt();
	 
	switch(option) {
		case 1:
			Transactions.applyForAccount();
			break;
		case 2:
			 Transactions.checkBalance();
			  break;
		case 3:
			Transactions.depositMoney();
			break;
		case 4:
			Transactions.withdrawMoney();
			break;
		case 5:
			Transactions.transferMoney();
			break;
		case 6:
			System.out.println(" Good Bye!");
			break;
		
		default:
			System.out.println("Invalid choice");
			
	scan.close();
	     }
	}
	
	public static void empTrans() {
	System.out.println("|------------------------------|");
	System.out.println("|       Sunshine Bank          |");
	System.out.println("|       Employee Menu          |");                          
	System.out.println("|      ---------------         |");
	System.out.println("|      Choose an option:       |");
	System.out.println("|    ---------------------     |");
	System.out.println("| 1. Display Customer Account  |");
	System.out.println("| 2. Open New Account          |");
	System.out.println("| 3. Close Account             |");
	System.out.println("| 4. Deny Account Opening      |");
	System.out.println("| 5. Approve Account  Opening  |");
	System.out.println("| 6. Exit                      |");
	System.out.println("|------------------------------|");
	
	 Scanner scan = new Scanner(System.in);
	 int option=scan.nextInt();
	 Transactions trans = new Transactions();
	
	switch(option) {
		case 1:
			Customer.displayCustomerInfo();
			  break;
		case 2:
			Account.OpenAccount();
			break;
		case 3:
			trans.closeAccount();
			break;
		case 4:
			Account.denyAccount();
			break;
		case 5:
			Account.approveAccount();
			break;
		case 6: 
			accountTrans();
		default:
			System.out.println("Invalid choice");
			
	scan.close();
	     }
	}
	public static void adminTrans() {
		System.out.println("|------------------------------|");
		System.out.println("|       Sunshine Bank          |");
		System.out.println("|        Admin Menu            |");                          
		System.out.println("|      ---------------         |");
		System.out.println("|      Choose an option:       |");
		System.out.println("|    ---------------------     |");
		System.out.println("| 1. Display Customer Account  |");
		System.out.println("| 2. Open New Account          |");
		System.out.println("| 3. Close Account             |");
		System.out.println("| 4. Deny Account Opening      |");
		System.out.println("| 5. Approve Account  Opening  |");
		System.out.println("| 6. Cancel Account            |");
		System.out.println("| 7. Exit                      |");
		System.out.println("|------------------------------|");
		
		 Scanner scan = new Scanner(System.in);
		 int option=scan.nextInt();
		 Transactions trans = new Transactions();
		
		switch(option) {
			case 1:
				Customer.displayCustomerInfo();
				  break;
			case 2:
				Account.OpenAccount();
				break;
			case 3:
				trans.closeAccount();
				break;
			case 4:
				Account.denyAccount();
				break;
			case 5:
				Account.approveAccount();
			case 6:
				Account.cancelAccount();
				break;
			case 7: 
				accountTrans();
			default:
				System.out.println("Invalid choice");
				
		scan.close();
		     }
		

	

}
}
