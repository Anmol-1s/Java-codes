import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class insertBatchUsingStatement {

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
            Statement statement= connection.createStatement();
            Scanner sc=new Scanner(System.in);

            while(true) {
                System.out.print("Enter the Id- ");
                int id=sc.nextInt();
                System.out.print("Enter the Name- ");
                String name=sc.next();
                System.out.print("Enter the Age- ");
                int age=sc.nextInt();
                System.out.print("Enter the Marks- ");
                double marks=sc.nextDouble();
                System.out.print("Enter the Choice (Y/N) - ");
                String choice =sc.next();

                String query=String.format("INSERT INTO workers (id,name,age,marks) VALUES(%d,'%s',%d,%.2f)",
                                                                                        id,name,age,marks);
                statement.addBatch(query);
                if(choice.toUpperCase().equals("N")) {
                    break;
                }
            }

            int arr[]=statement.executeBatch();

            //if any query not executed then show those query
            for(int i=0; i<arr.length; i++) {
                if(arr[i]==0) {
                    System.out.println("Query- "+ i+ "Not executed");
                }
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
