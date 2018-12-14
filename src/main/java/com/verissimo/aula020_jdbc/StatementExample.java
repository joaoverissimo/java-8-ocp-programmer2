package com.verissimo.aula020_jdbc;

import java.sql.*;

public class StatementExample {

    public static void main(String[] args) {

        try (Connection con = DriverManager.getConnection(DbUtil.DB_URL, DbUtil.DB_USER, DbUtil.DB_PWD); //
             Statement stmt = con.createStatement()) {

            boolean hasResults = stmt.execute("SELECT * FROM locestado");
            if (hasResults) {
                // To retrieve the object with the results
                ResultSet rs = stmt.getResultSet();
            } else {
                // To get the number of affected rows
                int affectedRows = stmt.getUpdateCount();
            }

            ResultSet rs = stmt.executeQuery("SELECT * FROM locestado");

            stmt.executeUpdate("INSERT INTO locestado (cod, nome, uf) VALUES ('30', 'test city', 'TE');"); // Returns 1
            stmt.executeUpdate("UPDATE locestado SET nome='test alter' WHERE cod = 30"); // Returns 1
            stmt.executeUpdate("DELETE FROM locestado WHERE cod = 30"); // Returns 1

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
