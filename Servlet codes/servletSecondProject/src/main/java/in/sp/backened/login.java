package in.sp.backened;


import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class login extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse responserequest)throws ServletException , IOException {
		System.out.println("I am in Service");
	}
	
}

