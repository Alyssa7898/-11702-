<%@page import="org.hh.entity.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>学生信息列表</title>
</head>
<body>
<%
		String error=(String)request.getAttribute("errer");
		if(error!=null){
			out.print("增加失败");
      }else{
    	  out.print("增加失败");
      }
%>
       	<table border="1">
      		 <tr>
      			 <th>学号</th>
        		 <th>姓名</th>
                 <th>年龄</th>
                 
                  <th>操作</th>
       </tr>
       <%//获取request中的数据
   	    response.setContentType("text/html; charset=UTF-8");
        response.setCharacterEncoding("utf-8");
        List<Student>students=(List<Student>)request.getAttribute("students");
     
       for(Student student:students){
    	%>
    		<tr>
    			<td><a href="QueryStudentBySnoServlet?sno=<%=student.getSno()%>"><%=student.getSno()%></a></td>
    			<td><%=student.getSname() %></td>
    			<td><%=student.getSage() %></td>
    			<td><a href="DeleteStudnentServlet?sno=<%=student.getSno()%>">删除</a>
    			<a href="add.jsp">新增</a></td>
    		
    		</tr>
    	   
      <%  }
       %>
       </table>
</body>
</html>