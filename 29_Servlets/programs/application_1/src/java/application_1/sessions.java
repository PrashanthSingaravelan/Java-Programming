package application_1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpSession;

public class sessions extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            String n = request.getParameter("user_name");
            
            HttpSession session=request.getSession();  
            session.setAttribute("uname",n); 
            
            Integer attribute = (Integer)session.getAttribute("user_name");
            
            if (attribute == null) {
                    attribute = new Integer(1);
                    out.println("<h1> Welcome New User </h1>");
            }
            
            else {
                attribute = new Integer(attribute.intValue() + 1);
                out.println("<h1> Welcome Back the old user</h1>");
            }
            
            session.setAttribute("user_name", attribute);
            session.setMaxInactiveInterval(30);
            
            out.println("<h1> Session id : " + session.getId() + "</h1>");
            
            out.println("<h1> Session last access time : " + session.getLastAccessedTime() + "</h1>");
            
        } 
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }


}
