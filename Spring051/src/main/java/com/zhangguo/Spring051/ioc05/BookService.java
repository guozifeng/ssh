package com.zhangguo.Spring051.ioc05;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

/**
 * 图书业务类
 */
@Service
public class BookService {
	
	public IBookDAO getDaoofbook() {
		return daoofbook;
	}

	/*
	@Autowired
	@Qualifier("bookdao02")
	public void setDaoofbook(IBookDAO daoofbook) {
		this.daoofbook = daoofbook;
	}*/
	
	@Resource(name="bookdao02")
	public void setDaoofbook(IBookDAO daoofbook) {
		this.daoofbook = daoofbook;
	}

	/*
	@Autowired
	@Qualifier("bookdao02")
	*/
	IBookDAO daoofbook;
	
	/*
	public BookService(@Qualifier("bookdao02") IBookDAO daoofbook) {
		this.daoofbook=daoofbook;
	}*/
	
	public void storeBook(String bookname){
		System.out.println("图书上货");
		String result=daoofbook.addBook(bookname);
		System.out.println(result);
	}
}
