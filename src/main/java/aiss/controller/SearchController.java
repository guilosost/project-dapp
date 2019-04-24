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
import aiss.model.resource.DeviantArtResource;
import aiss.model.resource.FlickrResource;

public class SearchController extends HttpServlet {

	private static final long serialVersionUID = -5374211096463373531L;
	private static final Logger log = Logger.getLogger(SearchController.class.getName());

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String devianArtToken = (String) req.getSession().getAttribute("DeviantArt-token");
		String query = req.getParameter("searchQuery").replace(" ", "_");
		RequestDispatcher rd = null;


		// Search for photos in Flickr
		log.log(Level.FINE, "Searching for Flickr photos that contain " + query);
		FlickrResource flickr = new FlickrResource();
		PhotoSearch flickrResults = flickr.getFlickrPhotos(query);
		
		if (flickrResults !=null){
			rd = req.getRequestDispatcher("/success.jsp");	
			req.setAttribute("photos", flickrResults.getPhotos());	
		}
		
		// Search for images in DeviantArt
		log.log(Level.FINE, "Searching for DeviantArt images that contain " + query);

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
