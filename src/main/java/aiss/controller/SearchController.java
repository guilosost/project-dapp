package aiss.controller;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.dailymotion.DailymotionSearch;
import aiss.model.dailymotion.List;
import aiss.model.deviantart.GetFolderByID;
import aiss.model.deviantart.SearchDeviantArt;
import aiss.model.resource.DailymotionResource;
import aiss.model.resource.DeviantArtResource;
import aiss.model.resource.YoutubeResource;
import aiss.model.youtube.YoutubeSearch;

public class SearchController extends HttpServlet {

	private static final long serialVersionUID = -5374211096463373531L;
	private static final Logger log = Logger.getLogger(SearchController.class.getName());

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String devianArtToken = (String) req.getSession().getAttribute("DeviantArt-token");
		String dailymotionToken = (String) req.getSession().getAttribute("Dailymotion-token");
		String youtubeToken = (String) req.getSession().getAttribute("Youtube-token");
		String query = req.getParameter("searchQuery");
		Integer nextDailymotionPage = Integer.valueOf(req.getParameter("nextDailymotionPage"));
		Integer nextDeviantPage = Integer.valueOf(req.getParameter("nextDeviantPage"));
		String query1 = req.getParameter("searchQuery").replace(" ", "_");
		String query2 = req.getParameter("searchQuery").replace(" ", "+");
		RequestDispatcher rd = null;

		// Search for videos in Dailymotion
		log.log(Level.FINE, "Searching for Dailymotion videos that contain " + query);
		DailymotionResource dailymotion = new DailymotionResource(dailymotionToken);
		DailymotionSearch dailymotionResults = dailymotion.getDailymotionVideos(query2, nextDailymotionPage);
		DailymotionSearch dailymotionLikedVideos = dailymotion.getLikedVideos();
		DailymotionSearch dailymotionWatchLaterVideos = dailymotion.getWatchLaterVideos();

		for (List l : dailymotionResults.getList()) {
			l.setTitle(l.getTitle().substring(0, 50));
		}

		if (dailymotionResults.getList() != null) {
			rd = req.getRequestDispatcher("/success.jsp");
			req.setAttribute("dailymotionVideos", dailymotionResults.getList());
			req.setAttribute("nextDailymotionPage", nextDailymotionPage + 1);
			req.setAttribute("dailymotionLikedVideos", dailymotionLikedVideos.getList());
			req.setAttribute("dailymotionWatchLaterVideos", dailymotionWatchLaterVideos.getList());
			req.setAttribute("dailymotionToken", dailymotionToken);
		}
//
//		// Search for videos in Youtube
//		log.log(Level.FINE, "Searching for Youtube videos that contain " + query);
//		YoutubeResource youtube = new YoutubeResource(youtubeToken);
//		YoutubeSearch youtubeResults = youtube.searchYoutubeVideos(query);
//
//		if (youtubeResults.getVideoItems() != null) {
//			rd = req.getRequestDispatcher("/success.jsp");
//			req.setAttribute("youtubeVideos", youtubeResults.getVideoItems());
//			req.setAttribute("youtubeToken", youtubeToken);
//		}

		// Search for images in DeviantArt
		log.log(Level.FINE, "Searching for DeviantArt images that contain " + query);
		log.log(Level.FINE, "Next page: " + nextDeviantPage);

		if (devianArtToken != null && !"".equals(devianArtToken)) {
			DeviantArtResource daResource = new DeviantArtResource(devianArtToken);
			SearchDeviantArt deviantArtImagesResults = daResource.getDeviantArtImages(query1, nextDeviantPage);
			GetFolderByID deviantFavFolder = daResource.getDeviantArtFavs();

			deviantArtImagesResults.getNextOffset();

			for (int i = 0; i < deviantArtImagesResults.getResults().size(); i++) {
				String title = deviantArtImagesResults.getResults().get(i).getTitle();
				if(title.length() > 28) {
					deviantArtImagesResults.getResults().get(i).setTitle(title.substring(0, 28));
				}
				
			}

			rd = req.getRequestDispatcher("/success.jsp");
			req.setAttribute("deviantArtImages", deviantArtImagesResults.getResults());
			req.setAttribute("nextDeviantPage", deviantArtImagesResults.getNextOffset());
			req.setAttribute("deviantFavFolder", deviantFavFolder.getResults());
			req.setAttribute("deviantArtToken", devianArtToken);
			rd.forward(req, resp);
		} else {
			log.info("Trying to access DeviantArt without an access token, redirecting to OAuth servlet");
			req.getRequestDispatcher("/AuthController/DeviantArt").forward(req, resp);
		}

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
