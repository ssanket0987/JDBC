package com.Callable_statement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		 Scanner sc = new Scanner(System.in);

	        Class.forName("com.mysql.cj.jdbc.Driver");

	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sample", "root", "Sanket@1");

	        CallableStatement cs = con.prepareCall("{call update_data(?,?)}");

	        
	        cs.setInt(1, 10);
	        cs.registerOutParameter(2,String);

	        cs.execute();
	        System.out.println("NAME: " + cs.getInt(2));
	        cs.close();
	        sc.close();

	}

}
