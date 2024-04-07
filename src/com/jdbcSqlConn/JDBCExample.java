package com.jdbcSqlConn;
import java.sql.*;

public class JDBCExample {

    public static void main(String[] args) throws Exception {

        // Register JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Open a connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sample", "root", "Sanket@1");

        // Create a statement
        Statement st = con.createStatement();

        // Execute a query
        ResultSet rs = st.executeQuery("SELECT * FROM Student WHERE `Roll no` = 1");

        // Process the result set
        if (rs.next()) {
            int rollNo = rs.getInt("Roll no");
            String name = rs.getString("Name");
            String city = rs.getString("City");

            // Display data
            System.out.println("Roll No: " + rollNo + ", Name: " + name + ", City: " + city);
        }

        // Close resources
        rs.close();
        st.close();
        con.close();
    }
}

