package br.com.petadoption.model;

public class Pet {

	private Integer id;
	
	private String name;
	private Integer age;
	private String breed;
	private boolean isVaccinated = false;

	public Integer getId() {
		
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public boolean isVaccinated() {
		return isVaccinated;
	}
	
	public void setVaccinated(boolean vaccinated) {
		isVaccinated = vaccinated;
	}
}
