package br.com.petadoption.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.petadoption.model.Pet;
import br.com.petadoption.model.PetDataBase;


@WebServlet("/viewPet")
public class ViewPetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String parameterId = request.getParameter("id");
		Integer id = Integer.parseInt(parameterId);
		
		PetDataBase base = new PetDataBase();
		
		Pet pet = base.findById(id);
		
		System.out.println(pet.getName());
		
		request.setAttribute("pet", pet);
		RequestDispatcher rd = request.getRequestDispatcher("/formEditPet.jsp");
		
		rd.forward(request, response);
		
		System.out.println("Executing ViewPetServlet");
	}

}
