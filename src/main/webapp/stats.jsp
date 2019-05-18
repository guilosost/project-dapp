<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css">
<link rel="shortcut icon" type="image/png" href="favicon.png" />
<title>Stats</title>
</head>
<body>

	<fieldset id="deviantArt">
		<legend> DeviantArt User Stats </legend>
		<c:forEach items="${requestScope.deviantArtStats}"
			var="deviantArtStats1">
			<h3>
				<c:out value="${deviantArtStats1.title}" />
			</h3>
			<p>
				Comentarios:
				<c:out value="${deviantArtStats1.stats.comments}" />
			</p>
			<p>
				Favoritos:
				<c:out value="${deviantArtStats1.stats.favourites}" />
			</p>
			<br>
		</c:forEach>
	</fieldset>

	<fieldset id="dailymotion">
		<legend> Dailymotion User Stats </legend>
		<h3>${dailymotionStats.username}</h3>
		<img src='${dailymotionStats.avatar190Url}'/>
		<p>Followers: ${dailymotionStats.followersTotal}</p>
		<p>Videos: ${dailymotionStats.videosTotal}</p>
		<p>Total Views: ${dailymotionStats.viewsTotal}</p>
	</fieldset>

</body>
</html>