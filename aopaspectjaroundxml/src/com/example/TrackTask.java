package com.example;
import org.aspectj.lang.ProceedingJoinPoint;
public class TrackTask
{
	public Object myadvice(ProceedingJoinPoint pjp) throws Throwable 
	{
		System.out.println("Additional Concern Before calling actual method");
		Object obj=pjp.proceed();
		System.out.println("Additional Concern After calling actual method");
		return obj;
	}
}
