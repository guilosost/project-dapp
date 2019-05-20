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

function postComentarioDA(url1, token1, id1) {
	const access_token1 = token1;
	const devid = id1;
	console.log(token1 + " ::::: " + url1);
    const URL = url1 + "?access_token=" + access_token1;
    const Data = "body=" + document.getElementById(devid).value;
    document.getElementById(devid).value = "Comentario publicado!";
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

function changeSize(id) {
	console.log("Cambiando tamaño de " + id);
	var image = document.getElementById(id+"-i");
	console.log(image);
	if(image.style.width != "100%") {
    image.style.width = '100%';
	} else if(image.style.width != "20%") {
	image.style.width = '20%';
	}
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
		<img id="${deviantArtBestImage.deviationid}-i"
			src="${deviantArtBestImage.preview.src}" class="veinte"
			onclick="changeSize('${deviantArtBestImage.deviationid}')"
			height="40%" width="40%" />
		<p>Comentarios: ${deviantArtBestImage.stats.comments}</p>
		<p>Favoritos: ${deviantArtBestImage.stats.favourites}</p>

		<textarea id="${deviantArtBestImage.deviationid}" class="fillable"
			name="comentario" maxlength="50"></textarea>
		<img src="images/comment.png" alt="icono_comentar"
			onclick="postComentarioDA('https://www.deviantart.com/api/v1/oauth2/comments/post/deviation/${deviantArtBestImage.deviationid}', '${deviantArtToken}', '${deviantArtBestImage.deviationid}')">
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