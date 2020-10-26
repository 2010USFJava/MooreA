package com.revature.banking;

import java.util.Scanner;

public class Transactions {
	
	private int acctNum;
	private double balance;
	private double deposit;
	private double withdraw;
	private double transfer;
	private double amount;
	
	Scanner scan = new Scanner(System.in);
	double money=scan.nextDouble();
	Transactions trans= new Transactions();
	
	public Transactions() {
		
	}

	public Transactions(int acctNum, double balance, double deposit, double withdraw, double transfer, double amount) {
		super();
		this.acctNum = acctNum;
		this.balance = balance;
		this.deposit = deposit;
		this.withdraw = withdraw;
		this.transfer = transfer;
		this.amount=amount;
	}
	
	
	public void depositMoney() {
		System.out.println("Deposit amount: ");
		money=trans.getDeposit();
		trans.setDeposit(money);
		System.out.println("You deposited: " + money);
		System.out.println("Current balance: " + balance);
		
	}

	public void withdrawMoney() {
		System.out.println("Withdrawal amount: ");
		money=trans.getWithdraw();
		trans.setWithdraw(money);
		
		if(money<=balance) {
			System.out.println("You withdrew: " + money);
			
			System.out.println("Current balance: " + balance);
		}else {
			System.out.println("Insufficient Funds");
			System.out.println("Current balance: " + balance);
		}
		
	}
	
	public void transferMoney() {
		System.out.println("Transfer amount:");
		money=trans.getTransfer();
		trans.setTransfer(money);
		if(money<=balance) {
			System.out.println("You transfered: " + money);
			System.out.println("Current balance: " + balance);
		}else {
			System.out.println("Insufficient Funds");
			System.out.println("Current balance: " + balance);
		}
		
	}
	
	public int getAcctNum() {
		return acctNum;
	}
	public void setAcctNum(int acctNum) {
		this.acctNum = acctNum;
	}




	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}



	public double getDeposit() {
		return deposit;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}



	public double getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
	}



	public double getTransfer() {
		return transfer;
	}
	public void setTransfer(double transfer) {
		this.transfer = transfer;
	}

	
	

	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}



	@Override
	public String toString() {
		return "Transactions [acctNum=" + acctNum + ", balance=" + balance + ", deposit=" + deposit + ", withdraw="
				+ withdraw + ", transfer=" + transfer + ", amount=" + amount + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + acctNum;
		long temp;
		temp = Double.doubleToLongBits(amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(deposit);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(transfer);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(withdraw);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Transactions other = (Transactions) obj;
		if (acctNum != other.acctNum)
			return false;
		if (Double.doubleToLongBits(amount) != Double.doubleToLongBits(other.amount))
			return false;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		if (Double.doubleToLongBits(deposit) != Double.doubleToLongBits(other.deposit))
			return false;
		if (Double.doubleToLongBits(transfer) != Double.doubleToLongBits(other.transfer))
			return false;
		if (Double.doubleToLongBits(withdraw) != Double.doubleToLongBits(other.withdraw))
			return false;
		return true;
	}


}
