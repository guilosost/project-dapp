package aiss.model.resource;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.resource.ClientResource;

import aiss.model.dailymotion.DailymotionSearch;
import aiss.model.dailymotion.DailymotionUserStats;

public class DailymotionResource {

	private static final Logger log = Logger.getLogger(DailymotionResource.class.getName());

	private final String access_token;

	public DailymotionResource(String access_token) {
		this.access_token = access_token;
	}

	public DailymotionSearch getDailymotionVideos(String query) throws UnsupportedEncodingException {
		// Poner parámetro de entrada en formato correcto
		String search = URLEncoder.encode(query, "UTF-8");

		// Crear la URL https://api.dailymotion.com/videos?search=star+wars&limit=10
		String uri = "https://api.dailymotion.com/videos?search=" + search + "&limit=10&sort=random";

		log.log(Level.FINE, "Dailymotion URI: " + uri);

		// Hacer petición al servicio REST (devuelve objeto JSON)
		ClientResource cr = new ClientResource(uri);

		// Convertir JSON en .Java
		DailymotionSearch dailymotionSearch = cr.get(DailymotionSearch.class);

		return dailymotionSearch;
	}

	public DailymotionUserStats getDailymotionStats() throws UnsupportedEncodingException {

		// Crear la URL GET https://api.dailymotion.com/user/me?fields=avatar_190_url,
		// country,description,followers_total,following_total,status,username,videos_total,views_total&
		// access_token = access_token

		String uri = "https://api.dailymotion.com/user/me?fields=avatar_190_url,country,description,followers_total,following_total,username,videos_total,views_total&access_token="
				+ access_token;

		log.log(Level.FINE, "DailymotionUserStats URI: " + uri);

		// Hacer petición al servicio REST (devuelve objeto JSON)
		ClientResource cr = new ClientResource(uri);

		// Convertir JSON en .Java
		DailymotionUserStats dailymotionStats = cr.get(DailymotionUserStats.class);

		return dailymotionStats;
	}
}
