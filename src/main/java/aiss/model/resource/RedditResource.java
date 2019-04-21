package aiss.model.resource;

import java.util.Map;
import java.util.logging.Logger;

import org.restlet.data.ChallengeResponse;
import org.restlet.data.ChallengeScheme;
import org.restlet.data.MediaType;
import org.restlet.representation.StringRepresentation;
import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import aiss.model.reddit.Child;
import aiss.model.reddit.Data_;

public class RedditResource {
	private static final Logger log = Logger.getLogger(RedditResource.class.getName());

	private final String access_token;
	private final String uri = "https://www.reddit.com";

	public RedditResource(String access_token) {
		this.access_token = access_token;
	}

	/**
	 *
	 * @return Files
	 */
	public String postSubreddit(Child post, String content) {

		ClientResource cr = null;
		Data_ datos = null;
		try {
			cr = new ClientResource(uri + "?access_token=" + access_token);
			Child newPost = cr.post(post, Child.class);
			datos = newPost.getData();
			// https://www.reddit.com/api/submit?
			// access_token=qMPo05YQ-pRrEA&sr=u/migyanari&api_type=json&title=pppp&text=pro.json&kind=t3
			cr = new ClientResource(
					uri + "/api/submit?access_token=" + access_token + "&kind=t3&api_type=json&sr="
					+ datos.getSubreddit() + "&title=" + datos.getTitle() + "&text=" + datos.getSelftext());
			Map<String, Object> headers = cr.getRequestAttributes();
			headers.put("Content-Type", "text/plain");
			cr.put(content);
		} catch (ResourceException re) {
			log.warning("Error when inserting file: " + cr.getResponse().getStatus());
		}
		return datos.getSelftext();
	}


}
