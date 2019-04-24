package aiss.controller;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.deviantart.DeviantArtResult;
import aiss.model.deviantart.SearchDeviantArt;
import aiss.model.resource.DeviantArtResource;
import aiss.model.resource.UnsplashResource;
import aiss.model.unsplash.SearchUnsplashPhotos;

public class SearchController extends HttpServlet {

	private static final Logger log = Logger.getLogger(SearchController.class.getName());

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String devianArtToken = (String) req.getSession().getAttribute("DeviantArt-token");
		String unsplashToken = (String) req.getSession().getAttribute("Unsplash-token");
		String query = req.getParameter("searchQuery").replace(" ", "_");
		RequestDispatcher rd = null;

		// Search for images in DeviantArt
		log.log(Level.FINE, "Searching for DeviantArt images that contain " + query);

		if (devianArtToken != null && !"".equals(devianArtToken)) {

			DeviantArtResource daResource = new DeviantArtResource(devianArtToken);
			SearchDeviantArt deviantArtImagesResults = daResource.getDeviantArtImages(query);

			for (DeviantArtResult r : deviantArtImagesResults.getResults()) {

				log.log(Level.FINE, r.getUrl());
			}

			rd = req.getRequestDispatcher("/success.jsp");
			req.setAttribute("deviantArtImages", deviantArtImagesResults.getResults());
			rd.forward(req, resp);
		} else {
			log.info("Trying to access DeviantArt without an access token, redirecting to OAuth servlet");
			req.getRequestDispatcher("/AuthController/DeviantArt").forward(req, resp);
		}

		// Search for images in Unsplash
		log.log(Level.FINE, "Searching for DeviantArt images that contain " + query);

		if (unsplashToken != null && !"".equals(unsplashToken)) {

			UnsplashResource uResource = new UnsplashResource(unsplashToken);
			SearchUnsplashPhotos unsplashImagesResults = uResource.getUnsplashImages(query);

			for (aiss.model.unsplash.UnsplashResult r : unsplashImagesResults.getResults()) {

				log.log(Level.FINE, r.getLinks().getPhotos());
			}

			rd = req.getRequestDispatcher("/success.jsp");
			req.setAttribute("unsplashPhotos", unsplashImagesResults.getResults());
			rd.forward(req, resp);
		} else {
			log.info("Trying to access Unsplash without an access token, redirecting to OAuth servlet");
			req.getRequestDispatcher("/AuthController/Unsplash").forward(req, resp);
		}
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
