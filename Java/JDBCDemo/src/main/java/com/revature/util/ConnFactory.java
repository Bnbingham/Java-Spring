package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnFactory {
	//singleton factory
	
	//private static instance of self
	private static ConnFactory cf = new ConnFactory();
	
	//private no args constructor
	private ConnFactory() {
		super();
	}
	
	//private static sychronized "getter" method
	public static synchronized ConnFactory getInstance() {
		if(cf == null)
			cf = new ConnFactory();
		return cf;
	}
	
	//Methods that do stuff
	//get a Connectoin to bd
	public Connection getConnection() {
		String url = "jdbc:oracle:thin:@java2004usf.c3ze8kvqgwxn.us-east-2.rds.amazonaws.com:1521:ORCL"; 
		String user= "chinook";
		String password= "p4ssw0rd";
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	
}
