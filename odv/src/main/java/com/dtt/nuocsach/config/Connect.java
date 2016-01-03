package com.dtt.nuocsach.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Connect {

	private static final String DATABASE_URL = "jdbc:mysql://119.17.253.225/ns_portalcore";
	private static final String USERNAME = "nuocsach";
	private static final String PASSWORD = "nuocsach123";

	public static Connection getconect() throws SQLException {
		Properties info = new Properties();
		info.put("user", USERNAME);
		info.put("password", PASSWORD);
		System.out.println("Connecting database...");
		java.sql.Connection conn = DriverManager.getConnection(DATABASE_URL, info);
		return conn;

	}

}
