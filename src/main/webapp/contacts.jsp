<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Book</title>
</head>
<body>
	<h1>Contact Book</h1>
	<div class="container">
		<table id="agenda" border="1">
			<tr>
				<th>Nombre</th>
				<th>Telefono</th>
			</tr>

			<c:forEach items="${resquestScope.contacts}" var="entry">
				<tr>
					<td><c:out value="${entry.value.name}" /></td>
					<td><c:out value="${entry.value.telephone}" /></td>
				</tr>
			</c:forEach>
			
		</table>
	</div>
</body>
</html>