<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'list.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link type="text/css" rel="stylesheet" href="css/style.css" />
  </head>
  <body>
   		<div>${msg}</div>
		<div class="m_right">
          <p></p>
          <form action="manage/listServlet" method="post">
          		<div  style="text-align:center;vertical-align:middle;">根据名字查询
          		<input style="height: 40px;" type="text" id="tj" name="tj"/><input style="height: 40px;" type="submit" value="搜索"></div>
            	<div style="width: 150px;font-size: 16px ;" >用户列表</div>
          <table border="0" class="order_tab" style="width:930px; text-align:center; margin-bottom:30px;" cellspacing="0" cellpadding="0"> 
            <tr>
            	<td>用户账号</td>
            	<td>用户姓名</td>
            	<td>身份证</td>
            	<td>联系电话</td>
            	<td>操作</td>
            </tr>
            <c:forEach items="${tjcxlist}" var="cate">
             <tr>
                <td>${cate.loginName}</td>
                <td>${cate.userName}</td>
                <td>${cate.identityCode}</td>
                <td>${cate.mobile}</td>
                <td><a href="manage/selectxgServlet?xgid=${cate.id}">修改</a> <a href="manage/scuserServlet?scid=${cate.id}">删除</a></td>
             </tr>
            </c:forEach>
          </table>
          </form>
  </body>
</html>
