package aiss.controller;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.deviantart.Result;
import aiss.model.deviantart.SearchDeviantArt;
import aiss.model.resource.DeviantArtResource;

public class DeviantArtStatsController extends HttpServlet {

	private static final long serialVersionUID = -2421050068295083718L;
	private static final Logger log = Logger.getLogger(DeviantArtStatsController.class.getName());

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String deviantArtToken = (String) req.getSession().getAttribute("DeviantArt-token");
		RequestDispatcher rd = null;

		if (deviantArtToken != null && !"".equals(deviantArtToken)) {

			DeviantArtResource spResource = new DeviantArtResource(deviantArtToken);
			SearchDeviantArt deviantArtStats = spResource.getDeviantArtStats();

			for (Result r : deviantArtStats.getResults()) {

				log.log(Level.FINE, r.getStats().getFavourites().toString());
			}

			rd = req.getRequestDispatcher("/stats.jsp");
			req.setAttribute("deviantArtStats", deviantArtStats.getResults());
			rd.forward(req, resp);

		} else {
			log.info("Trying to access DeviantArt without an access token, redirecting to OAuth servlet");
			req.getRequestDispatcher("/AuthController/DeviantArt").forward(req, resp);
		}

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
