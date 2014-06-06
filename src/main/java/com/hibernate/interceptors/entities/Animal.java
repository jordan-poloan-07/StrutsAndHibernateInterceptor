package com.hibernate.interceptors.entities;

public class Animal {

	private Long animalId;
	private String animalName;
	private Long animalOffsprings;
	private Boolean isCarnivore;
	private String landExplored;

	public Long getAnimalId() {
		return animalId;
	}

	public void setAnimalId(Long animalId) {
		this.animalId = animalId;
	}

	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	public Long getAnimalOffsprings() {
		return animalOffsprings;
	}

	public void setAnimalOffsprings(Long animalOffsprings) {
		this.animalOffsprings = animalOffsprings;
	}

	public Boolean getIsCarnivore() {
		return isCarnivore;
	}

	public void setIsCarnivore(Boolean isCarnivore) {
		this.isCarnivore = isCarnivore;
	}

	public String getLandExplored() {
		return landExplored;
	}

	public void setLandExplored(String landExplored) {
		this.landExplored = landExplored;
	}

}
