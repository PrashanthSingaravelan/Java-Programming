import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class prog_4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String str1 = request.getParameter("field");
        String connection = "jdbc:derby://localhost:1527/workshop_event";
             try {
                 Connection connect = DriverManager.getConnection(connection, "abc", "123");
                 Statement stm = connect.createStatement();
                 ResultSet rs = null;
                 
                 String query = "SELECT * FROM COLLEGE_EVENTS WHERE STATE = '" + str1 + "'";
                 
                 try { rs = stm.executeQuery(query); } 
                 catch (SQLException ex) {   Logger.getLogger(prog_4.class.getName()).log(Level.SEVERE, null, ex);  }
                 
                  try (PrintWriter out = response.getWriter()) {
                  int temp=0;
                            out.println("<!DOCTYPE html>");
                            out.println("<html>");
                            out.println("<head>");
                            
                            out.println("<title>Program-4</title>");            
                            out.println("</head>");
                            
                            out.println("<body>");
                                        while(rs.next()) { temp+=1; }
                            out.println("Number of Participants from " + str1 + " : " + temp);
                            out.println("</body>");
                            out.println("</html>");
            
                  rs.close();
                  stm.close();
                  connect.close();
                 
             }  catch (Exception e) { System.out.println("Some-thing went wrong");}
        } catch (Exception e) { System.out.println("Some-thing went wrong");}
    }
}
