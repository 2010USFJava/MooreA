package com.revature.banking;

import java.util.Scanner;

public class Transactions {
	
	private int acctNum;
	private double balance;
	private double deposit;
	private double withdraw;
	private double transfer;
	private double amount;
	private double currentBalance= balance + deposit;
	
	


	Scanner scan = new Scanner(System.in);
	double money=scan.nextDouble();
	Transactions trans= new Transactions();
	
	public Transactions() {
		
	}

	
	public Transactions(int acctNum, double balance, double deposit, double withdraw, double transfer, double amount,
			double currentBalance) {
		super();
		this.acctNum = acctNum;
		this.balance = balance;
		this.deposit = deposit;
		this.withdraw = withdraw;
		this.transfer = transfer;
		this.amount = amount;
		this.currentBalance = currentBalance;
	}

	
		
	
	public void depositMoney() {
		System.out.println("Deposit amount:  ");
		money=getDeposit();
		setDeposit(money);
		System.out.println( "Current balance: " +  currentBalance  );
		
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


	public double getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}


	@Override
	public String toString() {
		return "Transactions [acctNum=" + acctNum + ", balance=" + balance + ", deposit=" + deposit + ", withdraw="
				+ withdraw + ", transfer=" + transfer + ", amount=" + amount + ", currentBalance=" + currentBalance
				+ ", scan=" + scan + ", money=" + money + ", trans=" + trans + "]";
	}


}
