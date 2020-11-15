package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.revature.beans.Customer;
import com.revature.beans.Transaction;
import com.revature.dao.TransactionsDao;
import com.revature.exceptions.OverLimitException;
import com.revature.util.ConFactory;
import com.revature.util.LogThis;

public class TransactionsDaoImpl implements TransactionsDao {
	
	public static ConFactory cf= ConFactory.getInstance();
	
	public void depositMoney(Customer c) throws SQLException {
		
		Connection conn = cf.getConnection();
		PreparedStatement ps = conn.prepareStatement("select * from customer right join transactions "
				+ " on customers.ctid=transctions.tid");
			
		 ps.setString(4, cusername);
		 ps.setString(5, cpassword);
		 
		 ResultSet rs=ps.executeQuery();
		
		Scanner scan = new Scanner(System.in);
		getBalance();
		System.out.println("________________");
		
		System.out.println("Deposit amount: ");
		float deposit = scan.nextInt();
		float currentBal=balance+ deposit;
		System.out.println("You deposited $ " + deposit + " current balance: $ " +  currentBal);
		LogThis.LogIt("info", getCusername()  + " made an deposit ");
	}

	public boolean withdrawMoney(Customer c) throws OverLimitException, SQLException {
		Connection conn = cf.getConnection();
		PreparedStatement ps = conn.prepareStatement("select ");
		boolean withdrawl=false;
		try {
			Scanner scan = new Scanner(System.in);
			getBalance();
			System.out.println("________________");
			System.out.println("Withdraw amount: ");
			float withdraw = scan.nextInt();
			if(balance>withdraw) {
			float currentbal=balance-withdraw;
				System.out.println("You withdrew $ " + withdraw + " current balance: $ " +  currentBal);
				LogThis.LogIt("info", getCusername()  + " made a withdrawl ");
				
			}
			float currentBal=balance-withdraw;
		getBalance();
		}
		catch throws OverLimitException{
			
		}
		return currentBalance;
	}
	

	public void showBalance(Customer c) throws SQLException {
		
		
	}

}
