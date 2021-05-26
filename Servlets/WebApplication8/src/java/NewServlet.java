import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class NewServlet extends HttpServlet {    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        String str,str1;
        str=request.getParameter("firstname");
        str1=request.getParameter("lastname");
        out.println("name is :"+str+str1);
        out.println(
         "<html>\n" +
            "<head><title>" + "title" + "</title></head>\n" +
            "<body bgcolor = \"#f0f0f0\">\n" +
               "<h1 align = \"center\">" + "title" + "</h1>\n" +
               "<ul>\n" +
                  "  <li><b>First Name</b>: "
                  + request.getParameter("firstname") + "\n" +
                  "  <li><b>Last Name</b>: "
                  + request.getParameter("lastname") + "\n" +
               "</ul>\n" +
            "</body>"+
         "</html>"
        
        );   
        out.close();
        
        }
    

}
