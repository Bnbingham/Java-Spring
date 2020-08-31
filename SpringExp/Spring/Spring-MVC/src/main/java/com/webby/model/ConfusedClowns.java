package com.webby.model;

public class ConfusedClowns {

	private int id;
	private String name;
	private boolean dimensia;
	private int balloons;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isDimensia() {
		return dimensia;
	}

	public void setDimensia(boolean dimensia) {
		this.dimensia = dimensia;
	}

	public int getBalloons() {
		return balloons;
	}

	public void setBalloons(int balloons) {
		this.balloons = balloons;
	}

	public ConfusedClowns(int id, String name, boolean dimensia, int balloons) {
		super();
		this.id = id;
		this.name = name;
		this.dimensia = dimensia;
		this.balloons = balloons;
	}

	public ConfusedClowns() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ConfusedClowns [id=" + id + ", name=" + name + ", dimensia=" + dimensia + ", balloons=" + balloons
				+ "]";
	}

}
