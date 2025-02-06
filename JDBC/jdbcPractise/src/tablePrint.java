import com.mysql.cj.xdevapi.Table;

import javax.print.DocFlavor;
import java.sql.*;


public class tablePrint {

    private static final String url = "jdbc:mysql://localhost:3306/intellij";
    private static final String username = "root";
    private static final String password = "Anmol@1234";

    public static void main(String [] args) {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try{
            Connection connection = DriverManager.getConnection(url,username,password);

            String query = "select * from editor";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            tableHeader.print(10,"id",10,"name",10,"age",10,"salary");
            while(resultSet.next()) {

                Integer id = resultSet.getInt("ID");
                String name= resultSet.getString("Name");
                Integer age = resultSet.getInt("Age");
                Float salary = resultSet.getFloat("Salary");

                table1.print(10,id,10,name,10,age,10,salary);
            }
            tableLiner.print(10,10,10,10);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

