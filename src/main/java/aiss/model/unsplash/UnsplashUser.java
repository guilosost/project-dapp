
package aiss.model.unsplash;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "updated_at",
    "username",
    "name",
    "first_name",
    "last_name",
    "twitter_username",
    "portfolio_url",
    "bio",
    "location",
    "links",
    "profile_image",
    "instagram_username",
    "total_collections",
    "total_likes",
    "total_photos",
    "accepted_tos",
    "followed_by_user",
    "photos",
    "badge",
    "downloads",
    "tags",
    "followers_count",
    "following_count",
    "allow_messages",
    "numeric_id",
    "uid",
    "uploads_remaining",
    "unlimited_uploads",
    "email"
})
public class UnsplashUser {

    @JsonProperty("id")
    private String id;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("username")
    private String username;
    @JsonProperty("name")
    private String name;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("twitter_username")
    private Object twitterUsername;
    @JsonProperty("portfolio_url")
    private Object portfolioUrl;
    @JsonProperty("bio")
    private Object bio;
    @JsonProperty("location")
    private Object location;
    @JsonProperty("links")
    private Links links;
    @JsonProperty("profile_image")
    private ProfileImage profileImage;
    @JsonProperty("instagram_username")
    private Object instagramUsername;
    @JsonProperty("total_collections")
    private Integer totalCollections;
    @JsonProperty("total_likes")
    private Integer totalLikes;
    @JsonProperty("total_photos")
    private Integer totalPhotos;
    @JsonProperty("accepted_tos")
    private Boolean acceptedTos;
    @JsonProperty("followed_by_user")
    private Boolean followedByUser;
    @JsonProperty("photos")
    private List<Object> photos = null;
    @JsonProperty("badge")
    private Object badge;
    @JsonProperty("downloads")
    private Integer downloads;
    @JsonProperty("tags")
    private Tags tags;
    @JsonProperty("followers_count")
    private Integer followersCount;
    @JsonProperty("following_count")
    private Integer followingCount;
    @JsonProperty("allow_messages")
    private Boolean allowMessages;
    @JsonProperty("numeric_id")
    private Integer numericId;
    @JsonProperty("uid")
    private String uid;
    @JsonProperty("uploads_remaining")
    private Integer uploadsRemaining;
    @JsonProperty("unlimited_uploads")
    private Boolean unlimitedUploads;
    @JsonProperty("email")
    private String email;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("twitter_username")
    public Object getTwitterUsername() {
        return twitterUsername;
    }

    @JsonProperty("twitter_username")
    public void setTwitterUsername(Object twitterUsername) {
        this.twitterUsername = twitterUsername;
    }

    @JsonProperty("portfolio_url")
    public Object getPortfolioUrl() {
        return portfolioUrl;
    }

    @JsonProperty("portfolio_url")
    public void setPortfolioUrl(Object portfolioUrl) {
        this.portfolioUrl = portfolioUrl;
    }

    @JsonProperty("bio")
    public Object getBio() {
        return bio;
    }

    @JsonProperty("bio")
    public void setBio(Object bio) {
        this.bio = bio;
    }

    @JsonProperty("location")
    public Object getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Object location) {
        this.location = location;
    }

    @JsonProperty("links")
    public Links getLinks() {
        return links;
    }

    @JsonProperty("links")
    public void setLinks(Links links) {
        this.links = links;
    }

    @JsonProperty("profile_image")
    public ProfileImage getProfileImage() {
        return profileImage;
    }

    @JsonProperty("profile_image")
    public void setProfileImage(ProfileImage profileImage) {
        this.profileImage = profileImage;
    }

    @JsonProperty("instagram_username")
    public Object getInstagramUsername() {
        return instagramUsername;
    }

    @JsonProperty("instagram_username")
    public void setInstagramUsername(Object instagramUsername) {
        this.instagramUsername = instagramUsername;
    }

    @JsonProperty("total_collections")
    public Integer getTotalCollections() {
        return totalCollections;
    }

    @JsonProperty("total_collections")
    public void setTotalCollections(Integer totalCollections) {
        this.totalCollections = totalCollections;
    }

    @JsonProperty("total_likes")
    public Integer getTotalLikes() {
        return totalLikes;
    }

    @JsonProperty("total_likes")
    public void setTotalLikes(Integer totalLikes) {
        this.totalLikes = totalLikes;
    }

    @JsonProperty("total_photos")
    public Integer getTotalPhotos() {
        return totalPhotos;
    }

    @JsonProperty("total_photos")
    public void setTotalPhotos(Integer totalPhotos) {
        this.totalPhotos = totalPhotos;
    }

    @JsonProperty("accepted_tos")
    public Boolean getAcceptedTos() {
        return acceptedTos;
    }

    @JsonProperty("accepted_tos")
    public void setAcceptedTos(Boolean acceptedTos) {
        this.acceptedTos = acceptedTos;
    }

    @JsonProperty("followed_by_user")
    public Boolean getFollowedByUser() {
        return followedByUser;
    }

    @JsonProperty("followed_by_user")
    public void setFollowedByUser(Boolean followedByUser) {
        this.followedByUser = followedByUser;
    }

    @JsonProperty("photos")
    public List<Object> getPhotos() {
        return photos;
    }

    @JsonProperty("photos")
    public void setPhotos(List<Object> photos) {
        this.photos = photos;
    }

    @JsonProperty("badge")
    public Object getBadge() {
        return badge;
    }

    @JsonProperty("badge")
    public void setBadge(Object badge) {
        this.badge = badge;
    }

    @JsonProperty("downloads")
    public Integer getDownloads() {
        return downloads;
    }

    @JsonProperty("downloads")
    public void setDownloads(Integer downloads) {
        this.downloads = downloads;
    }

    @JsonProperty("tags")
    public Tags getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(Tags tags) {
        this.tags = tags;
    }

    @JsonProperty("followers_count")
    public Integer getFollowersCount() {
        return followersCount;
    }

    @JsonProperty("followers_count")
    public void setFollowersCount(Integer followersCount) {
        this.followersCount = followersCount;
    }

    @JsonProperty("following_count")
    public Integer getFollowingCount() {
        return followingCount;
    }

    @JsonProperty("following_count")
    public void setFollowingCount(Integer followingCount) {
        this.followingCount = followingCount;
    }

    @JsonProperty("allow_messages")
    public Boolean getAllowMessages() {
        return allowMessages;
    }

    @JsonProperty("allow_messages")
    public void setAllowMessages(Boolean allowMessages) {
        this.allowMessages = allowMessages;
    }

    @JsonProperty("numeric_id")
    public Integer getNumericId() {
        return numericId;
    }

    @JsonProperty("numeric_id")
    public void setNumericId(Integer numericId) {
        this.numericId = numericId;
    }

    @JsonProperty("uid")
    public String getUid() {
        return uid;
    }

    @JsonProperty("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    @JsonProperty("uploads_remaining")
    public Integer getUploadsRemaining() {
        return uploadsRemaining;
    }

    @JsonProperty("uploads_remaining")
    public void setUploadsRemaining(Integer uploadsRemaining) {
        this.uploadsRemaining = uploadsRemaining;
    }

    @JsonProperty("unlimited_uploads")
    public Boolean getUnlimitedUploads() {
        return unlimitedUploads;
    }

    @JsonProperty("unlimited_uploads")
    public void setUnlimitedUploads(Boolean unlimitedUploads) {
        this.unlimitedUploads = unlimitedUploads;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

}
