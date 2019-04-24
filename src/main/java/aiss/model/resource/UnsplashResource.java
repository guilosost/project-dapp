package aiss.model.resource;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.resource.ClientResource;

import aiss.model.unsplash.Links;
import aiss.model.unsplash.SearchUnsplashPhotos;
import aiss.model.unsplash.StatsTotal;
import aiss.model.unsplash.UnsplashUser;

public class UnsplashResource {

	private static final Logger log = Logger.getLogger(UnsplashResource.class.getName());

	private final String access_token;

	public UnsplashResource(String access_token) {
		this.access_token = access_token;
	}

	public SearchUnsplashPhotos getUnsplashImages(String query) throws UnsupportedEncodingException {

		// Poner parámetro de entrada en formato correcto
		String search = URLEncoder.encode(query, "UTF-8");

		// Crear la URL
		// https://api.unsplash.com/search/photos?page=1&query=nature&per_page=5&access_token=Alph4num3r1ct0k3nv4lu3
		String uri = "https://api.unsplash.com/search/photos?page=1&query=" + search + "&per_page=5&access_token="
				+ access_token;

		log.log(Level.FINE, "Unsplash URI: " + uri);

		// Hacer petición al servicio REST (devuelve objeto JSON)
		ClientResource cr = new ClientResource(uri);

		// Convertir JSON en .Java
		SearchUnsplashPhotos unsplashSearch = cr.get(SearchUnsplashPhotos.class);

		return unsplashSearch;
	}

	public SearchUnsplashPhotos getUnsplashStats() throws UnsupportedEncodingException {

		// Crear la URL GET https://api.unsplash.com/stats/total

		String uri = "https://api.unsplash.com/stats/total?access_token=" + access_token;

		log.log(Level.FINE, "Unsplash URI: " + uri);

		// Hacer petición al servicio REST (devuelve objeto JSON)
		ClientResource cr = new ClientResource(uri);

		// Convertir JSON en .Java
		SearchUnsplashPhotos unsplashSearch = cr.get(SearchUnsplashPhotos.class);

		return unsplashSearch;
	}

	public UnsplashUser getUnsplashUserInfo() throws UnsupportedEncodingException {

		// Crear la URL GET GET https://api.unsplash.com/me

		String uri = "https://api.unsplash.com/me?access_token=" + access_token;
		log.log(Level.FINE, "Unsplash URI: " + uri);

		// Hacer petición al servicio REST (devuelve objeto JSON)
		ClientResource cr = new ClientResource(uri);

		// Convertir JSON en .Java
		UnsplashUser unsplashUserInfo = cr.get(UnsplashUser.class);

		return unsplashUserInfo;
	}
}
