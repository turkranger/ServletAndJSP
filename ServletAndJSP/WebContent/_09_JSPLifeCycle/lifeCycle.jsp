<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Life Cycle</title>
</head>
<body>
	<%!public void jspInit() {
		ServletConfig config = getServletConfig();

		String email = config.getInitParameter("email");
		String parola = config.getInitParameter("parola");
		System.out.println("Email:" + email);
		System.out.println("Parola:" + parola);

	}

	public void jspDestroy() {
		System.out.println("Destroy");
	}

%>


</body>
</html>