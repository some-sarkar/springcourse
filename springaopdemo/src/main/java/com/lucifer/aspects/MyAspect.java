package com.lucifer.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	
	@Before("execution(* com.lucifer.payment.MakePayment.doPayment(..))")
	public void runBefore() {
		System.out.println("session started");
	}
	
	@After("execution(* com.lucifer.payment.MakePayment.doPayment(..))")
	public void runAfter() {
		System.out.println("session ended");
	}
	
}
