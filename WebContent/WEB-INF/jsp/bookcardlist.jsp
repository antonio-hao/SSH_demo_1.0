<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
	<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>����</td>
			<td>����</td>
			<td>�Ա�</td>
			<td>�쿨����</td>
			<td>Ѻ��</td>
		</tr>
		<!-- ʹ��struts2��ǩ���е�iterator���������ݱ���ѭ����ʾ���� -->
		<s:iterator value="#myBookCardList" status="bcs">
			<tr>
				<td><s:property value="cid"></s:property></td>
				<td><s:property value="name"></s:property></td>
				<td><s:property value="sex"></s:property></td>
				<td><s:date name="cardDate" format="yyyy��MM��dd��"></s:date></td>
				<td><s:property value="%{formatDouble(deposit)}"></s:property></td>
			</tr>
		</s:iterator>
		<!-- �жϲ�ѯ��������0������ʾ��û�в��ҵ����ݡ� -->
		<s:if test="myBookCardList.size()==0">
			<tr>
				<td colspan="7">û�в��ҵ�����</td>
			</tr>
		</s:if>
	</table>
</body>
</html>