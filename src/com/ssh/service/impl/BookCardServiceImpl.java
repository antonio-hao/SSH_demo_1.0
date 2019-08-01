package com.ssh.service.impl;

import java.util.List;

import com.ssh.dao.BookCardDao;
import com.ssh.entity.BookCard;
import com.ssh.service.BookCardService;

//创建BookCardServiceImpl(实现类)实现BookCardService接口
public class BookCardServiceImpl implements BookCardService {

	public BookCardDao bookCardDao;

	@Override
	public List<BookCard> getAllBookCard() {
		// 本类应该编写业务逻辑的代码，
		// 但本例没有业务逻辑，就不用写。

		// 访问数据库的代码，不会出现在service这一层
		// 交给dao来操作数据库

		List<BookCard> myBookCardList = bookCardDao.getAllBookCard();

		// 进行其它的业务逻辑操作，比如增加多一个选项，是否过期
		// 本例不需要
		// ....
		
		return myBookCardList;
	}

	public void setBookCardDao(BookCardDao bookCardDao) {
		this.bookCardDao = bookCardDao;
	}

}
