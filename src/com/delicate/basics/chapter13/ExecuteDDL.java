package com.delicate.basics.chapter13;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class ExecuteDDL {
    private String driver;
    private String url;
    private String user;
    private String password;

    public void initParam(String paramFilename) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream(paramFilename));
        driver = properties.getProperty("driver");
        url = properties.getProperty("url");
        user = properties.getProperty("user");
        password = properties.getProperty("password");
    }

    public void createTable(String sql) throws ClassNotFoundException, SQLException {
        Class.forName(driver);
        try (
                Connection conn = DriverManager.getConnection(url, user, password);
                Statement stmt = conn.createStatement()
        ) {
            stmt.executeQuery(sql);
        }
    }

    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
        ExecuteDDL ed = new ExecuteDDL();
        ed.initParam("src/mysql.properties");
        ed.createTable("select * from heros");
    }
}
