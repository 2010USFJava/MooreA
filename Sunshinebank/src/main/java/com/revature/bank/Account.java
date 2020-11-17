package com.revature.bank;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Account extends User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2918739566230933799L;

	public static int accountNum = 0;

	private static Customer customer;

	ArrayList<Account> accounts = new ArrayList<>();

	static Scanner scan = new Scanner(System.in);

	public Account() {

//		Lists.accountList.add(this);
//		Files.writeAccountFile(Lists.accountList);
	}

	public Account(int accountNum, Customer customer) {
		super();
		this.accountNum = accountNum;

		this.customer = customer;
//		Lists.accountList.add(this);
//		Files.writeAccountFile(Lists.accountList);

	}

//	public static void displayCustomer() {
//
//		System.out.println(customer);
//	}
//
//	public static int createAccountNum(String username) {
//
//		ArrayList<Integer> acctNum = new ArrayList<>();
//
//		if (accountNum == 0) {
//			accountNum = (int) (Math.random() * 5000);
//			acctNum.add(accountNum);
//
//			for (int i = 0; i < acctNum.size(); i++) {
//
//				System.out.println("Account number:  " + acctNum.get(i));
//				LogThis.LogIt("info", "Account number: " + getAccountNum() + " was created for " + Customer.username);
//			}
//
//		}
//		return accountNum;
//
//	}
//
//	public static void OpenAccount() {
//		getAccountNum();
//		// displayCustomerInfo();
//		float openingbalance = 0;
//
//		System.out.println("How much is the initial deposit: ");
//		float deposit = scan.nextFloat();
//		float currentbalance = openingbalance + deposit;
//		Transactions newT = new Transactions();
//		Transactions.setBalance(deposit);
//		LogThis.LogIt("info", " balance: $ " + currentbalance);
//		Menu.accountTrans();
//
//	}

	/**
	 * @return the accountNum
	 */
	public static int getAccountNum() {
		return accountNum;
	}

	/**
	 * @param accountNum the accountNum to set
	 */
	public static void setAccountNum(int accountNum) {
		Account.accountNum = accountNum;
	}

	/**
	 * @return the customer
	 */
	public static Customer getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public static void setCustomer(Customer customer) {
		Account.customer = customer;
	}

}
