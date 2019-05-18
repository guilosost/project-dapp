
package aiss.model.dailymotion;

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
    "avatar_190_url",
    "country",
    "description",
    "followers_total",
    "following_total",
    "status",
    "username",
    "videos_total",
    "views_total"
})
public class DailymotionUserStats {

    @JsonProperty("avatar_190_url")
    private String avatar190Url;
    @JsonProperty("country")
    private String country;
    @JsonProperty("description")
    private Object description;
    @JsonProperty("followers_total")
    private Integer followersTotal;
    @JsonProperty("following_total")
    private Integer followingTotal;
    @JsonProperty("status")
    private String status;
    @JsonProperty("username")
    private String username;
    @JsonProperty("videos_total")
    private Integer videosTotal;
    @JsonProperty("views_total")
    private Integer viewsTotal;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("avatar_190_url")
    public String getAvatar190Url() {
        return avatar190Url;
    }

    @JsonProperty("avatar_190_url")
    public void setAvatar190Url(String avatar190Url) {
        this.avatar190Url = avatar190Url;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("description")
    public Object getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(Object description) {
        this.description = description;
    }

    @JsonProperty("followers_total")
    public Integer getFollowersTotal() {
        return followersTotal;
    }

    @JsonProperty("followers_total")
    public void setFollowersTotal(Integer followersTotal) {
        this.followersTotal = followersTotal;
    }

    @JsonProperty("following_total")
    public Integer getFollowingTotal() {
        return followingTotal;
    }

    @JsonProperty("following_total")
    public void setFollowingTotal(Integer followingTotal) {
        this.followingTotal = followingTotal;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    @JsonProperty("videos_total")
    public Integer getVideosTotal() {
        return videosTotal;
    }

    @JsonProperty("videos_total")
    public void setVideosTotal(Integer videosTotal) {
        this.videosTotal = videosTotal;
    }

    @JsonProperty("views_total")
    public Integer getViewsTotal() {
        return viewsTotal;
    }

    @JsonProperty("views_total")
    public void setViewsTotal(Integer viewsTotal) {
        this.viewsTotal = viewsTotal;
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
