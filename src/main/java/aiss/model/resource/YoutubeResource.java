package aiss.model.resource;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import aiss.model.unsplash.AccessToken;
import aiss.model.youtube.VideoItem;
import aiss.model.youtube.YoutubeSearch;

public class YoutubeResource {

	private static final Logger log = Logger.getLogger(YoutubeResource.class.getName());
	private final String access_token;

	public YoutubeResource(String access_token) {
		this.access_token = access_token;
	}

	public YoutubeSearch searchYoutubeVideos(String query) throws UnsupportedEncodingException {
		// Poner parámetro de entrada en formato correcto
		String search = URLEncoder.encode(query, "UTF-8");

		// Crear la URL
		// https://www.googleapis.com/youtube/v3/search?part=snippet&q=dogs&maxresult=10
		String uri = "https://www.googleapis.com/youtube/v3/search?part=snippet&q=" + search
				+ "&maxresult=10&access_token=" + access_token;

		log.log(Level.FINE, "Youtube URI: " + uri);

		// Hacer petición al servicio REST (devuelve objeto JSON)
		ClientResource cr = new ClientResource(uri);

		// Convertir JSON en .Java
		YoutubeSearch youtubeSearch = cr.get(YoutubeSearch.class);

		return youtubeSearch;
	}

}
