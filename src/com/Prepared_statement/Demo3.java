package com.Prepared_statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo3 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner sc = new Scanner(System.in);

        
        Class.forName("com.mysql.cj.jdbc.Driver");

        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sample", "root", "Sanket@1");

       
        String query = "SELECT * FROM Employees WHERE Salary <= ? ORDER BY Salary ASC";

        
        PreparedStatement pst = con.prepareStatement(query);

       
        System.out.println("Enter the salary condition:");
        int sal = sc.nextInt();

        
        pst.setInt(1, sal);

        
        ResultSet rs = pst.executeQuery();

        
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
        }

        
        rs.close();
        pst.close();
        con.close();
        sc.close();
    }
}

