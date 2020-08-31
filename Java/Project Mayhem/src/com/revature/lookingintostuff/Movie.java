package com.revature.lookingintostuff;

public class Movie {
	private String name;
	private int likes;

	public Movie(String name, int likes) {
		super();
		this.name = name;
		this.likes = likes;
	}

	public int getLikes() {
		return likes;
	}

}
