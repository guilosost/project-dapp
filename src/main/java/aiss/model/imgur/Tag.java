
package aiss.model.imgur;

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
    "name",
    "display_name",
    "followers",
    "total_items",
    "following",
    "background_hash",
    "thumbnail_hash",
    "accent",
    "background_is_animated",
    "thumbnail_is_animated",
    "is_promoted",
    "description",
    "logo_hash",
    "logo_destination_url",
    "description_annotations"
})
public class Tag {

    @JsonProperty("name")
    private String name;
    @JsonProperty("display_name")
    private String displayName;
    @JsonProperty("followers")
    private Integer followers;
    @JsonProperty("total_items")
    private Integer totalItems;
    @JsonProperty("following")
    private Boolean following;
    @JsonProperty("background_hash")
    private String backgroundHash;
    @JsonProperty("thumbnail_hash")
    private Object thumbnailHash;
    @JsonProperty("accent")
    private String accent;
    @JsonProperty("background_is_animated")
    private Boolean backgroundIsAnimated;
    @JsonProperty("thumbnail_is_animated")
    private Boolean thumbnailIsAnimated;
    @JsonProperty("is_promoted")
    private Boolean isPromoted;
    @JsonProperty("description")
    private String description;
    @JsonProperty("logo_hash")
    private Object logoHash;
    @JsonProperty("logo_destination_url")
    private Object logoDestinationUrl;
    @JsonProperty("description_annotations")
    private DescriptionAnnotations descriptionAnnotations;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("display_name")
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty("display_name")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @JsonProperty("followers")
    public Integer getFollowers() {
        return followers;
    }

    @JsonProperty("followers")
    public void setFollowers(Integer followers) {
        this.followers = followers;
    }

    @JsonProperty("total_items")
    public Integer getTotalItems() {
        return totalItems;
    }

    @JsonProperty("total_items")
    public void setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
    }

    @JsonProperty("following")
    public Boolean getFollowing() {
        return following;
    }

    @JsonProperty("following")
    public void setFollowing(Boolean following) {
        this.following = following;
    }

    @JsonProperty("background_hash")
    public String getBackgroundHash() {
        return backgroundHash;
    }

    @JsonProperty("background_hash")
    public void setBackgroundHash(String backgroundHash) {
        this.backgroundHash = backgroundHash;
    }

    @JsonProperty("thumbnail_hash")
    public Object getThumbnailHash() {
        return thumbnailHash;
    }

    @JsonProperty("thumbnail_hash")
    public void setThumbnailHash(Object thumbnailHash) {
        this.thumbnailHash = thumbnailHash;
    }

    @JsonProperty("accent")
    public String getAccent() {
        return accent;
    }

    @JsonProperty("accent")
    public void setAccent(String accent) {
        this.accent = accent;
    }

    @JsonProperty("background_is_animated")
    public Boolean getBackgroundIsAnimated() {
        return backgroundIsAnimated;
    }

    @JsonProperty("background_is_animated")
    public void setBackgroundIsAnimated(Boolean backgroundIsAnimated) {
        this.backgroundIsAnimated = backgroundIsAnimated;
    }

    @JsonProperty("thumbnail_is_animated")
    public Boolean getThumbnailIsAnimated() {
        return thumbnailIsAnimated;
    }

    @JsonProperty("thumbnail_is_animated")
    public void setThumbnailIsAnimated(Boolean thumbnailIsAnimated) {
        this.thumbnailIsAnimated = thumbnailIsAnimated;
    }

    @JsonProperty("is_promoted")
    public Boolean getIsPromoted() {
        return isPromoted;
    }

    @JsonProperty("is_promoted")
    public void setIsPromoted(Boolean isPromoted) {
        this.isPromoted = isPromoted;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("logo_hash")
    public Object getLogoHash() {
        return logoHash;
    }

    @JsonProperty("logo_hash")
    public void setLogoHash(Object logoHash) {
        this.logoHash = logoHash;
    }

    @JsonProperty("logo_destination_url")
    public Object getLogoDestinationUrl() {
        return logoDestinationUrl;
    }

    @JsonProperty("logo_destination_url")
    public void setLogoDestinationUrl(Object logoDestinationUrl) {
        this.logoDestinationUrl = logoDestinationUrl;
    }

    @JsonProperty("description_annotations")
    public DescriptionAnnotations getDescriptionAnnotations() {
        return descriptionAnnotations;
    }

    @JsonProperty("description_annotations")
    public void setDescriptionAnnotations(DescriptionAnnotations descriptionAnnotations) {
        this.descriptionAnnotations = descriptionAnnotations;
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
