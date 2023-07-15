package com.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackTask{
	@Pointcut("execution(* Task.*(..))")
	public void k(){}//pointcut name
	
	@Pointcut("execution(* Task.k*(..))")
	public void ok(){}//pointcut name
	
	@After("k()")//applying pointcut on after advice
	public void myadvice(JoinPoint jp)//it is advice (after advice)
	{
		System.out.println("additional concern");
		//System.out.println("Method Signature: "  + jp.getSignature());
	}
}
