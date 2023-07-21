package br.com.petadoption.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.petadoption.model.Pet;
import br.com.petadoption.model.PetDataBase;


@WebServlet("/editPet")
public class EditPetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String petName = request.getParameter("name");
		String petBreed = request.getParameter("breed");
		String petAge = request.getParameter("age");
		String petVaccine = request.getParameter("vaccine");
		
		String paramId = request.getParameter("id");
		
		Integer id = Integer.valueOf(paramId);
		
		
		System.out.println("ID: " + id);
		
		PetDataBase base = new PetDataBase();
		
		Pet oldPet = base.findById(id);
		
		oldPet.setName(petName);
		oldPet.setBreed(petBreed);
		oldPet.setAge(Integer.parseInt(petAge));
		oldPet.setVaccinated(petVaccine.equalsIgnoreCase("yes"));
		
		response.sendRedirect("listPet");
		
		
	}

}
