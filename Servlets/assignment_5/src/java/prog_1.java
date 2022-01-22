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

public class prog_1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String str1 = request.getParameter("field_1");
        String str2 = request.getParameter("field_2");
            
        String connection = "jdbc:derby://localhost:1527/workshop_event";
             try {
                 Connection connect = DriverManager.getConnection(connection, "abc", "123");
                 Statement stm = connect.createStatement();
                 ResultSet rs = null;
                 
                 String query = "SELECT " +  str1 + "," + str2 + " FROM COLLEGE_EVENTS";
                 try { rs = stm.executeQuery(query); } 
                 catch (SQLException ex) {   Logger.getLogger(prog_1.class.getName()).log(Level.SEVERE, null, ex);  }
                 
                  try (PrintWriter out = response.getWriter()) {
                      
                            out.println("<!DOCTYPE html>");
                            out.println("<html>");
                            
                            out.println("<head>");
                            
                            out.println("<title>Program-1</title>");            
                            out.println("<style>");
                                        
                            out.println("table, th, td { border: 1px solid black   border-collapse: collapse}");

                            out.println("th,td { padding:5px;}");
                            out.println("th { text-allign:left ; }");
                                    
                            out.println("</style>");
                            out.println("</head>");
                            
                            out.println("<body>");
                            out.println("<table style  = 'width:100%'>");
                            
                            out.println( "<tr>" + 
                                               "<th>" +  str1   +  "</th>"+ 
                                               "<th>" +  str2+  "</th>"+ 
                                               "</tr>");
                            
                                    while(rs.next()) {
                                        
                                           out.println( "<tr>" + 
                                               "<td>" +   rs.getString(str1) +  "</td>"+ 
                                                "<td>" +  rs.getString(str2) +  "</td>"+ 
                                               "</tr>");
                                     }
                            
                            out.println("</table>");

                            out.println("</body>");
                            out.println("</html>");
            
                  rs.close();
                  stm.close();
                  connect.close();
                 
             }  catch (SQLException e) { System.out.println("Some-thing went wrong");}
        } catch (Exception e) { System.out.println("Some-thing went wrong");}
    }
}


