package aiss.model.resource;

import java.util.logging.Logger;

// https://photoslibrary.googleapis.com/v1/mediaItems
public class GooglePhotosResource {
	
	private static final Logger log = Logger.getLogger(GooglePhotosResource.class.getName());

	private final String access_token;

	public GooglePhotosResource(String access_token) {
		this.access_token = access_token;
	}

}
