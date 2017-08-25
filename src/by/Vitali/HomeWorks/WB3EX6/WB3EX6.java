package by.Vitali.HomeWorks.WB3EX6;

import java.sql.*;

/**
 * WB3EX6
 */
public class WB3EX6 {
    public static void main(String[] args) {
        final String dbURL = "jdbc:mysql://localhost:3306/WB32";
        final String userName = "root";
        final String password = "1234";

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (Connection connection = DriverManager.getConnection(dbURL, userName, password)) {
            Statement statement = connection.createStatement();
            System.out.println("The amount of recipients and amount of payments on each of them.");
            String query = "SELECT name, SUM(value) AS 'ALL SUM' FROM receivers, expenses WHERE receiver=receivers.num GROUP BY name ORDER by receiver;";
            ResultSet result = statement.executeQuery(query);
            while (result.next()) {
                System.out.println(result.getString(1) + " - " + result.getString(2));

            }
            System.out.println();
            System.out.println("The amount of payments for the day when there was the greatest payment.");
            query = "SELECT paydate, SUM(value)  AS 'MAX SUM VALUE' FROM expenses WHERE paydate =(SELECT paydate FROM expenses WHERE value=(SELECT MAX(value) FROM expenses));";
            result = statement.executeQuery(query);
            while (result.next()) {
                System.out.println(result.getString(1) + " - " + result.getString(2));

            }
            System.out.println();

            System.out.println("The largest payment for the day when the payment amount was the largest.");
            query = "SELECT MAX(value) FROM expenses WHERE paydate = (SELECT paydate FROM expenses GROUP BY paydate ORDER BY sum(value) DESC LIMIT 1);";
            result = statement.executeQuery(query);
            while (result.next()) {
                System.out.println(result.getString(1));

            }
            System.out.println();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}