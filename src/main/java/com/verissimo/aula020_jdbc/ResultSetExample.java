package com.verissimo.aula020_jdbc;

import java.sql.*;

public class ResultSetExample {

    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection(DbUtil.DB_URL, DbUtil.DB_USER, DbUtil.DB_PWD); //
             Statement stmt = con.createStatement(); //
             ResultSet rs = stmt.executeQuery("SELECT * FROM locestado limit 0,5")) {

            while (rs.next()) {
                System.out.println(rs.getLong("cod") + " - " + rs.getString("nome"));
            }

            //1 - Acre
            //2 - Alagoas
            //3 - Amazonas
            //4 - Amapá
            //5 - Bahia

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
