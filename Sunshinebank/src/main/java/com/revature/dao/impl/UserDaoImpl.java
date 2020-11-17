package com.revature.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.bank.User;
import com.revature.dao.UserDao;
import com.revature.util.ConFactory;

public class UserDaoImpl implements UserDao {

	public static ConFactory cf = ConFactory.getInstance();

	@Override
	public User findAccountById(int uid) throws SQLException {
		User u = null;
		Connection conn = cf.getConnection();
		String sql = " select * from sunshine.user where uusername= ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, uid);

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {

			u = new User(rs.getInt(1), rs.getString(2), rs.getString(3));

			System.out.println(u.toString());
		}
		return u;

	}

	@Override
	public void createUsername(User u) throws SQLException {
		// TODO Auto-generated method stub

	}
}
