<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/style.css">
<link rel="stylesheet" type="text/css" href="css/header-footer.css">
<link rel="shortcut icon" type="image/png" href="images/favicon.png" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<title>Stats</title>
<style>
h3 {
	text-decoration: underline;
}
</style>
</head>
<body>
	<header class="header">
		<a class="title" href="index.jsp"><h1 class="title">
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
	<div class="flex">
		<fieldset style="background: rgba(24, 204, 63, 0.7); margin-top: 5px;" id="deviantArt">
			<legend>
				<img src="images/DeviantArtLogo.png" alt="logo_deviantart">
			</legend>
			<h3>
				${deviantArtUser.user.username}<img
					src='${deviantArtUser.user.usericon}' height="10%" width="10%"
					style="margin-bottom: -10px;" />
			</h3>
			<p>
				<b>Deviations:</b> ${deviations}<br> <b>Your Comments:</b>
				${deviantArtUser.stats.userComments}<br> <b>Your Favorites:</b>
				${deviantArtUser.stats.userFavourites}
			</p>
			<p>
				<b>Profile Views:</b> ${deviantArtUser.stats.profilePageviews}<br>
				<b>Profile Comments:</b> ${deviantArtUser.stats.profileComments}
			</p>

			<h3>Best Image: ${deviantArtBestImage.title}</h3>
			<img id="${deviantArtBestImage.deviationid}-i"
				src="${deviantArtBestImage.preview.src}"
				onclick="changeSize('${deviantArtBestImage.deviationid}')" />
			<p>
				<b>Comments:</b> ${deviantArtBestImage.stats.comments}<br> <b>Favorites:</b>
				${deviantArtBestImage.stats.favourites}
			</p>
		</fieldset>

		<fieldset style="background: rgba(0, 170, 255, 0.7); margin-top: 10px;"
			id="dailymotion">
			<legend>
				<img src="images/DailymotionLogo.png" alt="logo_dailymotion">
			</legend>
			<h3>${dailymotionStats.username}</h3>
			<p>
				<b>Followers:</b> ${dailymotionStats.followersTotal}<br> <b>Videos:</b>
				${dailymotionStats.videosTotal}
			</p>
			<p>
				<b>Total Views:</b> ${dailymotionStats.viewsTotal}<br> <b>Total
					Likes:</b> ${totalLikes}
			</p>
			<h3>Viewest Video: ${bestVideo.title}</h3>

			<iframe frameborder="0" width="345" height="190"
				src='http://www.dailymotion.com/embed/video/${bestVideo.id}'
				allowfullscreen allow="autoplay"></iframe>

			<p>
				<b>Views:</b> ${bestVideo.viewsTotal}<br> <b>Likes:</b>
				${bestVideo.likesTotal}
			</p>
		</fieldset>

		<fieldset style="background: rgba(255, 0, 0, 0.7); margin-top: 7px;"
			id="youtube">
			<legend>
				<img src="images/YouTubeLogo.png" alt="logo_youtube">
			</legend>
			<h3>${youtubeUsername}</h3>
			<p>
				<b>Subscribers:</b> ${youtubeSubscriber}<br> <b>Videos:</b>
				${youtubeNumVideos}
			</p>
			<p>
				<b>Total Views:</b> ${youtubeViews}<br> <b>Total Likes:</b>
				${youtubeLikes}<br> <b>Total Dislikes:</b> ${youtubeDislikes}<br>
				<b>Total Comments:</b> ${youtubeComments}
			</p>
			<h3>Viewest Video: ${youtubeMostViewedTitle}</h3>

			<iframe width="345" height="190"
				src="https://www.youtube.com/embed/<c:out value="${youtubeMostViewed.id}"/>?feature=oembed"
				frameborder="0"
				allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture"
				allowfullscreen data-rocket-lazyload="fitvidscompatible"
				data-lazy-src="https://www.youtube.com/embed/<c:out value="${youtubeMostViewed.id}"/>?feature=oembed"
				class="lazyloaded" data-was-processed="true"></iframe>

			<p>
				<b>Views:</b> ${youtubeMostViewed.statistics.viewCount}<br> <b>Likes:</b>
				${youtubeMostViewed.statistics.likeCount}<br> <b>Dislikes:</b>
				${youtubeMostViewed.statistics.dislikeCount}<br> <b>Comments:</b>
				${youtubeMostViewed.statistics.commentCount}
			</p>
		</fieldset>
	</div>

	<footer class="footer">
		<p class="texto">SOBRE NOSOTROS</p>
	</footer>
</body>
</html>