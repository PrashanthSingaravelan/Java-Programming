import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class basic_form_2 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String str1,str2;
            str1 = request.getParameter("first_name");
            str2 = request.getParameter("last_name");
            out.println("Your name is : " + str1 + " " + str2);
            
                   out.println(
                  "<html>\n" +
                            "<head>" + 
                                     "<title>" + "Form Window" + "</title>" +
                          "</head>\n" +
                          
                            "<body bgcolor = \"#f0f0f0\">\n" +
                                 "<h1 align = \"center\">" + "Form" + "</h1>\n" +
                                    "<ul>\n" +
                                         "  <li><b>First Name</b>: " + request.getParameter("first_name") + "\n" +
                                         "  <li><b>Last Name</b>: " + request.getParameter("last_name") + "\n" +
                                    "</ul>\n" +
                            "</body>"+
                  "</html>"
                    );   
                   
                   out.close();
            }
    }
}