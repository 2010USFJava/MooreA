package com.revature.bank;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.revature.menu.Menu;
import com.revature.util.Files;
import com.revature.util.Lists;
import com.revature.util.LogThis;

public class Employee implements Serializable  {
	

	private static final long serialVersionUID = -7819128785344472626L;
	
	
	private static String fName;
	private static String lName;
	private static String username; 
	private static String password;
	private static String type;
	
	
	
	
	public Employee() {
	
		Lists.employeeList.add(this);
		Files.writeEmployeeFile(Lists.employeeList);
	}
	
	public Employee(String username, String password) {
		this.username=username;
		this.password=password;
		Lists.employeeList.add(this);
		Files.writeEmployeeFile(Lists.employeeList);
		LogThis.LogIt("info", "employee username: " + getUsername() + " employee password: " + getPassword());
	}

	
	public Employee(String fName, String lName, String username,String type) {
		super();
		
		this.fName = fName;
		this.lName = lName;
		this.type = type;
		
		
		Lists.employeeList.add(this);
		Files.writeEmployeeFile(Lists.employeeList);
		LogThis.LogIt("info", "Employee " + getfName() + " " +getlName() +  " is an "  + getType());
		
		
	}
	

	
	//employee=fName.lName
	//adminn=fitrst.last*A
		public static void empUsers() {

			Map<String, String> emp= new HashMap<String, String>();
			
			emp.put( "kit.kat*A", "katkit");
			emp.put("baby.ruth", "ruthbaby");
			emp.put("heath.bar", "barheath");
			for(Map.Entry<String, String> entry : emp.entrySet())
				
			System.out.println("key: " + entry.getKey() + ", Value:  " + entry.getValue());
	        Data ds3 = new Data();
	        ds3.setMap(emp);
	        ds3.getMap(emp);

	        MoreData md3= new MoreData();
	        ds3.giveMap(md3);
	        md3.displayMap();
	        

			for (String s : emp.keySet()) {
				
				System.out.println("keyset:" + s );
				
			} // LogThis.LogIt("info",  "list of employees " + emp );
	        
		}
		
		
		
		
	public static void empLogIn() {
		
		Scanner scan = new Scanner(System.in);
		
		Map<String, String> emp= new HashMap<String, String>();
		
		emp.put( "kit.kat*A", "katkit");
		emp.put("baby.ruth", "ruthbaby");
		emp.put("heath.bar", "barheath");
		for(Map.Entry<String, String> entry : emp.entrySet())
			
		System.out.println("key: " + entry.getKey() + ", Value:  " + entry.getValue());
		System.out.println(" ");
		System.out.println("1. kit.kat*A--Admin");
		System.out.println("2. baby.ruth- employee");
		System.out.println("3. heath.bar - employee");
		int option=scan.nextInt();
		switch(option) {
		case 1:
			Menu.adminTrans();
			break;
		case 2:
			Menu.empTrans();
			break;
		case 3:
			Menu.empTrans();
			break;
		case 4:
			System.out.println("invalid, try again");
			break;
		default:
			System.out.println("GoodBye");
		}
			scan.close();
			
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

	public static String getUsername() {
		return username;
	}
	public static void setUsername(String username) {
		Employee.username = username;
	}

	public static String getPassword() {
		return password;
	}

	public static void setPassword(String password) {
		Employee.password = password;
	}

	
	
	

}


