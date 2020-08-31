package com.revature.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Human;

public class IOWithCollections {
	private static final String humanFile = "human.txt";
	public static List<Human> humanList = new ArrayList<Human>();
	
	//write method 
	public static void writeHumnaFile() {
		try {
			ObjectOutputStream objectOut = new ObjectOutputStream(new FileOutputStream(humanFile));
			objectOut.writeObject(humanList);
			objectOut.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	public static void readHumanFile() {
		try {
			ObjectInputStream objectn = new ObjectInputStream(new FileInputStream(humanFile));
			humanList = (List<Human>) objectn.readObject(); //need to cast to object, and potential the class might not exist, checked exception
			objectn.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
}
