package com.revature.bank;

import java.io.Serializable;
import java.util.Scanner;

import com.revature.exceptions.IncByNegNumException;
import com.revature.menu.Menu;
import com.revature.util.Files;
import com.revature.util.Lists;
import com.revature.util.LogThis;


public class Transactions implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1567602479221022768L;
	
	
	private double balance;
	private double deposit;
	private double withdraw;
	private double transfer;
	private double amount;
	private double currentBalance;
	private double transaction;
	
	


	Scanner scan = new Scanner(System.in);
	double money=scan.nextDouble();
	Transactions trans= new Transactions();
	
	public Transactions() {
		Lists.transList.add(this);
		Files.writeTransactionsFile(Lists.transList);
		
	}

	
	public Transactions(double balance, double deposit, double withdraw, double transfer, double amount,
			double currentBalance, double transaction) {
		super();
		
		this.balance = balance;
		this.deposit = deposit;
		this.withdraw = withdraw;
		this.transfer = transfer;
		this.amount = amount;
		this.currentBalance = currentBalance;
		this.transaction=transaction;
		Lists.transList.add(this);
		Files.writeTransactionsFile(Lists.transList);
		LogThis.LogIt("info" , " Transaction: " + getTransaction() +  " was made");
	}

	

	public void depositMoney() {
		System.out.println("Enter deposit amount:  ");
		money=getDeposit();
		setDeposit(money);
		currentBalance=balance+deposit;
		System.out.println( "Current balance: " +  currentBalance  );
		System.out.println(Lists.transList.toString());
		Menu.accountTrans();
		
	}

	public void withdrawMoney() {
		System.out.println("Enter Withdrawal amount: ");
		money=trans.getWithdraw();
		trans.setWithdraw(money);
		
		if(money<=balance) {
			System.out.println("You withdrew: " + money);
			LogThis.LogIt("info", "withdrawl amount: " + getWithdraw()  );
			System.out.println("Current balance: " + balance);
			System.out.println(Lists.transList.toString());
		}else {
			System.out.println("Insufficient Funds");
			System.out.println("Current balance: " + balance + "return to transaction window");
			System.out.println(Lists.transList.toString());
			Menu.accountTrans();
		}
			
		
		
	}
	
	public void transferMoney() {
		System.out.println("Transfer amount:");
		money=trans.getTransfer();
		trans.setTransfer(money);
		if(money<=balance) {
			System.out.println("You transfered: " + money);
			System.out.println("Current balance: " + balance);
			System.out.println(Lists.transList.toString());
		}else {
			System.out.println("Insufficient Funds");
			System.out.println("Current balance: " + balance + "return to transaction menu");
			System.out.println(Lists.transList.toString());
			Menu.accountTrans();
		}
		
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

	public double getTransaction() {
		return transaction;
	}
	public void setTransaction() {
		this.transaction=transaction;
	}

	public void increaseAmount(int x) throws IncByNegNumException{
		if(x<=0) {
			throw new IncByNegNumException();
		}
		this.amount+=x;
	}

}
