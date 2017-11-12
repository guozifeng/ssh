package com.ghs.aop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ghs.aop.Sleepable;

public class TestAOP {
	public static void main(String[] args) {
		method1();
		method2();
		method3();
		method4();
	}

	private static void method1() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1.xml");
		Sleepable sleeper = (Sleepable) context.getBean("humanProxy");
		sleeper.sleep();
	}

	private static void method2() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
		Sleepable sleeper = (Sleepable) context.getBean("human");
		sleeper.sleep();
	}
	
	private static void method3() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
		Sleepable sleeper = (Sleepable) context.getBean("human");
		sleeper.sleep();
	}

	private static void method4() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext4.xml");
		Sleepable sleeper = (Sleepable) context.getBean("human");
		sleeper.sleep();
	}
}
