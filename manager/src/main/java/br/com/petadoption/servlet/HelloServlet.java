package br.com.petadoption.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/hi")
public class HelloServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		PrintWriter writer = resp.getWriter();
		
		writer.println("<html>");
		writer.println("<title>Welcome Page</title");
		writer.println("<body>");
		writer.println("First Pet Adoption Servlet");
		writer.println("</body>");
		writer.println("</html>");
		
	}
	
}
