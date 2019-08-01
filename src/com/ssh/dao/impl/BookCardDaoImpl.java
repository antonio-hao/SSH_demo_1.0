package com.ssh.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.ssh.dao.BookCardDao;
import com.ssh.entity.BookCard;

//����BookCardDaoImpl(ʵ����)ʵ��BookCardDao�ӿ�
public class BookCardDaoImpl implements BookCardDao {

	// ��SSH��������Ҫʹ��ĳ��ʵ������ô�Ͷ�������һ������Ȼ��
	// �������set����������springע�������
	// ʵ�ֲ�Ҫ��ע���ʵ������������Լ���ô��������������˭
	private SessionFactory sessionFactory;

	@Override
	public List<BookCard> getAllBookCard() {
		// sessionFactory���ʵ�������Լ��������hibernate��ͳд������
		// Ҳ���Խ���springȥ�й�
		/*
		 * Configuration cfg = new Configuration().configure(); sessionFactory =
		 * cfg.buildSessionFactory();
		 */

		// ��ȡsession
		Session session = sessionFactory.openSession();

		// ���浱ʹ��JPA��ʱ��EntityManager ������ Session
		Query<BookCard> query = session.createQuery("from BookCard");

		// �����е����ݲ�ѯ�������ŵ�List������
		List<BookCard> list = (List<BookCard>)query.list();

		// �����ϱ���ѭ��
		System.out.println("��ѯ���ݣ�");
		for (BookCard bookCard : list) {
			// ��ӡ���������̨
			
			System.out.println(bookCard.getName());

		}
		// �ر�session
		session.close();
		// �ر�sessionFactory
		sessionFactory.close();
		// ����list����
		return list;

	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
