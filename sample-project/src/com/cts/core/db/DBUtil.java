package com.cts.core.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	public static final Connection getConnection() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			// 2. Connect with database using Connection interface
			String url = "jdbc:mysql://localhost:3306/cts_003?useSSL=false";
			String user = "root";
			String password = "pankaj";
			Connection conn = DriverManager.getConnection(url, user, password);
			return conn;
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
			return null;
		}

	}
}
