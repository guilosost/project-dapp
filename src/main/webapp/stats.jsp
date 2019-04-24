<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Stats</title>
</head>
<body>

	<fieldset id="deviantArt">
		<legend>
			DeviantArt User Stats
		</legend>
		<c:forEach items="${requestScope.deviantArtStats}" var="deviantArtStats1">
			<h3><c:out value="${deviantArtStats1.title}" /></h3>
			<p>Comentarios: <c:out value="${deviantArtStats1.stats.comments}"/></p>
			<p>Favoritos: <c:out value="${deviantArtStats1.stats.favourites}"/></p>
			<br>
		</c:forEach>
	</fieldset>

</body>
</html>