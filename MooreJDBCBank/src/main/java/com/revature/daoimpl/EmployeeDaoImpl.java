package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.revature.dao.EmployeeDao;
import com.revature.util.ConFactory;

public class EmployeeDaoImpl  implements EmployeeDao {
	
	public static ConFactory cf= ConFactory.getInstance();

	public void signIn() throws SQLException {
		Connection conn= cf.getConnection();
		String sql="     ";
		PreparedStatement ps = conn.prepareStatement(sql);
	
	}

	public void signOut() throws SQLException {
		Connection conn= cf.getConnection();
		String sql="     ";
		PreparedStatement ps = conn.prepareStatement(sql);
	
		
	}

}
