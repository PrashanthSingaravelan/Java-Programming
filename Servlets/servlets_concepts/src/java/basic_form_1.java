import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class basic_form_1 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String str1,str2;
            str1 = request.getParameter("book_name");
            str2 = request.getParameter("author_name");
            out.println("Book : " + str1);
            out.println("Author : " + str2);            
            
                   out.println(
                  "<html>\n" +
                            "<head>" + 
                                     "<title>" + "Form Window" + "</title>" +
                          "</head>\n" +
                          
                            "<body bgcolor = \"#f0f0f0\">\n" +
                                 "<h1 align = \"center\">" + "Form" + "</h1>\n" +
                                    "<ul>\n" +
                                         "  <li><b>Book Name</b>: " + request.getParameter("book_name") + "\n" +
                                         "  <li><b>Author Name</b>: " + request.getParameter("author_name") + "\n" +
                                    "</ul>\n" +
                            "</body>"+
                  "</html>"
                    );   
                   
                   out.close();
            }
    }
}