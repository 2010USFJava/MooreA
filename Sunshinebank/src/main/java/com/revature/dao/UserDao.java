package com.revature.dao;

import java.sql.SQLException;

import com.revature.bank.User;

public interface UserDao {

	public User findAccountById(int uid) throws SQLException;

	public void createUsername(User u) throws SQLException;

}
