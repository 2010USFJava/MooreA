package com.revature.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.bank.Customer;
import com.revature.dao.CustomerDao;
import com.revature.util.ConFactory;

public class CustomerDaoImpl implements CustomerDao {

	public static ConFactory cf = ConFactory.getInstance();
	Connection conn = cf.getConnection();

	@Override
	public long createCust(List<Customer> newCust) throws SQLException {

		Customer create = null;
		String sql = " insert into sunshine.customer ( cid, cfname,  clname, caddress,  ccity, cstate, czip,cphone, cssn, "
				+ "cemail, cusername, cpassword) Values(default,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		long cid = 0;
		Scanner scan = new Scanner(System.in);

		System.out.println("_______________________");
		// cid.nextVal();
		System.out.println("Please Enter Customer Information:");
		System.out.println("Enter  first name");
		String cfname = scan.nextLine();
		System.out.println("Enter last name");
		String clname = scan.nextLine();
		System.out.println("Enter  address");
		String csddress = scan.nextLine();
		System.out.println("Enter city");
		String ccity = scan.nextLine();
		System.out.println("Enter state");
		String cstate = scan.nextLine();
		System.out.println("Enter zip");
		int czip = scan.nextInt();
		System.out.println("Enter  phone(no dashes)");
		String cphone = scan.next();
		System.out.println("Enter social security number- (no dashes)");
		String Cssn = scan.next();
		System.out.println("Enter email");
		String cemail = scan.next();
		System.out.println("Enter username");
		String cusername = scan.next();
		System.out.println("Enter password");
		String cpassword = scan.next();

		for (Customer cust : newCust) {
			ps.setLong(1, cust.getCid());
			ps.setString(2, cust.getCfname());
			ps.setString(3, cust.getClname());
			ps.setString(4, cust.getCaddress());
			ps.setString(5, cust.getCcity());
			ps.setString(6, cust.getCstate());
			ps.setInt(7, cust.getCzip());
			ps.setString(8, cust.getCphone());
			ps.setString(9, cust.getCssn());
			ps.setString(10, cust.getCemail());
			ps.setString(11, cust.getCusername());
			ps.setString(12, cust.getCpassword());

			int rowsAffected = ps.executeUpdate();
			if (rowsAffected > 0) {
				try (ResultSet rs = ps.getGeneratedKeys()) {
					if (rs.next()) {
						cid = rs.getLong(1);

					}
				} catch (SQLException e) {

				}

			}

		}
		return cid;

	}

	@Override
	public List<Customer> getAllCustomers() throws SQLException {
		List<Customer> custList = new ArrayList<Customer>();
		String sql = ("select * from sunshine.customer");
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery(sql);
		Customer c = null;
		while (rs.next()) {
			c = new Customer(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
					rs.getString(6), rs.getInt(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11),
					rs.getString(12));
			custList.add(c);
		}
		return custList;
	}

}
