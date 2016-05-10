<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pretraga</title>
</head>
<body>
	<form action="/MusicMax/SearchServlet" method="get">
		Pretraga: <input type="text" name="pretraga">
		Kriterijum pretrage: 
		<select name="kriterijum">
			<option value="naziv">Naziv</option>
			<option value="izvodjac">Izvodjac</option>
			<option value="album">Album</option>
			<option value="godina">Godina</option>
			<option value="zanr">Zanr</option>
		</select>
	<input type="submit" value="Search"> 
	<c:if test="${empty kompozicija}">
		${poruka}
	</c:if>
	<table>
	<c:if test="${!empty kompozicije}">
		<thead><td>Naziv</td><td>Izvodjac</td><td>Autor</td><td>Album</td><td>Godina</td><td>Pravac</td></thead>	
		<c:forEach var="kompozicija" items="${kompozicije}">
			<tr>
				<td>${kompozicija.naziv}</td>
				<td>${kompozicija.izvodjac}</td>
				<td>${kompozicija.autor}</td>
				<td>${kompozicija.album}</td>
				<td>${kompozicija.godina}</td>
				<td>${kompozicija.pravac}</td>
			</tr>
		</c:forEach>
	</c:if>
	</table>
</form>
</body>
</html>