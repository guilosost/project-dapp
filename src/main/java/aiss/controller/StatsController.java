package aiss.controller;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.dailymotion.DailymotionUserStats;
import aiss.model.dailymotion.DailymotionVideo;
import aiss.model.deviantart.DeviantArtResult;
import aiss.model.deviantart.DeviantArtUser;
import aiss.model.deviantart.SearchDeviantArt;
import aiss.model.resource.DailymotionResource;
import aiss.model.resource.DeviantArtResource;
import aiss.model.resource.YoutubeResource;
import aiss.model.youtube.GetUserVideos;
import aiss.model.youtube.GetUserVideosItem;
import aiss.model.youtube.StatisticsItem;
import aiss.model.youtube.UserStatistics;

public class StatsController extends HttpServlet {

	private static final long serialVersionUID = -2421050068295083718L;
	private static final Logger log = Logger.getLogger(StatsController.class.getName());

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String deviantArtToken = (String) req.getSession().getAttribute("DeviantArt-token");
		String dailymotionToken = (String) req.getSession().getAttribute("Dailymotion-token");
		String youtubeToken = (String) req.getSession().getAttribute("Youtube-token");
		RequestDispatcher rd = null;

		if (deviantArtToken != null && !"".equals(deviantArtToken)) {

			DeviantArtResource spResource = new DeviantArtResource(deviantArtToken);
			SearchDeviantArt deviantArtStats = spResource.getDeviantArtStats();
			DeviantArtUser deviantUser = spResource.getDeviantArtUserInfo();
			DeviantArtResult bestImage = spResource.getBestDeviantImage();

			for (DeviantArtResult r : deviantArtStats.getResults()) {

				log.log(Level.FINE, r.getStats().getFavourites().toString());
			}

			log.log(Level.FINE, deviantUser.getUser().getUsername());

			req.setAttribute("deviantArtUser", deviantUser);
			req.setAttribute("deviantArtStats", deviantArtStats.getResults());
			req.setAttribute("deviations", deviantArtStats.getResults().size());
			req.setAttribute("deviantArtBestImage", bestImage);
			req.setAttribute("deviantArtToken", deviantArtToken);

		} else {
			log.info("Trying to access DeviantArt without an access token, redirecting to OAuth servlet");
			req.getRequestDispatcher("/AuthController/DeviantArt").forward(req, resp);
		}

		if (dailymotionToken != null && !"".equals(dailymotionToken)) {

			DailymotionResource spResource = new DailymotionResource(dailymotionToken);
			DailymotionUserStats dailymotionStats = spResource.getDailymotionStats();
			DailymotionVideo dailyBestVideo = spResource.getBestOwnVideo();
			Integer totalLikes = spResource.getDailymotionTotalLikes();

			log.log(Level.FINE, "Username: " + dailymotionStats.getUsername());
			log.log(Level.FINE, "Title: " + dailyBestVideo.getTitle());

			req.setAttribute("dailymotionStats", dailymotionStats);
			req.setAttribute("bestVideo", dailyBestVideo);
			req.setAttribute("totalLikes", totalLikes);
			req.setAttribute("dailymotionToken", dailymotionToken);
		} else {
			log.info("Trying to access Dailymotion without an access token, redirecting to OAuth servlet");
			req.getRequestDispatcher("/AuthController/Dailymotion").forward(req, resp);
		}

		if (youtubeToken != null && !"".equals(youtubeToken)) {
			YoutubeResource yResource = new YoutubeResource(youtubeToken);
			//Statistics ytStats = yResource.getChannelStats();
			GetUserVideos youtubeVideos = yResource.getOwnYoutubeVideos();
			UserStatistics youtubeStatistics = yResource.getUserStatistics();
			
			List<String> stats = yResource.getStats();
			String youtubeUsername = stats.get(0);
			String youtubeSubscribers = stats.get(6);
			String youtubeLikes = stats.get(2);
			String youtubeDislikes = stats.get(3);
			String youtubeComments = stats.get(4);
			String youtubeViews = stats.get(5);
			//GetUserVideosItem youtubeMostViewed= yResource.getMostViewedVideo();

			log.log(Level.FINE, "Followers: " + youtubeSubscribers);
			
			// Sacando mejor vídeo
			Integer viewsBestVideo = 0, resultViews = 0;
			StatisticsItem youtubeMostViewed = youtubeStatistics.getItems().get(0);
			for (StatisticsItem mv : youtubeStatistics.getItems()) {
				viewsBestVideo = Integer.valueOf(mv.getStatistics().getViewCount());
				resultViews = Integer.valueOf(youtubeMostViewed.getStatistics().getViewCount());
				
				if (viewsBestVideo > resultViews) {
					youtubeMostViewed = mv;
				}
			}

			String youtubeMostViewedTitle = "";
			for (GetUserVideosItem gi : youtubeVideos.getItems()) {
				if (youtubeMostViewed.getId().equals(gi.getId().getVideoId())) {
					youtubeMostViewedTitle = gi.getSnippet().getTitle();
				}
			}
			
			//Sacando estadísticas y datos de usuario

			rd = req.getRequestDispatcher("/stats.jsp");
			req.setAttribute("youtubeUsername", youtubeUsername);
			req.setAttribute("youtubeSubscriber", youtubeSubscribers);
			req.setAttribute("youtubeNumVideos", youtubeVideos.getItems().size());
			req.setAttribute("youtubeLikes", youtubeLikes);
			req.setAttribute("youtubeDislikes", youtubeDislikes);
			req.setAttribute("youtubeComments", youtubeComments);
			req.setAttribute("youtubeViews", youtubeViews);
			req.setAttribute("youtubeMostViewed", youtubeMostViewed);
			req.setAttribute("youtubeMostViewedTitle", youtubeMostViewedTitle);
			rd.forward(req, resp);
		} else {
			log.info("Trying to access Dailymotion without an access token, redirecting to OAuth servlet");
			req.getRequestDispatcher("/AuthController/Youtube").forward(req, resp);
		}
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
