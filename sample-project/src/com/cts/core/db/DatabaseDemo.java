package com.cts.core.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Connection conn = DBUtil.getConnection();
		// Create a Statement to execute SQL Queries
		Statement stmt = conn.createStatement();

//		String query = "insert into employee (name, company) values('Arvind', 'Wipro')";
//		String query = "update employee set company = 'Accenture' where id = 4";
//		
//		int result = stmt.executeUpdate(query);
//		if(result> 0) {
//			System.out.println("Data Updated Successfully!!!");
//		}else {
//			System.out.println("try again");
//		}
		String query = "select * from employee";
		ResultSet rs = stmt.executeQuery(query);

		while (rs.next()) {

			System.out.println(rs.getInt("id") + " : " + rs.getString(2) + " : " + rs.getString("company"));
		}

	}

}
