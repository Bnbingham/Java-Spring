package com.revature.util;

import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Warrior;
import com.revature.menu.Menu;

public class Roster {
public static List<Warrior> warriorList= 
	new ArrayList<Warrior>();

	
	public static Warrior findWarriorByName(String inputName) {
		for(int i=0;i<warriorList.size();i++) {
			String name=warriorList.get(i).getName();
			if(inputName.equals(name)) {
				return warriorList.get(i);
			}
		}
				System.out.println("Warrior Not Found");
				Menu.startMenu();
				return null;
	}
}
