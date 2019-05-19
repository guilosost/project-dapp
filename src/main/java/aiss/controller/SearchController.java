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
import aiss.model.deviantart.GetFolderByID;
import aiss.model.deviantart.SearchDeviantArt;
import aiss.model.flickr.PhotoSearch;
import aiss.model.imgur.ImgurGallerySearch;
import aiss.model.resource.DailymotionResource;
import aiss.model.resource.DeviantArtResource;
import aiss.model.resource.FlickrResource;
import aiss.model.resource.ImgurResource;
import aiss.model.resource.UnsplashResource;
import aiss.model.resource.YoutubeResource;
import aiss.model.unsplash.SearchUnsplashPhotos;
import aiss.model.youtube.YoutubeSearch;

public class SearchController extends HttpServlet {

	private static final long serialVersionUID = -5374211096463373531L;
	private static final Logger log = Logger.getLogger(SearchController.class.getName());

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String devianArtToken = (String) req.getSession().getAttribute("DeviantArt-token");
//		String unsplashCode = (String) req.getSession().getAttribute("Unsplash-token");
		String dailymotionToken = (String) req.getSession().getAttribute("Dailymotion-token");
		String youtubeToken = (String) req.getSession().getAttribute("Youtube-token");
		String query = req.getParameter("searchQuery").replace(" ", "_");
		String query2 = req.getParameter("searchQuery").replace(" ", "+");
		String query1 = req.getParameter("searchQuery");
		RequestDispatcher rd = null;

//		// Search for photos in Flickr
//		log.log(Level.FINE, "Searching for Flickr photos that contain " + query1);
//		FlickrResource flickr = new FlickrResource();
//		PhotoSearch flickrResults = flickr.getFlickrPhotos(query);
//
//		if (flickrResults != null) {
//			rd = req.getRequestDispatcher("/success.jsp");
//			req.setAttribute("photos", flickrResults.getPhotos());
//		}

		// Search for videos in Dailymotion
		log.log(Level.FINE, "Searching for Dailymotion videos that contain " + query1);
		DailymotionResource dailymotion = new DailymotionResource(dailymotionToken);
		DailymotionSearch dailymotionResults = dailymotion.getDailymotionVideos(query2);
		DailymotionSearch dailymotionLikedVideos = dailymotion.getLikedVideos();
		DailymotionSearch dailymotionWatchLaterVideos = dailymotion.getWatchLaterVideos();

		if (dailymotionResults.getList() != null) {
			rd = req.getRequestDispatcher("/success.jsp");
			req.setAttribute("dailymotionVideos", dailymotionResults.getList());
			req.setAttribute("dailymotionLikedVideos", dailymotionLikedVideos.getList());
			req.setAttribute("dailymotionWatchLaterVideos", dailymotionWatchLaterVideos.getList());
			req.setAttribute("dailymotionToken", dailymotionToken);
		}

		// Search for videos in Youtube
		log.log(Level.FINE, "Searching for Youtube videos that contain " + query);
		YoutubeResource youtube = new YoutubeResource(youtubeToken);
		YoutubeSearch youtubeResults = youtube.searchYoutubeVideos(query);

		if (youtubeResults.getVideoItems() != null) {
			rd = req.getRequestDispatcher("/success.jsp");
			req.setAttribute("youtubeVideos", youtubeResults.getVideoItems());
			req.setAttribute("youtubeToken", youtubeToken);
		}

		// Search for images in DeviantArt
		log.log(Level.FINE, "Searching for DeviantArt images that contain " + query1);

		if (devianArtToken != null && !"".equals(devianArtToken)) {
			DeviantArtResource daResource = new DeviantArtResource(devianArtToken);
			SearchDeviantArt deviantArtImagesResults = daResource.getDeviantArtImages(query);
			GetFolderByID deviantFavFolder = daResource.getDeviantArtFavs();

			rd = req.getRequestDispatcher("/success.jsp");
			req.setAttribute("deviantArtImages", deviantArtImagesResults.getResults());
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
