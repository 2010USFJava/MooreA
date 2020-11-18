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
import com.revature.dao.EmployeeDao;
import com.revature.exceptions.OverLimitException;
import com.revature.exceptions.UsernamePasswordMismatchException;
import com.revature.menu.MainMenu;
import com.revature.util.ConFactory;
import com.revature.util.LogThis;
import com.sun.tools.javac.resources.ct;

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
@Override
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
			ResultSet rs = stmt.executeQuery("select * from sunshinebank.customer inner join sunshinebank.account\r\n"
					+ "on sunshinebank.customer.cusername=account.cusername ");

			while (rs.next()) {
				
			
			

			System.out.println("===========================================================");
			System.out.println("Account details:");
			System.out.println("First Name: " + rs.getString(2));
			System.out.println(" Last Name: " + rs.getString(3) );                                                  
			System.out.println(" Username: "   +  rs.getString(4));                                                      
			System.out.println(" Password: "   +   rs.getString(5));                                               
			System.out.println(" Account Number: " +   rs.getInt(7));                                                        
			System.out.println(" Balance: $ " +  	rs.getDouble(8));                                                        
			System.out.println(" Account Sataus:  " + rs.getString(9));                                                   
			System.out.println("===========================================================");
			
			}
			System.out.println("*********************");
			System.out.println("1. Delete account");
			System.out.println("2. Close account ");
			System.out.println("3. Tranaction Window");
			System.out.println("4. Main Menu");
			System.out.println("5. Exit");
			System.out.println("*********************");

			
			int ans=scan.nextInt();
			switch(ans) {
			case 1:
				try {
					Connection conn4 = cf.getConnection();
					
					System.out.println("enter account number to delete");
					int number = scan.nextInt();

					PreparedStatement stm = conn4.prepareStatement("delete from sunshinebank.account where aacountnum=? ");
					 
					
					stm.setInt(1, number);
					stm.executeUpdate();
				
				} catch (SQLException e) {
					e.printStackTrace();
				}
				viewAccount();
				break;
			case 2:
				try {
					Connection conn5 = cf.getConnection();
					System.out.println("enter account number to close");
					int number = scan.nextInt();
					PreparedStatement pst = conn5.prepareStatement("update sunshinebank.account set status = 'closed' where aacountnum=?");
					pst.setInt(1, number);
					ResultSet rst = pst.executeQuery();
					while (rst.next()) {
						String  active = status; 
						String  closed = status;
						rst.getString(4);
						if (active!=status) {
							pst.setString(4, status);
							
							
							System.out.println( "account numner " + number + " is closed");
							LogThis.LogIt("info", " Account number: " + number + "  was closed");
							
						}
					}
					viewAccount();
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			case 3:
				MainMenu.empMenu();
				break;
			case 4:
				MainMenu.mainMenu();
				break;
			case 5: 
				System.out.println("Goodbye");
			default:
				System.out.println("invalid");
				break;
			}
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


	
	@Override
	public void custSignIn() throws SQLException {

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
				System.out.println("Welcome back " + username );
				System.out.println("==========================");
				
				
				LogThis.LogIt("info", "user " + username + " logged in");
				System.out.println("");
				System.out.println("******************");
				System.out.println("*Choose an option*");
				System.out.println("1. Make deposit");
				System.out.println("2. Make Withdrawal");
				System.out.println("3. Check Balance");
				System.out.println("4  Main Menu");
				System.out.println("5. Exit");
				System.out.println("******************");
				
				
				int ans=scan.nextInt();
				switch(ans) {
				case 1:
					
					Connection conn2 = cf.getConnection();
					
						String sql2="select * from sunshinebank.account where cusername=?";
						PreparedStatement ps2 = conn2.prepareStatement(sql2);
						
						ps2.setString(1, username);
						 
						ResultSet rs2=ps2.executeQuery();
						while(rs2.next()) {
							balance=rs2.getDouble(3);
							System.out.println("Balance: $ " + balance );
							System.out.println(" ");
						
							
							Connection com=cf.getConnection();
						System.out.println("Deposit amount: ");
						double deposit = scan.nextInt();
						
						String sq2 = "UPDATE sunshinebank.account set balance = ?::NUMERIC::MONEY where cusername= ? ";
						PreparedStatement st2=com.prepareStatement(sq2);
						
						Double current=balance+deposit;
						st2.setString(2, username);
						st2.setDouble(1, current);
						st2.executeUpdate();
						


						Connection conn22 = cf.getConnection();
						
							String sql22="select * from sunshinebank.account where cusername=?";
							PreparedStatement ps22 = conn22.prepareStatement(sql22);
							
							ps22.setString(1, username);
							 
							ResultSet rs22=ps22.executeQuery();
							while(rs22.next()) {
								current=rs22.getDouble(3);
							
								System.out.println("Balance: $ " +current);
								System.out.println(" ");
						
					
						LogThis.LogIt("info", username +  " made an deposit of $ " + deposit);
						custSignIn();
						}	
						}
					break;
					
				case 2:
					
					Connection co = cf.getConnection();
					
						String sqls="select * from sunshinebank.account where cusername=?";
						PreparedStatement pss = co.prepareStatement(sqls);
						
						pss.setString(1, username);
					
						ResultSet rss=pss.executeQuery();
						while(rss.next()) {
						balance=rss.getDouble(3);
						System.out.println("Balance: $ " + balance );
						
						
						
					System.out.println("  ");
						System.out.println("Withdraw amount: ");
						double withdraw = scan.nextInt();
						

						Connection co2 = cf.getConnection();
						String s = "UPDATE sunshinebank.account set balance = ?::NUMERIC::MONEY where cusername= ? ";
						PreparedStatement p= co2.prepareStatement(s);
						
						p.setString(2, username);
					
						if(balance>= withdraw ){
							Double current=balance-withdraw;
						
					
						p.setDouble(1, current);
						p.executeUpdate();
						
						}else
							System.out.println("Insufficient funds");
							custSignIn();
						}
						

						Connection conn220 = cf.getConnection();
						
							String sql220="select * from sunshinebank.account where cusername=?";
							PreparedStatement ps220 = conn220.prepareStatement(sql220);
							
							ps220.setString(1, username);
							 
							ResultSet rs220=ps220.executeQuery();
							while(rs220.next()) {
								rs220.getDouble(3);
							
								System.out.println("Balance: $ " + balance);
								System.out.println(" ");
						
					
							}
						custSignIn();
						
					
						
					break;
					
				case 3:
					
						Connection conn1 = cf.getConnection();
					
						String sql1="select * from sunshinebank.account where cusername=?";
						PreparedStatement ps10 = conn1.prepareStatement(sql1);
						
						ps10.setString(1, username);
					
						ResultSet rs10=ps10.executeQuery();
						while(rs10.next()) {
							
						
						rs10.getString(5);
						
						System.out.println("Balance: $ " + rs10.getDouble(3));
						}
				
						custSignIn();
					
				break;
				
				case 4:
					MainMenu.transMenu();
					break;
				case 5:
					System.out.println("Goodbye");
					break;
				}
					
			
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}



	@Override
	public void depositMoney(String cusername) throws SQLException {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter username");
		String username=scan.nextLine();
		boolean withdrawal = false;
		Connection conn = cf.getConnection();
		Connection con=cf.getConnection();
		try {
			String sq = "insert into sunshinebank.account (balance)values(?::NUMERIC::MONEY) ";
			String sql="select * from sunshinebank.account where cusername=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, username);
			 
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				balance=rs.getDouble(3);
				System.out.println("Balance: $ " + balance );
				
			System.out.println("Deposit amount: ");
			double deposit = scan.nextInt();
			double currentBal = balance + deposit;
			
			
			PreparedStatement st=con.prepareStatement(sq);
			
			st.setDouble(1, currentBal);
			st.setString(2, username);;
			ResultSet r = st.executeQuery();
			
			while(r.next()) {
				double current=r.getDouble(3);
				
				System.out.println("Depsoit : $ " + deposit+ "Balance: $ " + current);
			LogThis.LogIt("info", username +  " made an deposit of $ " + deposit);
			MainMenu.transMenu();
			}}	
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
				
			
			rs.getString(5);
			balance=rs.getDouble(3);
			//System.out.println(balance);
		//ps.setDouble(3, balance);
			System.out.println("Withdraw amount: ");
			double withdraw = scan.nextInt();

			if (balance>= withdraw ){
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
