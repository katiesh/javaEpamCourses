package com.epam.task61.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectionDB {

    public Connection getConn() throws SQLException{
        ResourceBundle resource = ResourceBundle.getBundle("property.database");
        String url = resource.getString("url");
        String user = resource.getString("user");
        String pass = resource.getString("password");
        return DriverManager.getConnection(url, user, pass);
    }
}
