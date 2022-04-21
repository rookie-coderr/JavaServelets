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
		
		String num1 = req.getParameter("number1");
		String num2 = req.getParameter("number2");
		
		if(num1!=null && num2!=null && num1.trim().length()>0 && num2.trim().length()>0) {
			int number1 = Integer.parseInt(req.getParameter("number1"));
			int number2 = Integer.parseInt(req.getParameter("number2"));
			PrintWriter out = res.getWriter();
			out.println("<p>Result = " + (number1+number2) + "</p>");
		}
		
		
		
	}

}
