package br.edu.ifpb.esperanca.pdp.adesp.database;

import java.sql.*;

// review
public class DBConnection {
    private Connection connection = null;
    private static DBConnection instance = null;

    public static DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }

    private DBConnection() {
        try {
            //conecta com o arquivo adesp ou cria o arquivo adesp
            connection = DriverManager.getConnection("jdbc:sqlite:adesp.db");

//            connection = DriverManager.getConnection("jdbc:sqlite::resource" + TestDB.class.getResource("/resource/adesp.db"));
        } catch(SQLException ex) {
            System.out.println("Ocorreu um erro ao conectar com o banco!");
//            ex.printStackTrace();
        }
    }

    public Connection getConnection() {
        return this.connection;
    }

    public void closeConnection() {
        try {
            connection.close();
        } catch(SQLException ex) {
            System.out.println("Houve um erro ao fechar a conexão com o banco!");
//            ex.printStackTrace();
        }
    }
}
