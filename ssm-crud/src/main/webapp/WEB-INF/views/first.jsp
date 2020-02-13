<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>employees list</title>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<!-- web路径：
	不以/开始的相对路径，找资源，以当前资源的路径为基准，经常容易出问题
	以/开始的开始的相对路径，找资源，以服务器为标准（http//localhost/端口号)需要加项目名;
	就是http//localhost/端口号/crud/...
	${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css
  -->
<!-- Bootstrap -->
<script src="${APP_PATH}/static/js/jquery-3.4.1.min.js"  type="text/javascript"></script>
<link
	href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
	<link
	href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/calendar.css"
	rel="stylesheet">
	<script
	src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"
	type="text/javascript"></script>
	<script
	src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/calendar.js"
	type="text/javascript"></script>
	<style type="text/css">
	 	html,body{

    width: 100%;

    height: 100%;

}

.mui-content{

    background: url(002.jpg) bottom center no-repeat #efeff4 ;

    background-size: 100% 100%;

    width: 100%;

    height: 100%;

}
	</style>
</head>
<body>
       
		<div class="jumbotron">
			<div class="container">
  			<h1>欢迎使用</h1>
  			<p>这是一个本司授权的员工签到系统，请按照公司规定进行考勤</p>
 		    <p><a class="btn btn-primary btn-lg" href="${APP_PATH}/toempInfo" role="button">去签到</a></p>
  			</div>
	  </div>
	 
</body>
</html>