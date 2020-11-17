package com.revature.menu;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.beans.Customer;
import com.revature.dao.AccountDao;
import com.revature.dao.CustomerDao;
import com.revature.dao.EmployeeDao;
import com.revature.daoimpl.AccountDaoImpl;
import com.revature.daoimpl.CustomerDaoImpl;
import com.revature.daoimpl.EmployeeDaoImpl;

public class MainMenu extends Customer {
	
	static AccountDao acct=new AccountDaoImpl();
	static EmployeeDao emp = new EmployeeDaoImpl();
	static CustomerDao cc = new CustomerDaoImpl();

	

	public static void mainMenu() {

		System.out.println("|==============================|");
		System.out.println("|    Welcome to Sunshine Bank  |");
		System.out.println("|        Sign In/Register      |");
		System.out.println("|      ---------------         |");
		System.out.println("|      Choose an option:       |");
		System.out.println("|    ---------------------     |");
		System.out.println("|    1. Customer Sign In       |");
		System.out.println("|    2. Employee Sign In       |");
		System.out.println("|    3. Exit                   |");
		System.out.println("|==============================|");

		Scanner scan = new Scanner(System.in);
		int option = scan.nextInt();
		switch (option) {

		case 1:
			try {
				custSign();
			} catch (SQLException e) {

				e.printStackTrace();
			}
			break;
		case 2:

			try {
				emp.empSignIn();
			} catch (SQLException e) {

				e.printStackTrace();
			}
			break;
		case 3:
			System.out.println(" Good Bye!");
			break;

		default:
			System.out.println("Invalid choice, choose again");
			mainMenu();
			break;
		}
	}

	public static void transMenu() throws SQLException {
		System.out.println("|==============================|");
		System.out.println("|        Sunshine Bank         |");
		System.out.println("|     Account Transcations     |");
		System.out.println("|      ---------------         |");
		System.out.println("|      Choose an option:       |");
		System.out.println("|    ---------------------     |");
		System.out.println("|    1. Check Balance          |");
		System.out.println("|    2. Deposit                |");
		System.out.println("|    3. Withdraw               |");
		System.out.println("|    4. Return to Main Menu    |");
		System.out.println("|    5. Sign Out               |");
		System.out.println("|==============================|");

		Scanner scan = new Scanner(System.in);
		int option = scan.nextInt();
	
		switch (option) {
		case 1:
	      acct.showBalance(cusername);
			break;
		case 2:
			acct.depositMoney(cusername);
			break;
		case 3:
			acct.withdrawMoney(cusername);
			break;
		case 4:
			MainMenu.mainMenu();
			break;
		case 5:
		 acct.custSignOut(cusername);
		default:
			System.out.println("Invalid choice");
			transMenu();
scan.close();
		}
	}

	public static void custSign() throws SQLException {
		System.out.println("|==============================|");
		System.out.println("|        Sunshine Bank         |");
		System.out.println("|       SignIn/Register        |");
		System.out.println("|      ---------------         |");
		System.out.println("|      Choose an option:       |");
		System.out.println("|    ---------------------     |");
		System.out.println("|    1. Register               |");
		System.out.println("|    2. Sign in                |");
		System.out.println("|    3. Return to Main Menu    |");
		System.out.println("|==============================|");

		Scanner scan = new Scanner(System.in);
		int option = scan.nextInt();
		Customer a=null;
		switch (option) {
		case 1:
			cc.createCustomer();
	     
			break;
		case 2:
			 acct.custSignIn();
			break;
		case 3:
			
			mainMenu();
			break;
		
		default:
			System.out.println("Invalid choice");
			transMenu();
scan.close();
		}
	}
	
}
