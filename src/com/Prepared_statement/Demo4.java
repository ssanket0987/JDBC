package com.Prepared_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo4 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner sc = new Scanner(System.in);

        Class.forName("com.mysql.cj.jdbc.Driver");

        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sample", "root", "Sanket@1");

        
        String query = "SELECT * FROM Employee WHERE Salary <= ? ORDER BY Salary ASC";

        
        PreparedStatement pst = con.prepareStatement(query);

        
        System.out.println("Enter the salary condition:");
        int sal = sc.nextInt();

        
        pst.setInt(1, sal);

        
        ResultSet rs = pst.executeQuery();

       
        while (rs.next()) {
            int employeeID = rs.getInt(1);
            String employeeName = rs.getString(2);
            int currentSalary = rs.getInt(3);

            
            int newSalary = (currentSalary > 50000) ? (int) (currentSalary * 1.5) : (int) (currentSalary * 1.2);

            System.out.println(employeeID + " " + employeeName + " " + currentSalary + " " + newSalary);
        
        sc.close();        }

      
    }
}
