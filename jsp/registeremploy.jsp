<%@ taglib prefix="form" 
    uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="submitForm" modelAttribute="employee">
     First name:<form:input path="firstName" />
     <br><br>
     Last name:<form:input path="lastName" />
     <br><br>
     <input type="submit" values="Submit" />
</form:form>
</body>
</html>