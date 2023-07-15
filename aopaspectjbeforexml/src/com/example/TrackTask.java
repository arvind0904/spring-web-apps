package com.example;

import org.aspectj.lang.JoinPoint;

public class TrackTask{
	
	public void myadvice(JoinPoint jp)//it is advice
	{
		System.out.println("I am a Before Aspect");
		//System.out.println("Method Signature: "  + jp.getSignature());
	}
}
