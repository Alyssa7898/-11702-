<%@page import="org.hh.entity.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>详细信息</title>
</head>
<body>

<%
           Student student =(Student)request.getAttribute("student");
%>
		</body>
		<!-- 通过表单展示信息 -->
		<form action="UpdateStudentServlet">
		学号：<input type="text" name="sno" value="<%=student.getSno()%>"readonly="readonly"><br/>
		姓名：<input type="text"name="sname" value="<%=student.getSname()%>"><br/>
		年龄：<input type="text"name="sage" value="<%=student.getSage()%>"><br/>
		住址：<input type="text" name="saddress"value="<%=student.getSaddress()%>"><br/>
		<input type="submit" value="修改" >
		<a href ="QueryAllServlet">返回</a>
		<a href="add.jsp">新增</a>
		</form>
</html>