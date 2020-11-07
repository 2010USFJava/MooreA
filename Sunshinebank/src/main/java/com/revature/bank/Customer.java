package com.revature.bank;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.util.Files;
import com.revature.util.Lists;
import com.revature.util.LogThis;

public class Customer implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6480484755576229315L;
	
	public static int accountNum=0;
	static  String username;
	private static  String pswd;
	private  static String email;
	private  static  String fName;
	private  static String lName;
	private  static String address;
	private  static String city;
	private  static String state;
	private  static  int zip;
	private  static int phone;
	private  static int ssn;
	
	
	static Scanner in = new Scanner(System.in);
	

	public Customer() {
		this(username, pswd, accountNum, email, fName, lName, address, city, state, zip, phone, ssn);
		Lists.customerList.add(this);
		Files.writeCustomerFile(Lists.customerList);
	}
	
	public Customer(String username) {
		this(username, pswd, accountNum,  email, fName, lName, address, city, state, zip, phone, ssn);
		Lists.customerList.add(this);
		Files.writeCustomerFile(Lists.customerList);
	}

	public Customer(String username, String pswd) {
		this(username, pswd, accountNum, email, fName, lName, address, city, state, zip, phone, ssn);
		Lists.customerList.add(this);
		Files.writeCustomerFile(Lists.customerList);
	}

	public Customer(String username, String pswd, int accountNum) {
		this(username, pswd, accountNum, email, fName, lName, address, city, state, zip, phone, ssn);
		Lists.customerList.add(this);
		Files.writeCustomerFile(Lists.customerList);
	}
	
	public Customer(String username, String pswd, int accountNum, String email) {
		this(username, pswd, accountNum, email, fName, lName, address, city, state, zip, phone, ssn);
		Lists.customerList.add(this);
		Files.writeCustomerFile(Lists.customerList);
	}
	
	public Customer(String username, String pswd, int accountNum, String email, String fName) {
		this(username, pswd, accountNum, email, fName, lName, address, city, state, zip, phone, ssn);
		Lists.customerList.add(this);
		Files.writeCustomerFile(Lists.customerList);
	}
	
	public Customer(String username, String pswd, int accountNum, String email, String fName, String lName) {
		this(username, pswd, accountNum, email, fName, lName, address, city, state, zip, phone, ssn);
		Lists.customerList.add(this);
		Files.writeCustomerFile(Lists.customerList);
	}
	
	public Customer(String username, String pswd, int accountNum, String email, String fName, String lName, String address, String city) {
		this(username, pswd, accountNum, email, fName, lName, address, city, state, zip, phone, ssn);
		Lists.customerList.add(this);
		Files.writeCustomerFile(Lists.customerList);
	}
	
	public Customer(String username, String pswd, int accountNum, String email, String fName, String lName, String address, String city, String state) {
		this(username, pswd, accountNum, email, fName, lName, address, city, state, zip, phone, ssn);
		Lists.customerList.add(this);
		Files.writeCustomerFile(Lists.customerList);
	}
	
	public Customer(String username, String pswd, int accountNum, String email, String fName, String lName, String address, String city, String state, int zip) {
		this(username, pswd, accountNum, email, fName, lName, address, city, state, zip, phone, ssn);
		Lists.customerList.add(this);
		Files.writeCustomerFile(Lists.customerList);
	}
	
	public Customer(String username, String pswd, int accountNum, String email, String fName, String lName, String address, String city, String state, int zip, int phone) {
		this(username, pswd,accountNum,  email, fName, lName, address, city, state, zip);
		Lists.customerList.add(this);
		Files.writeCustomerFile(Lists.customerList);
	}
	
	public Customer(String username, String pswd, int accountNum, String email, String fName, String lName, String address, String city,
			String state, int zip, int phone, int ssn) {
		super();
		this.username = username;
		this.pswd = pswd;
		this.email = email;
		this.fName = fName;
		this.lName = lName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
		this.ssn = ssn;
		this.accountNum=accountNum;
		
		Lists.customerList.add(this);
		Files.writeCustomerFile(Lists.customerList);
		LogThis.LogIt("info"," Customer "  + getfName() + " " + getlName() +  " , was created");
	}
	
	public Customer( String email, String fName, String lName, String address, String city,
			String state, int zip, int phone, int ssn) {
		this.email=email;
		this.fName = fName;
		this.lName = lName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
		this.ssn = ssn;
	}

	public static  int createAccountNum(String username) {
		getUsername();
		List<Integer> actNum = new ArrayList<Integer>();
			int min=10;
			int max=500;
			if (accountNum==0  ) {
				accountNum = (int)(Math.random() * (max - min + 1) + min);
				
			} 
			for (int i = 0; i < actNum.size(); i++) {
				actNum.add(accountNum);
				System.out.println(actNum.get(i) + " ");
				LogThis.LogIt("info",  "account number: " + accountNum + "was created");
			}
			return accountNum;
		}
		
	

	public static void displayCustomerInfo(String username) {
		
		Lists.findAccountByUsername(username);
		System.out.println(fName +lName +address +city+state+ zip+ phone+ssn+email+ username+accountNum);
	}
	
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}



	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}



	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}



	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}



	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}



	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}



	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}



	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	


