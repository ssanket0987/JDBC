package com.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBUtil {

    static Connection con = null;

    public static Connection getConnect() throws SQLException {
       
            try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sample", "root", "Sanket@1");
	            System.out.println("Connection established");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            
			return con;
       
       
    }
}
