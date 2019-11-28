package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.*;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class DynamicDeleteQueryWithProperties {

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		FileReader reader = null;

		try {
			
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);

			//	Driver driver = new Driver();
			//	DriverManager.registerDriver(driver);

			try {
				Class.forName("com.mysql.jdbc.Driver");


				String url = prop.getProperty("url");
				conn = DriverManager.getConnection(url, prop);

				String sql = "delete from  employee_info  where id=?";

				stmt = conn.Statement(sql);
				String empid = args[0];
				int id = Integer.parseInt(empid);
				stmt.setInt(1, id);


				int count = stmt.executeUpdate();
				System.out.println(count +	" Rows deleted");

			} catch (Exception e) {
				e.printStackTrace();

			}finally {

				if(stmt!=null) {
					try {
						stmt.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				if(conn!=null) {
					try {
						conn.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}




		}
	}