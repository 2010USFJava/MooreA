package com.revature.bank;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.revature.menu.Menu;
import com.revature.util.Files;
import com.revature.util.Lists;
import com.revature.util.LogThis;


public class User implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = -2437056169379975891L;
	
	
	private  String username;
	private  String pswd;
	private int employeeID;
	
	public static Scanner in = new Scanner(System.in);
	
	
	public User() {
		
		
		Lists.userList.add(this);
		Files.writeUserFile(Lists.userList);
	}

	public User(String username, String pswd) {
		this.username=username;
		this.pswd=pswd;
		Lists.userList.add(this);
		Files.writeUserFile(Lists.userList);
		LogThis.LogIt("info",  "user : " + this.getUsername() + " logged into system");
		
	}
	
	public User(String username, String pswd, int employeeID) {
		this.username = username;
		this.pswd = pswd;
		this.employeeID=employeeID;
		
		Lists.userList.add(this);
		Files.writeUserFile(Lists.userList);
		LogThis.LogIt("info", "Employee " + this.getUsername() + " logged in" );
	
	}
	

	
	public void searchForUser() {
		
		System.out.println("Enter username");
		String inputUser=in.nextLine();
		
		System.out.println("Enter password");
		String inputPswd=in.nextLine();

		Lists.findAccountByUsername(inputUser);
		Lists.findPassword(inputPswd);
		
		User user1= new User(inputUser, inputPswd );
		
		if(inputUser==inputPswd) {
			LogThis.LogIt("info",  " Username:  " + user1.getUsername() + " logged in");
		Menu.accountTrans();
		}else {
			LogThis.LogIt("info", " username and password do not match, try again");
			searchForUser();
		}
		
		
	}
	
	
	public void custUser() {
	
		
			System.out.println("Enter username");
			String username=in.nextLine();
			System.out.println("Enter password");
			String pswd=in.nextLine();
			
			User cUser= new User(username, pswd);
			LogThis.LogIt("info",  " Username " + cUser.getUsername() + " logged in");
			System.out.println(Lists.userList.toString());
			
			HashMap<String, String> SignIn= new HashMap<String, String>();
			SignIn.put(this.username, this.pswd);
			LogThis.LogIt("info", " Username: " + cUser.getUsername() + cUser.getPswd() + " and password have been mapped together");
			System.out.println(Lists.userList.toString());
			
//			for (String i : SignIn.keySet()) {
//			     System.out.println("key: " + i + "value: " + SignIn.get(i));
//			    }
//			}
			
		
	}
	
	public void  adminUser(String username, String pswd, int employeeID) {
		System.out.println("Enter username: ");
		String name=in.nextLine();
		System.out.println("Enter password: ");
		String adminPswd= in.nextLine();
		System.out.println("Enter employee ID number: ");
		int empId = Integer.parseInt(in.nextLine());
	
		User admin = new User(name, adminPswd, empId);
		LogThis.LogIt("info", " Admin with employeeID: " + admin.getEmployeeID() + " just loged in");
		System.out.println(Lists.userList.toString());
		
		
	}

	public void empUser( String username, String pswd, int employeeID) {
		System.out.println("Enter username: ");
		String empName=in.nextLine();
		System.out.println("Enter password: ");
		String empPswd= in.nextLine();
		System.out.println("Enter employee ID number: ");
		int ID = Integer.parseInt(in.nextLine());
	
		User emp = new User(empName, empPswd, ID);
		LogThis.LogIt("info", " Admin with employeeID: " + emp.getEmployeeID() + " just loged in");
		System.out.println(Lists.userList.toString());
		
	}
	
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}


	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}


	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}


	@Override
	public String toString() {
		return "User [username=" + username + ", pswd=" + pswd + ", employee=" + employeeID + "]";
	}

}