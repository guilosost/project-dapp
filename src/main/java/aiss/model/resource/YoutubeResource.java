package aiss.model.resource;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import aiss.model.unsplash.AccessToken;
import aiss.model.youtube.Item;
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

	public void likeYoutubeVideo(Item video) {
		// Creamos la URL a la que haremos POST:
		// https://www.googleapis.com/youtube/v3/videos/rate?id=KWudofo499w&rating=like&
		// access_token=ya29.GlsNB4c0aXgqJpI832sv1KT4Ag4940ZUFTWq5aJ2SzGtvK_AOLFV6ZculuLQQgSscUGu0AIhA-X2KDh3a4z2zytVbt2wQ0MX2weT27mccBBgxUTx5mo8B62EoYuW
		String url = "https://www.googleapis.com/youtube/v3/videos/rate?id=" + video.getId()
				+ "&rating=like&access_token=" + access_token;

		log.log(Level.FINE, "El access viene de :" + url);

		ClientResource cr = null;

		try {
			cr = new ClientResource(url);
			cr.setEntityBuffering(true);

		} catch (ResourceException re) {
			// ToDo: print useful log information before returning
			log.warning("Error when creating an Access Token: " + cr.getResponse().getStatus());
		}

	}

	// Creamos la URL a la que haremos POST:
	// https://www.googleapis.com/youtube/v3/videos/rate?id=KWudofo499w&rating=like&
	// access_token=ya29.GlsNB4c0aXgqJpI832sv1KT4Ag4940ZUFTWq5aJ2SzGtvK_AOLFV6ZculuLQQgSscUGu0AIhA-X2KDh3a4z2zytVbt2wQ0MX2weT27mccBBgxUTx5mo8B62EoYuW

}
