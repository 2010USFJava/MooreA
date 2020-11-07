package com.revature.bank;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.revature.util.Files;
import com.revature.util.Lists;
import com.revature.util.LogThis;

public class Employee implements Serializable  {
	

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7819128785344472626L;
	
	
	private static String fName;
	private static String lName;
	private static String type;
	private List<String> keys;
	
	
	public Employee() {
		this(fName, lName, type);
		Lists.employeeList.add(this);
		Files.writeEmployeeFile(Lists.employeeList);
	}
	
	public Employee(String fName) {
		this(fName, lName, type);
		Lists.employeeList.add(this);
		Files.writeEmployeeFile(Lists.employeeList);
	}
	
	public Employee(String fName, String lName) {
		this(fName, lName, type);
		Lists.employeeList.add(this);
		Files.writeEmployeeFile(Lists.employeeList);
	}
	
	
	public Employee(String fName, String lName, String type) {
		super();
		
		this.fName = fName;
		this.lName = lName;
		this.type = type;
		
		Lists.employeeList.add(this);
		Files.writeEmployeeFile(Lists.employeeList);
		LogThis.LogIt("info", "Employee " + getfName() + " " +getlName() +  " is an "  + getType());
		
		
	}
	

	public Employee addKeys(Employee employee) {
		this.keys.addAll(employee.getKeys());
		return this;
	}
	
	
	//username=fName.lName
	
	public static void makeEmpUser() {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("enter employee first name");
			fName=scan.nextLine();
			System.out.println("enter employee last name");
			lName=scan.nextLine();
			String username= fName+ "." + lName;
			System.out.println("enter password");
			String pswd=scan.nextLine();
			
			Employee empUser = new Employee(fName, lName);
			LogThis.LogIt("info", "employee: " + fName+ " " + lName + " username: " + username );
			
			HashMap<String, String> emMap = new HashMap<String, String>();
			emMap.put(username, pswd);
			emMap.get(username);
			LogThis.LogIt("info", "HashMap for employee :  " + empUser + " is key: " + username + " - password: " + pswd);
			
			
	}
	public static void empLogIn() {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter username");
		String name=scan.nextLine();
		System.out.println("Enter password");
		String pswd=scan.nextLine();
		
		Lists.findEmpUser(name);
		System.out.println();
	}

//	public void typeOfEmp() {
//		
//		
//		if(type==admin) {
//		adminRights();
//			
//		}else if (type==emp) {
//		empRights();
//		}else 
//			System.out.println("Invalid choice");
//			
//	}
//	
	/* Admin should be able to view all customers info:
	 *  approving/denying accounts
	 *  withdrawing. depositing, transferring money
	 *  Canceling account
	 *  */

	public static void adminRights() {
		Customer.displayCustomerInfo(Customer.username);
		Account.openAccount();
		Account.closeAccount();
		Account.denyAccount();
		Account.approveAccount();
		Account.cancelAccount();
		Transactions.withdrawMoney();
		Transactions.depositMoney();
		Transactions.transferMoney();
		
		
	}
	
	/*
	 * *  employee should be able to view account balances and 
 *  personal info, approve or deny opening of an account
 */

	
	public static void empRights() {
		Customer.displayCustomerInfo();
		Account.openAccount();
		Account.closeAccount();
		Account.denyAccount();
		Account.approveAccount();
		Transactions.withdrawMoney();
		Transactions.depositMoney();
		Transactions.transferMoney();
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


	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}


}


