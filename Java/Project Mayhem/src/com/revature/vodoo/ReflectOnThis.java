package com.revature.vodoo;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

//We have three threads running

public class ReflectOnThis {

	public static void main(String[] args) {
		A a= new A();
		Class<?> c= a.getClass();
		System.out.println("Public Methods:");
		Method [] m= c.getDeclaredMethods();
		for(int i=0;i<m.length;i++) {
			int modifiers=m[i].getModifiers();
			if (Modifier.isPrivate(modifiers)) {
				System.out.println(" "+ m[i].getName());
			}
		}
		
	}

}
class A{
	public static void a1() {
		
	}
	public void a2() {
		
	}
	protected void a3() {
		
	}
	@SuppressWarnings("unused")
	private void a4() {
		
	}
}