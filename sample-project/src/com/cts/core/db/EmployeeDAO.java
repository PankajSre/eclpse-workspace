package com.cts.core.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDAO {

	Connection conn = DBUtil.getConnection();

	PreparedStatement ps = null;

	public void saveEmployee(Employee employee) {
		String query = "insert into employee (name, company) values(?,?)";
		try {
			ps = conn.prepareStatement(query);
			ps.setString(1, employee.getName());
			ps.setString(2, employee.getCompany());

			int rows = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
