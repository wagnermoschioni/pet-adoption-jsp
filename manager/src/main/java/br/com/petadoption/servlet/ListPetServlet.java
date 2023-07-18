package br.com.petadoption.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
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
		
		request.setAttribute("pets", petList);
		RequestDispatcher rd = request.getRequestDispatcher("/listPets.jsp");
		rd.forward(request, response);
		
	}

}
