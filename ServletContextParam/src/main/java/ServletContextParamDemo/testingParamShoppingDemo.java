package ServletContextParamDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class testingParamShoppingDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private String license;
	private String greeting;
       

    public testingParamShoppingDemo() {
        super();
    }
    
    public void init() {
    	greeting = getServletConfig().getInitParameter("greeting");
    	license = getServletConfig().getInitParameter("license");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("inside shoppingServlet.getmethod");
		PrintWriter out = response.getWriter();
		
		ServletContext sc = getServletContext();
		String projectName = sc.getInitParameter("project-name");
		String expirationSeconds = sc.getInitParameter("login-expiration-time-in-seconds");
		
		out.println("ShoppingServlet");
		out.println("From get method");
		out.println("-------context param------");
		out.println("Project name " + projectName);
		out.println("Expiration Seconds" + expirationSeconds);
		out.println("---------init param--------");
		out.println("License"+ license);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside post method");
	}

}
