package aiss.model.resource;

import java.util.Map;
import java.util.logging.Logger;

import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import aiss.model.reddit.Child;
import aiss.model.reddit.Data_;
import aiss.model.twitter.Tweet;

public class TwitterResource {
	private static final Logger log = Logger.getLogger(TwitterResource.class.getName());

	private final String access_token;
	private final String uri = "https://www.twitter.com";

	public TwitterResource(String access_token) {
		this.access_token = access_token;
	}

	/**
	 *
	 * @return Files
	 */
	public String postTweet(Tweet post, String text) {

		ClientResource cr = null;
		Tweet datos = null;
		try {
			cr = new ClientResource(uri + "?access_token=" + access_token);
			Tweet newPost = cr.post(post, Tweet.class);
			datos = newPost;
			// https://www.reddit.com/api/submit?
			// access_token=qMPo05YQ-pRrEA&sr=u/migyanari&api_type=json&title=pppp&text=pro.json&kind=t3
			cr = new ClientResource(uri + "/api/submit?access_token=" + access_token + "&kind=t3&api_type=json&sr="
					+ newPost.getCreatedAt() + "&title=" + newPost.getIdStr() + "&text=" + newPost.getText());
			Map<String, Object> headers = cr.getRequestAttributes();
			headers.put("Content-Type", "text/plain");
			cr.put(text);
		} catch (ResourceException re) {
			log.warning("Error when inserting file: " + cr.getResponse().getStatus());
		}
		return datos.getText();
	}

}
