<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.hcl.jdbc.DaoConnection"%>
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
<form method="get" action="DeaprtmentSearch.jsp">
<center>
Department No:
<input type="text" name="deptno" /> <br/><br/>
<input type="submit" value="search" />
</center>
</form>
<%
if(request.getParameter("deptno") !=null) {
	int deptno=Integer.parseInt(request.getParameter("deptno"));
	String cmd="select * from Department Where dept=?";
	Connection con=DaoConnection.getConnection();
	PreparedStatement pst=con.prepareStatement(cmd);
	pst.setInt(1,deptno);
	ResultSet rs=pst.executeQuery();
	if(rs.next()) {
		out.println("Dname "+rs.getString("dname")+ "<br/>");
		out.println("Loc "+rs.getString("loc")+ "<br/>");
		out.println("City "+rs.getString("city")+ "<br/>");
		out.println("Head "+rs.getInt("head")+ "<br/>");
	} else {
		out.println("*** record not found ***");
	}
}
%>
</body>
</html>