
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
@JsonPropertyOrder({
    "snippet"
})
public class TopLevelComment {

    @JsonProperty("snippet")
    private CommentSnippet_ snippet;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("snippet")
    public CommentSnippet_ getSnippet() {
        return snippet;
    }

    @JsonProperty("snippet")
    public void setSnippet(CommentSnippet_ snippet) {
        this.snippet = snippet;
    }

    public TopLevelComment withSnippet(CommentSnippet_ snippet) {
        this.snippet = snippet;
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

    public TopLevelComment withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
