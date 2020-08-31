package com.revature.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Trainer")
public class Trainer implements Serializable {
	
	@Id
	@Column(name = "T_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "trainerSequence")
	@SequenceGenerator(name = "trainerSequence",sequenceName = "Trainer_SEQ")
	private int id;
	
	@Column(name ="T_name")
	private String name;
	
	@Column(name ="T_age")
	private int age;
	
	//can use a junction table instead of ManyToMany
	//	@ManyToMany()
	@JoinTable(name ="Pokemon_Trainer")
	private List<Pokemon> pokemonOwnder;

	public Trainer(String name, int age, List<Pokemon> pokemonOwnder) {
		super();
		this.name = name;
		this.age = age;
		this.pokemonOwnder = pokemonOwnder;
	}

	public Trainer() {
		super();
	}

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Pokemon> getPokemonOwnder() {
		return pokemonOwnder;
	}

	public void setPokemonOwnder(List<Pokemon> pokemonOwnder) {
		this.pokemonOwnder = pokemonOwnder;
	}

	@Override
	public String toString() {
		return "Trainer [id=" + id + ", name=" + name + ", age=" + age + ", pokemonOwnder=" + pokemonOwnder + "]";
	}

}
