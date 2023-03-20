package com.example.superheltev5.repositories;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBManager {
    private static Connection con = null;

    public static Connection getConnection() {
        if (con != null) return con;
        String user = null, password = null, url = null;
        url = "jdbc:sqlserver://tyss.database.windows.net;databaseName=superheroes";
        user = System.getenv("USERNAME");
        password = System.getenv("PASSWORD");
        try{
            con = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
}
