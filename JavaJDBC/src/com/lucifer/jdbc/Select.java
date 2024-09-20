package com.lucifer.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select {

	public static void main(String[] args) {
		
		try {
			
			
			Connection con = Constant.conObject();
			String q = "SELECT * FROM table1";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(q);
			System.out.println("ID\t\tName\t\tCity");
			System.out.println("----------------------------------------");
			while(rs.next()) {
				
				System.out.println(rs.getInt(1) + "\t\t" + rs.getString(2) + "\t\t" + rs.getString(3));
			}
			
			con.close();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
