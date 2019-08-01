package com.ssh.action;

import java.text.DecimalFormat;
import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ssh.entity.BookCard;
import com.ssh.service.BookCardService;

//创建BookCardAction(action类)继承ActionSupport接口
public class BookCardAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3213789657873603217L;

	// 声明service，但不给它创建具体的实现类的实例，
	private BookCardService bookCardService = null;

	public void setBookCardService(BookCardService bookCardService) {
		this.bookCardService = bookCardService;
	}

	// 编写execute()方法
	public String execute() {

		// 获取IndexService实例，调用getAllBookCard()方法
		// 将结果保存到List集合里
		List<BookCard> myBookCardList = bookCardService.getAllBookCard();

		// 将查询出来的结构集打印到控制台
		System.out.println("结果集：" + myBookCardList.size());

		// 获取Context上下文对象
		ActionContext ac = ActionContext.getContext();
		// 将myBookCardList集合添加到上下文对象里
		ac.put("myBookCardList", myBookCardList);

		// 返回一个字符串
		return "success";
	}

	// 金额格式转换
	public String formatDouble(double s) {
		DecimalFormat fmat = new DecimalFormat("\u00A4##.0");
		return fmat.format(s);
	}

}
