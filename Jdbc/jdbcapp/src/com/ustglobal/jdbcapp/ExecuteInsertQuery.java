package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteInsertQuery {

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		//if not update then don't use resultset......

		// JDBC starts................

		try {
			//Step-1st (Load the driver.....)
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);


			//Step-2nd (Get the connection.....)
			String url = 
					"jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);


			//Step-3rd (Issue SQL Query.......)
			String sql = " insert into employee_info values "
					+" (7,'Hemanth', 10000, 'M') ";
			stmt = conn.createStatement();
			int count = stmt.executeUpdate(sql);


			// Step-4th (Read the results......)
			System.out.println(count + " Row(s) inserted ");
		}
		catch (SQLException e) {
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
			}catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}//end of main
}// end of ExecuteInsertQuery
