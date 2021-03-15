package com.cts.core.db;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDriver {

	public static void main(String[] args) throws SQLException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Name : ");
		String name = br.readLine();
		System.out.print("Enter Company Name : ");
		String company = br.readLine();
//		System.out.print("Enter Id : ");
//		int id = Integer.parseInt(br.readLine());
		
        Employee employee = new Employee(name, company);
        EmployeeDAO dao = new EmployeeDAO();
        
        dao.saveEmployee(employee);
		
		
	}

}
