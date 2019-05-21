
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
    "viewCount",
    "commentCount",
    "subscriberCount",
    "hiddenSubscriberCount",
    "videoCount"
})
public class Statistics {

    @JsonProperty("viewCount")
    private String viewCount;
    @JsonProperty("commentCount")
    private String commentCount;
    @JsonProperty("subscriberCount")
    private String subscriberCount;
    @JsonProperty("hiddenSubscriberCount")
    private Boolean hiddenSubscriberCount;
    @JsonProperty("videoCount")
    private String videoCount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("viewCount")
    public String getViewCount() {
        return viewCount;
    }

    @JsonProperty("viewCount")
    public void setViewCount(String viewCount) {
        this.viewCount = viewCount;
    }

    public Statistics withViewCount(String viewCount) {
        this.viewCount = viewCount;
        return this;
    }

    @JsonProperty("commentCount")
    public String getCommentCount() {
        return commentCount;
    }

    @JsonProperty("commentCount")
    public void setCommentCount(String commentCount) {
        this.commentCount = commentCount;
    }

    public Statistics withCommentCount(String commentCount) {
        this.commentCount = commentCount;
        return this;
    }

    @JsonProperty("subscriberCount")
    public String getSubscriberCount() {
        return subscriberCount;
    }

    @JsonProperty("subscriberCount")
    public void setSubscriberCount(String subscriberCount) {
        this.subscriberCount = subscriberCount;
    }

    public Statistics withSubscriberCount(String subscriberCount) {
        this.subscriberCount = subscriberCount;
        return this;
    }

    @JsonProperty("hiddenSubscriberCount")
    public Boolean getHiddenSubscriberCount() {
        return hiddenSubscriberCount;
    }

    @JsonProperty("hiddenSubscriberCount")
    public void setHiddenSubscriberCount(Boolean hiddenSubscriberCount) {
        this.hiddenSubscriberCount = hiddenSubscriberCount;
    }

    public Statistics withHiddenSubscriberCount(Boolean hiddenSubscriberCount) {
        this.hiddenSubscriberCount = hiddenSubscriberCount;
        return this;
    }

    @JsonProperty("videoCount")
    public String getVideoCount() {
        return videoCount;
    }

    @JsonProperty("videoCount")
    public void setVideoCount(String videoCount) {
        this.videoCount = videoCount;
    }

    public Statistics withVideoCount(String videoCount) {
        this.videoCount = videoCount;
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

    public Statistics withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
