package com.revature.util;


import java.util.ArrayList;
import java.util.List;
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
			

			public static Customer findAccountByUsername(String inputname) {
			
			for(int i =0; i < customerList.size(); i++) {
				String username = customerList.get(i).getUsername();
				if(username.equals(inputname)) {
					return customerList.get(i);
				}
				
			LogThis.LogIt("info", "username"  + Customer.getUsername() + " was not found");
		}
			return null;
	}
	
	public static Customer findAccountByAccountNum(int actNum) {
		
		for(int i =0; i < customerList.size(); i++) {
			customerList.get(i);
			Integer acc = Customer.getAccountNum();
			if(acc.equals(actNum)) {
				return customerList.get(i);
			}
			LogThis.LogIt("info", " account number: " + acc + " was not found");
			System.out.println("account number not found");
		}
	
		
		return null;
	}
	
	
		
	public static Employee findEmpUser(String name) {
		
		for(int i =0; i < employeeList.size(); i++) {
			String emUser = employeeList.get(i).getType();
			if(emUser.equals(name)) {
				return employeeList.get(i);
				
			}
			LogThis.LogIt("info", " employee username: " +  emUser + " found");
			
		}
		
		System.out.println("employee  not found");
		
		return null;
	}
	
}	


	