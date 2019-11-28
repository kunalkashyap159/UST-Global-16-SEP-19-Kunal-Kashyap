package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.mysql.jdbc.Driver;

public class PreparedDynamicInsertStatementQuery {

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
			String sql = " insert into employee_info values(?,?,?,?)";  // ? ?- is much faster than normal query.....
			pstmt = conn.prepareStatement(sql);
			
			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1, id);
			
			String ename = args[1];
			pstmt.setString(2, ename);
			
			String empsal = args[2];
			int sal = Integer.parseInt(empsal);
			pstmt.setInt(3, sal);
			
			String egender = args[3];
			pstmt.setString(4, egender);
			


			// Step-4th (Read the results......)
			int count =pstmt.executeUpdate();
			System.out.println(count + " Row(s) inserted ");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}finally {

			//Step-5th (Close all JDBC Objects- its optional)

			try {
				if(pstmt!=null) {
					pstmt.close();
				}
				if(conn!=null) {
					conn.close();
				}
				
			}catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}//end of main
}// end of PreparedStatementQuery
