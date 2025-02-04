import java.sql.*;
import java.util.Scanner;

public class transaction {

    private static final String url="jdbc:mysql://localhost:3306/transaction";
    private static final String username="root";
    private static final String password="Anmol@1234";

    public static void main (String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            connection.setAutoCommit(false);
            String debit_query = String.format("UPDATE accounts SET balance = balance - ? WHERE account_number = ?");
            String credit_query = String.format("Update accounts SET balance = balance + ? WHERE account_number = ?");

            PreparedStatement debitPreparedStatement = connection.prepareStatement(debit_query);
            PreparedStatement creditPreparedStatement = connection.prepareStatement(credit_query);

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the account number to debit amount -");
            int account_number = sc.nextInt();
            System.out.print("Enter the amount- ");
            double amount = sc.nextDouble();

            debitPreparedStatement.setDouble(1, amount);
            debitPreparedStatement.setInt(2, account_number);

            creditPreparedStatement.setDouble(1, amount);
            creditPreparedStatement.setInt(2, 102);

            debitPreparedStatement.executeUpdate();
            creditPreparedStatement.executeUpdate();

            if(isSufficient(connection,account_number,amount)) {
                connection.commit();
                System.out.print("Transaction Successfull");
            } else {
                connection.rollback();
                System.out.print("Insufficient balance");
            }
            debitPreparedStatement.close();
            creditPreparedStatement.close();
            sc.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
        static boolean isSufficient(Connection connection, int account_number, double amount ) {

            try {
                String query = "SELECT balance FROM accounts WHERE account_number= ?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);

                preparedStatement.setInt(1,account_number);
                ResultSet resultSet = preparedStatement.executeQuery();

                if(resultSet.next()) {
                    double current_balance = resultSet.getDouble("balance");
                    if(amount > current_balance) {
                        return false;
                    } else {
                        return true;
                    }
                }
                resultSet.close();
            } catch(SQLException e) {
                System.out.println(e.getMessage());
            }
            return false;
    }
}
