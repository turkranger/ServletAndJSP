<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>UseBeanProperty</title>
</head>
<body>


	<jsp:useBean id="myperson" class="_11_UseBean.Model.Person"
		scope="request">

	</jsp:useBean>


	<jsp:getProperty property="name" name="myperson" />
	<jsp:getProperty property="surname" name="myperson" />
	<jsp:getProperty property="year" name="myperson" />

	<br />


	<jsp:useBean id="thereIsNoBean" class="_11_UseBean.Model.Person"
		scope="request">
	</jsp:useBean>


	<jsp:getProperty property="name" name="thereIsNoBean" />
	<jsp:getProperty property="surname" name="thereIsNoBean" />
	<jsp:getProperty property="year" name="thereIsNoBean" />
	
	<jsp:setProperty property="name" name="thereIsNoBean" value="new name"/>
	
	<jsp:getProperty property="name" name="thereIsNoBean" />

</body>
</html>