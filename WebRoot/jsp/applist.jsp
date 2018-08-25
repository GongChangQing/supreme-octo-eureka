<%@ page language="java" isELIgnored="false" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'applist.jsp' starting page</title>
    
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
   			<form action="">
   			<table>
   				<tr>
   					<td>软件名称</td>
   					<td><input type="text" name="appName"></td>
   					<td></td>
   					<td></td>
   					<td>APP状态</td>
   					<td>
   						<select name = "appState">
   							<option value="1" <c:if test="${appState==1}">selected="selected"</c:if> >待审核</option>
   							<option value="2" <c:if test="${appState==2}">selected="selected"</c:if> >审核通过</option>
   							<option value="3" <c:if test="${appState==3}">selected="selected"</c:if> >审核不通过</option>
   							<option value="4" <c:if test="${appState==4}">selected="selected"</c:if>>已上架</option>
   							<option value="5" <c:if test="${appState==5}">selected="selected"</c:if>>以下架</option>
   						</select>
   					</td>
   					<td></td>
   					<td></td>
   					<td>所属平台</td>
   					<td>
   						<select name = "appPt">
   							<option value="1" <c:if test="${appPt==1}">selected="selected"</c:if> >手机</option>
   							<option value="2" <c:if test="${appPt==2}">selected="selected"</c:if> >平板</option>
   						</select>
   					</td>
   				</tr>
   				
   				<tr>
   					<td>一级分类</td>
   					<td>
   						<select name = "categoryI">
   							<option value="0">请选择</option>
   							<c:forEach items="${clist}" var="c">
   								<option value="${c.id}" <c:if test="${categoryI==0}">selected="selected"</c:if> >${c.categoryName}</option>
   							</c:forEach>
   						</select>
   					</td>
   					<td></td>
   					<td></td>
   					<td>二级分类</td>
   					<td>
   						<select name = "categoryII">
   						
   						</select>
   					</td>
   					<td></td>
   					<td></td>
   					<td>三级分类</td>
   					<td>
   						<select name = "categoryIII">
   						
   						</select>
   					</td>
   				</tr>	
   			</table>
   			</form>
   		</div>
  </body>
</html>
