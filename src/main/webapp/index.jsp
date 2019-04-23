<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Project Dapp</title>
<link rel="shortcut icon" type="image/png" href="favicon.png" />
</head>

<body>

	<h1>Project Dapp</h1>

	<p>Este proyecto va enfocado a facilitar la publicación de imágenes
		en el ámbito digital. La aplicación reúne cuatro aplicaciones de
		image hosting service que pueden usarse para agilizar la publicación. La
		idea es poder publicar en todas las páginas de una sola vez y
		obtener las estadísticas del alcance de estas publicaciones y la
		reacción que ha causado en los receptores, para así poder perfilar el
		tipo de publicaciones que se harán en el futuro. Los integrantes del
		grupo son:</p>
	<ul>
		<li>Gonzalo Álvarez García (gonalvgar@alum.us.es)</li>
		<li>Alfonso Cadenas Morales (alfcadmor@alum.us.es)</li>
		<li>Guillermo Losada Ostos (guilosost@alum.us.es)</li>
		<li>Miguel Yanes Ariza (migyanari@alum.us.es)</li>
	</ul>
	
	<a href="deviantArtSearch.jsp">Prueba Búsqueda de DeviantArt</a>
            <br>

	<h2>Tokens de OAuth</h2>
	<ul>
		<li><strong>Unslpash:</strong>
			<ul>
				<li><c:out value='${sessionScope["Unslpash-token"]}' /></li>
			</ul></li>
		<li><strong>Imgur:</strong>
			<ul>
				<li><c:out value='${sessionScope["Imgur-token"]}' /></li>
			</ul></li>
			<li><strong>DeviantArt:</strong>
			<ul>
				<li><c:out value='${sessionScope["DeviantArt-token"]}' /></li>
			</ul></li>
	</ul>

</body>

</html>