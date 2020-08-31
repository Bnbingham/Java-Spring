package com.revature.beans;

public class Power {
	private String name;

	public Power(String name) {
		super();
		this.name = name;
	}

	public Power() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Power [name=" + name + "]";
	}

}
