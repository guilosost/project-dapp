package aiss.controller;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import aiss.model.resource.UnsplashResource;
import aiss.model.unsplash.AccessToken;

public class UnsplashCreateCollectionController extends HttpServlet {

	private static final long serialVersionUID = -1237286462568353357L;
	private final Logger log = Logger.getLogger(UnsplashCreateCollectionController.class.getName());

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		String code = (String) req.getSession().getAttribute("Unsplash-token");
		String url = "https://unsplash.com/oauth/token?client_id=f2bf65c4a4fdb6a286ba98495ef14b36607d81f2305783f0ebe97f0aa28d8cf0&"
				+ "client_secret=0fc50688e19388e6f6ca71c849676e7d52fb7c4b663cb25d43cfe2487954f4a1&redirect_uri=urn:ietf:wg:oauth:2.0:oob&code="
				+ code + "&grant_type=authorization_code";
		log.log(Level.FINE, "El access viene de :" + url);

		String result = "";
		ClientResource cr = null;

		try {
			cr = new ClientResource(url);
			cr.setEntityBuffering(true);
			result = cr.post("", AccessToken.class).getAccessToken();

		} catch (ResourceException re) {
			// ToDo: print useful log information before returning
			log.warning("Error when creating an Access Token: " + cr.getResponse().getStatus());
		}
		String accessToken = result;

		// TODO
		String title = "New collection";

		if (accessToken != null && !"".equals(accessToken)) {
			if (title != null && !"".equals(title)) {
				UnsplashResource uResource = new UnsplashResource(accessToken);
				log.info("in create controller");
				uResource.POSTRequest(title);
				// NOTA: Sé que ambas opciones redirigen al mismo sitio xd
				req.setAttribute("message", "Collection created");
				req.getRequestDispatcher("/unsplashCreateCollection.jsp").forward(req, resp);
			} else {
				req.setAttribute("message", "You must provide a valid title");

				req.getRequestDispatcher("unsplashCreateCollection.jsp").forward(req, resp);
			}
		} else {
			log.info("Trying to access Unsplash without an access token, redirecting to OAuth servlet");
			req.getRequestDispatcher("/AuthController/Unsplash").forward(req, resp);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		doGet(req, resp);
	}
}
