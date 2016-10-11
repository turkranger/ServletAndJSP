<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Map , java.util.HashMap"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%="Hello JSP Expression"%>
	<br>

	<!-- c:out JSP Expression gibi calisir, value degerini browserda gosterir. -->

	<c:out value="Hello JSTL !" />
	<br>

	<%
		request.setAttribute("name", "alper");
	%>

	<%=request.getAttribute("name")%>
	<br>

	<!-- value attribute alaninda expression language kullanabiliriz ! -->
	<c:out value="${name}" />
	<br>

	<!-- default attribute'u eger value null'sa yani ilgili attribute bean vs bulunamadiysa calisir. -->

	<c:out value="${thisIsNone}" default="AAAAA" />
	<br>

	<!-- default attribute alanini kullanmak yerine body alaninda da yazabiliriz. -->
	<c:out value="${thisIsNone}">AAAAA</c:out>
	<br>

	<!-- hem default attribute hem body alanini yazarsak bu durumda calisma zamaninda hata aliriz. -->

	<%--
	<c:out value="${thisIsNone}"  default="AAAAA" >AAAAA</c:out>
	
	 --%>

	<%="<b> </b> is bold tag"%>
	<br>

	<c:out value="<b> bold</b> is bold tag" />
	<br>

	<!--  escapeXml varsayilan olarak true dur. -->
	<c:out value="<b> </b> is bold tag" escapeXml="true" />


	<%
		Map myMap = new HashMap();
			request.setAttribute("myMapAttribute", myMap);
	%>
	<br>
	<br>
	<c:set target="${myMapAttribute}" property="key1" value="value1" />
	<c:set target="${myMapAttribute}" property="key2">value2</c:set>

	<c:out value="${myMapAttribute.key1}"></c:out>
	<c:out value="${myMapAttribute['key2']}"></c:out>

	<!-- target alani null olmamalidir ! yoksa calisma zamaninda exception firlatir. -->
	<%--
	<c:set target="${thereIsNoMap}" property="exception" value="javax.servlet.jsp.JspTagException" />
	 --%>

	<!-- cset ve cif kullanımı -->

	<c:set var="result" scope="request" value="70" />
	<br>

	<!--  C:if kullanimi:********************************************************************** -->
	<c:if test="${result > 50}">
		<p>
			You pass exam ! :
			<c:out value="${result}" />
		<p>
	</c:if>


	<c:set var="myName" scope="request" value="Levent" />

	<c:if test="${myName eq 'Levent'}">
		<p>Hello(eq) , ${myName}
		<p>
	</c:if>

	<c:set var="salary" scope="session" value="15000" />

	<!-- c:chose kullanimi when ve otherwise ile*************************************************  -->
	<p>
		Your salary is :
		<c:out value="${salary}" />
	</p>

	<c:choose>
		<c:when test="${salary <= 2000}">
       Low Salary
    </c:when>

		<c:when test="${salary < 10000}">
        Salary is very good.
    </c:when>
		<c:otherwise>
        Excellent salary!
    </c:otherwise>
	</c:choose>


	<!-- foreach kullanimi************************************************************************* -->

	<c:forEach var="x" begin="5" end="15" step="5">
		<c:out value="${x}" />
	</c:forEach>


	<%
		java.util.List<String> myList = new java.util.ArrayList<String>();
	        myList.add("element1");
	        myList.add("element2");
	        myList.add("element3");

	        request.setAttribute("myListAttribute", myList);
	%>

	<c:forEach var="element" items="${myListAttribute}">
		<br><c:out value="${element}" />
	</c:forEach>
</body>
</html>




















