package in.sp.backened;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class login extends HttpServlet {

	@WebServlet("/mylogin")
	public class MyServlet extends HttpServlet {


	    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    	
	        String myemail = req.getParameter("email1");
	        String mypass = req.getParameter("pass1");
	        
	        if(myemail.equals("anmolsoni@gmail.com") && mypass.equalsIgnoreCase("Anmol@1234"))  {
	        	System.out.println("Success");
	        } else {
	        	System.out.println("Failed");
	        }
	    	
	    }
	}
}
