<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success</title>
</head>
<body>

	<fieldset id="deviantArt">
		<legend>
			DeviantArt search for
			<c:out value="${param.searchQuery}" />
		</legend>
		<c:forEach items="${requestScope.deviantArtImages}"
			var="deviantArtImage">
			<h3><c:out value="${deviantArtImage.title}" /> (<c:out value="${deviantArtImage.publishedTime}" />)</h3>
			<img src='<c:out value="${deviantArtImage.preview.src}"/>'  height="10%" width="10%" />
			<br>
		</c:forEach>
	</fieldset>
	
	<fieldset id="unsplash">
		<legend>
			Unsplash search for
			<c:out value="${param.searchQuery}" />
		</legend>
		<c:forEach items="${requestScope.unsplashPhotos}"
			var="deviantArtImage">
			<h3><c:out value="${unsplashImage.title}" /> (<c:out value="${unsplashImage.publishedTime}" />)</h3>
			<img src='<c:out value="${unsplashImage.preview.src}"/>'  height="10%" width="10%" />
			<br>
		</c:forEach>
	</fieldset>

</body>
</html>