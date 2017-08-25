package by.Vitali.HomeWorks.WB3EX4EX5.SQLquery.WB3EX7;

import by.Vitali.HomeWorks.WB3EX4EX5.SQLquery.WB3EX7.Beans.Expense;
import by.Vitali.HomeWorks.WB3EX4EX5.SQLquery.WB3EX7.Beans.Receiver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Виталий on 22.08.2017.
 */
public class DAOClass implements DAO {

    private String user = "root";
    private String password = "1234";
    private String url = "jdbc:mysql://localhost:3306/WB32";
    private String driver = "com.mysql.jdbc.Driver";


    private static DAOClass singleton;

    public static  DAOClass getDAOClass(){
        if(singleton == null) {
            singleton = new DAOClass();
        }
        return singleton;
    }


    private DAOClass() {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }


    @Override
    public Receiver getReceiver(final int num) {
        Receiver receiver = null;
        try (Connection connection = getConnection()) {
            String query = "SELECT * FROM receivers WHERE num = ?;";
            PreparedStatement pStatement = connection.prepareStatement(query);
            pStatement.setInt(1, num);
            ResultSet resultSet = pStatement.executeQuery();
            if (resultSet.next()) {
                receiver = new Receiver();
                receiver.setNum(resultSet.getInt("num"));
                receiver.setName(resultSet.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return receiver;

    }

    @Override
    public List<Receiver> getReceivers() {
        List<Receiver> receivers = new ArrayList<>();
        try (Connection connection = getConnection()) {
            String query = "SELECT * FROM receivers;";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                receivers.add(new Receiver(resultSet.getInt("num"), resultSet.getString("name")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return receivers;
    }

    @Override
    public Expense getExpense(final int num) {
        Expense expense = null;
        try (Connection connection = getConnection()) {
            String query = "SELECT * FROM expenses WHERE num = ?;";
            PreparedStatement pStatement = connection.prepareStatement(query);
            pStatement.setInt(1, num);
            ResultSet resultSet = pStatement.executeQuery();
            if (resultSet.next()) {
                expense = new Expense();
                expense.setNum(resultSet.getInt("num"));
                expense.setPaydate(resultSet.getString("paydate"));
                expense.setReceiver(resultSet.getInt("receiver"));
                expense.setValue(resultSet.getInt("value"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return expense;
    }

    @Override
    public List<Expense> getExpenses() {
        List<Expense> expenses = new ArrayList<>();
        try (Connection connection = getConnection()) {
            String query = "SELECT * FROM expenses;";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                expenses.add(new Expense(resultSet.getInt("num"), resultSet.getString("paydate"),
                        resultSet.getInt("receiver"), resultSet.getInt("value")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return expenses;
    }

    @Override
    public int addReceiver(Receiver receiver) {
        int result = 0;
        try (Connection connection = getConnection()) {
            String query = "INSERT INTO receivers VALUES (?, ?);";
            PreparedStatement pStatement = connection.prepareStatement(query);
            pStatement.setInt(1, receiver.getNum());
            pStatement.setString(2, receiver.getName());
            result = pStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int addExpense(Expense expense) {
        int result = 0;
        try (Connection connection = getConnection()) {
            String query = "INSERT INTO expenses VALUES (?, ?, ?, ?);";
            PreparedStatement pStatement = connection.prepareStatement(query);
            pStatement.setInt(1, expense.getNum());
            pStatement.setString(2, expense.getPayDate());
            pStatement.setInt(3, expense.getReceiver());
            pStatement.setInt(4, expense.getValue());
            result = pStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}