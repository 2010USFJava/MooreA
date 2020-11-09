package com.revature.util;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;

import com.revature.bank.Account;
import com.revature.bank.Customer;
import com.revature.bank.Employee;
import com.revature.bank.Transactions;
import com.revature.bank.User;
import com.revature.menu.Menu;


public class Lists {
	

		public static List<Customer> customerList= new ArrayList<>();
		public static List<User> userList= new ArrayList<User>();
		public static List<Employee> employeeList= new ArrayList<Employee>();
		public static List<Transactions> transList= new ArrayList<Transactions>();
		public static List<Menu> menuList= new ArrayList<Menu>();
		public static List<Account> accountList= new ArrayList<Account>();
		
		
			public static Customer findPassword(String inputPswd) {
			
			for(int i =0; i < customerList.size(); i++) {
				String password = customerList.get(i).getPswd();
				if(password.equals(inputPswd)) {
					return customerList.get(i);
				}
				
		}
			LogThis.LogIt("info", "password "  + Customer.getPswd() + " was not found");
			return null;
	}
			

			/**
			 * @return 
			 * 
			 */
			public static Customer findAccountByUsername() {
				
				HashMap<String, String> cMap= new HashMap<String, String>();
				
				Scanner in = new Scanner(System.in);
					
				System.out.println("Enter username");
				String username=in.nextLine();
				System.out.println("Enter password");
				String pswd=in.next();
				Customer name=new Customer (username, pswd);
				cMap.get(username);

				for(int i =0; i < customerList.size(); i++) {
					String user = customerList.get(i).getUsername();
					if(user.equals(username));
					System.out.println("username: " + username);
				Menu.accountTrans();
					
				LogThis.LogIt("info",  " account with username: " + username  + " was found");
				
				LogThis.LogIt("info",  "username not found");
				Menu.mainMenu();
		}
				return null;	
		}
			

			
	public static Customer findAccountNum() {
		
		HashMap<String, Integer> aMap= new HashMap<String, Integer>();
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter username");
		String username=in.nextLine();
		
		Customer name=new Customer (username);
		aMap.get(username);
		
		for(int i =0; i < customerList.size(); i++) {
			Integer acNum = customerList.get(i).getAccountNum();
			if(acNum.equals(Customer.accountNum)) {
				return customerList.get(i);
			}
			System.out.println("account number not found");
	}
		return null;
	}
	
		
	public static Employee findEmpUser() {
		

		HashMap<String, String> emp= new HashMap<String, String>();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter username");
		String username=in.nextLine();
		System.out.println("Enter password");
		String pswd=in.next();
		
		Employee name=new Employee (username, pswd);
		emp.get(username);
		for(int i =0; i < employeeList.size(); i++) {
			String user = employeeList.get(i).getUsername();
			if(user.equals(username)) {
				return employeeList.get(i);
	
			}
			LogThis.LogIt("info",  " account with username: " + username  + " was found");
		}
			

		return null;
	}
}

	