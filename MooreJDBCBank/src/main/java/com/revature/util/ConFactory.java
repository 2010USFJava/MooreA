package com.revature.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConFactory {
	

	private static ConFactory cf;

	// private no args constructor
	private ConFactory() {
		super();

	}

//public static synchronized "getter' method
	public static synchronized ConFactory getInstance() {
		if (cf == null) {
			cf = new ConFactory();
		}
		return cf;
	}

	// methods that do stuff
	public Connection getConnection() {
		Connection conn = null;
		Properties prop = new Properties();

		try {
			prop.load(new FileReader("database.properties"));
			conn = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("username"),
					prop.getProperty("password"));
			
		} catch (SQLException e) {

			e.printStackTrace();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return conn;
	}


}
