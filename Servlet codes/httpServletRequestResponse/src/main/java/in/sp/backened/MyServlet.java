package in.sp.backened;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/submitform")
public class MyServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String myname = req.getParameter("name1");
        String myemail = req.getParameter("email1"); 

        
        System.out.println("Name: " + myname);
        System.out.println("Email: " + myemail);

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h3>Name: " + myname + "</h3>");
        out.println("<h3>Email: " + myemail + "</h3>");
    }
}