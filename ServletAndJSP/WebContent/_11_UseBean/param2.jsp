<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<!-- Html name isimleri ile Person propertyleri aynı isimde olursa getParameter
	veya Param methoduna gerek yok
	 -->
	<jsp:useBean id="person1" class="_11_UseBean.Model.Person">
		<jsp:setProperty name="person1" property="name" />
		<jsp:setProperty name="person1" property="surname" />
		<jsp:setProperty name="person1" property="year" />
	</jsp:useBean>
	
	<%-- Bu yontem de kullanilabilir 
		<jsp:useBean id="person2" class="_11_UseBean.Model.Person">
		<jsp:setProperty name="person1" property="*" />
	</jsp:useBean>
	
	--%>

	<jsp:getProperty property="name" name="person1" />
	<jsp:getProperty property="surname" name="person1" />
	<jsp:getProperty property="year" name="person1" />
</body>
</html>