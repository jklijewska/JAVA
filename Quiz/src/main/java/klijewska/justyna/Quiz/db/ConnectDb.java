package klijewska.justyna.Quiz.db;

import java.sql.*;

public class ConnectDb {
    private static final String USER_NAME="root";
    private static final String USER_PASSWRORD="1234";
    private static final String URL="jdbc:mysql://localhost:3306/quiz";

    private static Connection connection=null;
    ResultSet resultSet = null;

    private static void dbConnection(){
        try {
            connection = DriverManager.getConnection(URL, USER_NAME, USER_PASSWRORD);
            Statement statement = connection.createStatement();
        }
        catch(SQLException e){
            System.out.println("Error: Connection to database");
            e.printStackTrace();
        }
    }

    public ResultSet dbSelect(String sql){
        dbConnection();
        try{
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
        }
        catch(SQLException e){
            System.out.println("Error: Problem with select");
            e.printStackTrace();
        }
        return resultSet;
    }
    public void dbInsert(String sql){
        dbConnection();
        try{
            Statement statement=connection.createStatement();
            resultSet=statement.executeQuery(sql);
        }
        catch(SQLException e){
            System.out.println("Error: Problem with insert");
            e.printStackTrace();
        }
    }


}
