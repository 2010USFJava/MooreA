package com.revature.banking;

import java.util.Random;
import java.util.Scanner;

public class Account {
	
	private static int acctNum;
	private String type;
	private String open;
	private String close;
	private double balance;
	
	Scanner in = new Scanner(System.in);
	double amt=in.nextDouble();
	Account act = new Account();
	
	public Account() {
	
	}

	public Account(int acctNum, String type, String open, String close, double balance) {
		super();
		this.acctNum = acctNum;
		this.type=type;
		this.open = open;
		this.close = close;
		this.balance = balance;
	}


		public static void createAccountNum() {
			Random random = new Random();
			acctNum=random.nextInt(2000);
		}
		
		
		
		public void displayAcct() {
			System.out.println(acctNum+ type+ balance);
		}
		
		
		
		public void acctbalance() {
			System.out.println("Account balance: " + balance);
		}
		
		
	public int getAcctNum() {
		return acctNum;
	}
	public void setAcctNum(int acctNum) {
		this.acctNum = acctNum;
	}



	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type=type;
	}


	public String getOpen() {
		return open;
	}
	public void setOpen(String open) {
		this.open = open;
	}



	public String getClose() {
		return close;
	}
	public void setClose(String close) {
		this.close = close;
	}



	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}



	@Override
	public String toString() {
		return "Account [acctNum=" + acctNum + ", type=" + type + ", open=" + open + ", close=" + close + ", balance="
				+ balance + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + acctNum;
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((close == null) ? 0 : close.hashCode());
		result = prime * result + ((open == null) ? 0 : open.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Account other = (Account) obj;
		if (acctNum != other.acctNum)
			return false;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		if (close == null) {
			if (other.close != null)
				return false;
		} else if (!close.equals(other.close))
			return false;
		if (open == null) {
			if (other.open != null)
				return false;
		} else if (!open.equals(other.open))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}


	
	

}
/* check for overdrawn accounts or
 *  inputting negative amounts
 */
