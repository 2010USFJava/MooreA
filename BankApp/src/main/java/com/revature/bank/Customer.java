package com.revature.bank;

public class Customer {
	
	String first;
	String last;
	String email;
	int phone;
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Customer(String first, String last, String email, int phone) {
		super();
		this.first = first;
		this.last = last;
		this.email = email;
		this.phone = phone;
	}
	
	
	


	public String getFirst() {
		return first;
	}


	public void setFirst(String first) {
		this.first = first;
	}


	public String getLast() {
		return last;
	}


	public void setLast(String last) {
		this.last = last;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getPhone() {
		return phone;
	}


	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	

}
