import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class updateUsingPreparedStatament {

    private static final String url = "jdbc:mysql://localhost:3306/jpMorgan";
    private static final String username = "root";
    private static final String password = "Anmol@1234";

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            Connection connection= DriverManager.getConnection(url,username,password);
            String query=String.format("UPDATE workers SET age=? WHERE id=?" );

            PreparedStatement preparedStatement =connection.prepareStatement(query);
            preparedStatement.setInt(1,22);
            preparedStatement.setInt(2,1);

            int rowAffected=preparedStatement.executeUpdate();
            if(rowAffected>0) {
                System.out.println("Data updated Successfully");
            } else {
                System.out.println("Data Not updated");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
