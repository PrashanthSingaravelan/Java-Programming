import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class event_table {
    public static void main(String[] args) {
             String connection = "jdbc:derby://localhost:1527/workshop_event";
             try {
                 Connection connect = DriverManager.getConnection(connection, "abc", "123");
                 Statement stm = connect.createStatement();
                 ResultSet rs = null;
                 
                 String query = "SELECT * FROM COLLEGE_EVENTS";
                 rs = stm.executeQuery(query);
                 
                 while(rs.next()) {
                        System.out.println( 
                             "  " +  rs.getInt("student_id") + 
                             "  " +  rs.getString("student_name") + 
                             "  " +  rs.getString("game") +
                             "  " +  rs.getTimestamp("schedule") +
                             "  " +  rs.getString("payment_mode") + 
                             "  " +  rs.getString("state")
                              );  }
                  rs.close();
                  stm.close();
                  connect.close();
                 
             }  catch (Exception e) { System.out.println("Some-thing went wrong");}
    }
}
