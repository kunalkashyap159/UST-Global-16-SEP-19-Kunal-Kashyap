package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class MyFirstJDBC {

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		// JDBC starts................

		try {


			//Step-1st (Load the driver.....)
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);


			//Step-2nd (Get the connection.....)
			String url = 
					"jdbc:mysql://localhost:3306/ust_ty_db?"+"user=root&password=root";
			conn = DriverManager.getConnection(url);


			//Step-3rd (Issue SQL Query.......)
			stmt = conn.createStatement();
			String sql = "select * from employee_info";
			rs = stmt.executeQuery(sql);


			// Step-4th (Read the results......)
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int salary = rs.getInt("salary");
				String gender = rs.getString("gender");

				System.out.println("Id is "+id);
				System.out.println("Name is "+name);
				System.out.println("Salary is "+salary);
				System.out.println("Gender is "+gender);
				System.out.println("**********************");
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {

			//Step-5th (Close all JDBC Objects- its optional)

			try {
				if(conn!=null) {
					conn.close();
				}
				if(stmt!=null) {
					stmt.close();
				}

				if(rs!=null ) {
					rs.close();
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}//end of main
}// end of MyFirstJDBC
