
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
    "user",
    "is_watching",
    "profile_url",
    "user_is_artist",
    "artist_level",
    "artist_specialty",
    "real_name",
    "tagline",
    "countryid",
    "country",
    "website",
    "bio",
    "cover_photo",
    "profile_pic",
    "last_status",
    "user_stats"
})
public class DeviantArtUser {

    @JsonProperty("user")
    private User user;
    @JsonProperty("is_watching")
    private Boolean isWatching;
    @JsonProperty("profile_url")
    private String profileUrl;
    @JsonProperty("user_is_artist")
    private Boolean userIsArtist;
    @JsonProperty("artist_level")
    private Object artistLevel;
    @JsonProperty("artist_specialty")
    private Object artistSpecialty;
    @JsonProperty("real_name")
    private String realName;
    @JsonProperty("tagline")
    private String tagline;
    @JsonProperty("countryid")
    private Integer countryid;
    @JsonProperty("country")
    private String country;
    @JsonProperty("website")
    private String website;
    @JsonProperty("bio")
    private String bio;
    @JsonProperty("cover_photo")
    private String coverPhoto;
    @JsonProperty("profile_pic")
    private Object profilePic;
    @JsonProperty("last_status")
    private Object lastStatus;
    @JsonProperty("user_stats")
    private UserStats userStats;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("user")
    public User getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(User user) {
        this.user = user;
    }

    @JsonProperty("is_watching")
    public Boolean getIsWatching() {
        return isWatching;
    }

    @JsonProperty("is_watching")
    public void setIsWatching(Boolean isWatching) {
        this.isWatching = isWatching;
    }

    @JsonProperty("profile_url")
    public String getProfileUrl() {
        return profileUrl;
    }

    @JsonProperty("profile_url")
    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    @JsonProperty("user_is_artist")
    public Boolean getUserIsArtist() {
        return userIsArtist;
    }

    @JsonProperty("user_is_artist")
    public void setUserIsArtist(Boolean userIsArtist) {
        this.userIsArtist = userIsArtist;
    }

    @JsonProperty("artist_level")
    public Object getArtistLevel() {
        return artistLevel;
    }

    @JsonProperty("artist_level")
    public void setArtistLevel(Object artistLevel) {
        this.artistLevel = artistLevel;
    }

    @JsonProperty("artist_specialty")
    public Object getArtistSpecialty() {
        return artistSpecialty;
    }

    @JsonProperty("artist_specialty")
    public void setArtistSpecialty(Object artistSpecialty) {
        this.artistSpecialty = artistSpecialty;
    }

    @JsonProperty("real_name")
    public String getRealName() {
        return realName;
    }

    @JsonProperty("real_name")
    public void setRealName(String realName) {
        this.realName = realName;
    }

    @JsonProperty("tagline")
    public String getTagline() {
        return tagline;
    }

    @JsonProperty("tagline")
    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    @JsonProperty("countryid")
    public Integer getCountryid() {
        return countryid;
    }

    @JsonProperty("countryid")
    public void setCountryid(Integer countryid) {
        this.countryid = countryid;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("website")
    public String getWebsite() {
        return website;
    }

    @JsonProperty("website")
    public void setWebsite(String website) {
        this.website = website;
    }

    @JsonProperty("bio")
    public String getBio() {
        return bio;
    }

    @JsonProperty("bio")
    public void setBio(String bio) {
        this.bio = bio;
    }

    @JsonProperty("cover_photo")
    public String getCoverPhoto() {
        return coverPhoto;
    }

    @JsonProperty("cover_photo")
    public void setCoverPhoto(String coverPhoto) {
        this.coverPhoto = coverPhoto;
    }

    @JsonProperty("profile_pic")
    public Object getProfilePic() {
        return profilePic;
    }

    @JsonProperty("profile_pic")
    public void setProfilePic(Object profilePic) {
        this.profilePic = profilePic;
    }

    @JsonProperty("last_status")
    public Object getLastStatus() {
        return lastStatus;
    }

    @JsonProperty("last_status")
    public void setLastStatus(Object lastStatus) {
        this.lastStatus = lastStatus;
    }

    @JsonProperty("user_stats")
    public UserStats getUserStats() {
        return userStats;
    }

    @JsonProperty("stats")
    public void setUserStats(UserStats userStats) {
        this.userStats = userStats;
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
