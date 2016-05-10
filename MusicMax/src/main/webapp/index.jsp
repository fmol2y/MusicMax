<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Music Max - Home page</title>
</head>
<body>
	<h2>Welcome to Music Max!</h2>
	<div id="navigationRow">
		<a href="">Login</a>
		<a href="">Register</a>
		<a href="/MusicMax/search.jsp">Search</a>
		<a href="/MusicMax/newcomposition.jsp">Upload nove kompozicije</a>
		<a href="/MusicMax/unoszanimljivosti.jsp">Unos nove zanimljivosti</a>
	</div><br>
	<div id="zanimljivosti">
		<form action="/MusicMax/HomePageServlet" method="get">
			<c:forEach var="z" items="${zanimljivosti}">
				${z.tekst}<br>
			</c:forEach>
		</form>
	</div>
</body>
</html>
