package aiss.model.resource;

import java.util.Map;
import java.util.logging.Logger;

import org.restlet.data.ChallengeResponse;
import org.restlet.data.ChallengeScheme;
import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import aiss.model.imgur.Image;

public class ImgurResource {

	private static final Logger log = Logger.getLogger(ImgurResource.class.getName());
	private final String baseURL = "https://api.imgur.com";
	private final String access_token;
	private final String uri = "https://www.imgur.com";

	public ImgurResource(String access_token) {
		this.access_token = access_token;
	}

	/**
	 *
	 * @return Files
	 */
	public String postImage(Image post, String content) {

		ClientResource cr = null;
		Image imagen = null;
		try {
			cr = new ClientResource(uri + "?access_token=" + access_token);
			Image newPost = cr.post(post, Image.class);
			imagen = newPost;
			// https://www.reddit.com/api/submit?
			// access_token=qMPo05YQ-pRrEA&sr=u/migyanari&api_type=json&title=pppp&text=pro.json&kind=t3
			cr = new ClientResource(uri + "/api/submit?access_token=" + access_token + "&kind=t3&api_type=json&sr="
					+ imagen.getName() + "&title=");
			Map<String, Object> headers = cr.getRequestAttributes();
			headers.put("Content-Type", "text/plain");
			cr.put(content);
		} catch (ResourceException re) {
			log.warning("Error when inserting file: " + cr.getResponse().getStatus());
		}
		return imagen.getName();
	}

	public Image getImage() {

		String imageGetUrl = baseURL + "/3/image/";
		ClientResource cr = new ClientResource(imageGetUrl);

		ChallengeResponse chr = new ChallengeResponse(ChallengeScheme.HTTP_OAUTH_BEARER);
		chr.setRawValue(access_token);
		cr.setChallengeResponse(chr);

		Image imagen = null;
		try {
			imagen = cr.get(Image.class);
			return imagen;

		} catch (ResourceException re) {
			log.warning("Error when retrieving Spotify playlists: " + cr.getResponse().getStatus());
			log.warning(imageGetUrl);
			return null;
		}

	}

}
