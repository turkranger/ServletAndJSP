<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<body>
	<p>include.jsp dosyamiza header.html dosyasinin icerigini ekledik.</p>

	<%@include file="header.html"%>

	<p>includeMe.jsp dosyasini ekleyelim;</p>

	<%@include file="include_jsp.jsp"%>

</body>
</html>