package aiss.model.resource;

import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.data.ChallengeResponse;
import org.restlet.data.ChallengeScheme;
import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import aiss.model.imgur.Gallery;
import aiss.model.imgur.ImgurImage;
import aiss.model.unsplash.AccessToken;

public class ImgurResource {

	private static final Logger log = Logger.getLogger(ImgurResource.class.getName());
	private final String baseURL = "https://api.imgur.com";
	private final String access_token;
	private final String uri = "https://www.imgur.com";
//https://api.imgur.com/3/gallery/search/{{sort}}/{{window}}/{{page}}?q=cats

	public ImgurResource(String access_token) {
		this.access_token = access_token;
	}

	/**
	 *
	 * @return Files
	 */
	public String postImage(ImgurImage post, String content) {

		ClientResource cr = null;
		ImgurImage imagen = null;
		try {
			cr = new ClientResource(uri + "?access_token=" + access_token);
			ImgurImage newPost = cr.post(post, ImgurImage.class);
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

	public Gallery getGallery(String name) {
		// /3/gallery/search/{{sort}}/{{window}}/{{page}}?q=cats

		String imageGetUrl = baseURL + "/3/gallery/search/" + name;
		ClientResource cr = new ClientResource(imageGetUrl);

		ChallengeResponse chr = new ChallengeResponse(ChallengeScheme.HTTP_OAUTH_BEARER);
		cr.setChallengeResponse(chr);

		Gallery galeria = null;
		try {
			galeria = cr.get(Gallery.class);
			return galeria;

		} catch (ResourceException re) {
			log.warning("Error when getting image from Imgur: " + cr.getResponse().getStatus());
			log.warning(imageGetUrl);
			return null;
		}

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
