package data_base_operations;

import java.sql.Connection;
import java.sql.DriverManager;


public class program_1 {
    public static void main(String[] args) {
        try {
        String url = "jdbc:mysql://localhost:3306/java_db";
        String user_name = "root";
        String password  = "abc123";
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connect = DriverManager.getConnection(url, user_name, password);
        
        if (connect != null) {
            Sting create_query = "create table "
        }
        
        }
        
        catch(Exception e) { System.out.println(e); }
        
        
                
    }
}
