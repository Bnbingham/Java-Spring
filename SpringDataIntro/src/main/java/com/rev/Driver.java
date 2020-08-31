package com.rev;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rev.beans.Guitar;
import com.rev.repos.GuitarDAO;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");

		addSomeGuitars(ac);

		 GuitarDAO gd=(GuitarDAO)ac.getBean("guitarDAO");
		 List<Guitar> glist=gd.findGuitarByMake("Gibson");
		 System.out.println(glist);
		 

		((AbstractApplicationContext) ac).close();

	}

	static void addSomeGuitars(ApplicationContext ac) {
		Guitar g1 = new Guitar("Gibson", "Les Paul", "purple");
		Guitar g2 = new Guitar("Gibson", "Explorer", "white");
		Guitar g3 = new Guitar("Fender", "Stratocaster", "green");
		Guitar g4 = new Guitar("Ibanez", "RG50", "yellow");

		GuitarDAO gd = (GuitarDAO) ac.getBean("guitarDAO");
		gd.save(g1);
		gd.save(g2);
		gd.save(g3);
		gd.save(g4);

	}
}
