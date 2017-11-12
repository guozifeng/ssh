package com.ghs.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SleepHelper4{
	
	@Pointcut("execution(* *.sleep(..))")
	public void sleepPointcut(){
		System.out.println("睡觉吧！");
	}
	
	@Before("sleepPointcut()")
	public void beforeSleep(){
		System.out.println("睡觉前要脱衣服！");
	}
	
	@After("sleepPointcut()")
	public void afterSleep(){
		System.out.println("起床后要穿衣服！");
	}
}
