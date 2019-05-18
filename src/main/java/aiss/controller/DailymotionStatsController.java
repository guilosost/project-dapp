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
import aiss.model.resource.DailymotionResource;

public class DailymotionStatsController  extends HttpServlet {

	private static final long serialVersionUID = 540460649688202103L;
	private static final Logger log = Logger.getLogger(DailymotionStatsController.class.getName());

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String dailymotionToken = (String) req.getSession().getAttribute("Dailymotion-token");
		RequestDispatcher rd = null;

		if (dailymotionToken != null && !"".equals(dailymotionToken)) {

			DailymotionResource spResource = new DailymotionResource(dailymotionToken);
			DailymotionUserStats dailymotionStats = spResource.getDailymotionStats();

			log.log(Level.FINE, "Username: " + dailymotionStats.getUsername());
			

			rd = req.getRequestDispatcher("/stats.jsp");
			req.setAttribute("dailymotionStats", dailymotionStats);
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
