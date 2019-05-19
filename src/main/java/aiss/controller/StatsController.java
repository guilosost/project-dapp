package aiss.controller;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.dailymotion.DailymotionUserStats;
import aiss.model.dailymotion.List;
import aiss.model.deviantart.DeviantArtResult;
import aiss.model.deviantart.DeviantArtUser;
import aiss.model.deviantart.SearchDeviantArt;
import aiss.model.resource.DailymotionResource;
import aiss.model.resource.DeviantArtResource;

public class StatsController extends HttpServlet {

	private static final long serialVersionUID = -2421050068295083718L;
	private static final Logger log = Logger.getLogger(StatsController.class.getName());

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String deviantArtToken = (String) req.getSession().getAttribute("DeviantArt-token");
		String dailymotionToken = (String) req.getSession().getAttribute("Dailymotion-token");
		RequestDispatcher rd = null;

		if (deviantArtToken != null && !"".equals(deviantArtToken)) {

			DeviantArtResource spResource = new DeviantArtResource(deviantArtToken);
			SearchDeviantArt deviantArtStats = spResource.getDeviantArtStats();
			DeviantArtUser deviantUser = spResource.getDeviantArtUserInfo();
			DeviantArtResult bestImage = spResource.getBestDeviantImage();

			for (DeviantArtResult r : deviantArtStats.getResults()) {

				log.log(Level.FINE, r.getStats().getFavourites().toString());
			}
			
			log.log(Level.FINE, deviantUser.getUser().getUsername());

//			rd = req.getRequestDispatcher("/stats.jsp");
			req.setAttribute("deviantArtUser", deviantUser);
			req.setAttribute("deviantArtStats", deviantArtStats.getResults());
			req.setAttribute("deviations", deviantArtStats.getResults().size());
			req.setAttribute("deviantArtBestImage", bestImage);
			req.setAttribute("deviantArtToken", deviantArtToken);
//			rd.forward(req, resp);

		} else {
			log.info("Trying to access DeviantArt without an access token, redirecting to OAuth servlet");
			req.getRequestDispatcher("/AuthController/DeviantArt").forward(req, resp);
		}

		if (dailymotionToken != null && !"".equals(dailymotionToken)) {

			DailymotionResource spResource = new DailymotionResource(dailymotionToken);
			DailymotionUserStats dailymotionStats = spResource.getDailymotionStats();
			List dailyBestVideo = spResource.getBestOwnVideo();
			Integer totalLikes = spResource.getDailymotionTotalLikes();

			log.log(Level.FINE, "Username: " + dailymotionStats.getUsername());
			log.log(Level.FINE, "Title: " + dailyBestVideo.getTitle());

			rd = req.getRequestDispatcher("/stats.jsp");
			req.setAttribute("dailymotionStats", dailymotionStats);
			req.setAttribute("bestVideo", dailyBestVideo);
			req.setAttribute("totalLikes", totalLikes);
			req.setAttribute("dailymotionToken", dailymotionToken);
			rd.forward(req, resp);

		} else {
			log.info("Trying to access Dailymotion without an access token, redirecting to OAuth servlet");
			req.getRequestDispatcher("/AuthController/Dailymotion").forward(req, resp);
		}
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
