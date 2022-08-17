import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServlet;

public class perform_operations extends HttpServlet {
    public void service (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
      response.setContentType("text/html;charset=UTF-8");
        
        int i = Integer.parseInt(request.getParameter("num1"));
        int j = Integer.parseInt(request.getParameter("num2"));
        int k = i + j;

        PrintWriter out = response.getWriter();
        out.println("Result is : " + k);  
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        service(request, response);
    }
}
