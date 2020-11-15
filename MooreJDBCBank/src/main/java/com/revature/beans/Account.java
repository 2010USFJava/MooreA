package com.revature.beans;

public class Account extends Customer {
	
	public int aid;
	public int aacountnum=0;
	public double balance;
	
	
	
	public Account() {
		super();

	}
 public  Account(int aid, int aacountnum, double balance) {
		super();
		this.aid = aid;
		this.aacountnum = aacountnum;
		this.balance=balance;
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

	/**
	 * @return the accountNum
	 */
	public int getAacountnum() {
		return aacountnum;
	}

	/**
	 * @param accountNum the accountNum to set
	 */
	public void setAacountnum(int aacountnum) {
		this.aacountnum = aacountnum;
	}
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance=balance;
	}
	

	@Override
	public String toString() {
		return "Account [aid=" + aid + ", aacountnum=" + aacountnum + "]";
	}
	
	
	
	
	
	

}
