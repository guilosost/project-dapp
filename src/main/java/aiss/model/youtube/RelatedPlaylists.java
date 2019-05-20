
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
    "likes",
    "favorites",
    "uploads",
    "watchHistory",
    "watchLater"
})
public class RelatedPlaylists {

    @JsonProperty("likes")
    private String likes;
    @JsonProperty("favorites")
    private String favorites;
    @JsonProperty("uploads")
    private String uploads;
    @JsonProperty("watchHistory")
    private String watchHistory;
    @JsonProperty("watchLater")
    private String watchLater;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("likes")
    public String getLikes() {
        return likes;
    }

    @JsonProperty("likes")
    public void setLikes(String likes) {
        this.likes = likes;
    }

    public RelatedPlaylists withLikes(String likes) {
        this.likes = likes;
        return this;
    }

    @JsonProperty("favorites")
    public String getFavorites() {
        return favorites;
    }

    @JsonProperty("favorites")
    public void setFavorites(String favorites) {
        this.favorites = favorites;
    }

    public RelatedPlaylists withFavorites(String favorites) {
        this.favorites = favorites;
        return this;
    }

    @JsonProperty("uploads")
    public String getUploads() {
        return uploads;
    }

    @JsonProperty("uploads")
    public void setUploads(String uploads) {
        this.uploads = uploads;
    }

    public RelatedPlaylists withUploads(String uploads) {
        this.uploads = uploads;
        return this;
    }

    @JsonProperty("watchHistory")
    public String getWatchHistory() {
        return watchHistory;
    }

    @JsonProperty("watchHistory")
    public void setWatchHistory(String watchHistory) {
        this.watchHistory = watchHistory;
    }

    public RelatedPlaylists withWatchHistory(String watchHistory) {
        this.watchHistory = watchHistory;
        return this;
    }

    @JsonProperty("watchLater")
    public String getWatchLater() {
        return watchLater;
    }

    @JsonProperty("watchLater")
    public void setWatchLater(String watchLater) {
        this.watchLater = watchLater;
    }

    public RelatedPlaylists withWatchLater(String watchLater) {
        this.watchLater = watchLater;
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

    public RelatedPlaylists withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
