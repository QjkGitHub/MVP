package com.qf.dao.util;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtilD1 {
    private static ComboPooledDataSource dataSource = new ComboPooledDataSource("test_c3p0");
    public static Connection getConnection(){
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return conn;
    }

    public static void closeRe(ResultSet rs, Statement st,Connection conn){

            try {
                if(rs != null)
                rs.close();
                if(st != null)
                    st.close();
                if(conn != null)
                    conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }


    }
}
