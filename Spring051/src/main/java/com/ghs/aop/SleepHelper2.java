package com.ghs.aop;

public class SleepHelper2{
	
	public void beforeSleep(){
		System.out.println("睡觉前要脱衣服！");
	}
	
	public void afterSleep(){
		System.out.println("起床后要穿衣服！");
	}
}
