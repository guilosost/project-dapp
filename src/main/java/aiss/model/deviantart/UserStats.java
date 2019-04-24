
package aiss.model.deviantart;

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
    "user_deviations",
    "user_favourites",
    "user_comments",
    "profile_pageviews",
    "profile_comments"
})
public class UserStats {

    @JsonProperty("user_deviations")
    private Integer userDeviations;
    @JsonProperty("user_favourites")
    private Integer userFavourites;
    @JsonProperty("user_comments")
    private Integer userComments;
    @JsonProperty("profile_pageviews")
    private Integer profilePageviews;
    @JsonProperty("profile_comments")
    private Integer profileComments;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("user_deviations")
    public Integer getUserDeviations() {
        return userDeviations;
    }

    @JsonProperty("user_deviations")
    public void setUserDeviations(Integer userDeviations) {
        this.userDeviations = userDeviations;
    }

    @JsonProperty("user_favourites")
    public Integer getUserFavourites() {
        return userFavourites;
    }

    @JsonProperty("user_favourites")
    public void setUserFavourites(Integer userFavourites) {
        this.userFavourites = userFavourites;
    }

    @JsonProperty("user_comments")
    public Integer getUserComments() {
        return userComments;
    }

    @JsonProperty("user_comments")
    public void setUserComments(Integer userComments) {
        this.userComments = userComments;
    }

    @JsonProperty("profile_pageviews")
    public Integer getProfilePageviews() {
        return profilePageviews;
    }

    @JsonProperty("profile_pageviews")
    public void setProfilePageviews(Integer profilePageviews) {
        this.profilePageviews = profilePageviews;
    }

    @JsonProperty("profile_comments")
    public Integer getProfileComments() {
        return profileComments;
    }

    @JsonProperty("profile_comments")
    public void setProfileComments(Integer profileComments) {
        this.profileComments = profileComments;
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
