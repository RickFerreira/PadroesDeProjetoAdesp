package br.edu.ifpb.esperanca.pdp.adesp.database;

import java.sql.*;

public class DBConnection {
    static final String DB_URL = "jdbc:mysql://localhost:3306/adesp";
    static final String DB_USERNAME = "example";
    static final String DB_PASSWORD = "example";
    static final String warning = "running"; // warning to dev

    public static Connection getConnection() {

       try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println(warning);
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
