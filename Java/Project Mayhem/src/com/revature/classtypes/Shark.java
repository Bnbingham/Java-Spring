package com.revature.classtypes;

public class Shark extends Fish implements Hunt{

	public void swim() {
		System.out.println("I'm a swimming Shark.");		
	}

	public void breathe() {
		System.out.println("I breate underwater, I'm a shark");
	}

	@Override
	public void findPrey() {
		System.out.println("I ate fishes");
	}
	
}
