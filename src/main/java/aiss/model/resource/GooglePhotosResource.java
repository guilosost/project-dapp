package aiss.model.resource;

import java.util.Map;
import java.util.logging.Logger;

import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import aiss.model.google.drive.FileItem;
import aiss.model.googlephotos.MediaItem;

// https://photoslibrary.googleapis.com/v1/mediaItems
public class GooglePhotosResource {
	
	private static final Logger log = Logger.getLogger(GooglePhotosResource.class.getName());

	private final String access_token;

	public GooglePhotosResource(String access_token) {
		this.access_token = access_token;
	}
	
	public String insertFile(MediaItem file, String content) {
		
		

        ClientResource cr = null;
        String newId = null;
        try {
            cr = new ClientResource(uri + "?access_token=" + access_token);
            MediaItem newFile = cr.post(file, MediaItem.class);
            newId = newFile.getId();
            cr = new ClientResource(uri_upload + "/" + newId + "?uploadType=media&access_token=" + access_token);
            Map<String, Object> headers = cr.getRequestAttributes();
            headers.put("Content-Type", "text/plain");
            cr.put(content);
        } catch (ResourceException re) {
            log.warning("Error when inserting file: " + cr.getResponse().getStatus());
        }
        return newId;
    }

}
