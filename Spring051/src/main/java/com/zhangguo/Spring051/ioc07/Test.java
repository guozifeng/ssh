package com.zhangguo.Spring051.ioc07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	@org.junit.Test
	public void testStoreBook()
	{
		//容器
		ApplicationContext ctx=new ClassPathXmlApplicationContext("IOCBeans07.xml");
		BookService bookservice=ctx.getBean(BookService.class);
		bookservice.storeBook("《Spring MVC权威指南 第三版》");
		
		Math math=ctx.getBean("math",Math.class);
		int n1=100,n2=5;
		math.add(n1, n2);
		math.sub(n1, n2);
		math.mut(n1, n2);
		math.div(n1, n2);
	}
}
