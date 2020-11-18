package com.revature.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConFactory {
	
	//Singleton Factory
	//private static instance of itself
	
	private static ConFactory cf ;
	
	// private no args constructor
	private ConFactory() {
		super();
		
	}
//public static synchronized "getter' method
	public static synchronized ConFactory getInstance() {
		if(cf==null) {
			cf= new ConFactory();
		}
		return cf;
	}
	//methods that do stuff
	public Connection getConnection() {
		Connection conn=null;
		Properties prop= new Properties();
//		String url= "jdbc:postgresql://javarev.ckpnjd2qofzs.us-east-2.rds.amazonaws.com:5432/postgres";
//		String username="amsaizan";
//		String password="michelle";
		try {
			prop.load(new FileReader("database.properties"));
			conn=DriverManager.getConnection(
					prop.getProperty("url"),prop.getProperty("username"),prop.getProperty("password"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
}