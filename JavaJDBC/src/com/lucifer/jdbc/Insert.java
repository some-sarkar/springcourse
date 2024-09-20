package com.lucifer.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			//Connection con = DriverManager.getConnection(Constant.url, Constant.username, Constant.password);
			Connection con = Constant.conObject();
			String q = "INSERT INTO table1(tName,tCity) values(?,?)";
			PreparedStatement ps = con.prepareStatement(q);
			
			ps.setString(1, "anv");
			ps.setString(2, "Mra");
			
			ps.execute();
			System.out.println("Data Inserted");
			
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
