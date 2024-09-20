package com.lucifer.jdbc;
import java.sql.*;

public class FirstJDBCClass {

	public static void main(String[] args) {

		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			//creating connection
			String url = "jdbc:mysql://sql12.freesqldatabase.com:3306/sql12732466";

			String username = "sql12732466";
			String password = "iYxHE6IKTD";
			
			Connection con = DriverManager.getConnection(url, username, password);
			
			String q = "create table table1(tId int(20) primary key auto_increment,tName varchar(200) not null, tCity varchar(400))";
			
			Statement stmt = con.createStatement();
			stmt.execute(q);
			System.out.println("Table created");
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
