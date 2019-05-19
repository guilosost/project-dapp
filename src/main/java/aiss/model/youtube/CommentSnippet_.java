
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
    "textOriginal",
    "videoId"
})
public class CommentSnippet_ {

    @JsonProperty("textOriginal")
    private String textOriginal;
    @JsonProperty("videoId")
    private String videoId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("textOriginal")
    public String getTextOriginal() {
        return textOriginal;
    }

    @JsonProperty("textOriginal")
    public void setTextOriginal(String textOriginal) {
        this.textOriginal = textOriginal;
    }

    public CommentSnippet_ withTextOriginal(String textOriginal) {
        this.textOriginal = textOriginal;
        return this;
    }

    @JsonProperty("videoId")
    public String getVideoId() {
        return videoId;
    }

    @JsonProperty("videoId")
    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public CommentSnippet_ withVideoId(String videoId) {
        this.videoId = videoId;
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

    public CommentSnippet_ withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
