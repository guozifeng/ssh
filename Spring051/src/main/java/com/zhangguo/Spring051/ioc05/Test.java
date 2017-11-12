package com.zhangguo.Spring051.ioc05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// 容器
		ApplicationContext ctx = new ClassPathXmlApplicationContext("IOCBeans05.xml");
		BookService bookservice = ctx.getBean(BookService.class);
		bookservice.storeBook("《Spring MVC权威指南 第三版》");
	}
}
