package aiss.controller;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.resource.YoutubeResource;
import aiss.model.youtube.VideoItem;
import aiss.model.youtube.ChannelStats;
import aiss.model.youtube.YoutubeRatedVideoGet;
import aiss.model.youtube.YoutubeSearch;

public class YoutubeSearchController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8969468412050701247L;
	private static final Logger log = Logger.getLogger(SearchController.class.getName());

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String youtubeToken = (String) req.getSession().getAttribute("Youtube-token");
		String query = req.getParameter("searchQuery");
		String nextYoutubePage = req.getParameter("nextYoutubePage");

		RequestDispatcher rd = null;

		// Search for videos in Youtube
		log.log(Level.FINE, "Searching for Youtube videos that contain " + query);
		YoutubeResource youtube = new YoutubeResource(youtubeToken);
		YoutubeSearch youtubeResults = youtube.searchYoutubeVideos(query, nextYoutubePage);
		YoutubeRatedVideoGet likedVideos = youtube.getLikedVideos();
		YoutubeRatedVideoGet dislikedVideos = youtube.getDislikedVideos();

		for (VideoItem v : youtubeResults.getVideoItems()) {
			if (v.getVideoSnippet().getTitle().length() > 40)
				v.getVideoSnippet().setTitle(v.getVideoSnippet().getTitle().substring(0, 40));
		}
//		ChannelList watchLater = youtube.getWatchLaterVideos();

		log.log(Level.FINE, "Next page " + youtubeResults.getNextPageToken());
		log.log(Level.FINE, "Actual page " + nextYoutubePage);

		if (youtubeResults.getVideoItems() != null) {
			rd = req.getRequestDispatcher("/success.jsp");
			req.setAttribute("youtubeVideos", youtubeResults.getVideoItems());
			req.setAttribute("nextYoutubePage", youtubeResults.getNextPageToken());
			req.setAttribute("youtubeLikedVideos", likedVideos.getItems());
			req.setAttribute("youtubeDislikedVideos", dislikedVideos.getItems());
			req.setAttribute("youtubeToken", youtubeToken);
//			req.setAttribute("watchLaterVideos", watchLater.getItems());
			rd.forward(req, resp);
		}
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}