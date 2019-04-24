package aiss.controller;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.imgur.ImgurImage;
import aiss.model.resource.ImgurResource;

public class ImgurGetImageController extends HttpServlet {
	private static final Logger log = Logger.getLogger(ImgurNewPostController.class.getName());

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		String accessToken = (String) req.getSession().getAttribute("Imgur-token");
		String query = req.getParameter("searchQuery").replace(" ", "_");
		RequestDispatcher rd = null;
//Search for images in Imgur
		log.log(Level.FINE, "Searching images in Imgur that contains" + query);
		if (accessToken != null && !"".equals(accessToken)) {
			ImgurResource imResource = new ImgurResource(accessToken);
			ImgurImage imagen = imResource.getImage(query);
			log.log(Level.FINE, imagen.getId());

			rd = req.getRequestDispatcher("/success.jsp");
			req.setAttribute("ImgurImage", imagen);
			rd.forward(req, resp);
		} else

		{
			log.info("Trying to access Imgur without an access token, redirecting to OAuth servlet");
			req.getRequestDispatcher("/AuthController/Imgur").forward(req, resp);
		}
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
