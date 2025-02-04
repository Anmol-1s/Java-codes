import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class insertBatchUsingPreparedStatement {

    private static final String url = "jdbc:mysql://localhost:3306/cognizent";
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
            String query=String.format("INSERT INTO employeelist (id,name,age,marks) VALUES (?,?,?,?)");
            PreparedStatement preparedStatement=connection.prepareStatement(query);

            Scanner sc=new Scanner(System.in);
            while(true) {
                System.out.print("Enter the id- ");
                int id=sc.nextInt();
                System.out.print("Enter the name- ");
                String name=sc.next();
                System.out.print("Enter the age- ");
                int age=sc.nextInt();
                System.out.print("Enter the marks- ");
                double marks=sc.nextDouble();
                System.out.print("Enter the Choice Y/N- ");
                String choice=sc.next();

                preparedStatement.setInt(1,id);
                preparedStatement.setString(2,name);
                preparedStatement.setInt(3,age);
                preparedStatement.setDouble(4,marks);

                preparedStatement.addBatch();
                if(choice.toUpperCase().equals("N")) {
                    break;
                }
            }
            int arr[]=preparedStatement.executeBatch();
            for(int i=0; i<arr.length; i++) {
                if(arr[i]==0) {
                    System.out.println("Query- "+ i +"Not executed" );
                }
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
