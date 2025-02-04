import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class deleteUsingPreparedStatement {

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
            String query=String.format("DELETE FROM workers WHERE id=?");

            PreparedStatement preparedStatement=connection.prepareStatement(query);
            preparedStatement.setInt(1,1);

            int rowAffected=preparedStatement.executeUpdate();
            if(rowAffected>0) {
                System.out.println("Data Deleted Successfully");
            } else {
                System.out.println("Data Not Deleted");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
