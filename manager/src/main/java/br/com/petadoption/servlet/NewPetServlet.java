package br.com.petadoption.servlet;

import java.io.IOException;

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
		String petBreed = request.getParameter("breed");
		String petAge = request.getParameter("age");
		String petVaccine = request.getParameter("vaccine");

		Pet pet = new Pet();
		pet.setName(petName);
		pet.setBreed(petBreed);
		pet.setAge(Integer.parseInt(petAge));
		pet.setVaccinated(petVaccine.equalsIgnoreCase("yes"));
		PetDataBase db = new PetDataBase();
		
		db.add(pet);		
			
		
		/**
		 * Using JSP
		 */
		
		request.setAttribute("name", pet.getName());
		
		response.sendRedirect("listPet");
		
//		request.setAttribute("name", pet.getName());
//		RequestDispatcher rd = request.getRequestDispatcher("/listPet");
//		rd.forward(request, response);
		
		
		
	}

}
