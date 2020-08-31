package com.revature.compare;

import java.util.Comparator;

	//Method 2 of comparing
	//External class that implements Comparator
public class StudentComparator implements Comparator<Student>{

	//Compare gpa's
	@Override
	public int compare(Student o1, Student o2) {
		
		return (int)( o1.getGpa()-o2.getGpa() )*100;
	}

}
