package br.com.petadoption.model;

import java.util.ArrayList;
import java.util.List;

public class PetDataBase {

	private static List<Pet> pets = new ArrayList<>();

	public PetDataBase() {

	}

	public  List<Pet> getPets() {
		return PetDataBase.pets;
	}

	public void add(Pet pet) {
		PetDataBase.pets.add(pet);

	}

}
