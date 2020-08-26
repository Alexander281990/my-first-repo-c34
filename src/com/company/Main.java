package com.company;

import java.sql.*;

public class Main {

    Connection connection;
    {
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "281190AAA_riddick");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    public void getById(long id) {
        try{
            PreparedStatement preparedStatement = connection.prepareStatement("select * from table where id = ?");
            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            long user_id = resultSet.getLong(1);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void main(String[] args) {

    }
}
