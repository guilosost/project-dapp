package aiss.controller;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.deviantart.Result;
import aiss.model.deviantart.SearchDeviantArt;
import aiss.model.resource.DeviantArtResource;

public class DeviantArtSearchController extends HttpServlet {

	private static final long serialVersionUID = -2916510823249492029L;
	private static final Logger log = Logger.getLogger(DeviantArtSearchController.class.getName());

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String accessToken = (String) req.getSession().getAttribute("DeviantArt-token");
		String query = req.getParameter("searchQuery");

		// Search for images in DeviantArt
		log.log(Level.FINE, "Searching for DeviantArt images that contain " + query);

		if (accessToken != null && !"".equals(accessToken)) {

			DeviantArtResource spResource = new DeviantArtResource(accessToken);
			SearchDeviantArt deviantArtImagesResults = spResource.getDeviantArtImages(query);

			for(Result r : deviantArtImagesResults.getResults()) {

				log.log(Level.FINE, r.getUrl());
			}
			
			req.setAttribute("deviantArtImages", deviantArtImagesResults);
			req.getRequestDispatcher("/success.jsp").forward(req, resp);

		} else {
			log.info("Trying to access DeviantArt without an access token, redirecting to OAuth servlet");
			req.getRequestDispatcher("/AuthController/DeviantArt").forward(req, resp);
		}
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
