<%@ page language="java" isELIgnored="false" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  	<div>
  		<form action="<%=basePath%>user/doLogin" method="post">
  			<table style="text-align: center;" align="center" >
  				<tr>
  					<td style="font-size:20px">————&nbsp;&nbsp;&nbsp;APP开发者平台&nbsp;&nbsp;&nbsp;————</td>
  				</tr>
  				
  				<tr><td></td></tr>
  				<tr><td></td></tr>
  				<tr><td></td></tr>
  				
  				<tr>
  					<td><input type="text" name="userCode" /></td>
  				</tr>
  				
  				<tr><td></td></tr>
  				<tr><td></td></tr>
  				<tr><td></td></tr>
  				
  				<tr>
  					<td><input type="password" name="password"/></td>
  				</tr>
  				
  				<tr><td></td></tr>
  				<tr><td></td></tr>
  				<tr><td></td></tr>
  				
  				<tr>
  					<td>
  						<input type="submit" name="登录"/>
  						<input type="reset" name="重填">
  					</td>
  				</tr>
  				
  				<tr><td></td></tr>
  				<tr><td></td></tr>
  				<tr><td>${error}</td></tr>
  				
  				<tr>
  					<td>
  						@2016 All Rights Reserved
  					</td>
  				</tr>
  			</table>
  		</form>
  	</div>
  </body>
</html>
