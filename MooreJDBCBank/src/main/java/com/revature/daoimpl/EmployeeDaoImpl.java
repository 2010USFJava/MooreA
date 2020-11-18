package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.revature.beans.Customer;
import com.revature.beans.Employee;
import com.revature.dao.AccountDao;
import com.revature.dao.CustomerDao;
import com.revature.dao.EmployeeDao;
import com.revature.driver.Driver;
import com.revature.exceptions.UsernamePasswordMismatchException;
import com.revature.menu.MainMenu;
import com.revature.util.ConFactory;
import com.revature.util.LogThis;

public class EmployeeDaoImpl extends Employee implements EmployeeDao {
	CustomerDao dao = new CustomerDaoImpl();
	AccountDao acc = new AccountDaoImpl();
	public static ConFactory cf= ConFactory.getInstance();
	
	
	@Override
	
	public void empSignIn() throws SQLException {
		
		try {
		
		Connection conn= cf.getConnection();
		
		String sql="select * from sunshinebank.employee where eusername=? and epassword=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setString(1, "admin");
		ps.setString(2, "sunshine1");

		ResultSet rs=ps.executeQuery();
		
		while(rs.next()) {

			rs.getString(2);
			rs.getString(3);
		System.out.println("admin logged in");
		LogThis.LogIt("info"," admin logged in");	
	            	 MainMenu.empMenu();
	           }
		
	
	}catch (SQLException e) {
   		e.printStackTrace();
     	}catch(UsernamePasswordMismatchException ue) {
			ue.printStackTrace();
		
		LogThis.LogIt("info", "admin logged in");
     	}
		
	

}


	@Override
	public void empSignOut() throws SQLException {
		Connection conn= cf.getConnection();
		try {
			conn.close();
			System.out.println(" admin logged out");
			LogThis.LogIt("infi",  " admin logged out");
		}catch (SQLException e){
			e.printStackTrace();
		}
		
	
		
	}
	
	

	
}
