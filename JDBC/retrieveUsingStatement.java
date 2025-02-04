import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
                                  // through this code we can print sql table
public class retrieveUsingStatement {

    private static final String url = "jdbc:mysql://localhost:3306/wipro";
    private static final String username = "root";
    private static final String password = "Anmol@1234";

    public static void main(String[] args) {
        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found: " + e.getMessage());
            return;
        }

        try {
             Connection connection = DriverManager.getConnection(url, username, password);
             Statement statement = connection.createStatement();

            // SQL query to fetch data from the "volunteers" table
            String query = "SELECT * FROM volunteers";
            ResultSet resultSet = statement.executeQuery(query);

            // Process the result set
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                double marks = resultSet.getDouble("marks");

                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Marks: " + marks);
            }

        } catch (SQLException e) {
            System.out.println("SQL error: " + e.getMessage());
        }
    }
}
