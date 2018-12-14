package com.verissimo.aula020_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcExampleCon {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //from docker-compose on root level
        String url = "jdbc:mysql://179.21.128.2:3306/cidades";
        String user = "root";
        String pwd = "12345";

        // Class.forName("com.mysql.jdbc.Driver");
        // does not necessary, after  JDBC 4.0
        Connection con = DriverManager.getConnection(url, user, pwd);

        // using Properties
        Properties props = new Properties();
        props.put("user", "root");
        props.put("password", "12345");
        props.put("useUnicode", "yes");
        props.put("characterEncoding", "UTF-8");
        Connection con2 = DriverManager.getConnection(url, props);

        // inner try-witch-resources
        try (Connection con3 = DriverManager.getConnection(url, user, pwd)) {
            //do somting...
        }
    }

}
