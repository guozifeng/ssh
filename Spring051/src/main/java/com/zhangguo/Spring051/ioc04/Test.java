package com.zhangguo.Spring051.ioc04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		//容器
		ApplicationContext ctx=new ClassPathXmlApplicationContext("IOCBeans04.xml");
		A01 a01=ctx.getBean("a01",A01.class);
		System.out.println(a01.getMsg());
	}
}
