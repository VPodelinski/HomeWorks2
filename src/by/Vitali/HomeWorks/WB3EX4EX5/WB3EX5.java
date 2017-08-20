package by.Vitali.HomeWorks.WB3EX4EX5;

import java.sql.*;

/**
 *WB3EX5
 */
public class WB3EX5 {
    public static void main(final String... args) {
        if (args.length < 4) {
            throw new IllegalArgumentException("Should be 4 arguments");
        }
        final String dbURL = "jdbc:mysql://localhost:3306/WB32";
        final String userName = "root";
        final String password = "1234";

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();  // + "?user=root&password=1234&useSSL=false"
        }
        try (Connection connection = DriverManager.getConnection(dbURL, userName, password)) {
            String query = "INSERT INTO expenses VALUES (?, ?, ?, ?);";
            PreparedStatement pStatement = connection.prepareStatement(query);
            pStatement.setInt(1, Integer.valueOf(args[0]));
            pStatement.setDate(2, Date.valueOf(args[1]));
            pStatement.setInt(3, Integer.valueOf(args[2]));
            pStatement.setInt(4, Integer.valueOf(args[3]));
            pStatement.executeUpdate();
            Statement statement = connection.createStatement();
            query = "SELECT * FROM expenses INNER JOIN receivers ON expenses.receiver = receivers.num ORDER BY expenses.num;";
            ResultSet result = statement.executeQuery(query);
            while (result.next()) {
                System.out.println(result.getInt("expenses.num") + " " + result.getDate("expenses.paydate")
                        + " " + result.getString("receivers.name") + " " + result.getInt("value"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
