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

function postCommentYoutube(url1, token1, channelId, text, videoId) {
	const access_token = token1;
	const chanid=channelId;
	const vidid=videoId;
	console.log(chanid + ", " + token1 + "::::: " + url1 + "comment");
	
}

function postFavDeviantArt(url1, token1, deviid) {
	//var proxyUrl = 'https://cors-anywhere.herokuapp.com/';
	const access_token1 = token1;
	const id = deviid;
	console.log(deviid + ", " + token1 + " ::::: " + url1 + "fave");
	if(document.getElementById(id).src == "http://localhost:8090/images/unfavorite(icon).png" ||
			document.getElementById(id).src == "https://project-dapp.appspot.com/images/unfavorite(icon).png") {
		var image = document.getElementById(id).src = "images/favorite(icon).png";
        const URL = url1 + "fave";
        const Data = {
        		
        		deviationid: id,
        		access_token: access_token1
        		
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
        
	} else if(document.getElementById(id).src == "http://localhost:8090/images/favorite(icon).png" ||
			document.getElementById(id).src == "https://project-dapp.appspot.com/images/favorite(icon).png") {
		var image = document.getElementById(id).src = "images/unfavorite(icon).png";
        const URL = url1 + "unfave";
        const Data = {
        		
        		deviationid: id,
        		access_token: access_token1
        		
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
				<c:out value="${deviantArtImage.author.username}" />
				)
			</h3>
			<img src='<c:out value="${deviantArtImage.preview.src}"/>'
				height="20%" width="20%" />

			<c:set var="conditionVariable" value="no" />
			<c:forEach items="${requestScope.deviantFavFolder}" var="deviantsFav">
				<c:if
					test="${deviantsFav.deviationid == deviantArtImage.deviationid  && conditionVariable == 'no'}">

					<button type="button"
						onclick="postFavDeviantArt('https://www.deviantart.com/api/v1/oauth2/collections/', '<c:out value="${deviantArtToken}"/>','<c:out value="${deviantArtImage.deviationid}"/>')">
						<img src="images/favorite(icon).png" alt="icono_favoritos"
							id="<c:out value="${deviantArtImage.deviationid}"/>">
					</button>

					<c:set var="conditionVariable" value="true" />
				</c:if>
			</c:forEach>
			<c:if test="${conditionVariable == 'no'}">

				<button type="button"
					onclick="postFavDeviantArt('https://www.deviantart.com/api/v1/oauth2/collections/', '<c:out value="${deviantArtToken}"/>','<c:out value="${deviantArtImage.deviationid}"/>')">
					<img src="images/unfavorite(icon).png" alt="icono_favoritos"
						id="<c:out value="${deviantArtImage.deviationid}"/>">
				</button>
			</c:if>
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

			<!-- Esto es el botón de Like -->
			<c:set var="conditionVariable" value="no" />
			<c:forEach items="${requestScope.dailymotionLikedVideos}"
				var="dailysFavoritos">
				<c:if
					test="${dailysFavoritos.id == dailymotionVideo.id  && conditionVariable == 'no'}">

					<button type="button"
						onclick="postLikeDailymotion('https://api.dailymotion.com/me/likes/<c:out value="${dailymotionVideo.id}"/>?access_token=${dailymotionToken}', '<c:out value="${dailymotionVideo.id}"/>')">
						<img src="images/favorite(icon).png" alt="icono_favoritos"
							id="<c:out value="${dailymotionVideo.id}"/>">
					</button>

					<c:set var="conditionVariable" value="true" />
				</c:if>
			</c:forEach>
			<c:if test="${conditionVariable == 'no'}">

				<button type="button"
					onclick="postLikeDailymotion('https://api.dailymotion.com/me/likes/<c:out value="${dailymotionVideo.id}"/>?access_token=${dailymotionToken}', '<c:out value="${dailymotionVideo.id}"/>')">
					<img src="images/unfavorite(icon).png" alt="icono_favoritos"
						id="<c:out value="${dailymotionVideo.id}"/>">
				</button>
			</c:if>

			<!-- Esto es el botón de WatchLater -->
			<c:set var="conditionVariable" value="no" />
			<c:forEach items="${requestScope.dailymotionWatchLaterVideos}"
				var="dailysWL">
				<c:if
					test="${dailysWL.id == dailymotionVideo.id  && conditionVariable == 'no'}">

					<button type="button"
						onclick="postWTDailymotion('https://api.dailymotion.com/me/watchlater/<c:out value="${dailymotionVideo.id}"/>?access_token=${dailymotionToken}', '<c:out value="${dailymotionVideo.id}"/>')">
						<img src="images/watchlater(icon).png" alt="icono_watchlater"
							id="<c:out value="${dailymotionVideo.id}"/>-wt">
					</button>

					<c:set var="conditionVariable" value="true" />
				</c:if>
			</c:forEach>
			<c:if test="${conditionVariable == 'no'}">

				<button type="button"
					onclick="postWTDailymotion('https://api.dailymotion.com/me/watchlater/<c:out value="${dailymotionVideo.id}"/>?access_token=${dailymotionToken}', '<c:out value="${dailymotionVideo.id}"/>')">
					<img src="images/unwatchlater(icon).png" alt="icono_watchlater"
						id="<c:out value="${dailymotionVideo.id}"/>-wt">
				</button>
			</c:if>
			<br>
			<br>
		</c:forEach>
		<!-- No puedo meter en el método ${sessionScope["Dailymotion-token"]}, por eso está hecho con ${dailymotionToken}-->

	</fieldset>

	<fieldset id="youtube">
		<legend>
			Youtube search for
			<c:out value="${param.searchQuery}" />
		</legend>
		<p>${youtubeToken}</p>
		<c:forEach items="${requestScope.youtubeVideos}" var="youtubeVideo">
			<h3>
				<c:out value="${youtubeVideo.snippet.title}" />
				(
				<c:out value="${youtubeVideo.id.videoId}" />
				)

			</h3>
			<iframe frameborder="0" scrolling="no" marginheight="0"
				marginwidth="0" width="340" height="130"
				src='https://www.youtube.com/embed/<c:out value="${youtubeVideo.id.videoId}"/>?autoplay=0&fs=0&iv_load_policy=3&showinfo=0&rel=0&cc_load_policy=0&start=0&end=0&origin=https://youtubeembedcode.com"'
				allowfullscreen allow="autoplay"></iframe>
			<br>
			<br>
		</c:forEach>

	</fieldset>
</body>

<script>
function postCommentYoutube(url1, token1, channelId, text, videoId) {
	const access_token = token1;
	console.log(chanid + ", " + token1 + "::::: " + url1 + "comment");
	const URL = url1 + "?part=id&access_token=" + token1;
	const Data = {
			{
				  "snippet": {
				    "channelId": channelId,
				    "topLevelComment": {
				      "snippet": {
				        "textOriginal": text,
				        "videoId": videoId
				      }
				    }
				  }
				}
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


	function postLikeDailymotion(url1, elm) {
		const id = elm;
		const emu = document.getElementById(id).src;
		console.log(emu);
		if(document.getElementById(id).src == "http://localhost:8090/images/unfavorite(icon).png" ||
				document.getElementById(id).src == "https://project-dapp.appspot.com/images/unfavorite(icon).png") {
			var image = document.getElementById(id).src = "images/favorite(icon).png";
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
	        
		} else if(document.getElementById(id).src == "http://localhost:8090/images/favorite(icon).png" ||
				document.getElementById(id).src == "https://project-dapp.appspot.com/images/favorite(icon).png") {
			var image = document.getElementById(id).src = "images/unfavorite(icon).png";
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
	
	function postWTDailymotion(url1, elm) {
		const id = elm;
		const emu = document.getElementById(id + "-wt").src;
		console.log(emu);
		if(document.getElementById(id + "-wt").src == "http://localhost:8090/images/unwatchlater(icon).png" ||
				document.getElementById(id + "-wt").src == "https://project-dapp.appspot.com/images/unwatchlater(icon).png") {
			var image = document.getElementById(id + "-wt").src = "images/watchlater(icon).png";
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
	        
		} else if(document.getElementById(id + "-wt").src == "http://localhost:8090/images/watchlater(icon).png" ||
				document.getElementById(id + "-wt").src == "https://project-dapp.appspot.com/images/watchlater(icon).png") {
			var image = document.getElementById(id + "-wt").src = "images/unwatchlater(icon).png";
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
</html>