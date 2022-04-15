package ServeletExamples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletExAddition extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int number1 = Integer.parseInt(req.getParameter("number1"));
		int number2 = Integer.parseInt(req.getParameter("number2"));
		PrintWriter out = 
		out.print
		
	}

}
