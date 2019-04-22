package aiss.controller;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.reddit.Child;
import aiss.model.resource.RedditResource;

public class RedditNewPostController extends HttpServlet {

	private static final Logger log = Logger.getLogger(RedditNewPostController.class.getName());

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		String accessToken = (String) req.getSession().getAttribute("Reddit-token");
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		if (accessToken != null && !"".equals(accessToken)) {
			if (title != null && !"".equals(title)) {
				RedditResource gdResource = new RedditResource(accessToken);
				Child post = new Child();
				post.getData().setTitle(title);
				post.getData().setSelftext(content);
				post.getData().setSubreddit("u/migyanari");
				gdResource.postSubreddit(post, content);
				req.setAttribute("message", "Post '" + title + "' added to " + post.getData().getSubreddit() + "!");
				req.getRequestDispatcher("index.html").forward(req, resp);
			} else {
				req.setAttribute("message", "You must provide a valid title for file");
				req.setAttribute("content", content);
				req.getRequestDispatcher("newPost.jsp").forward(req, resp);
			}
		} else {
			log.info("Trying to access Reddit without an access token, redirecting to OAuth servlet");
			req.getRequestDispatcher("/AuthController/Reddit").forward(req, resp);
		}
	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		doGet(req, resp);
	}

}
