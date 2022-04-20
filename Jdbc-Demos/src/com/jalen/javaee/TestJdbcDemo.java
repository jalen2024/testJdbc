package com.jalen.javaee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestJdbcDemo {


    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");

        String url = "jdbc:mysql://127.0.0.1:3306/db1?&useSSL=false";
//        String url = "jdbc:mysql://127.0.0.1:3306/db1";
        String userName = "root";
        String password = "12345678";
        Connection connection = DriverManager.getConnection(url, userName, password);

//        String sql = "select * from person";
        String sql = "update person set age = 88 where id = 1";

        Statement statement = connection.createStatement();
        int execute = statement.executeUpdate(sql);
        System.out.println("操作结果："+execute);
    }
}
