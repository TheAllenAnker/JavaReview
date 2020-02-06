package com.delicate.basics.chapter13;

import com.mysql.cj.protocol.Resultset;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class CachedRowSetTest {
    private static String driver;
    private static String url;
    private static String user;
    private static String password;

    public void initParam(String paramFilename) throws IOException {
        Properties props = new Properties();
        props.load(new FileInputStream(paramFilename));
        driver = props.getProperty("driver");
        url = props.getProperty("url");
        user = props.getProperty("user");
        password = props.getProperty("password");
    }

    public CachedRowSet query(String sql) throws ClassNotFoundException, SQLException {
        Class.forName(driver);
        Connection conn = DriverManager.getConnection(url, user, password);
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        RowSetFactory rowSetFactory = RowSetProvider.newFactory();
        CachedRowSet cachedRowSet = rowSetFactory.createCachedRowSet();
        cachedRowSet.populate(rs);
        rs.close();
        ps.close();
        conn.close();
        return cachedRowSet;
    }

    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
        CachedRowSetTest ct = new CachedRowSetTest();
        ct.initParam("src/mysql.properties");
        CachedRowSet cachedRS = ct.query("select * from heros");
        cachedRS.afterLast();
        while (cachedRS.previous()) {
            System.out.println(cachedRS.getString(1)
                    + "\t" + cachedRS.getString(2)
                    + "\t" + cachedRS.getString(3));
            if (cachedRS.getInt("id") == 3) {
                // update it
                System.out.println("Updating a row");
            }
        }

        Connection conn = DriverManager.getConnection(url, user, password);
        conn.setAutoCommit(false);
        cachedRS.acceptChanges(conn);
    }
}
