package com.revature.bank;

import java.io.Serializable;
import java.util.Scanner;

public class Transactions extends Account implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1567602479221022768L;

	public static float balance;
	public static float deposit;
	public static float withdraw;
	// public static float transfer;

	public static float transaction;

	static Scanner scan = new Scanner(System.in);

	Transactions trans = new Transactions();

	public Transactions() {
//		Lists.transList.add(this);
//		Files.writeTransactionsFile(Lists.transList);

	}

	public Transactions(float balance, float deposit, float withdraw, float transaction) {
		super();

		Transactions.balance = balance;
		Transactions.deposit = deposit;
		Transactions.withdraw = withdraw;
		Transactions.transaction = transaction;
//		Lists.transList.add(this);
//		Files.writeTransactionsFile(Lists.transList);
//		LogThis.LogIt("info", " Transaction: " + getTransaction() + " was ......");
	}

//	public static void applyForAccount() {
//		Customer.getAccountNum();
//		System.out.println(Customer.accountNum + " accountNum");
//		System.out.println("hello, " + Customer.username);
//		System.out.println("Thank you, we will notify you of our decision");
//		LogThis.LogIt("info", " Transaction: " + getTransaction() + " was made");
//		Menu.accountTrans();
//
//	}
//
//	public static void closeAccount() {
//
//		getCustomer();
//		System.out.println("enter account number");
//
//		System.out.println();
//		System.out.println(getBalance());
//		System.out.println(balance);
//		transaction = balance - withdraw;
//		System.out.println("account was closed: balance is 0");
//		LogThis.LogIt("info", " Username; " + username + " account is closed");
//
//	}
//
//	public static void checkBalance() {
//
//		getAccountNum();
//		getBalance();
//		System.out.println(balance);
//
//		LogThis.LogIt("info", "balance is: " + balance);
//
//		Menu.accountTrans();
//	}
//
//	public static void depositMoney() {
//		getAccountNum();
//		getBalance();
//		System.out.println(" balance: $ " + balance + "Enter deposit amount:  ");
//		deposit = scan.nextInt();
//		transaction = balance + deposit;
//		setBalance(transaction);
//
//		LogThis.LogIt("info", "Current balance: $ " + transaction);
//		LogThis.LogIt("info", " Transaction: " + getTransaction() + " was deposited");
//
//		Menu.accountTrans();
//
//	}
//
//	public static void withdrawMoney() {
//		getAccountNum();
//		getBalance();
//		System.out.println("Balance: $  " + balance + "  Enter Withdrawal amount: ");
//		withdraw = scan.nextInt();
//
//		if (withdraw <= balance) {
//			transaction = balance - withdraw;
//
//			LogThis.LogIt("info", "withdrawl amount: $ " + withdraw);
//			LogThis.LogIt("info", "Current balance: $ " + transaction);
//			LogThis.LogIt("info", " Transaction: " + getTransaction() + " was withdrawn");
//			setBalance(transaction);
//			Menu.accountTrans();
//		} else {
//			LogThis.LogIt("info", "Insufficient Funds");
//			LogThis.LogIt("info", "Current balance: $ " + balance + "return to transaction window");
//
//			Menu.accountTrans();
//		}
//
//	}
//
//	public static void transferMoney() {
//		// if more than one account ask for account number, if match key to value then
//		// get amount
//		getAccountNum();
//		getBalance();
//		// String sending;
//		// String recieving;
//
//		System.out.println("balance $  " + balance);
//		LogThis.LogIt("info", "account number: " + accountNum);
//		float outNum = scan.nextFloat();
//		LogThis.LogIt("info", "Transfer: $" + outNum + " from account number: " + accountNum);
//
//		if (outNum <= balance) {
//			transaction = balance - outNum;
//			getBalance();
//			LogThis.LogIt("info", "transfer: $  " + outNum + "from account number " + accountNum);
//			LogThis.LogIt("info", "Current balance: " + transaction);
//			LogThis.LogIt("info", " Transaction: " + getTransaction() + " was transfered");
//
//		} else {
//			LogThis.LogIt("info", "Insufficient Funds");
//			LogThis.LogIt("info", "Current balance: " + balance + "return to transaction menu");
//			Menu.accountTrans();
//
//			System.out.println("Transfer to account number : ");
//			outNum = scan.nextInt();
//			getBalance();
//			float trans = balance + outNum;
//			LogThis.LogIt("info", " Account number: " + accountNum + " received a deposit of: $ " + outNum);
//			LogThis.LogIt("info", "Current balance: " + trans);
//			setBalance(trans);
//			Menu.accountTrans();
//		}
//
//	}

	public static float getBalance() {
		return balance;
	}

	public static void setBalance(float balance) {
		Transactions.balance = balance;

	}

	public float getDeposit() {
		return deposit;
	}

	public void setDeposit(float deposit) {
		this.deposit = deposit;
	}

	public static float getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(float withdraw) {
		this.withdraw = withdraw;
	}

	public static float getTransaction() {
		return transaction;
	}

	public void setTransaction(float transaction) {
		this.transaction = transaction;
	}

}
