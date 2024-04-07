package com.jdbcSqlConn;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJdbcDemo2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		 Class.forName("com.mysql.cj.jdbc.Driver");

	        
	     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sample", "root", "Sanket@1");
	     Statement st = con.createStatement();
	     Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter id");
		 int ID=sc.nextInt();
		 
		 System.out.println("Eneter Username:");
		 String Username= sc.next();
		 
		 System.out.println("Enter Password");
		 int Password=sc.nextInt();
		 
		 String insertQuery="insert into User values("+ID+" '"+Username+"' "+Password+")";
		
       

       
        
		

	}

}
