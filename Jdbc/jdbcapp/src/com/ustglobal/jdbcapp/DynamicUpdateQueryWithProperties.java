package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class DynamicUpdateQueryWithProperties {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;
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
			String sql = " update employee_info set name=?, salary =?, gender=? where id=?";
			pstmt = conn.prepareStatement(sql);
			
			
			String empid = args[0];
			int id = Integer.parseInt(empid);
			
			String name = args[1];
			
			String empsal = args[2];
			int sal = Integer.parseInt(empsal);
			
			String gender = args[3];
			
			// set accordingly in order same as like in database.............
			pstmt.setInt(4, id);
			pstmt.setString(1, name);
			pstmt.setInt(2, sal);
			pstmt.setString(3, gender);
			
			int count = pstmt.executeUpdate();


			// Step-4th (Read the results......)
			System.out.println(count + " Rows inserted ");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}finally {

			//Step-5th (Close all JDBC Objects- its optional)

			try {
				if(conn!=null) {
					conn.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}//end of main
}// end of ExecuteUpdateQuery
