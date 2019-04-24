package aiss.controller;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.resource.UnsplashResource;
import aiss.model.unsplash.AccessToken;
import aiss.model.unsplash.SearchUnsplashPhotos;
import aiss.model.unsplash.UnsplashResult;

public class SearchControllerUnsplash extends HttpServlet {

	private static final Logger log = Logger.getLogger(SearchControllerUnsplash.class.getName());
	private static final String tokenURL = "https://unsplash.com/oauth/token";

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// String unsplashCode = (String)
		// req.getSession().getAttribute("Unsplash-token");
		String unsplashCode = "6cf067d06b0f174422f76814feec4e3782e756bd41a9460a42b2d0383035fa08";
		String unsplashToken = UnsplashResource.getAccessToken(unsplashCode);

		String query = req.getParameter("searchQuery").replace(" ", "_");
		RequestDispatcher rd = null;

		// Search for images in Unsplash
		log.log(Level.FINE, "Searching for Unsplash images that contain " + query);

		if (unsplashCode != null && !"".equals(unsplashCode)) {

			UnsplashResource uResource = new UnsplashResource(unsplashCode);
			SearchUnsplashPhotos unsplashImagesResults = uResource.getUnsplashImages(query);

			for (UnsplashResult r : unsplashImagesResults.getResults()) {

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
