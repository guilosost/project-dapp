<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/style.css">
<link rel="shortcut icon" type="image/png" href="images/favicon.png" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<title>Success</title>
<script>

	function postAjax(url1, elm) {
		if(document.getElementById(elm).value == "No") {
			var input = document.getElementById(elm).value == "S�";
			var image = document.getElementById(elm).src = "images/favorite(icon).png";
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
	        
		} else if(document.getElementById(elm).value == "S�") {
			var input = document.getElementById(elm).value == "No";
			var image = document.getElementById(elm).src = "images/unfavorite(icon).png";
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
					
					<button type="button"
						onclick="postAjax('https://api.dailymotion.com/me/likes/<c:out value="${dailymotionVideo.id}"/>?access_token=${dailymotionToken}', 'id=<c:out value="${dailymotionVideo.id}"/>')">
						<img src="images/favorite(icon).png" alt="icono_favoritos"
							id="<c:out value="${dailymotionVideo.id}"/>">
					</button>
					
					<input type="hidden" id="<c:out value="${dailymotionVideo.id}"/>" name="<c:out value="${dailymotionVideo.id}"/>" value="S�">
					<c:set var="conditionVariable" value="true" />
				</c:if>
				<c:if
					test="${dailysFavoritos.id != dailymotionVideo.id  && conditionVariable == 'false'}">

					<button type="button"
						onclick="postAjax('https://api.dailymotion.com/me/likes/<c:out value="${dailymotionVideo.id}"/>?access_token=${dailymotionToken}', 'id=<c:out value="${dailymotionVideo.id}"/>')">
						<img src="images/unfavorite(icon).png" alt="icono_favoritos"
							id="<c:out value="${dailymotionVideo.id}"/>">
					</button>
					
					<input type="hidden" id="<c:out value="${dailymotionVideo.id}"/>" name="<c:out value="${dailymotionVideo.id}"/>" value="No">
					<c:set var="conditionVariable" value="true" />
				</c:if>
			</c:forEach>
			<br>
			<br>
		</c:forEach>
		<!-- No puedo meter en el m�todo ${sessionScope["Dailymotion-token"]}, por eso est� hecho con ${dailymotionToken}-->

	</fieldset>

</body>
</html>