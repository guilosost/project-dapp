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
<title>Stats</title>
<script>

function postComentarioDA(url1, token1) {
	const access_token1 = token1;
	console.log(token1 + " ::::: " + url1);
    const URL = url1 + "fave?access_token=" + access_token1;
    const Data = document.getElementById("comentario").value;
    console.log(Data);
    const othePram= {
        method: 'POST',
        //mode: "no-cors",
        headers: {
            'Content-Type': 'application/x-www-form-urlencoded'
             },
        body: Data
       };
        
        //.then(response=>console.info(response.type))// opaque
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
		<h3>
			${deviantArtUser.user.username} <img
				src='${deviantArtUser.user.usericon}' height="10%" width="10%" />
		</h3>
		<p>Deviations: ${deviations}</p>
		<p>Comentarios: ${deviantArtUser.stats.userComments}</p>
		<p>Favoritos: ${deviantArtUser.stats.userFavourites}</p>
		<p>Visitas al perfil: ${deviantArtUser.stats.profilePageviews}</p>
		<p>Comentarios en el perfil:
			${deviantArtUser.stats.profileComments}</p>

		<h3>Mejor imagen: ${deviantArtBestImage.title}</h3>
		<p>${deviantArtBestImage.deviationid}</p>
		<img src='<c:out value="${deviantArtBestImage.preview.src}"/>'
			height="40%" width="40%" />
		<p>Comentarios: ${deviantArtBestImage.stats.comments}</p>
		<p>Favoritos: ${deviantArtBestImage.stats.favourites}</p>

		<input id="comentario" name="comentario" type="text" maxlength="30"
			value="" /> <br> <input type="button" id="like" name="like"
			onclick="postComentarioDA('https://www.deviantart.com/api/v1/oauth2/comments/post/deviation/${deviantArtBestImage.deviationid}', 'access_token=${deviantArtToken}')">
		<br>
	</fieldset>

	<fieldset id="dailymotion">
		<legend> Dailymotion User Stats </legend>
		<h3>${dailymotionStats.username}</h3>
		<img src='${dailymotionStats.avatar190Url}' />
		<p>Followers: ${dailymotionStats.followersTotal}</p>
		<p>Videos: ${dailymotionStats.videosTotal}</p>
		<p>Total Views: ${dailymotionStats.viewsTotal}</p>
		<p>Total Likes: ${totalLikes}</p>
	</fieldset>

	<fieldset id="dailymotion">
		<legend> Dailymotion Viewest Video </legend>
		<h3>${bestVideo.title}</h3>
		<p>${dailymotionToken}</p>
		<iframe frameborder="0" width="340" height="130"
			src='http://www.dailymotion.com/embed/video/${bestVideo.id}'
			allowfullscreen allow="autoplay"></iframe>

		<p>Likes: ${bestVideo.likesTotal}</p>
		<p>Views: ${bestVideo.viewsTotal}</p>
	</fieldset>

</body>
</html>