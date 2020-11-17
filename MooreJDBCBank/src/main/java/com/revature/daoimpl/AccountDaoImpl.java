package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import com.revature.beans.Account;
import com.revature.beans.Employee;
import com.revature.dao.AccountDao;
import com.revature.exceptions.OverLimitException;
import com.revature.exceptions.UsernamePasswordMismatchException;
import com.revature.menu.MainMenu;
import com.revature.util.ConFactory;
import com.revature.util.LogThis;

public class AccountDaoImpl extends Account implements AccountDao {

	public static ConFactory cf = ConFactory.getInstance();

	@Override
	public boolean matchUnameNPass() throws SQLException, UsernamePasswordMismatchException {
		Connection conn = cf.getConnection();

		boolean nameNpassMatch = false;
		try {

			PreparedStatement ps = conn
					.prepareStatement("select cusername from sunshinebank.customer where cusername='?' and cpassword='?'");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				String username = rs.getString(1);

				if (username.equals(getCusername())) {
					System.out.println("==========================");
					System.out.println("Welcome back " + getCusername() + "log in succesfull");
					System.out.println("==========================");

					nameNpassMatch = true;
					MainMenu.transMenu();
					rs.close();
				} else {

					matchUnameNPass();
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (UsernamePasswordMismatchException ue) {
			ue.printStackTrace();
		}
		return nameNpassMatch;

	}

	public int createAccountNum(String username) throws SQLException{
		ArrayList<Account> acctNum = new ArrayList<>();
		
			aacountnum = (int) (Math.random() * 5000);

			for (int i = 0; i < acctNum.size(); i++) {

				System.out.println("Account number:  " + acctNum.get(i) + "" + cusername);
				LogThis.LogIt("info", "Account number: " + getAacountnum() + " was created for " + getCusername());
			}

		return aacountnum;
	}

	@Override
	public void viewAccount() throws SQLException {

		Connection conn = cf.getConnection();
		try {
			Scanner scan = new Scanner(System.in);

			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from sunshinebank.cust_profile");

			while (rs.next()) {
				rs.getInt(3);
				rs.getDouble(4);
				rs.getString(5);
				rs.getString(6);
				rs.getString(7);
			}

			System.out.println("===================================================================");
			System.out.println("Account details: ");
			System.out.println("First Name " + getCfirst() + " Last Name " + getClast());
			System.out.println(" username " + getCusername() + " account number " + getAacountnum());
			System.out.println(" balance  $ " + getBalance());
			System.out.println("===================================================================");

			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteAccount() throws SQLException {
		Connection conn = cf.getConnection();

		try {

			Scanner scan = new Scanner(System.in);
			System.out.println("enter account number to delete");
			int number = scan.nextInt();

			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("delete from account where aacountnum=? cascade");
			while (rs.next()) {
				rs.getInt(2);
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String custSignIn() throws SQLException {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter username");
		String username = scan.nextLine();
		System.out.println("Enter password");
		String password = scan.nextLine();
		Employee emp = new Employee(username, password);
		try {
			Connection conn = cf.getConnection();
			String sql="select  * from sunshinebank.customer where cusername=? and cpassword=? ";
			PreparedStatement ps = conn.prepareStatement(sql);
		
			 
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
					rs.getString(5);
					rs.getString(4);
			if(password==username) {
			
					custSignIn();
					
				}else
					System.out.println("==========================");
				System.out.println("Welcome back " + getCusername() );
				System.out.println("==========================");
					MainMenu.transMenu();
			LogThis.LogIt("info", "user " + cusername + " loggin in");
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cusername;
	}


	@Override
	public void closeAccount() throws SQLException {
		Connection conn = cf.getConnection();
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("enter account number to close");
			int number = scan.nextInt();
			PreparedStatement ps = conn
					.prepareStatement("update sunshinebank.account set status = closed where status =null returning *");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				String closed = null;
				rs.getString(4);
				if (status != null) {
					ps.setString(4, closed);
					System.out.println(getCfirst() + "" + getClast() + " 's account is closed");
					LogThis.LogIt("info", " Account number: " + getAacountnum() + " 's account was closed");
					rs.close();
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void depositMoney(String cusername) throws SQLException {
		getCusername();
		Scanner scan = new Scanner(System.in);
		System.out.println("enter username");
		String username=scan.nextLine();
		boolean withdrawal = false;
		Connection conn = cf.getConnection();
		try {
			String sql="select * from sunshinebank.account where cusername=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, username);
		
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				rs.getString(5);
			
			System.out.println("Deposit amount: ");
			double deposit = scan.nextInt();
			double currentBal = rs.getDouble(3) + deposit;
			ps.execute();
			ps.setDouble(3, currentBal);
			
			System.out.println("Depsoit : $ " + deposit+ "Balance: $ " + currentBal);
			LogThis.LogIt("info", username +  " made an deposit of $ " + deposit);
			MainMenu.transMenu();
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean withdrawMoney(String cusername) throws OverLimitException, SQLException {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter username");
		String username=scan.nextLine();
		boolean withdrawal = false;
		Connection conn = cf.getConnection();
		try {
			String sql="select * from sunshinebank.account where cusername=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, username);
		
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				
			
			username=rs.getString(5);
			balance=rs.getDouble(3);
			
		
			System.out.println("Withdraw amount: ");
			double withdraw = scan.nextInt();

			if (balance >= withdraw) {
				double currentbal = balance - withdraw;
				ps.setDouble(3, currentbal);
				System.out.println(username +" withdrew $ " + withdraw + " current balance: $ "
						+ currentbal);
				System.out.println("Balance: $ " + rs.getDouble(3));
				
				LogThis.LogIt("info", username + " made a withdrawl of " + withdraw);
				MainMenu.transMenu();
			} else {
				System.out.println("Insufficient funds");
				withdrawMoney(cusername);
				
			}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void showBalance(String cusername) throws SQLException {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter username");
		String username=scan.nextLine();
		
		Connection conn = cf.getConnection();
		try {
			String sql="select * from sunshinebank.account where cusername=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, username);
		
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				
			
			rs.getString(5);
			
			System.out.println("Balance: $ " + rs.getDouble(3));
			MainMenu.transMenu();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	
	@Override
	public void custSignOut(String username) throws SQLException {
		Connection conn = cf.getConnection();
		try {
			System.out.println("Signed out");
			
			System.out.println(getCfirst() + " logged out");
			LogThis.LogIt("infi", getCfirst() + "" + getClast() + "logged out");
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
