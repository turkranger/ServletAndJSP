<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <p>##### pageContext.include ##### </p>
 
 
 <p>##### pageContext.include start ##### </p>
 
 
 <%
		RequestDispatcher rd = request.getRequestDispatcher("_13_Static_DynamicInclusion/include_jsp.jsp");
		rd.include(request, response);
	%>
     
 <p>##### pageContext.include end##### </p>
 <%-- 
     
<%
		rd.forward(request, response);
	%>
	
	
	--%>

</body>
</html>