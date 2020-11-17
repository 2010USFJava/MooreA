package com.revature.beans;

import com.revature.util.LogThis;

public class Account extends Customer {
	
	public int aid;

	public double balance;
	public String status;
	
	
	
	public Account() {
		super();

	}
 public  Account(int aid, double balance, String status) {
		super();
		this.aid = aid;
		
		this.balance=balance;
		this.status=status;
		//LogThis.LogIt("info", " account number " + getAacountnum() + "was created");
	}

	/**
	 * @return the aid
	 */
	public int getAid() {
		return aid;
	}

	/**
	 * @param aid the aid to set
	 */
	public void setAid(int aid) {
		this.aid = aid;
	}

	
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance=balance;
	}
	
	

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Account [aid=" + aid +  ", balance=" + balance + ", status=" + status
				+ "]";
	}
	
	
	
	
	
	

}
