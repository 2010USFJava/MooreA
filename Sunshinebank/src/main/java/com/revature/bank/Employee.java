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
		Map<String, String> emp= new HashMap<String, String>();
		
		emp.put( "kit.kat*A", "katkit");
		emp.put("baby.ruth", "ruthbaby");
		emp.put("heath.bar", "barheath");
		for(Map.Entry<String, String> entry : emp.entrySet())
			
		System.out.println("key: " + entry.getKey() + ", Value:  " + entry.getValue());

		Scanner scan= new Scanner(System.in);
		System.out.println("Enter username");
		String name=scan.nextLine();
		System.out.println("Enter password");
		String pswd=scan.nextLine();
			 
		String admin="kit.kat*A";
		String emplo="heath.bar";
		String emp2="baby.ruth";
		if(name==admin){
			
			 Menu.adminTrans();
			}
		else if(name==emplo) {Menu.empTrans();}
		else
			System.out.println("invalid username, try again");
		empLogIn();
			
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


