package java_database.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class basic_table_creation {
    public static void main(String[] args) {
        try {
         Class.forName("org.sqlite.JDBC");   // Using Driver
         Connection con = DriverManager.getConnection();
    }catch(Exception e) {}
    
    }   
}
