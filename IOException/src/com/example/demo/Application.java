package com.example.demo;
import java.sql.*;
public class Application {

	public static void main(String[] args) {

		Connection con;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection
					("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
			System.out.println(con);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
