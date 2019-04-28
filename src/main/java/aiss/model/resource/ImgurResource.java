package aiss.model.resource;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import aiss.model.imgur.ImgurGallerySearch;
import aiss.model.unsplash.AccessToken;

public class ImgurResource {

	private static final Logger log = Logger.getLogger(ImgurResource.class.getName());
	private final String baseURL = "https://api.imgur.com/3";
	private final String access_token;
//https://api.imgur.com/3/gallery/search/{{sort}}/{{window}}/{{page}}?q=cats

	public ImgurResource(String access_token) {
		this.access_token = access_token;
	}

	/**
	 *
	 * @return Files
	 */

	public ImgurGallerySearch getImgurGallery(String name) throws UnsupportedEncodingException {
		// /3/gallery/search/{{sort}}/{{window}}/{{page}}?q=cats

		String search = URLEncoder.encode(name, "UTF-8");
		
		String imageGetUrl = baseURL + "/gallery/search/?q=" + search + "&client_id=88b9f143f2ceb36";

		log.log(Level.FINE, "Imgur URI: " + imageGetUrl);

		// Hacer petición al servicio REST (devuelve objeto JSON)
		ClientResource cr = new ClientResource(imageGetUrl);

		// Convertir JSON en .Java
		ImgurGallerySearch imgurSearch = cr.get(ImgurGallerySearch.class);

		return imgurSearch;

	}
	
public String getAccessToken() throws UnsupportedEncodingException {
		
		String url = "https://unsplash.com/oauth/token?client_id=f2bf65c4a4fdb6a286ba98495ef14b36607d81f2305783f0ebe97f0aa28d8cf0&client_secret=0fc50688e19388e6f6ca71c849676e7d52fb7c4b663cb25d43cfe2487954f4a1&redirect_uri=urn:ietf:wg:oauth:2.0:oob&code="
				+ access_token + "&grant_type=authorization_code";
		log.log(Level.FINE, "El access viene de :" + url);

		String result = "";
		ClientResource cr = null;

		try {
			cr = new ClientResource(url);
			cr.setEntityBuffering(true);
			result = cr.post("", AccessToken.class).getAccessToken();

		} catch (ResourceException re) {
			// ToDo: print useful log information before returning
			log.warning("Error when creatin a Imgur Access Token: " + cr.getResponse().getStatus());
		}
		return result;
	}

}
