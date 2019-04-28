
package aiss.model.unsplash;

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
    "self",
    "html",
    "photos",
    "likes",
    "portfolio",
    "following",
    "followers"
})
public class Links_ {

    @JsonProperty("self")
    private String self;
    @JsonProperty("html")
    private String html;
    @JsonProperty("photos")
    private String photos;
    @JsonProperty("likes")
    private String likes;
    @JsonProperty("portfolio")
    private String portfolio;
    @JsonProperty("following")
    private String following;
    @JsonProperty("followers")
    private String followers;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("self")
    public String getSelf() {
        return self;
    }

    @JsonProperty("self")
    public void setSelf(String self) {
        this.self = self;
    }

    @JsonProperty("html")
    public String getHtml() {
        return html;
    }

    @JsonProperty("html")
    public void setHtml(String html) {
        this.html = html;
    }

    @JsonProperty("photos")
    public String getPhotos() {
        return photos;
    }

    @JsonProperty("photos")
    public void setPhotos(String photos) {
        this.photos = photos;
    }

    @JsonProperty("likes")
    public String getLikes() {
        return likes;
    }

    @JsonProperty("likes")
    public void setLikes(String likes) {
        this.likes = likes;
    }

    @JsonProperty("portfolio")
    public String getPortfolio() {
        return portfolio;
    }

    @JsonProperty("portfolio")
    public void setPortfolio(String portfolio) {
        this.portfolio = portfolio;
    }

    @JsonProperty("following")
    public String getFollowing() {
        return following;
    }

    @JsonProperty("following")
    public void setFollowing(String following) {
        this.following = following;
    }

    @JsonProperty("followers")
    public String getFollowers() {
        return followers;
    }

    @JsonProperty("followers")
    public void setFollowers(String followers) {
        this.followers = followers;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
