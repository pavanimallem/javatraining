<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int a,b,c,d,e;
a=Integer.parseInt(request.getParameter("firstNo"));
b=Integer.parseInt(request.getParameter("secondNo"));
c=a+b;
//out.println("sum is " +c + "<br/>");
d=a-b;
out.println("sub is " +d+ "<br/>");
e=a*b;
out.println("multi is " +e+ "<br/>");
%>
sum is : <%=c %>
</body>
</html>