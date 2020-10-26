package com.revature.banking;

import java.util.Scanner;

public class User {
	public  String username;
	public String pswd;
	private String customer;
	private String admin;
	private String employee;
	
	Scanner in = new Scanner(System.in);
	String ans=in.next();
	User user = new User();
	
	public User() {
		this(" ");
	}

	
	public User(String username) {
		this(username, " ");
	}

	

	public User(String username, String pswd) {
		this.username = username;
		this.pswd = pswd;
	}
	
	
	public void  adminUser(String username, String pswd) {
		System.out.println("Enter admin username");
		ans=user.getUsername();
		user.setUsername(ans);
		in.next();
		
		System.out.println("Enter password");
		ans=user.getPswd();
		user.setPswd(ans);
		
	}

	public void empUser(String username, String pswd) {
		System.out.println("Enter employee username");
		
		ans=user.getUsername();
		user.setUsername(ans);
		in.next();
		
		System.out.println("Enter password");
		ans=user.getPswd();
		user.setPswd(ans);
		
	}
	
	public void custUser(String username, String pswd) {
		System.out.println("username");
		ans=user.getUsername();
		user.setUsername(ans);
		in.next();
		
	System.out.println("password");
	    ans=user.getPswd();
	    user.setPswd(ans);
		
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


	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}


	public String getAdmin() {
		return admin;
	}
	public void setAdmin(String admin) {
		this.admin = admin;
	}


	public String getEmployee() {
		return employee;
	}
	public void setEmployee(String employee) {
		this.employee = employee;
	}


	@Override
	public String toString() {
		return "User [username=" + username + ", pswd=" + pswd + ", customer=" + customer + ", admin=" + admin
				+ ", employee=" + employee + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((admin == null) ? 0 : admin.hashCode());
		result = prime * result + ((customer == null) ? 0 : customer.hashCode());
		result = prime * result + ((employee == null) ? 0 : employee.hashCode());
		result = prime * result + ((pswd == null) ? 0 : pswd.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (admin == null) {
			if (other.admin != null)
				return false;
		} else if (!admin.equals(other.admin))
			return false;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (employee == null) {
			if (other.employee != null)
				return false;
		} else if (!employee.equals(other.employee))
			return false;
		if (pswd == null) {
			if (other.pswd != null)
				return false;
		} else if (!pswd.equals(other.pswd))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	
	
	
	

}
