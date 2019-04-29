package aiss.controller;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.deviantart.SearchDeviantArt;
import aiss.model.flickr.PhotoSearch;
import aiss.model.imgur.ImgurGallerySearch;
import aiss.model.resource.DeviantArtResource;
import aiss.model.resource.FlickrResource;
import aiss.model.resource.ImgurResource;
import aiss.model.resource.UnsplashResource;
import aiss.model.unsplash.SearchUnsplashPhotos;

public class SearchController extends HttpServlet {

	private static final long serialVersionUID = -5374211096463373531L;
	private static final Logger log = Logger.getLogger(SearchController.class.getName());

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String devianArtToken = (String) req.getSession().getAttribute("DeviantArt-token");
		String unsplashCode = (String) req.getSession().getAttribute("Unsplash-token");
		String query = req.getParameter("searchQuery").replace(" ", "_");
		String query1 = req.getParameter("searchQuery");
		RequestDispatcher rd = null;

		// Search for photos in Flickr
		log.log(Level.FINE, "Searching for Flickr photos that contain " + query1);
		FlickrResource flickr = new FlickrResource();
		PhotoSearch flickrResults = flickr.getFlickrPhotos(query);

		if (flickrResults != null) {
			rd = req.getRequestDispatcher("/success.jsp");
			req.setAttribute("photos", flickrResults.getPhotos());
		}
		
		// Search for photos in Imgur
				log.log(Level.FINE, "Searching for Flickr photos that contain " + query1);
				ImgurResource imgur = new ImgurResource("");
				ImgurGallerySearch imgurResults = imgur.getImgurGallery(query);

				if (imgurResults != null) {
					rd = req.getRequestDispatcher("/success.jsp");
					req.setAttribute("imgurImages", imgurResults.getData());
				}

		// Search for photos in Unsplash
		log.log(Level.FINE, "Searching for Unsplash photos that contain " + query1);
		
		if (unsplashCode != null && !"".equals(unsplashCode)) {
			UnsplashResource uResource = new UnsplashResource(unsplashCode);
			SearchUnsplashPhotos unsplashImagesResults = uResource.getUnsplashImages(query1);

			rd = req.getRequestDispatcher("/success.jsp");
			req.setAttribute("unsplashPhotos", unsplashImagesResults.getResults());
		} else {
			log.info("Trying to access Unsplash without an access token, redirecting to OAuth servlet");
			req.getRequestDispatcher("/AuthController/Unsplash").forward(req, resp);
		}

		// Search for images in DeviantArt
		log.log(Level.FINE, "Searching for DeviantArt images that contain " + query1);

		if (devianArtToken != null && !"".equals(devianArtToken)) {
			DeviantArtResource daResource = new DeviantArtResource(devianArtToken);
			SearchDeviantArt deviantArtImagesResults = daResource.getDeviantArtImages(query);

			rd = req.getRequestDispatcher("/success.jsp");
			req.setAttribute("deviantArtImages", deviantArtImagesResults.getResults());
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
