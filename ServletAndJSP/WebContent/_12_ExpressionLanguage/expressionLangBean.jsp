<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ExpressionLanguage</title>
</head>
<body>

	${myemployee.empId}
	<br> ${myemployee["empId"]} ${myemployee.name}



	<%-- bean yoksa , property'i olsa da olmasa da hata vermez!. Ekrana bir sey yazmaz !--%>
	${thereIsNoBean.thereIsNoProperty }

	${myemployee.department.departmentName }
	${myemployee.department.departmentId }
</body>
</html>