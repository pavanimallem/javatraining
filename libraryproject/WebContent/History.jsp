<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="menu.jsp"/>
<%
String user=(String)session.getAttribute("user");
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection(
	"jdbc:mysql://localhost:3307/library",
					"root","root");
String sql = " SELECT * FROM TransReturn WHERE Username = ?"; 			
PreparedStatement ps = con.prepareStatement(sql);
ps.setString(1,user);			
ResultSet rs = ps.executeQuery();
out.println("<table border='3'>");
out.println("<tr>");
out.println("<th>Book ID</th>");
out.println("<th>From Date</th>");
out.println("<th>To Date</th></tr>");
while(rs.next()){
	out.println("<tr><td>");
	out.println(rs.getString("BookID") + "</td>");
	out.println("<td>" +rs.getString("FromDate")); 
	out.println("<td>"+rs.getString("ToDate") + "</td></tr>");
}
out.println("</table>");
%>
</body>
</html>