package com.revature.bank;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.revature.menu.Menu;
import com.revature.util.Files;
import com.revature.util.Lists;
import com.revature.util.LogThis;

public class Customer implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6480484755576229315L;
	
	
	private static  String username;
	private static  String pswd;
	private  String email;
	private  String fName;
	private  String lName;
	private  String address;
	private  String city;
	private  String state;
	private  int zip;
	private  int phone;
	private  int ssn;
	private  static int accountNum;
	
	static Scanner in = new Scanner(System.in);
	
	Account account=new Account();

	public Customer() {
		Lists.customerList.add(this);
		Files.writeCustomerFile(Lists.customerList);
	}
	
	public Customer(String username, String pswd) {
		this.username = username;
		this.pswd = pswd;
		Lists.customerList.add(this);
		Files.writeCustomerFile(Lists.customerList);
	}


	
	public Customer(String username, String pswd, String email, String fName, String lName, String address, String city,
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
		
		Lists.customerList.add(this);
		Files.writeCustomerFile(Lists.customerList);
		LogThis.LogIt("info"," Customer ......");
	}
	

	public void createAccountNum() {
		int min=25;
		int max=250;
		int accountNum = (int)(Math.random() * (max - min + 1) + min);
		
		LogThis.LogIt("info", " Account number: " + accountNum + " was created");
	}
	
	
//		User user1= new User(inputUser, inputPswd );
//		Map<String, User> userPwdMap = new HashMap<>();
//		userPwdMap.put(user1.getUsername(), user1);
	
	
	//https://www.baeldung.com/java-hashmap

//	Map<String, Customer> acctNum = new HashMap<>();
//	Customer
//	
//		LogThis.LogIt("info", " key is:  "  +  " and value is:  " );
//		System.out.println(Lists.customerList.toString());
//		
//	
//			
		
	

	public void displayCustomerInfo() {
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
		Customer.username = username;
	}

	
	public static String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		Customer.pswd = pswd;
	}


	
	public static int getAccountNum() {
		return accountNum;
	}
	public static void setAccountNum(int accountNum) {
		Customer.accountNum = accountNum;
	}


	@Override
	public String toString() {
		return "Customer [username=" + username + ", pswd=" + pswd + ", email=" + email + ", fName=" + fName
				+ ", lName=" + lName + ", address=" + address + ", city=" + city + ", state=" + state + ", zip=" + zip
				+ ", phone=" + phone + ", ssn=" + ssn + "]";
	}
}


	
	
/* customers should be able to apply for
 *  joint or indv account
 * register with username and password
 * be able to withdraw, deposit, transfer and get balance
 */
	


