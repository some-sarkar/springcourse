package com.lucifer.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Constant {
	
	static String url = "jdbc:mysql://sql12.freesqldatabase.com:3306/sql12732466";
	static String username = "sql12732466";
	static String password = "iYxHE6IKTD";
	
	public static Connection conObject() throws SQLException {
		Connection con = DriverManager.getConnection(Constant.url, Constant.username, Constant.password);
		return con;
	}

}
