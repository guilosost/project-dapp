package aiss.controller;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.imgur.Image;
import aiss.model.resource.ImgurResource;

public class ImgurNewPostController extends HttpServlet {
	private static final Logger log = Logger.getLogger(ImgurNewPostController.class.getName());

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		doGet(req, resp);
	}
}
