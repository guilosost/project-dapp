<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Project DAPP</title>
<link rel="stylesheet" type="text/css" href="css/button.css">
<link rel="stylesheet" type="text/css" href="css/header-footer.css">
<link rel="shortcut icon" type="image/png"
	href="images/logo-dapp70x70(transparente).png" />
</head>

<body>
	<header class="header">
		<h1 class="title">
			<form id="searchForm" action="SearchController" method="post">
				<img class="logo" src="images/logo-dapp70x70(transparente).png">Project
				DAPP <input style="margin-left: 100px" type="text"
					name="searchQuery" required /> <input type="submit"
					name="searchBtn" title="search" value="search">
			</form>
		</h1>

		</div>
	</header>

	<p class="texto">Este proyecto va enfocado a facilitar la
		publicación de imágenes en el ámbito digital. La aplicación reúne
		cuatro aplicaciones de image hosting service que pueden usarse para
		agilizar la publicación. La idea es poder publicar en todas las
		páginas de una sola vez y obtener las estadísticas del alcance de
		estas publicaciones y la reacción que ha causado en los receptores,
		para así poder perfilar el tipo de publicaciones que se harán en el
		futuro. Los integrantes del grupo son:</p>
	<ul class="texto">
		<li>Gonzalo Álvarez García (gonalvgar@alum.us.es)</li>
		<li>Alfonso Cadenas Morales (alfcadmor@alum.us.es)</li>
		<li>Guillermo Losada Ostos (guilosost@alum.us.es)</li>
		<li>Miguel Yanes Ariza (migyanari@alum.us.es)</li>
	</ul>

	<ul id="button" class="logins">
		<li style="float: left;"><a href="/AuthController/DeviantArt">
				<button class="deviantart-button" role="link">Login
					DeviantArt</button>
		</a></li>
		<li style="float: left;"><a href="/AuthController/Dailymotion">
				<button class="dailymotion-button" role="link">Login
					Dailymotion</button>
		</a></li>
		<li style="float: left;"><a href="AuthController/Youtube">
				<button class="youtube-button" role="link">Login Youtube</button>
		</a></li>
	</ul>

	<a href="StatsController"><button class="stats-button" role="link">Estadísticas</button></a>

	<h2 class="texto">Tokens de OAuth</h2>
	<ul class="texto">
		<li><strong>Dailymotion:</strong>
			<ul>
				<li><c:out value='${sessionScope["Dailymotion-token"]}' /></li>
			</ul></li>
		<li><strong>DeviantArt:</strong>
			<ul>
				<li><c:out value='${sessionScope["DeviantArt-token"]}' /></li>
			</ul></li>
		<li><strong>Youtube:</strong>
			<ul>
				<li><c:out value='${sessionScope["Youtube-token"]}' /></li>
			</ul></li>
	</ul>

	<footer class="footer">
		<p class="texto">SOBRE NOSOTROS</p>
	</footer>

</body>

</html>