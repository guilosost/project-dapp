package aiss.controller;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.flickr.PhotoSearch;
import aiss.model.imgur.AccessToken;
import aiss.model.resource.FlickrResource;
import aiss.model.resource.UnsplashResource;
import aiss.model.unsplash.SearchUnsplashPhotos;
import aiss.utility.OAuthRegistry;

public class ImgurToken extends HttpServlet {

	private static final long serialVersionUID = 7451437395783754236L;
	private static final Logger log = Logger.getLogger(SearchController.class.getName());

	protected void doGet(HttpServletRequest req, HttpServletResponse resp, AccessToken credential) throws ServletException, IOException {


		req.getSession().setAttribute("Imgur-token", credential.getAccessToken());
	}
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			doGet(req, resp);
		}
}
