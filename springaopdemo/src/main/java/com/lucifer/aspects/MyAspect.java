package com.lucifer.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {
	
	@Pointcut("execution(* com.lucifer.payment.MakePayment.doPayment(..))")
	public void pointCut() {
		
	}
	
	//@Before("execution(* com.lucifer.payment.MakePayment.doPayment(..))")
	@Before("pointCut()")
	public void runBefore(JoinPoint joinpoint) {
		System.out.println("session started before");
		//System.out.println(joinpoint.toString()); 
	}
	
	//@After("execution(* com.lucifer.payment.MakePayment.doPayment(..))")
	@After("pointCut()")
	public void runAfter() {
		System.out.println("session ended after");
	}
	
	
	@Around("pointCut()")
	public void runAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out.println("session started around");
		proceedingJoinPoint.proceed();
		System.out.println("session ended around");
	}
	
}
