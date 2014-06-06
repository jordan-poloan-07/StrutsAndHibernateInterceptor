package com.hibernate.interceptors.entities;

public class Fish {

	private Long fishId;
	private String name;
	private String age;
	private Long seasExplored;
	private Long planktonAte;

	public Long getFishId() {
		return fishId;
	}

	public void setFishId(Long fishId) {
		this.fishId = fishId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Long getSeasExplored() {
		return seasExplored;
	}

	public void setSeasExplored(Long seasExplored) {
		this.seasExplored = seasExplored;
	}

	public Long getPlanktonAte() {
		return planktonAte;
	}

	public void setPlanktonAte(Long planktonAte) {
		this.planktonAte = planktonAte;
	}

}
