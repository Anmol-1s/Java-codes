import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
                               // data inserted into table thorugh java application
                              // through this code we can insert data in table workers
public class insertUpdateDeleteUsingStatement{

    private static final String url="jdbc:mysql://localhost:3306/jpMorgan";
    private static final String username="root";
    private static final String password="Anmol@1234";

    public static void main(String[] args){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            Connection connection= DriverManager.getConnection(url,username,password);
            Statement statement=connection.createStatement();

            String query=String.format("INSERT INTO workers (id,name,age,marks) VALUES (1,'Rahul',21,69.45)");

//update    String query=String.format("UPDATE workers SET marks=%2f WHERE id=%d",89.45,1);

//            String query=String.format("DELETE FROM workers WHERE id=%d" , 1);

            int rowsAffected=statement.executeUpdate(query);          //query compiled here
            if(rowsAffected>0) {
                System.out.println("Data Deleted Successfully");
            } else {
                System.out.println("Data Not Deleted");
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
