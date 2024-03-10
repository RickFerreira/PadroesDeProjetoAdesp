package br.edu.ifpb.esperanca.pdp.adesp.database;

import java.sql.*;

// review
public class DBConnection {
    static final String DB_URL = "jdbc:mysql://localhost:3306/adesp";
    static final String DB_USERNAME = "example"; // to test
    static final String DB_PASSWORD = "example"; // to test
    static final String warning = "running"; // warning to dev
    static Connection connection = null;

    public static Connection getConnection() {

       try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println(warning); // to test
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    public static void main(String[] args) { // to test
        getConnection();
    }
}
