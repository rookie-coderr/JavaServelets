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

//@WebServlet("/testingParamServlet")
@WebServlet(
		urlPatterns = "/testParamServlet",
		initParams= {
				@WebInitParam(name="greeting", value="Welcome testParam-1"),
				@WebInitParam(name="license", value="trial license-1")
		}
)

public class testingParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private String license;
	private String greeting;
       

    public testingParamServlet() {
        super();
    }
    
    public void init() {
    	greeting = getServletConfig().getInitParameter("greeting");
    	license = getServletConfig().getInitParameter("license");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("inside testparam.getmethod");
		PrintWriter out = response.getWriter();
		
		ServletContext sc = getServletContext();
		String projectName = sc.getInitParameter("project-name");
		String expirationSeconds = sc.getInitParameter("login-expiration-time-in-seconds");
		
		out.println("testParamServlet");
		out.println("From get method");
		out.println("-------context param------");
		out.println("Project name " + projectName);
		out.println("Expiration Seconds" + expirationSeconds);
		out.println("---------init param--------");
		out.println("Greeting message : " + greeting);
		out.println("License : "+ license);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside post method");
	}

}
