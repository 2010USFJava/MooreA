package com.revature.bank;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import com.revature.util.Files;
import com.revature.util.Lists;
import com.revature.util.LogThis;

public class Customer implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6480484755576229315L;
	
	public static int accountNum;
	public static  String username;
	public static  String pswd;
	private  static  String fName;
	private  static String lName;
	
	
	static Scanner in = new Scanner(System.in);
	List<Customer> customer= new ArrayList<Customer>();
	
	
	
	
	

	public Customer() {
		Lists.customerList.add(this);
		Files.writeCustomerFile(Lists.customerList);
	
	}
	
	public Customer(String username) {
		this.username = username;
		Lists.customerList.add(this);
		Files.writeCustomerFile(Lists.customerList);
	}
	public Customer(String username, String pswd) {
		this.username = username;
		this.pswd = pswd;
		Lists.customerList.add(this);
		Files.writeCustomerFile(Lists.customerList);
		LogThis.LogIt("info"," Customer username: " + getUsername() +  " with password  " + getPswd()+  " , logged in ");
	}
	
	public Customer(String username, int accountName) {
		this.username=username;
		this.accountNum=accountNum;
		Lists.customerList.add(this);
		Files.writeCustomerFile(Lists.customerList);
		LogThis.LogIt("info"," Customer username: " + getUsername() +  " with account number" + getAccountNum()+  " , logged in ");
		
	}
	
	
	public Customer(String username, String pswd,   String fName, String lName) {
		this.username=username;
		this.pswd=pswd;
		this.accountNum=accountNum;
		this.fName=fName;
		this.lName=lName;
		
		Lists.customerList.add(this);
		Files.writeCustomerFile(Lists.customerList);
	}
	
	
	public Customer(String username, String pswd,   String fName, String lName,  int accountNum) {
		this.username=username;
		this.pswd=pswd;
		this.fName=fName;
		this.lName=lName;
		
		this.accountNum=accountNum;
		Lists.customerList.add(this);
		Files.writeCustomerFile(Lists.customerList);
	}
	
	public static  int createAccountNum(String username) {
		getUsername();
		List<Integer> actNum = new ArrayList<Integer>();
			int min=10;
			int max=500;
			if (accountNum==0 ) {
				accountNum = (int)(Math.random() * (max - min + 1) + min);
				
			} 
			for (int i = 0; i < actNum.size(); i++) {
				actNum.add(accountNum);
				System.out.println(actNum.get(i) + " ");
				LogThis.LogIt("info",  "account number: " + accountNum + "was created");
			}
			return accountNum;
	}

		
	public static  Customer getCustomer( Customer cust) {
		Customer.getCustomer(cust);
		return cust;
	}

	public static void displayCustomerInfo() {
		
		//getCustomer(cust);
		System.out.println( );
		LogThis.LogIt("info",  " customer profile:  " );
	}
	
	
	public static String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}



	public static String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}



	public static String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	
	public static String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}


	
	public static int getAccountNum() {
		return accountNum;
	}
	public  void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}


}


	
	
/* customers should be able to apply for
 *  joint or indv account
 * register with username and password
 * be able to withdraw, deposit, transfer and get balance
 */
	


