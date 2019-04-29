<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css">
<link rel="shortcut icon" type="image/png" href="favicon.png" />
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
			<h3>
				<c:out value="${deviantArtImage.title}" />
				(
				<c:out value="${deviantArtImage.publishedTime}" />
				)
			</h3>
			<img src='<c:out value="${deviantArtImage.preview.src}"/>'
				height="20%" width="20%" />
			<br>
		</c:forEach>
	</fieldset>

	<fieldset id="flickr">
		<legend>
			Flickr search for
			<c:out value="${param.searchQuery}" />
		</legend>
		<c:forEach items="${requestScope.photos.photo}" var="photo">
			<h3>
				<c:out value="${photo.title}" />
			</h3>
			<img
				src='http://farm<c:out value="${photo.farm}"/>.staticflickr.com/<c:out value="${photo.server}"/>/<c:out value="${photo.id}"/>_<c:out value="${photo.secret}"/>.jpg'
				height="20%" width="20%" />
		</c:forEach>
	</fieldset>

	<fieldset id="unsplash">
		<legend>
			Unsplash search for
			<c:out value="${param.searchQuery}" />
		</legend>
		<c:forEach items="${requestScope.unsplashPhotos}" var="unsplashImage">
			<h3>
				<c:out value="${unsplashImage.description}" />
				(
				<c:out value="${unsplashImage.user.username}" />
				)
			</h3>
			<img src='<c:out value="${unsplashImage.urls.thumb}"/>' height="20%"
				width="20%" />
			<br>
		</c:forEach>
	</fieldset>

	<fieldset id="imgur">
		<legend>
			Imgur search for
			<c:out value="${param.searchQuery}" />
		</legend>
		<c:forEach items="${requestScope.imgurImages}" var="imgurDatum">
			<c:forEach items="${imgurDatum.images}" var="imgurImages">
				<h3>
					<c:out value="${imgurDatum.title}" />
					(
					<c:out value="${imgurDatum.accountUrl}" />
					)
				</h3>
				<img src='<c:out value="${imgurImages.link}"/>' height="20%"
					width="20%" />
				<br>
			</c:forEach>
		</c:forEach>
	</fieldset>

</body>
</html>