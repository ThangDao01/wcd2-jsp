package com.example.demo3.until;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

    private static Connection connection;
    public static synchronized Connection getConnection(){
        String url  = "jdbc:mysql://localhost:3306/assignment";
        String user = "root";
        String password = "";
        if (connection==null){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection(url,user,password);
            } catch (SQLException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        return connection;

    }

    public static void closeConnection(){
        try {
            connection.close();
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }finally {
            connection= null;
        }
    }


}
