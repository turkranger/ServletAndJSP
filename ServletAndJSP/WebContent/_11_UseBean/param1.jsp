<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Param1</title>
</head>
<body>
	<jsp:useBean id="person1" class="_11_UseBean.Model.Person">
		<!-- getParameter yontemi ile veri çekme-->
		<jsp:setProperty name="person1" property="name"
			value='<%=request.getParameter("firstName")%>' />
		<!-- param yontemi ile veri çekme-->
		<jsp:setProperty name="person1" property="surname" param="lastName" />
		<!-- param yontemi ile veri çekme gelen veri stringdir inte param yöntemi ile çevirmeye gerek yoktur-->
		<jsp:setProperty name="person1" property="year" param="yearOfBirth" />
	</jsp:useBean>

	<jsp:getProperty property="name" name="person1" />
	<jsp:getProperty property="surname" name="person1" />
	<jsp:getProperty property="year" name="person1" />
</body>
</html>