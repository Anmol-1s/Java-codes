import java.sql.*;

public class retrieveUsingPreparedStatement {

    private static final String url="jdbc:mysql://localhost:3306/jpMorgan";
    private static final String username="root";
    private static final String password="Anmol@1234";

    public static void main(String []args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            Connection connection= DriverManager.getConnection(url,username,password);
            String query=String.format("SELECT marks FROM workers WHERE marks=?");

            PreparedStatement preparedStatement= connection.prepareStatement(query);
            preparedStatement.setDouble(1,98.34);

            ResultSet resultSet=preparedStatement.executeQuery();
            if(resultSet.next()) {                                //using if instead of while beacuse of one entry
               double marks=resultSet.getDouble("marks");
                System.out.println("Marks- "+marks);
            } else {
                System.out.println("Data Not retrived");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
