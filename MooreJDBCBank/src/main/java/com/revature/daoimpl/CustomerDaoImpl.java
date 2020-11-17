package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.beans.Account;
import com.revature.beans.Customer;
import com.revature.dao.AccountDao;
import com.revature.dao.CustomerDao;
import com.revature.menu.MainMenu;
import com.revature.util.ConFactory;
import com.revature.util.LogThis;

public class CustomerDaoImpl extends Customer implements CustomerDao {
	AccountDao dao=new AccountDaoImpl();
	public static ConFactory cf = ConFactory.getInstance();

	@Override
	public long createCustomer() throws SQLException {
		
		Connection conn = cf.getConnection();
		Connection con= cf.getConnection();
		String sql = "insert into sunshinebank.customer (cfirst, clast, cusername, cpassword) values (?,?,?,?)";
		String sq="insert into sunshinebank.account (aacountnum, balance, status, cusername) values(?, ?::NUMERIC::MONEY,?,?)";
		
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Welcome to Sunshine Bank");
			System.out.println("Please Enter Customer Information to open an account");
			System.out.println("first name");
			String cfirst = scan.nextLine();
			System.out.println("last name");
			String clast = scan.nextLine();
			System.out.println("username");
			String cusername = scan.nextLine();
			System.out.println("password");
			String cpassword = scan.nextLine();
			System.out.println("Enter deposit amount");
			double bal=scan.nextInt();
			ArrayList<Customer> acctNum = new ArrayList<>();
		
			aacountnum = (int) (Math.random() * 8000);

			for (int i = 0; i < acctNum.size(); i++) {
				
				System.out.println("Account number:  " + acctNum.get(i) + "" + cusername);
				return aacountnum;
				//LogThis.LogIt("info", "Account number: " + aacountnum + " was created for " + getCusername());
			
			}
		
		
			
			Customer c=new Customer( cfirst, clast, cusername, cpassword, aacountnum);
			PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			PreparedStatement p = con.prepareStatement(sq);
			long id=0;
			ps.setString(1, c.getCfirst());
			ps.setString(2, c.getClast());
			ps.setString(3, c.getCusername());
			ps.setString(4, c.getCpassword());
			
			ps.executeUpdate();
			
			
			ResultSet rs=ps.getGeneratedKeys();
			
			
			if(rs!=null && rs.next()) {
				id=rs.getLong(1);
				System.out.println(rs.getInt(1));
				
				} else {
					
				}
			p.setDouble(2, bal);
			p.setInt(1, c.getAacountnum());
			p.setString(3, "active" );
			p.setString(4, cusername);
			p.executeUpdate();
			MainMenu.custSign();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return cid;
	}

	@Override
	public String checkDup() throws SQLException {
		Scanner scan = new Scanner(System.in);		
		try {
			Connection conn = cf.getConnection();
			PreparedStatement ps = conn.prepareStatement("select cusername from sunshinebank.customer");
			ResultSet rs = ps.executeQuery();
			
			
			while(rs.next()) {
			if (cusername !=rs.getString(1)) {
				System.out.println("username created");
				
				
				createCustomer();
				
			} else {
				
				System.out.println("enter username");
				ps.setString(1, getCusername());
				checkDup();
			}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cusername;
	}

	@Override
	public List<Customer> getAllCustomers() throws SQLException {
		List<Customer> customers = new ArrayList<>();
		try {
			Connection conn = cf.getConnection();
			Statement stmt = conn.createStatement();

			ResultSet rs = stmt.executeQuery("select * from customers");
			Customer c = null;
			while (rs.next()) {
				c = new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6));
				customers.add(c);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return customers;
	}

}
