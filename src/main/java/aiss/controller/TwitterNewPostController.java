package aiss.controller;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.resource.TwitterResource;
import aiss.model.twitter.Tweet;
import aiss.model.twitter.User;

public class TwitterNewPostController extends HttpServlet {

	private static final Logger log = Logger.getLogger(TwitterNewPostController.class.getName());

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		String accessToken = (String) req.getSession().getAttribute("Twitter-token");
		String createdAt = req.getParameter("created_at");
		String idStr = req.getParameter("id_str");
		String text = req.getParameter("text");

		if (accessToken != null && !"".equals(accessToken)) {
			if (createdAt != null && !"".equals(createdAt)) {
				if (text != null && !"".equals(text) && text.length() < 240) {
					TwitterResource gdResource = new TwitterResource(accessToken);
					Tweet post = new Tweet();
					post.setCreatedAt(createdAt);
					post.setIdStr(idStr);
					post.setText(text);
					gdResource.postTweet(post, text);
					req.setAttribute("message", "Post '" + text + "' added to " + post.getUser() + "page!");
					req.getRequestDispatcher("index.jsp").forward(req, resp);
				} else {
					req.setAttribute("message", "Text must contain more than 0 characters and less than 240");
					req.setAttribute("content", text);
					req.getRequestDispatcher("newPost.jsp").forward(req, resp);
				}
			} else {
				req.setAttribute("message", "You must provide a valid date for tweet");
				req.setAttribute("content", text);
				req.getRequestDispatcher("newPost.jsp").forward(req, resp);
			}
		} else {
			log.info("Trying to access Twitter without an access token, redirecting to OAuth servlet");
			req.getRequestDispatcher("/AuthController/Twitter").forward(req, resp);
		}

	}


	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		doGet(req, resp);
	}

}


