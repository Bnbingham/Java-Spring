package com.aop.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectExample {
	/*
	 * 
	 * Aspects complement OOP by reducing CrossCutting Concerns
	 * scattering, going from one class and injecting into lots of other classes: logging, exception handling
	 * tangling, classes are super intertwined, speghetti code
	 * 
	 * Spring AOP is an implementation of aspectj. It simplifies AspectJ, but reduces the functionality
	 * 
	 * aspect:
	 * 	takes the form of a class in spring
	 * 
	 * advice:
	 * 	takes the form of methods inside of a class
	 * 
	 * 
	 * JoinPoint
	 * 		possible points in runtime of the program where advice can be invoked. In Spring AOP, these points are method invocations
	 * 			JoinPoints take the form of an object given to us by Spring
	 * 			pulls a snapshot on the method about to get ran, the environment and so on.
	 * 			public Void beforeSinging(JoinPoint jp){ jp. }
	 * PointCut
	 * 		expressions that are used to select specific joinpoints. Pointcuts target joinpoints and take the form of strings of regular expressions.
	 * 
	 * Pointcut Expressions:
	 * 		"*" 	wildcard expression denoting return type and/or name
	 * 		".." 	Wildcard expression for method parameters
	 *		
	 *Pointcut timings/advice timings
	 *	Before				runs before method execution
	 *	After				runs after method execution
	 *	AfterReturning		runs after method returns
	 *	AfterThrowing		runs after throw
	 *	Around
	 * 
	 */
	
	
	
	
	//pointcut exception
	@Before("execution(* sing*(..))")
	public void beforeSinging(JoinPoint jp) {
//		jp.getSignature();
		System.out.println("something");
	}
	
	@Around("execution(* sing*(..))")
	public void aroundSinging(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("this is before");
		pjp.proceed();
		System.out.println("this is after the point");
	}
}
