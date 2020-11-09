package com.revature.driver;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import com.revature.bank.Customer;
import com.revature.bank.Data;
import com.revature.bank.MoreData;
import com.revature.menu.Menu;
import com.revature.util.LogThis;

public interface GetUser {
	Scanner scan = new Scanner(System.in);
	public static void makeCust() {
		
		System.out.println("Enter username:");
		String username=scan.nextLine();
		System.out.println("Enter password");
		String password=scan.nextLine();
		System.out.println("enter first name");
		String fName=scan.nextLine();
		System.out.println("enter last name");
		String lName=scan.nextLine();
		
		Customer.createAccountNum(username);
		
		Customer cust = new Customer(username, password, fName, lName, Customer.accountNum);
		cust.equals(cust);
		LogThis.LogIt("info", "Customer profile was created:  "  + username + " " +password + " "+  fName + " " + lName + " " + Customer.accountNum);
			System.out.println("Customer profile created");
		Map<String, String> cMap = new HashMap<>();
			cMap.put(username, password);
			//cMap.get(username);
				System.out.println(cMap);
				
			
		//LogThis.LogIt("info",  "key: " + entry.getKey() + ", Value:  " + entry.getValue());	
			Data ds= new Data();
			ds.setMap(cMap);
			ds.getMap(cMap);
			
			MoreData md =new MoreData();
			ds.giveMap(md);
			md.displayMap();
			
			Map<String, Integer> aMap = new HashMap<>();
			aMap.put(username, Customer.accountNum);
			aMap.get(username);
			for(Map.Entry<String, Integer> entry : aMap.entrySet())
			LogThis.LogIt("info", "key: " + entry.getKey() + ", Value:  " + entry.getValue());
			
			Data ds1= new Data();
			ds1.setMap(aMap);
			ds1.getMap(aMap);
			
			MoreData md1 =new MoreData();
			ds1.giveMap(md1);
			md1.displayMap();
			
			
			System.out.println("Would you like to add another person to the account? y/n");
			String ans=scan.nextLine();
			if (ans=="y") {
				System.out.println("enter first name");
				String fName1=scan.nextLine();
				System.out.println("enter last name");
				String lName1=scan.nextLine();
				System.out.println("enter email");
				String email1=scan.nextLine();
			Customer cust1= new Customer(fName, lName);
			Menu.custSignIn();
			
			}else if(ans=="n"){
				Menu.custSignIn();
			}else {
			System.out.println("Return to main menu");
			Menu.mainMenu();
			}
	}
	
	

}
