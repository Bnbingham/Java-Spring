package com.aop.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 
 * @author Revature
 *
 *	Spring AOP is an implementation of aspectj. It
 *		simplifies AspectJ, but it reduces the functionality.
 *
 *	AOP = Aspect Oriented Programming
 *		 meant to modularize cross cutting concerns
 *
 *	cross cutting concerns:
 *		tangling:	spaghetti code
 *		scattering:	logging, exception handling
 *	
 *	aspect:	
 *		takes the form of a class in spring
 *
 *	advice:
 *		takes the form of methods inside of an aspect
 *
 *	joinPoint
 *		possible points in runtime of the program where an advice can
 *			be invoked. In Spring AOP, these points are method invokations.
 *			JoinPoints take the form of an object given to us by Spring.
 *	PointCut
 *		expressions that are used to select specific joinpoints. Pointcuts
 *			target joinpoints and take the form of strings of regular expressions.
 *
 *	Pointcut expressions:
 *		"*" wildcard expressions denoting the return type and/or the name
 *		".." wildcard expressions for the method parameters.
 *
 *	pointcut timings/advice timings
 *		Before							runs before method execution
 *		After							runs after method execution
 *		AfterReturning					runs after method returns
 *		AfterThrowing					runs after method throws
 *		Around							
 *
 */


@Aspect
@Component
public class AspectExample {
	
	@Before("execution(* *(..))")
	public void beforeSinging(JoinPoint jp) {
//		jp.getSignature();
		System.out.println("this is the advice to run before singing");
	}
	
	@Around("execution(* sing*(..))")
	public void aroundSinging(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("this is the advice to run before singing");
		pjp.proceed();
		System.out.println("this is after the sing method executes");
	}

}
