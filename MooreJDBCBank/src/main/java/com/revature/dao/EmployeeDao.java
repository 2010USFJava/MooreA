package com.revature.dao;

import java.sql.SQLException;

public interface EmployeeDao {
	
	public void signIn() throws SQLException;
	public void signOut() throws SQLException;
	
	

}
