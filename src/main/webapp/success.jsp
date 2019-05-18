<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css">
<link rel="shortcut icon" type="image/png" href="favicon.png" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<title>Success</title>
<script>

	function postAjax(url1, data1) {
		if(document.getElementById("like").value == "No") {
			var input = document.getElementById("like").value = "Sí";
	        const URL = url1;
	        const Data = {};
	        
	        const othePram= {
	        		header: {
	        			"content-type":"application/json; charset=UTF-8"
	        		},
	        		body: Data,
	        		method: "POST"
	        };
	        
	        fetch(URL,othePram)
	        .then(data=>{return data.json()})
	        .then(res=>{console.log(res)})
	        .catch(error=>console.log(error));
	        
		} else if(document.getElementById("like").value == "Sí") {
			var input = document.getElementById("like").value = "No";
	        const URL = url1;
	        const Data = {};
	        
	        const othePram= {
	        		header: {
	        			"content-type":"application/json; charset=UTF-8"
	        		},
	        		body: Data,
	        		method: "DELETE"
	        };
	        
	        fetch(URL,othePram)
	        .then(data=>{return data.json()})
	        .then(res=>{console.log(res)})
	        .catch(error=>console.log(error));
		}
	}
	
</script>
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

	<fieldset id="dailymotion">
		<legend>
			Dailymotion search for
			<c:out value="${param.searchQuery}" />
		</legend>
		<p>${dailymotionToken}</p>
		<c:forEach items="${requestScope.dailymotionVideos}"
			var="dailymotionVideo">
			<h3>
				<c:out value="${dailymotionVideo.title}" />
				(
				<c:out value="${dailymotionVideo.id}" />
				)

			</h3>
			<iframe frameborder="0" width="340" height="130"
				src='http://www.dailymotion.com/embed/video/<c:out value="${dailymotionVideo.id}"/>'
				allowfullscreen allow="autoplay"></iframe>

			<c:set var="conditionVariable" value="false" />
			<c:forEach items="${requestScope.dailymotionLikedVideos}"
				var="dailysFavoritos">
				<c:if
					test="${dailysFavoritos.id == dailymotionVideo.id  && conditionVariable == 'false'}">
					<input type="button" id="like" name="like"
						onclick="postAjax('https://api.dailymotion.com/me/likes/<c:out value="${dailymotionVideo.id}"/>?access_token=${dailymotionToken}', 'access_token=${dailymotionToken}')"
						value="Sí">
					<c:set var="conditionVariable" value="true" />
				</c:if>
				<c:if
					test="${dailysFavoritos.id != dailymotionVideo.id  && conditionVariable == 'false'}">
					<input type="button" id="like" name="like"
						onclick="postAjax('https://api.dailymotion.com/me/likes/<c:out value="${dailymotionVideo.id}"/>?access_token=${dailymotionToken}', 'access_token=${dailymotionToken}')"
						value="No">
					<c:set var="conditionVariable" value="true" />
				</c:if>
			</c:forEach>
			<br>
			<br>
		</c:forEach>
		<!-- No puedo meter en el método ${sessionScope["Dailymotion-token"]}, por eso está hecho con ${dailymotionToken}-->

	</fieldset>

</body>
</html>