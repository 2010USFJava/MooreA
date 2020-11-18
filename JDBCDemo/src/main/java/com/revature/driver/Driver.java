package com.revature.driver;

import java.sql.SQLException;

import com.revature.beans.Pookieman;
import com.revature.dao.PookiemanDao;
import com.revature.daoimpl.PookiemanDaoImpl;


public class Driver {

	public static void main(String[] args)  {
//		AlbumDaoImpl adi=new AlbumDaoImpl();
//		try {
//			List<Album> aList= (ArrayList<Album>)adi.getAllAlbums();
//			System.out.println(aList.toString());
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		
		PookiemanDao pd= new PookiemanDaoImpl();
		try {
			pd.retrieveById(1);
		}catch(SQLException e)	{
			e.printStackTrace();
		}
	
	
	}
		
}
