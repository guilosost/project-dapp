<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Project DAPP</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<link rel="stylesheet" type="text/css" href="css/button.css">
<link rel="stylesheet" type="text/css" href="css/header-footer.css">
<link rel="shortcut icon" type="image/png" href="images/favicon.png" />
</head>

<body>
	<header class="header">
		<h1 class="title-index">
			<form id="searchForm" action="SearchController" method="post">
				<img class="logo" src="images/logo-dapp-header(transparente).png">Project
				DAPP <input style="margin-left: 100px" type="text"
					name="searchQuery" required /> <input type="hidden"
					id="nextDeviantPage" name="nextDeviantPage" value="0" /> <input
					type="hidden" id="nextDailymotionPage" name="nextDailymotionPage"
					value="1" /> <input type="hidden" name="nextYoutubePage" value="" />
				<input type="submit" name="searchBtn" title="search" value="search">
			</form>
		</h1>
	</header>
	<div style="background: rgb(255, 255, 255, 0.7); border-radius: 11px;">
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
	</div>

	<footer class="footer">
		<a href="aboutus.html" class="texto">SOBRE NOSOTROS </a>
	</footer>

</body>

</html>