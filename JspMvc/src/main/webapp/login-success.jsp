<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.xyz.LoginBean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>LoginSucess!!</h1>
<%
   LoginBean bean=(LoginBean)request.getAttribute("bean");
   out.println("LoginSucess!!"+bean.getName());
%>
</body>
</html>