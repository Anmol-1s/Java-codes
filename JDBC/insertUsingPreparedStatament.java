import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;               // insert data using preparedStatement

public class insertUsingPreparedStatament {

    private static final String url="jdbc:mysql://localhost:3306/jpMorgan";
    private static final String username="root";
    private static final String password="Anmol@1234";

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            Connection connection= DriverManager.getConnection(url,username,password);
            String query=String.format("INSERT INTO workers(id,name,age,marks) VALUES (?,?,?,?)");
            PreparedStatement preparedStatement=connection.prepareStatement(query);   //query compiled

            preparedStatement.setInt(1,1);
            preparedStatement.setString(2,"Anmol");
            preparedStatement.setInt(3,21);
            preparedStatement.setDouble(4,98.34);

            int rowsAffected=preparedStatement.executeUpdate();
            if(rowsAffected>0) {
                System.out.println("Data Inserted Successfully");
            } else {
                System.out.println("Data Not Inserted");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
