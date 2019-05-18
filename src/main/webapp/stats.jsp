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
<title>Stats</title>
<script>

function postAjax(url1, data1) {
		var input = document.getElementById("comentario").value;
		const coment = input;
        const URL = url1;
        const Data = {
        		message: coment		
        };
        
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
}
</script>
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
		<img src='${dailymotionStats.avatar190Url}' />
		<p>Followers: ${dailymotionStats.followersTotal}</p>
		<p>Videos: ${dailymotionStats.videosTotal}</p>
		<p>Total Views: ${dailymotionStats.viewsTotal}</p>
	</fieldset>

	<fieldset id="dailymotion">
		<legend> Dailymotion Viewest Video </legend>
		<h3>${bestVideo.title}</h3>
		<p>${dailymotionToken}</p>
		<iframe frameborder="0" width="340" height="130"
			src='http://www.dailymotion.com/embed/video/${bestVideo.id}'
			allowfullscreen allow="autoplay"></iframe>
		<input id="comentario" name="comentario" type="text" maxlength="30"
			value="" /> <br> <input type="button" id="like" name="like"
			onclick="postAjax('https://api.dailymotion.com/video/<c:out value="${bestVideo.id}"/>/comments?access_token=${dailymotionToken}', 'access_token=${dailymotionToken}')"
			value="No">
		<p>Likes: ${bestVideo.likesTotal}</p>
		<p>Views: ${bestVideo.viewsTotal}</p>
	</fieldset>

</body>
</html>