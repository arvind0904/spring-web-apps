package com.example;

import org.aspectj.lang.JoinPoint;

public class TaskProgress{
	public void myadvice(JoinPoint jp,Object result)//it is advice (after advice)
	{
		System.out.println("additional concern After");
//		System.out.println("Method Signature: "  + jp.getSignature());
//		System.out.println("Result in advice: "+result);
//		System.out.println("end of after returning advice...");
	}
}
