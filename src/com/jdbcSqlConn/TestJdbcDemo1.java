package com.jdbcSqlConn;

import java.sql.DriverManager;

public class TestJdbcDemo1 {

	public static void main(String[] args) {
		
		//load my driver register driver
		//MySql :con.myswl.cj.jdbc.Driver
		//Class static formname (Strin str)throws ClassNotFoundException
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loaded");
			
	
		}
		Connection con= DriverManager.
				getConnection("jdbc:mysql://localhost:3306/Sample\", \"root\", \"Sanket@1");
		//I want to creat one table in database
		String createTableQuery
		="creat table UserTAble ()userId int primary key ,userName varchar(50),userPassword"

	}

}
