
package aiss.model.youtube;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "snippet" })
public class YoutubeComment {

	@JsonProperty("snippet")
	private CommentSnippet commentSnippet;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("snippet")
	public CommentSnippet getSnippet() {
		return commentSnippet;
	}

	@JsonProperty("snippet")
	public void setSnippet(CommentSnippet snippet) {
		this.commentSnippet = snippet;
	}

	public YoutubeComment withSnippet(CommentSnippet snippet) {
		this.commentSnippet = snippet;
		return this;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public YoutubeComment withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}
