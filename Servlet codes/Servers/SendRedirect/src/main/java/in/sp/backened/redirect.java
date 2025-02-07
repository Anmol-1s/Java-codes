package in.sp.backened;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class redirect extends HttpServlet {

	@WebServlet("/mylogin")
	public class MyServlet extends HttpServlet {


	    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    	
	    	String mysearch = req.getParameter("search1");
	    	
	    	resp.sendRedirect("https ://WWW.google.com");
	    }
	}
}
