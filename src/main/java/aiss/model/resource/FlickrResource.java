package aiss.model.resource;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.resource.ClientResource;

import aiss.model.flickr.PhotoSearch;

public class FlickrResource {

	private static final String FLICKR_API_KEY = "98b2b372131ee37183807313f843eef4"; // TODO: Change this API KEY for
																						// your personal Key
	private static final Logger log = Logger.getLogger(FlickrResource.class.getName());

	public PhotoSearch getFlickrPhotos(String artist) throws UnsupportedEncodingException {

		// Poner parámetro de entrada en formato correcto
		String title = URLEncoder.encode(artist, "UTF-8");

		// Crear la URL
		String uri = "https://api.flickr.com/services/rest/?method=flickr.photos.search&" + "api_key=" + FLICKR_API_KEY
				+ "&tags=" + title
				+ "&per_page=5&format=json&nojsoncallback=1";

		log.log(Level.FINE, "Flickr URI: " + uri);

		// Hacer petición al servicio REST (devuelve objeto JSON)
		ClientResource cr = new ClientResource(uri);

		// Convertir JSON en .Java
		PhotoSearch photoSearch = cr.get(PhotoSearch.class);

		return photoSearch;
	}

}
