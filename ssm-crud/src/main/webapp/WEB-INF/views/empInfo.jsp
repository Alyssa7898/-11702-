<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
	<%
			pageContext.setAttribute("APP_PATH", request.getContextPath());
		%>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
         <link href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet" type="text/css">
         <script src="${APP_PATH}/static/js/jquery-3.4.1.min.js"></script>
		<!-- 加载 Bootstrap 的所有 JavaScript 插件。也可以根据需要只加载单个插件。 -->
		<script src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<body>
		<div class="container-fluid">
			<div class="col-md-4 col-md-offset-4"><strong>姓名:${empName}</strong></div>
			<div class="col-md-4 col-md-offset-4">性别：${gender}</div>
			<div class="col-md-4 col-md-offset-4">邮箱：${email}</div>
<%-- 			<div class="col-md-4 col-md-offset-4">部门：${employee.dept}</div> --%>
			<div>
		    <button type="button" class="btn btn-primary">修改信息</button>
		   <a href="empsign"<button type="button" class="btn btn-info" id="signbtn">签到</button>></a>
			</div>
		</div>
</body>
</html>