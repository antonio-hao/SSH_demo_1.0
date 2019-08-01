package com.ssh.service.impl;

import java.util.List;

import com.ssh.dao.BookCardDao;
import com.ssh.entity.BookCard;
import com.ssh.service.BookCardService;

//����BookCardServiceImpl(ʵ����)ʵ��BookCardService�ӿ�
public class BookCardServiceImpl implements BookCardService {

	public BookCardDao bookCardDao;

	@Override
	public List<BookCard> getAllBookCard() {
		// ����Ӧ�ñ�дҵ���߼��Ĵ��룬
		// ������û��ҵ���߼����Ͳ���д��

		// �������ݿ�Ĵ��룬���������service��һ��
		// ����dao���������ݿ�

		List<BookCard> myBookCardList = bookCardDao.getAllBookCard();

		// ����������ҵ���߼��������������Ӷ�һ��ѡ��Ƿ����
		// ��������Ҫ
		// ....
		
		return myBookCardList;
	}

	public void setBookCardDao(BookCardDao bookCardDao) {
		this.bookCardDao = bookCardDao;
	}

}
