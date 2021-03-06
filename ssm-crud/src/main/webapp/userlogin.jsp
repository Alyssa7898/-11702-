<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户登录</title>
<% pageContext.setAttribute("APP_PATH",request.getContextPath()) ;%>
<style type="text/css">

.form-horizontal{
    background-color: #fff;
    font-family: 'Arimo', sans-serif;
    text-align: center;
    padding: 50px 30px 50px;
    box-shadow: 12px 12px 0 0 rgba(0,0,0,0.3);
}
 
.form-horizontal .heading{
    color: #555;
    font-size: 30px;
    font-weight: 600;
    letter-spacing: 1px;
    text-transform: capitalize;
    margin: 0 0 50px 0;
}
 
.form-horizontal .form-group{
    margin: 0 auto 30px;
    position: relative;
}
 
.form-horizontal .form-group:nth-last-child(2){ margin-bottom: 20px; }
 
.form-horizontal .form-group:last-child{ margin: 0; }
 
.form-horizontal .form-group>i{
    color: #999;
    transform: translateY(-50%);
    position: absolute;
    left: 5px;
    top: 50%;
}
 
.form-horizontal .form-control{
    color: #7AB6B6;
    background-color: #fff;
    font-size: 17px;
    letter-spacing: 1px;
    height: 40px;
    padding: 5px 10px 2px 25px;
    box-shadow: 0 0 0 0 transparent;
    border: none;
    border-bottom: 1px solid rgba(0,0,0,0.1);
    border-radius: 0;
    display: inline-block;
}
 
.form-control::placeholder{
    color: rgba(0,0,0,0.2);
    font-size: 16px;
}
 
.form-horizontal .form-control:focus{
    border-bottom: 1px solid #7AB6B6;
    box-shadow: none;
}
 
.form-horizontal .btn{
    color: #7AB6B6;
    background-color: #EDF6F5;
    font-size: 18px;
    font-weight: 700;
    letter-spacing: 1px;
    border-radius: 5px;
    width: 50%;
    height: 45px;
    padding: 7px 30px;
    margin: 0 auto 25px;
    border: none;
    display: block;
    position: relative;
    transition: all 0.3s ease;
}
 
.form-horizontal .btn:focus,
.form-horizontal .btn:hover{
    color: #fff;
    background-color: #7AB6B6;
}
 
.form-horizontal .btn:before,
.form-horizontal .btn:after{
    content: '';
    background-color: #7AB6B6;
    height: 50%;
    width: 2px;
    position: absolute;
    left: 0;
    bottom: 0;
    z-index: 1;
    transition: all 0.3s;
}
 
.form-horizontal .btn:after{
    bottom: auto;
    top: 0;
    left: auto;
    right: 0;
}
 
.form-horizontal .btn:hover:before,
.form-horizontal .btn:hover:after{
    height: 100%;
    width: 50%;
    opacity: 0;
}
 
.form-horizontal .create_account{
    color: #D6BC8B;
    font-size: 16px;
    font-weight: 600;
    display: inline-block;
}
 
.form-horizontal .create_account:hover{
    color: #7AB6B6;
    text-decoration: none;
}
</style>
        <link href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet" type="text/css">
           <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
		<script src="${APP_PATH}/static/js/jquery-3.4.1.min.js"  type="text/javascript"></script>
		<!-- 加载 Bootstrap 的所有 JavaScript 插件。也可以根据需要只加载单个插件。 -->
		<script src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js" type="text/javascript"></script>
		

</head>

<body>

		<div class="form-bg">
    <div class="container">
        <div class="row">
            <div class="col-md-offset-4 col-md-4 col-sm-offset-3 col-sm-6">
                <form class="form-horizontal" action="${APP_PATH }/login" method="post">
                    <div class="heading">用户登录</div>
                    <div class="form-group">
                        <i class="fa fa-user"></i><input required="" name="username" type="email" class="form-control" placeholder="Username" id="exampleInputEmail1">
                    </div>
                    <div class="form-group">
                        <i class="fa fa-lock"></i><input required="" name="password" type="password" class="form-control" placeholder="Password">
                    </div>
                    <div class="form-group">
                        <button type="submit" class="btn btn-default"><i class="fa fa-arrow-right"></i></button>
                        <span>Don't have an account? <a href="/ssm-crud/src/main/webapp/WEB-INF/views/register.jsp" class="create_account">Sign up</a></span>
                    </div>
                </form>
            </div>
        </div>
    </div>
  </div>

</body>
</html>