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
import aiss.model.youtube.ChannelList;
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

		RequestDispatcher rd = null;

		// Search for videos in Youtube
		log.log(Level.FINE, "Searching for Youtube videos that contain " + query);
		YoutubeResource youtube = new YoutubeResource(youtubeToken);
		YoutubeSearch youtubeResults = youtube.searchYoutubeVideos(query);
		ChannelList watchLater = youtube.getWatchLaterVideos();

		if (youtubeResults.getVideoItems() != null) {
			rd = req.getRequestDispatcher("/success.jsp");
			req.setAttribute("youtubeVideos", youtubeResults.getVideoItems());
			req.setAttribute("youtubeToken", youtubeToken);
			req.setAttribute("watchLaterVideos", watchLater.getItems());
			rd.forward(req, resp);
		}
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}