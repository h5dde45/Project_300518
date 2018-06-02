package com.jc.p1.t20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

public class Starter {

    public static final String SQL = "INSERT INTO check_date (first,second,third) VALUES (?,?,?)";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Starter starter = new Starter();
        starter.writeDate(new Date());

    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/different_time",
                "root", "root");
    }

    public void writeDate(Date date) throws SQLException {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL)) {
            preparedStatement.setDate(1, new java.sql.Date(date.getTime()));
            preparedStatement.setTime(2, new java.sql.Time(date.getTime()));
            preparedStatement.setTimestamp(3, new java.sql.Timestamp(date.getTime()));
            preparedStatement.executeUpdate();
        }
    }
}
