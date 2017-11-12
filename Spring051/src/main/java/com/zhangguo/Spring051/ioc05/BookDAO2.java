package com.zhangguo.Spring051.ioc05;

import org.springframework.stereotype.Repository;

@Repository("bookdao02")
public class BookDAO2 implements IBookDAO {

	public String addBook(String bookname) {
		return "创建图书"+bookname+"成功！2";
	}

}
