<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

String u1=request.getParameter("uname");
String p1=request.getParameter("pass");
if(u1.equals("admin")&&p1.equals("admin"))
{
	RequestDispatcher rd= request.getRequestDispatcher("loginsuccess.jsp");
	rd.forward(request,response);
	//out.println("your value is ::"+u1+""+p1);
}
else
{
	RequestDispatcher rd= request.getRequestDispatcher("index.jsp");
	rd.forward(request,response);
	out.println("login is failed");
}

%>
</body>
</html>