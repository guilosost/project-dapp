
package aiss.model.unsplash;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "created_at",
    "updated_at",
    "width",
    "height",
    "color",
    "description",
    "alt_description",
    "urls",
    "links",
    "categories",
    "sponsored",
    "sponsored_by",
    "sponsored_impressions_id",
    "likes",
    "liked_by_user",
    "current_user_collections",
    "user",
    "tags"
})
public class Result {

    @JsonProperty("id")
    private String id;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("width")
    private Integer width;
    @JsonProperty("height")
    private Integer height;
    @JsonProperty("color")
    private String color;
    @JsonProperty("description")
    private Object description;
    @JsonProperty("alt_description")
    private String altDescription;
    @JsonProperty("urls")
    private Urls urls;
    @JsonProperty("links")
    private Links links;
    @JsonProperty("categories")
    private List<Object> categories = null;
    @JsonProperty("sponsored")
    private Boolean sponsored;
    @JsonProperty("sponsored_by")
    private Object sponsoredBy;
    @JsonProperty("sponsored_impressions_id")
    private Object sponsoredImpressionsId;
    @JsonProperty("likes")
    private Integer likes;
    @JsonProperty("liked_by_user")
    private Boolean likedByUser;
    @JsonProperty("current_user_collections")
    private List<Object> currentUserCollections = null;
    @JsonProperty("user")
    private SearchUserPhotos user;
    @JsonProperty("tags")
    private List<Tag> tags = null;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("width")
    public Integer getWidth() {
        return width;
    }

    @JsonProperty("width")
    public void setWidth(Integer width) {
        this.width = width;
    }

    @JsonProperty("height")
    public Integer getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(Integer height) {
        this.height = height;
    }

    @JsonProperty("color")
    public String getColor() {
        return color;
    }

    @JsonProperty("color")
    public void setColor(String color) {
        this.color = color;
    }

    @JsonProperty("description")
    public Object getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(Object description) {
        this.description = description;
    }

    @JsonProperty("alt_description")
    public String getAltDescription() {
        return altDescription;
    }

    @JsonProperty("alt_description")
    public void setAltDescription(String altDescription) {
        this.altDescription = altDescription;
    }

    @JsonProperty("urls")
    public Urls getUrls() {
        return urls;
    }

    @JsonProperty("urls")
    public void setUrls(Urls urls) {
        this.urls = urls;
    }

    @JsonProperty("links")
    public Links getLinks() {
        return links;
    }

    @JsonProperty("links")
    public void setLinks(Links links) {
        this.links = links;
    }

    @JsonProperty("categories")
    public List<Object> getCategories() {
        return categories;
    }

    @JsonProperty("categories")
    public void setCategories(List<Object> categories) {
        this.categories = categories;
    }

    @JsonProperty("sponsored")
    public Boolean getSponsored() {
        return sponsored;
    }

    @JsonProperty("sponsored")
    public void setSponsored(Boolean sponsored) {
        this.sponsored = sponsored;
    }

    @JsonProperty("sponsored_by")
    public Object getSponsoredBy() {
        return sponsoredBy;
    }

    @JsonProperty("sponsored_by")
    public void setSponsoredBy(Object sponsoredBy) {
        this.sponsoredBy = sponsoredBy;
    }

    @JsonProperty("sponsored_impressions_id")
    public Object getSponsoredImpressionsId() {
        return sponsoredImpressionsId;
    }

    @JsonProperty("sponsored_impressions_id")
    public void setSponsoredImpressionsId(Object sponsoredImpressionsId) {
        this.sponsoredImpressionsId = sponsoredImpressionsId;
    }

    @JsonProperty("likes")
    public Integer getLikes() {
        return likes;
    }

    @JsonProperty("likes")
    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    @JsonProperty("liked_by_user")
    public Boolean getLikedByUser() {
        return likedByUser;
    }

    @JsonProperty("liked_by_user")
    public void setLikedByUser(Boolean likedByUser) {
        this.likedByUser = likedByUser;
    }

    @JsonProperty("current_user_collections")
    public List<Object> getCurrentUserCollections() {
        return currentUserCollections;
    }

    @JsonProperty("current_user_collections")
    public void setCurrentUserCollections(List<Object> currentUserCollections) {
        this.currentUserCollections = currentUserCollections;
    }

    @JsonProperty("user")
    public SearchUserPhotos getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(SearchUserPhotos user) {
        this.user = user;
    }

    @JsonProperty("tags")
    public List<Tag> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

}
