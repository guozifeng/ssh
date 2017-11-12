package com.zhangguo.Spring051.iocTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	@org.junit.Test
	public void testStoreBook()
	{
		//容器
		ApplicationContext ctx=new AnnotationConfigApplicationContext(ApplicationCfg.class);
		BookService bookservice=ctx.getBean(BookService.class);
		bookservice.storeBook("《Spring MVC权威指南 第四版》");
		ctx.getBean(Student.class).show();
	}
}
