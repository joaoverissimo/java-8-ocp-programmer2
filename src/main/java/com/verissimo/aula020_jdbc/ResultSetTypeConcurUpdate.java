package com.verissimo.aula020_jdbc;

import java.sql.*;

public class ResultSetTypeConcurUpdate {

    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection(DbUtil.DB_URL, DbUtil.DB_USER, DbUtil.DB_PWD); //
             Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE); //
             ResultSet rs = stmt.executeQuery("SELECT cod, nome, uf FROM locestado limit 20,1")) {

            rs.next();
            rs.updateString("nome", "RoNdôNiA"); //Rondônia -> RoNdôNiA
            rs.updateRow();

            System.out.println(rs.getString("nome"));

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
