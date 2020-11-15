package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.revature.beans.Account;
import com.revature.beans.Customer;
import com.revature.dao.AccountDao;
import com.revature.exceptions.OverLimitException;

import com.revature.util.ConFactory;
import com.revature.util.LogThis;

public class AccountDaoImpl extends Account implements AccountDao {
	
	public static ConFactory cf= ConFactory.getInstance();


	public void viewAccount(Account acc) throws SQLException {
		Connection conn= cf.getConnection();
		
		Statement stmt=conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from cust_profile");
		
		rs.getInt(1);
		rs.getInt(2);
		rs.getInt(3);
		rs.getDouble(4);
		rs.getString(5);
		rs.getString(6);
		rs.getString(7);
		rs.getString(8);
		
		System.out.println("===================================================================");
		System.out.println("Account details ");
		System.out.println("First Name" + "" + " Last Name" + " " + "Username" + "" + "account number" +"" +  " balance  $ ");
		System.out.println(getCfirst() + " " +  getClast() + " " + getAacountnum() + " " + getBalance());
		System.out.println("===================================================================");		
		
	}
	

	public void deleteAccount() throws SQLException{
		Connection conn = cf.getConnection();
		
		
	}

	public void custSignIn() throws SQLException {
		
		Connection conn= cf.getConnection();
		matchUnameNPass(cusername, cpassword);
	
	
		System.out.println(" sign in succesful");
		
	}


	public void closeAccount()  throws SQLException{
		Connection conn = cf.getConnection();
		
		
	}
	

	
	public void depositMoney(double deposit) throws SQLException {
		
		
		Connection conn = cf.getConnection();
		PreparedStatement ps = conn.prepareStatement("select * from v_actinfo" );
		 
		 Scanner scan = new Scanner(System.in);
			
			System.out.println("==================");
			System.out.println("Deposit amount: ");
			System.out.println("==================");
			 deposit = scan.nextInt();
		
		
		 ps.setDouble(1, balance);
		 ps.setString(2, cusername);
		 
		 ResultSet rs=ps.executeQuery();
		
		
		double currentBal=balance+ deposit;
		setBalance(currentBal);
		 Account a = new Account(rs.getInt(1), rs.getInt(2), rs.getInt(3));
		System.out.println(cusername + "withdrew $ " + deposit + " current balance: $ " +  currentBal);
		LogThis.LogIt("info", getCusername()  + " made an deposit ");
	}

	public double withdrawMoney(double withdraw ) throws OverLimitException, SQLException {
		Connection conn = cf.getConnection();
		PreparedStatement ps = conn.prepareStatement("select * from v_actinfo ");
		
		boolean withdrawl=false;
		try {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("________________");
			System.out.println("Withdraw amount: ");
			withdraw = scan.nextInt();

			 ps.setDouble(1, balance);
			 ps.setString(2, cusername);
			 
			 ResultSet rs=ps.executeQuery();
			
			if(balance>withdraw) {
			double currentbal=balance-withdraw;
			setBalance(currentbal);
			 Account a = new Account(rs.getInt(1), rs.getInt(2), rs.getInt(3));
				System.out.println( cusername + " withdrew $ " + withdraw + " current balance: $ " +  currentbal);
				LogThis.LogIt("info", getCusername()  + " made a withdrawl ");
				
			}
			
		}
		catch (OverLimitException o){
			
		}
		return balance;
	}
	

	public void showBalance(double balance) throws SQLException {
		Connection conn = cf.getConnection();
		PreparedStatement ps = conn.prepareStatement("select * from v_actinfo ");

		 ps.setDouble(1, balance);
		 ps.setString(2, cusername);
		 
		 ps.executeQuery();
		
		 System.out.println("balance: $ " +  balance);
	}

	@Override
	public void custSignOut() throws SQLException {
		
		
	}


	@Override
	public void viewAccount() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	

}
