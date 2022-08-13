package access_database;
import java.sql.*;

public class Access_database {
    public static void main(String[] args) {
        try {
            String user_name = "root";
            String password = "abc12345";
            String url = "jdbc:mysql://localhost:3306/practice";
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection(url, user_name, password);
            
            if (connect != null) { // connection successful
                Statement stmt = connect.createStatement();
                ResultSet res = stmt.executeQuery("Select * from sample_1");
                while (res.next())   {
                    System.out.println("User Id" + res.getString(1) + 
                              "User Name" + res.getString(2));
                    }
                connect.close();
                }
            
            else {
                System.out.println("Connection is not Successful");
            }
        }
        
                catch (Exception e) {
            System.out.println(e);
        }    
    } 
}
