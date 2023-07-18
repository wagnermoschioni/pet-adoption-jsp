package br.com.petadoption.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.petadoption.model.Pet;
import br.com.petadoption.model.PetDataBase;

@WebServlet("/newPet")
public class NewPetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String petName = request.getParameter("name");

		Pet pet = new Pet();
		pet.setName(petName);
		PetDataBase db = new PetDataBase();
		
		db.add(pet);		
		
		/*
		 * 
		PrintWriter writer = response.getWriter();

		  Generating a HTML within Java class
		writer.println("<html>");
		writer.println("<title>New Pet</title");
		writer.println("<body>");
		writer.println("Pet successfully registered: " + pet.getName());
		writer.println("</body>");
		writer.println("</html>");
		*/
		
		
		/**
		 * Using JSP
		 */
		
		request.setAttribute("name", pet.getName());
		RequestDispatcher rd = request.getRequestDispatcher("/newPetCreated.jsp");
		rd.forward(request, response);
		
		
		
	}

}
