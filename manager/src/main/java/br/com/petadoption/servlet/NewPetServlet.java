package br.com.petadoption.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/newPet")
public class NewPetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String petName = request.getParameter("name");
		
		PrintWriter writer = response.getWriter();

		writer.println("<html>");
		writer.println("<title>New Pet</title");
		writer.println("<body>");
		writer.println("Pet successfully registered: " + petName);
		writer.println("</body>");
		writer.println("</html>");
	}

}
