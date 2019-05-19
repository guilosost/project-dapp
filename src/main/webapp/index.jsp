<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Project Dapp</title>
<link rel="stylesheet" type="text/css" href="css/button.css">
<link rel="shortcut icon" type="image/png" href="images/favicon.png" />
</head>

<body>

	<h1>Project Dapp</h1>

	<p>Este proyecto va enfocado a facilitar la publicación de imágenes
		en el ámbito digital. La aplicación reúne cuatro aplicaciones de image
		hosting service que pueden usarse para agilizar la publicación. La
		idea es poder publicar en todas las páginas de una sola vez y obtener
		las estadísticas del alcance de estas publicaciones y la reacción que
		ha causado en los receptores, para así poder perfilar el tipo de
		publicaciones que se harán en el futuro. Los integrantes del grupo
		son:</p>
	<ul>
		<li>Gonzalo Álvarez García (gonalvgar@alum.us.es)</li>
		<li>Alfonso Cadenas Morales (alfcadmor@alum.us.es)</li>
		<li>Guillermo Losada Ostos (guilosost@alum.us.es)</li>
		<li>Miguel Yanes Ariza (migyanari@alum.us.es)</li>
	</ul>


	<div id="searchDiv">
		<form id="searchForm" action="SearchController" method="post">
			<input type="text" name="searchQuery" required /> <input
				type="submit" name="searchBtn" title="search" value="search">
		</form>
	</div>
	
	<a href="StatsController">Prueba Stats</a>
	<br>
	<a href="DailymotionStatsController">Prueba Stats de Dailymotion</a>
	<br>
	<a href="youtubeSearch.jsp">Prueba búsqueda Youtube</a>
	<br>
	<a href="/AuthController/DeviantArt">
	<button class="deviantart-button" role="link">Login DevianArt</button></a>
	<br>
	<a href="/AuthController/Dailymotion">
	<button class="unsplash-button" role="link">Login Dailymotion</button></a>
	<br>
	<a href="AuthController/Youtube">
	<button class="unsplash-button" role="link">Login Youtube</button></a>

	<h2>Tokens de OAuth</h2>
	<ul>
		<li><strong>Unsplash:</strong>
			<ul>
				<li><c:out value='${sessionScope["Unsplash-token"]}' /></li>
			</ul></li>
		<li><strong>Dailymotion:</strong>
			<ul>
				<li><c:out value='${sessionScope["Dailymotion-token"]}' /></li>
			</ul></li>
		<li><strong>DeviantArt:</strong>
			<ul>
				<li><c:out value='${sessionScope["DeviantArt-token"]}' /></li>
			</ul></li>
		<li><strong>GooglePhotos:</strong>
			<ul>
				<li><c:out value='${sessionScope["GooglePhotos-token"]}' /></li>
			</ul></li>
		<li><strong>Youtube:</strong>
			<ul>
				<li><c:out value='${sessionScope["Youtube-token"]}' /></li>
			</ul></li>
	</ul>

</body>

</html>