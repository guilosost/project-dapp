
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
    "publishedAt",
    "channelId",
    "title",
    "description",
    "thumbnails",
    "channelTitle",
    "liveBroadcastContent"
})
public class Snippet {

    @JsonProperty("publishedAt")
    private String publishedAt;
    @JsonProperty("channelId")
    private String channelId;
    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;
    @JsonProperty("thumbnails")
    private Thumbnails thumbnails;
    @JsonProperty("channelTitle")
    private String channelTitle;
    @JsonProperty("liveBroadcastContent")
    private String liveBroadcastContent;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("publishedAt")
    public String getPublishedAt() {
        return publishedAt;
    }

    @JsonProperty("publishedAt")
    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public Snippet withPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
        return this;
    }

    @JsonProperty("channelId")
    public String getChannelId() {
        return channelId;
    }

    @JsonProperty("channelId")
    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public Snippet withChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Snippet withTitle(String title) {
        this.title = title;
        return this;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Snippet withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("thumbnails")
    public Thumbnails getThumbnails() {
        return thumbnails;
    }

    @JsonProperty("thumbnails")
    public void setThumbnails(Thumbnails thumbnails) {
        this.thumbnails = thumbnails;
    }

    public Snippet withThumbnails(Thumbnails thumbnails) {
        this.thumbnails = thumbnails;
        return this;
    }

    @JsonProperty("channelTitle")
    public String getChannelTitle() {
        return channelTitle;
    }

    @JsonProperty("channelTitle")
    public void setChannelTitle(String channelTitle) {
        this.channelTitle = channelTitle;
    }

    public Snippet withChannelTitle(String channelTitle) {
        this.channelTitle = channelTitle;
        return this;
    }

    @JsonProperty("liveBroadcastContent")
    public String getLiveBroadcastContent() {
        return liveBroadcastContent;
    }

    @JsonProperty("liveBroadcastContent")
    public void setLiveBroadcastContent(String liveBroadcastContent) {
        this.liveBroadcastContent = liveBroadcastContent;
    }

    public Snippet withLiveBroadcastContent(String liveBroadcastContent) {
        this.liveBroadcastContent = liveBroadcastContent;
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

    public Snippet withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
