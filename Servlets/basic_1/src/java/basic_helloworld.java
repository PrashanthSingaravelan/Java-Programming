import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class basic_helloworld extends HttpServlet {
    private String message;  // to store the message
    
    @Override
    public void init() throws ServletException {
         message = "Prashanth (1st servlet) ";
    }
    
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        response.setContentType("text/html;charset=UTF-8");  // setting the html at the response side
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Hello World</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Message :  " + message + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
   
   public void destory() {
     // do nothing
    }
   
}
