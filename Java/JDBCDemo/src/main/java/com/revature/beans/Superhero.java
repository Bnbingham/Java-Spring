package com.revature.beans;

public class Superhero {
	private String hero_name;

	public Superhero(String hero_name) {
		super();
		this.hero_name = hero_name;
	}

	public String getHero_name() {
		return hero_name;
	}

	public void setHero_name(String hero_name) {
		this.hero_name = hero_name;
	}

	@Override
	public String toString() {
		return "Superhero [hero_name=" + hero_name + "]";
	}

}
