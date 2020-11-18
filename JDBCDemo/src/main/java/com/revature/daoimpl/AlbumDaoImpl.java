package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Album;
import com.revature.dao.AlbumDao;

import com.revature.util.ConFactory;

public class AlbumDaoImpl implements AlbumDao {
	
	public static ConFactory cf= ConFactory.getInstance();

	
	
	@Override
	public List<Album> getAllAlbums() throws SQLException {
		List<Album> albumList= new ArrayList<Album>();
		Connection conn= cf.getConnection();
		Statement stmt= conn.createStatement();
		ResultSet rs= stmt.executeQuery("select * from \"Album\"");
		Album a= null;
		while(rs.next()) {
			a= new Album(rs.getInt(1),rs.getString(2),rs.getInt(3));
			albumList.add(a);
		}
		return albumList;
	}



}
