package com.revature.bank;

public class Bank {
	
	//has customers
	//employees and 
	//accounts
	
	Bank customer;
	Bank account;
	Bank emp;
	
	
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Bank(Bank customer, Bank account, Bank emp) {
		super();
		this.customer = customer;
		this.account = account;
		this.emp = emp;
	}


	public Bank getCustomer() {
		return customer;
	}
	public void setCustomer(Bank customer) {
		this.customer = customer;
	}


	public Bank getAccount() {
		return account;
	}
	public void setAccount(Bank account) {
		this.account = account;
	}


	public Bank getEmp() {
		return emp;
	}
	public void setEmp(Bank emp) {
		this.emp = emp;
	}
	
	
	

}
