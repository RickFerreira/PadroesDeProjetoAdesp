package br.edu.ifpb.esperanca.pdp.adesp.database;

import javax.swing.*;
import java.sql.*;

public class TestDB {
    public static void main(String[] args)
    {
        try
            (
                // create a database connection
                Connection connection = DBConnection.getInstance().getConnection();
                Statement statement = connection.createStatement();
            )
        {
            statement.setQueryTimeout(30);  // set timeout to 30 sec.

            statement.executeUpdate("DROP TABLE IF EXISTS discipline;");

            statement.executeUpdate("CREATE TABLE IF NOT EXISTS discipline(\n" +
                    "                id_discipline INT AUTO_INCREMENT PRIMARY KEY,\n" +
                    "                name VARCHAR(255) NOT NULL,\n" +
                    "                course VARCHAR(255) NOT NULL,\n" +
                    "                period INT NOT NULL\n" +
                    "            );");

            statement.executeUpdate("INSERT INTO discipline (name, course, period) VALUES\n" +
                    "('Matemática Aplicada à Computação', 'ADS', 1),\n" +
                    "('Inglês Instrumental 1', 'ADS', 1),\n" +
                    "('Práticas de Leitura e Produção de Textos 1', 'ADS', 1),\n" +
                    "('Algoritmos e Lógica de Programação', 'ADS', 1),\n" +
                    "('Introdução à Computação', 'ADS', 1);");


            ResultSet result = statement.executeQuery("SELECT * FROM discipline;");

            JOptionPane.showMessageDialog(null, "all fine");

            while(result.next())
            {
                // read the result set
                System.out.println("id_discipline = " + result.getString("name"));
                System.out.println("name = " + result.getString("name"));
                System.out.println("course = " + result.getString("course"));
                System.out.println("period = " + result.getInt("period"));
            }
        }
        catch(SQLException e)
        {
            // if the error message is "out of memory",
            // it probably means no database file is found
            e.printStackTrace(System.err);
        }
    }
}
