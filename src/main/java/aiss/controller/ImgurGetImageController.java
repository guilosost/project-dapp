package aiss.controller;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.imgur.Image;
import aiss.model.resource.ImgurResource;

public class ImgurGetImageController {
	private static final Logger log = Logger.getLogger(ImgurNewPostController.class.getName());

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		String accessToken = (String) req.getSession().getAttribute("Imgur-token");

		if (accessToken != null && !"".equals(accessToken)) {

			ImgurResource imResource = new ImgurResource(accessToken);
			Image imagen = imResource.getImage();

			if (imagen != null) {
				req.setAttribute("Image", imagen);
				req.getRequestDispatcher("/spotifyPlaylistsListing.jsp").forward(req, resp);
			} else {
				log.warning("no Image available");
				req.getRequestDispatcher("/spotifyPlaylistNew").forward(req, resp);
			}
		} else {
			log.info("Trying to access Imgur without an access token, redirecting to OAuth servlet");
			req.getRequestDispatcher("/AuthController/Imgur").forward(req, resp);
		}
	}
}
