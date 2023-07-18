package br.com.petadoption.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.petadoption.model.Pet;
import br.com.petadoption.model.PetDataBase;


@WebServlet("/listPet")
public class ListPetServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PetDataBase db = new PetDataBase();
		
		List<Pet> petList = db.getPets();
		
		PrintWriter writer = response.getWriter();

		writer.println("<html>");
		writer.println("<title>New Pet</title");
		writer.println("<body>");
		writer.println("<ul>");
		
		for (Pet pet : petList) {
			writer.println("<li>" + pet.getName() + "</li>");	
		}		
		
		writer.println("<ul>");
		writer.println("</body>");
		writer.println("</html>");
		
	}

}
