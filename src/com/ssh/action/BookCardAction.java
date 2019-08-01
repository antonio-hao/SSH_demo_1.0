package com.ssh.action;

import java.text.DecimalFormat;
import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ssh.entity.BookCard;
import com.ssh.service.BookCardService;

//����BookCardAction(action��)�̳�ActionSupport�ӿ�
public class BookCardAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3213789657873603217L;

	// ����service�������������������ʵ�����ʵ����
	private BookCardService bookCardService = null;

	public void setBookCardService(BookCardService bookCardService) {
		this.bookCardService = bookCardService;
	}

	// ��дexecute()����
	public String execute() {

		// ��ȡIndexServiceʵ��������getAllBookCard()����
		// ��������浽List������
		List<BookCard> myBookCardList = bookCardService.getAllBookCard();

		// ����ѯ�����Ľṹ����ӡ������̨
		System.out.println("�������" + myBookCardList.size());

		// ��ȡContext�����Ķ���
		ActionContext ac = ActionContext.getContext();
		// ��myBookCardList������ӵ������Ķ�����
		ac.put("myBookCardList", myBookCardList);

		// ����һ���ַ���
		return "success";
	}

	// ����ʽת��
	public String formatDouble(double s) {
		DecimalFormat fmat = new DecimalFormat("\u00A4##.0");
		return fmat.format(s);
	}

}
