
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
    "likeCount",
    "dislikeCount",
    "favoriteCount",
    "commentCount"
})
public class TrueStatistics {

    @JsonProperty("viewCount")
    private String viewCount;
    @JsonProperty("likeCount")
    private String likeCount;
    @JsonProperty("dislikeCount")
    private String dislikeCount;
    @JsonProperty("favoriteCount")
    private String favoriteCount;
    @JsonProperty("commentCount")
    private String commentCount;
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

    @JsonProperty("likeCount")
    public String getLikeCount() {
        return likeCount;
    }

    @JsonProperty("likeCount")
    public void setLikeCount(String likeCount) {
        this.likeCount = likeCount;
    }

    @JsonProperty("dislikeCount")
    public String getDislikeCount() {
        return dislikeCount;
    }

    @JsonProperty("dislikeCount")
    public void setDislikeCount(String dislikeCount) {
        this.dislikeCount = dislikeCount;
    }

    @JsonProperty("favoriteCount")
    public String getFavoriteCount() {
        return favoriteCount;
    }

    @JsonProperty("favoriteCount")
    public void setFavoriteCount(String favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    @JsonProperty("commentCount")
    public String getCommentCount() {
        return commentCount;
    }

    @JsonProperty("commentCount")
    public void setCommentCount(String commentCount) {
        this.commentCount = commentCount;
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
