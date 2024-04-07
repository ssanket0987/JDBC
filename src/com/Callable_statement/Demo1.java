package com.Callable_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.CallableStatement;




public class Demo1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner sc = new Scanner(System.in);

        Class.forName("com.mysql.cj.jdbc.Driver");

        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sample", "root", "Sanket@1");
        
        CallableStatement cs=con.prepareCall("{call insert_Data(?,?,?)}");
        
        cs.setInt(1,10);
        cs.setString(2, "Yash");
        cs.setInt(3, 40000);
        cs.execute();
        cs.close();
        sc.close();
        
        
    }
}
