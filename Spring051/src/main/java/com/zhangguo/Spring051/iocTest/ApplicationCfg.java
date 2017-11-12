package com.zhangguo.Spring051.iocTest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.zhangguo.Spring051.iocTest")
public class ApplicationCfg {
	@Bean
	public Student getStudent(){
		return new Student();
	}
}
