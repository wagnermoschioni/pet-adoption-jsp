package br.com.petadoption.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PetDataBase {

	private static List<Pet> pets = new ArrayList<>();

	static Integer seqId = 1;

	public PetDataBase() {

	}

	public List<Pet> getPets() {
		return PetDataBase.pets;
	}

	public void add(Pet pet) {
		pet.setId(seqId);
		PetDataBase.pets.add(pet);
		seqId++;
	}

	public void removePet(Integer id) {

		Iterator<Pet> it = pets.iterator();

		while (it.hasNext()) {
			Pet item = it.next();

			if (item.getId() == id) {
				it.remove();
			}
		}

	}

	public Pet findById(Integer id) {
		
		for (Pet pet : pets) {
			if (pet.getId() == id) {
				return pet;
			}
		}
		return null;
	}

}
