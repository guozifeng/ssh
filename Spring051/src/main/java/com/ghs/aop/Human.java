package com.ghs.aop;


public class Human implements Sleepable {

	@Override
	public void sleep() {
		System.out.println("正在睡觉！");
	}
}
