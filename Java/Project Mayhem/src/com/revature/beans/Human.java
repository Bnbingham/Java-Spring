package com.revature.beans;

import java.io.Serializable;

import com.revature.classtypes.Hunt;

//packages are fancy folders. creates a Namespace

/*
 *Naming Conventions
 *		Classes and Projects: Pascal casing, Capitalized first letter of each word
 *		Methods and Variables: Camel casing, ex. firstSecondThird
 *		Packages: lower case and delimited by periods
 *		Constants: ALL_CAPS delimited by underscore ex. PI 
*/

public class Human implements Hunt, Serializable { //generate serialVersion by clicking on class
/**
	 * 
	 */
	private static final long serialVersionUID = 9187957658114511135L;
/*
 	* Members of a class
	* 		Instance variables - property of a specific object ex. Human's name
	* 		Static variable - property shared by all in class
	* 		Instance methods - behavior relative to a specific object 
	* 		Static methods - behavior shared by all in a class
	* 		Constructor- method that instantiates a class using the keyword "new"
*/
//	Code Blocks - {things between curly braces}  static> instance> constructor/compiler
	
	//Instance code block - will run whenever class is instantiated 
	{System.out.println("I'm in an instance code block");}
	//static code block - will run once when the class is loaded into the compiler
	static {System.out.println("I'm in a static code block");}
	
//constructor example
	public Human() {
		System.out.println("I'm in the 'no args' constructor");
	} //it's good practice to include a " no args constructor"
	
	public Human(String name, int age, int weight) { //this is called a "constructor w/ fields or arguments"
		//super(); is called implicitly
		this.name=name;
		this.age=age;
		this.weight=weight;
		System.out.println("I'm in the constructor w/ fields");
	}
	
	private String name;
	private int age;
	private int weight;
	
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
	public int getWeight() {
		return weight;
	}
	//example of shadowing!
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}
	// This method makes the presented object information easier to read

	//This is an implemented method from a interface
	@Override
	public void findPrey() {
		System.out.println("I am hunting and I am a human.");
	}
	
	
}
