<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ejercicio 4 (servlet 2 en jsp)</title>
</head>
<body>

<h1>Ejercicio 4</h1>
<p>
<strong>Nombre: </strong> <%= request.getParameter("name") %> <br>

<strong>Telefono: </strong> <%= request.getParameter("phone") %>

</p>
</body>
</html>