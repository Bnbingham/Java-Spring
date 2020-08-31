package com.revature.model;

import java.io.Serializable;

public class PokemonType implements Serializable {

	private static final long serialVersionUID = -945668677502498269L;
	private int id;
	private String element;

	public PokemonType(int id, String element) {
		super();
		this.id = id;
		this.element = element;
	}

	public PokemonType() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "PokemonType [id=" + id + ", element=" + element + "]";
	}

}
