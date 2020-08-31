package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.model.Singer;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean-aspect.xml");
		Singer singer = ac.getBean(Singer.class);
		singer.singOceanMan();
//		singer.yellAssociates();
	}
}
