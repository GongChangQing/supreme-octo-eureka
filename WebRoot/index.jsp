<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
		a{
			text-decoration: none;
			color: black;
		}
	</style>
  </head>
  
  <body>
    	<div>
    		<table align="center">
    			<tr>
    				<td style="font-size: 50px">APP信息管理平台</td>
    			</tr>
    			
    			<tr><td><td></tr>
    			
    			<tr><td><td></tr>
    			
    			<tr>
    				<td>&nbsp;&nbsp;&nbsp;&nbsp;<a href="javascript:;">后台管理系统入口</a></td>
    			</tr>
    			
    			<tr><td><td></tr>
    			
    			<tr><td><td></tr>
    			
    			<tr>
    				<td>&nbsp;&nbsp;&nbsp;&nbsp;<a href="javascript:;">开发者平台入口</a></td>
    			</tr>
    		</table>
    	</div>
  </body>
  <script type="text/javascript" src="<%=basePath%>/js/jquery-1.10.2.min.js"></script>
  <script type="text/javascript">
  	$(function(){
  		$("a").mouseover(function(){
  			$(this).css("color","blue");
  		}).mouseout(function(){
  			$(this).css("color","black");
  		})
  	})
  </script>
</html>
