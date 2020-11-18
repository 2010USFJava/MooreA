package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.beans.Pookieman;
import com.revature.dao.PookiemanDao;
import com.revature.util.ConFactory;

public class PookiemanDaoImpl  implements PookiemanDao {

	
	public static ConFactory cf = ConFactory.getInstance();
	@Override
	public void catchNewPookieman(Pookieman p) throws SQLException {
		Connection conn = cf.getConnection();
		//String sql = "insert into pookiemans values("p.getPid() + ", " p.getPname()+");
		//inserts into table
		String sql= "insert into pookiemans values(?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, p.getPid());
		ps.setString(2,  p.getPName());
		ps.executeUpdate();
		
	}
	
	
	@Override
	public Pookieman retrieveById(int id)  throws SQLException{
		Pookieman hannah= null;
		
		Connection conn = cf.getConnection();
		String sql = " select * from pookiemans where pid= ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setInt(1,  id);
		ResultSet rs =ps.executeQuery();
		
		
		while(rs.next()) {
			hannah=new Pookieman(rs.getInt(1), rs.getString(2));
			hannah = new Pookieman();
			System.out.println(hannah);
			
		}	
		
		return hannah;
		
	
		}
		
	}

