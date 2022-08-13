package jdbc_concept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class basic_2_derbydatabase {
    public static void main(String[] args) {
        String connection_url = "Contact DB";
        try {
        Connection connect = DriverManager.getConnection(connection_url,"abc","123");
        //if (connect) {        }       System.out.println("connection is successfful");
        Statement stm   = connect.createStatement();    // establising the connection with the statement 
        
        // table creation
        stm.execute("CREATE TABLE IF NOT EXISTS table_1" +
                "(player_name text , game text , schedule datetime , payment_mode text )");
        
        // inserting the records into the table
        stm.execute("INSERT INTO table_1 VALUES('Prashanth' , 'cricket' ,    '2020-10-25 9:10:44' , 'card')");
        stm.execute("INSERT INTO table_1 VALUES('Saravanan' , 'base-ball' , '2020-10-25 10:10:44' , 'cash')");
        stm.execute("INSERT INTO table_1 VALUES('Kishore' , 'cricket' ,         '2020-10-25 11:10:44' , 'demand draft')");
        stm.execute("INSERT INTO table_1 VALUES('Mothish' , 'athletics' ,      '2020-10-25 14:10:44' , 'cash')");
        stm.execute("INSERT INTO table_1 VALUES('Sabari' , 'foot-ball' ,        '2020-10-25 15:10:44' , 'cheque')");
        
        connect.setAutoCommit(true);
        stm.close();
        connect.close();
        
            } catch(Exception e) {
                    System.out.println("Some-thing went wrong " + e.getMessage());
                 }
        }
}
