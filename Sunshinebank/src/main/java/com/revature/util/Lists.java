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
			
			LogThis.LogIt("info", "password "  + Customer.getPswd() + " was not found");
			System.out.println("password not found");
		
		}
			return null;
	}
			

			public static Customer findAccountByUsername(String inputUser) {
			
			for(int i =0; i < customerList.size(); i++) {
				String name = customerList.get(i).getUsername();
				if(name.equals(inputUser)) {
					return customerList.get(i);
					
				}
			
				LogThis.LogIt("info", "username"  + Customer.getUsername() + " was not found");
			System.out.println("username not found");
		
		}
			return null;
	}
		//to remove values based on key -- 
//		number.remove(3);
//	      System.out.println("Map key and values after removal:");
//	      Set set2 = number.entrySet();
//	      Iterator iterator2 = set2.iterator();
//	      while(iterator2.hasNext()) {
//	          Map.Entry mentry2 = (Map.Entry)iterator2.next();
//	          System.out.print("Key is: "+mentry2.getKey() + " & Value is: ");
//	          System.out.println(mentry2.getValue());
//	       }
		
	public static Customer findAccountByAccountNum(Integer actNum) {
		
		for(int i =0; i < customerList.size(); i++) {
			customerList.get(i);
			Integer acc = Customer.getAccountNum();
			if(acc.equals(actNum)) {
				return customerList.get(i);
			}
		}
		
		System.out.println("account number not found");
		
		return null;
	}
		
	public static Employee findEmplByKey(String emType) {
		
		for(int i =0; i < employeeList.size(); i++) {
			String typeEm = employeeList.get(i).getType();
			if(emType.equals(typeEm)) {
				return employeeList.get(i);
			}
		}
		
		System.out.println("employee  not found");
		
		return null;
	}

		
	}


	