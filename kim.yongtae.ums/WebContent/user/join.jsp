<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="kim.yongtae.ums.service.UserService" %>
<%@ page import="kim.yongtae.ums.service.UserServiceImpl" %>
<%
	String userName=request.getParameter("userName");
	if(userName != null&& !userName.equals("")){
	UserService userService = new UserServiceImpl();
	userService.join(userName);
%>
	<c:redirect url="../main.jsp?msgId=11"/>
<%
	}else{
%>
	<c:redirect url="../main.jsp?msgId=10"/>
<%
	}
%>