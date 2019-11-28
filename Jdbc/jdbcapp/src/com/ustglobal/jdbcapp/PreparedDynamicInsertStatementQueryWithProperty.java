package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class PreparedDynamicInsertStatementQueryWithProperty {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		FileReader reader = null;

		try {
			
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			
			//Step-1st (Load the driver.....)
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);


			//Step-2nd (Get the connection.....)
			String url = prop.getProperty("url");
			conn = DriverManager.getConnection(url, prop);


			//Step-3rd (Issue SQL Query.......)
			String sql = "prop.getProperty("insert-query");    .
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
		catch (Exception e) {
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
				
			}catch (Exception e) {
				e.printStackTrace();
			}

		}

	}//end of main
}// end of PreparedStatementQuery
