<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/style.css">
<link rel="stylesheet" type="text/css" href="css/button.css">
<link rel="stylesheet" type="text/css" href="css/header-footer.css">
<link rel="shortcut icon" type="image/png" href="images/favicon.png" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<title>Success</title>
<script>
function reload(query, deviOffset, youtubePage, dailyPage) {
	var q = document.getElementById("searchQuery").value = query;
	var o = document.getElementById("nextDeviantPage").value = deviOffset;
	var p = document.getElementById("nextYoutubePage").value = youtubePage;
	var d = document.getElementById("nextDailymotionPage").value = dailyPage;
	console.log("Query: " + q + ", offset: " + o + ", page: " + p + ", daily: " + d);
	document.getElementById("searchForm").submit();

}
</script>
</head>
<body>
	<header class="header">
		<a class="title-header" href="index.jsp"><h1 class="title">
				<form id="searchForm" action="SearchController" method="post">
					<img class="logo" src="images/logo-dapp-header(transparente).png">Project
					DAPP</a><input style="margin-left: 100px" type="text" id="searchQuery"
			name="searchQuery" required /> <input type="hidden"
			id="nextDeviantPage" name="nextDeviantPage" value="0" /> <input
			type="hidden" id="nextDailymotionPage" name="nextDailymotionPage"
			value="1" /> <input type="hidden" id="nextYoutubePage"
			name="nextYoutubePage" value="" /> <input type="submit"
			name="searchBtn" title="search" value="search"></form>
		</h1>

	</header>

	<h2>
		<img src="images/DeviantArtLogo.png" alt="logo_deviantart">
	</h2>
	<div class="resultsSearch">

		<br>
		<c:forEach items="${requestScope.deviantArtImages}"
			var="deviantArtImage">
			<div class="results" style="background: rgba(24, 204, 63, 0.7)">
				<h3 style="margin-left: 3px;">
					<c:out value="${deviantArtImage.title}" />
					<br>
					<p style="margin-top: 0; margin-bottom: -10px">
						By: <a
							href="https://www.deviantart.com/<c:out value="${deviantArtImage.author.username}" />"
							target="_blank" style="color: palevioletred;"><c:out
								value="${deviantArtImage.author.username}" /></a>
					</p>
				</h3>
				<c:set var="conditionVariable" value="no" />
				<div id="like">
					<c:forEach items="${requestScope.deviantFavFolder}"
						var="deviantsFav">
						<c:if
							test="${deviantsFav.deviationid == deviantArtImage.deviationid  && conditionVariable == 'no'}">

							<button class="deviant-rate-button" type="button"
								onclick="postFavDeviantArt('https://www.deviantart.com/api/v1/oauth2/collections/', '<c:out value="${deviantArtToken}"/>','<c:out value="${deviantArtImage.deviationid}"/>')">
								<img src="images/favorite(icon).png" alt="icono_favoritos"
									id="<c:out value="${deviantArtImage.deviationid}"/>">
							</button>

							<c:set var="conditionVariable" value="true" />
						</c:if>
					</c:forEach>
					<c:if test="${conditionVariable == 'no'}">

						<button class="deviant-rate-button" type="button"
							onclick="postFavDeviantArt('https://www.deviantart.com/api/v1/oauth2/collections/', '<c:out value="${deviantArtToken}"/>','<c:out value="${deviantArtImage.deviationid}"/>')">
							<img src="images/unfavorite(icon).png" alt="icono_favoritos"
								id="<c:out value="${deviantArtImage.deviationid}"/>">
						</button>
					</c:if>
				</div>
				<div class="image">
					<img id="${deviantArtImage.deviationid}-i" class="veinte"
						onclick="changeSize('${deviantArtImage.deviationid}')"
						src='<c:out value="${deviantArtImage.preview.src}"/>'>
				</div>
				<br>
				<div class="commentbox">
					<textarea id="${deviantArtImage.deviationid}-c"
						onclick="emptyBox(${deviantArtImage.deviationid})"
						class="fillable" name="comentario" maxlength="50"></textarea>
				</div>
				<div class="commenticon">
					<img style="border-radius: 5px;" src="images/comment.png"
						alt="icono_comentar"
						onclick="postComentarioDA('https://www.deviantart.com/api/v1/oauth2/comments/post/deviation/${deviantArtImage.deviationid}', '${deviantArtToken}', '${deviantArtImage.deviationid}')">
				</div>

				<br>
			</div>
		</c:forEach>
	</div>

	<h2>
		<img src="images/DailymotionLogo.png" alt="logo_deviantart">
	</h2>
	<div class="resultsSearch">

		<c:forEach items="${requestScope.dailymotionVideos}"
			var="dailymotionVideo">
			<div class="results" style="background: rgba(0, 170, 255, 0.7)">
				<h3 style="margin-left: 3px;">
					<c:out value="${dailymotionVideo.title}" />
				</h3>
				<div class="video">
					<iframe frameborder="0" width="99%" height="57%"
						src='https://www.dailymotion.com/embed/video/<c:out value="${dailymotionVideo.id}"/>'
						allowfullscreen allow="autoplay"></iframe>
				</div>
				<br>
				<div class="botonesDaily">
					<!-- Esto es el boton de Like -->
					<c:set var="conditionVariable" value="no" />
					<c:forEach items="${requestScope.dailymotionLikedVideos}"
						var="dailysFavoritos">
						<c:if
							test="${dailysFavoritos.id == dailymotionVideo.id  && conditionVariable == 'no'}">

							<button class="daily-button" type="button"
								onclick="postLikeDailymotion('https://api.dailymotion.com/me/likes/<c:out value="${dailymotionVideo.id}"/>?access_token=${dailymotionToken}', '<c:out value="${dailymotionVideo.id}"/>')">
								<img src="images/favorite(icon).png" alt="icono_favoritos"
									id="<c:out value="${dailymotionVideo.id}"/>">
							</button>

							<c:set var="conditionVariable" value="true" />
						</c:if>
					</c:forEach>
					<c:if test="${conditionVariable == 'no'}">

						<button class="daily-button" type="button"
							onclick="postLikeDailymotion('https://api.dailymotion.com/me/likes/<c:out value="${dailymotionVideo.id}"/>?access_token=${dailymotionToken}', '<c:out value="${dailymotionVideo.id}"/>')">
							<img src="images/unfavorite(icon).png" alt="icono_favoritos"
								id="<c:out value="${dailymotionVideo.id}"/>">
						</button>
					</c:if>

					<!-- Esto es el boton de WatchLater -->
					<c:set var="conditionVariable" value="no" />
					<c:forEach items="${requestScope.dailymotionWatchLaterVideos}"
						var="dailysWL">
						<c:if
							test="${dailysWL.id == dailymotionVideo.id  && conditionVariable == 'no'}">

							<button class="daily-button" type="button"
								onclick="postWTDailymotion('https://api.dailymotion.com/me/watchlater/<c:out value="${dailymotionVideo.id}"/>?access_token=${dailymotionToken}', '<c:out value="${dailymotionVideo.id}"/>')">
								<img src="images/watchlater(icon).png" alt="icono_watchlater"
									id="<c:out value="${dailymotionVideo.id}"/>-wt">
							</button>

							<c:set var="conditionVariable" value="true" />
						</c:if>
					</c:forEach>
					<c:if test="${conditionVariable == 'no'}">

						<button class="daily-button" type="button"
							onclick="postWTDailymotion('https://api.dailymotion.com/me/watchlater/<c:out value="${dailymotionVideo.id}"/>?access_token=${dailymotionToken}', '<c:out value="${dailymotionVideo.id}"/>')">
							<img src="images/unwatchlater(icon).png" alt="icono_watchlater"
								id="<c:out value="${dailymotionVideo.id}"/>-wt">
						</button>
					</c:if>
				</div>
			</div>
		</c:forEach>
		<!-- No puedo meter en el metodo ${sessionScope["Dailymotion-token"]}, por eso esta hecho con ${dailymotionToken}-->

	</div>

	<h2>
		<img src="images/YouTubeLogo.png" alt="logo_youtube">
	</h2>
	<div class="resultsSearch">
		<c:forEach items="${requestScope.youtubeVideos}" var="youtubeVideo">
			<div class="results" style="background: rgba(255, 0, 0, 0.7)">
				<h3>
					<p><c:out value="${youtubeVideo.videoSnippet.title}" /></p>
				</h3>
				<br>
				<div class="botonesYT">
					<!-- Esto es el boton de Like -->
					<c:set var="conditionVariable" value="no" />
					<c:forEach items="${requestScope.youtubeLikedVideos}"
						var="youtubeLikedVideo">
						<c:if
							test="${youtubeLikedVideo.id == youtubeVideo.id.videoId  && conditionVariable == 'no'}">

							<button class="rate-button" type="button"
								onclick="postRateYoutube('https://www.googleapis.com/youtube/v3/videos/rate', '<c:out value="${youtubeVideo.id.videoId}"/>','like', '<c:out value="${youtubeToken}"/>')">
								<img src="images/favorite(icon).png" alt="icono_like"
									id="<c:out value="${youtubeVideo.id.videoId}"/>-like">
							</button>

							<c:set var="conditionVariable" value="true" />
						</c:if>
					</c:forEach>
					<c:if test="${conditionVariable == 'no'}">
						<button class="rate-button" type="button"
							onclick="postRateYoutube('https://www.googleapis.com/youtube/v3/videos/rate', '<c:out value="${youtubeVideo.id.videoId}"/>','like', '<c:out value="${youtubeToken}"/>')">
							<img src="images/unfavorite(icon).png" alt="icono_like"
								id="<c:out value="${youtubeVideo.id.videoId}"/>-like">
						</button>
					</c:if>
					<!-- Esto es el boton de Dislike -->
					<c:set var="conditionVariable" value="no" />
					<c:forEach items="${requestScope.youtubeDislikedVideos}"
						var="youtubeDislikedVideo">
						<c:if
							test="${youtubeDislikedVideo.id == youtubeVideo.id.videoId  && conditionVariable == 'no'}">

							<button class="rate-button" type="button"
								onclick="postRateYoutube('https://www.googleapis.com/youtube/v3/videos/rate', '<c:out value="${youtubeVideo.id.videoId}"/>','dislike', '<c:out value="${youtubeToken}"/>')">
								<img src="images/disfavorite(icon).png" alt="icono_dislike"
									id="<c:out value="${youtubeVideo.id.videoId}"/>-dislike">
							</button>

							<c:set var="conditionVariable" value="true" />
						</c:if>
					</c:forEach>
					<c:if test="${conditionVariable == 'no'}">
						<button class="rate-button" type="button"
							onclick="postRateYoutube('https://www.googleapis.com/youtube/v3/videos/rate', '<c:out value="${youtubeVideo.id.videoId}"/>','dislike', '<c:out value="${youtubeToken}"/>')">
							<img src="images/disunfavorite(icon).png" alt="icono_dislike"
								id="<c:out value="${youtubeVideo.id.videoId}"/>-dislike">
						</button>
					</c:if>
				</div>
				<div class="video"
					style="margin-right: 4px; margin-bottom: 2px; margin-top: -16px;">
					<iframe
						width="300" height="160"
						src="https://www.youtube.com/embed/<c:out value="${youtubeVideo.id.videoId}"/>?feature=oembed"
						frameborder="0"
						allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture"
						allowfullscreen data-rocket-lazyload="fitvidscompatible"
						data-lazy-src="https://www.youtube.com/embed/<c:out value="${youtubeVideo.id.videoId}"/>?feature=oembed"
						class="lazyloaded" data-was-processed="true"></iframe>
					
				</div>
				<br>
				<div class="commentbox">
					<textarea id="${youtubeVideo.id.videoId}-c"
						onclick="emptyBox(${youtubeVideo.id.videoId})" class="fillable"
						name="comentario" maxlength="50"></textarea>
				</div>
				<div class="commenticon">
					<img style="border-radius: 5px;" src="images/comment.png"
						alt="icono_comentar"
						onclick="postCommentYoutube('https://www.googleapis.com/youtube/v3/commentThreads?part=snippet&access_token=${youtubeToken}', '${youtubeVideo.id.videoId}', '${youtubeVideo.videoSnippet.channelId}')">
				</div>
				<br>
			</div>
		</c:forEach>
	</div>
	<br><br><br>
	<footer class="footer">
	<div style=" margin-right: 5px; display: flex; float: right;">
	<img src="images/next(icon).png" onclick="reload('${param.searchQuery}', '${requestScope.nextDeviantPage}', '${requestScope.nextYoutubePage}', '${requestScope.nextDailymotionPage}')"></div>
	<a href="aboutus.html" class="texto">SOBRE NOSOTROS </a>
	</footer>
</body>

<script>
function emptyBox(id) {
	console.log("Me activo");
	if(document.getElementById(videoId + "-c").value == "¡Comentario publicado con éxito!") {
		document.getElementById(videoId + "-c").value = "";	
	}
}

function postCommentYoutube(url1, videoId, channelId) {
	const chan = channelId;
	const vid = videoId;
	const text = document.getElementById(videoId + "-c").value;
	document.getElementById(videoId + "-c").value = "¡Comentario publicado con éxito!";
	console.log("Channel" + channelId + " ::::: " + "Video " + videoId);
	console.log(url1);
	const URL = url1;
	
	(async () => {
		  const rawResponse = await fetch(URL, {
		    method: 'POST',
		    headers: {
		      'Accept': 'application/json',
		      'Content-Type': 'application/json'
		    },
		    body: JSON.stringify({snippet: {channelId: chan, videoId: vid, topLevelComment: {snippet: {textOriginal: texto}}}})
		  });
		  const content = await rawResponse.json();

		  console.log(content);
		})();
}

function postRateYoutube(url, videoId, rating, token) {
	const access_token = token;
	console.log(videoId + ", " + token + " ::::: " + url + "like");
	console.log(videoId + "-like, -------" + rating);
	console.log(document.getElementById(videoId+"-like").src);
	if(rating=="like") {
		console.log("Entrando");
		if(document.getElementById(videoId+"-like").src == "http://localhost:8090/images/unfavorite(icon).png" ||
		document.getElementById(videoId+"-like").src == "https://project-dapp.appspot.com/images/unfavorite(icon).png") {
			console.log("Entrando x100");
			var image = document.getElementById(videoId+"-dislike").src = "images/disunfavorite(icon).png";
			var image = document.getElementById(videoId+"-like").src = "images/favorite(icon).png";
			const URLRate = url + "?id=" + videoId + "&rating=" + rating + "&access_token=" + token;
			console.log(URLRate);
			const Data = {};
			
			const othePram= {
		    		header: {
		    			"content-type":"application/json; charset=UTF-8"
		    		},
		    		body: Data,
		    		method: "POST"
		    		
		    };
		    
		    fetch(URLRate,othePram)
		    .then(response=>console.info(response.type))
		    .catch(error=>console.log(error));
	} else if(document.getElementById(videoId+"-like").src == "http://localhost:8090/images/favorite(icon).png" ||
			document.getElementById(videoId+"-like").src == "https://project-dapp.appspot.com/images/favorite(icon).png") {
		var image = document.getElementById(videoId+"-like").src = "images/unfavorite(icon).png";
		const URLRate = url + "?id=" + videoId + "&rating=none&access_token=" + token;
		console.log(URLRate);
		const Data = {};
		
		const othePram= {
	    		header: {
	    			"content-type":"application/json; charset=UTF-8"
	    		},
	    		body: Data,
	    		method: "POST"
	    		
	    };
	    
	    fetch(URLRate,othePram)
	    .then(response=>console.info(response.type))
	    .catch(error=>console.log(error));
		}
	} else if(rating=="dislike") {
		if(document.getElementById(videoId+"-dislike").src == "http://localhost:8090/images/disunfavorite(icon).png" ||
		document.getElementById(videoId+"-dislike").src == "https://project-dapp.appspot.com/images/disunfavorite(icon).png") {
			var image = document.getElementById(videoId+"-like").src = "images/unfavorite(icon).png";
			var image = document.getElementById(videoId+"-dislike").src = "images/disfavorite(icon).png";
			const URLRate = url + "?id=" + videoId + "&rating=" + rating + "&access_token=" + token;
			console.log(URLRate);
			const Data = {};
			
			const othePram= {
		    		header: {
		    			"content-type":"application/json; charset=UTF-8"
		    		},
		    		body: Data,
		    		method: "POST"
		    		
		    };
		    
		    fetch(URLRate,othePram)
		    .then(response=>console.info(response.type))
		    .catch(error=>console.log(error));
	} else if(document.getElementById(videoId+"-dislike").src == "http://localhost:8090/images/disfavorite(icon)(icon).png" ||
			document.getElementById(videoId+"-dislike").src == "https://project-dapp.appspot.com/images/disfavorite(icon)(icon).png") {
		var image = document.getElementById(videoId+"-dislike").src = "images/disunfavorite(icon).png";
		const URLRate = url + "?id=" + videoId + "&rating=none&access_token=" + token;
		console.log(URLRate);
		const Data = {};
		
		const othePram= {
	    		header: {
	    			"content-type":"application/json; charset=UTF-8"
	    		},
	    		body: Data,
	    		method: "POST"
	    		
	    };
	    
	    fetch(URLRate,othePram)
	    .then(response=>console.info(response.type))
	    .catch(error=>console.log(error));
		}
	}
}

function postFavDeviantArt(url1, token1, deviid) {
	//var proxyUrl = 'https://cors-anywhere.herokuapp.com/';
	const access_token1 = token1;
	const id = deviid;
	console.log(deviid + ", " + token1 + " ::::: " + url1 + "fave");
	if(document.getElementById(id).src == "http://localhost:8090/images/unfavorite(icon).png" ||
			document.getElementById(id).src == "https://project-dapp.appspot.com/images/unfavorite(icon).png") {
		var image = document.getElementById(id).src = "images/favorite(icon).png";
        const URL = url1 + "fave?access_token=" + access_token1;
        const Data = "deviationid=" + id;
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
        
	} else if(document.getElementById(id).src == "http://localhost:8090/images/favorite(icon).png" ||
			document.getElementById(id).src == "https://project-dapp.appspot.com/images/favorite(icon).png") {
		var image = document.getElementById(id).src = "images/unfavorite(icon).png";
        const URL = url1 + "unfave?access_token=" + access_token1;
        const Data = "deviationid=" + id;
        
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
}

function postComentarioDA(url1, token1, id1) {
	const access_token1 = token1;
	const devid = id1;
	console.log(token1 + " ::::: " + url1);
    const URL = url1 + "?access_token=" + access_token1;
    const Data = "body=" + document.getElementById(devid + "-c").value;
    document.getElementById(devid + "-c").value = "¡Comentario publicado con éxito!";
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
	/* if(image.style.width != "99%") {
    image.style.width = '99%';/* 
    image.style.margin-bottom = '5px';
    image.style.margin-top = '5px';
    image.style.border-radius = '4px'; 
	} else if(image.style.width != "20%") {
	image.style.width = '20%';/* 
    image.style.margin-bottom = 'none';
    image.style.margin-top = 'none';
    image.style.border-radius = 'none';
	} */
	
	if(image.classList.contains("veinte")) {
		image.classList.remove("veinte");
		image.classList.add("cien");
	} else if(image.classList.contains("cien")) {
		image.classList.remove("cien");
		image.classList.add("veinte");
	}

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