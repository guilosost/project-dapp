
package aiss.model.imgur;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "title",
    "description",
    "datetime",
    "cover",
    "cover_width",
    "cover_height",
    "account_url",
    "account_id",
    "privacy",
    "layout",
    "views",
    "link",
    "ups",
    "downs",
    "points",
    "score",
    "is_album",
    "vote",
    "favorite",
    "nsfw",
    "section",
    "comment_count",
    "favorite_count",
    "topic",
    "topic_id",
    "images_count",
    "in_gallery",
    "is_ad",
    "tags",
    "ad_type",
    "ad_url",
    "in_most_viral",
    "include_album_ads",
    "images",
    "ad_config"
})
public class Datum {

    @JsonProperty("id")
    private String id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private Object description;
    @JsonProperty("datetime")
    private Integer datetime;
    @JsonProperty("cover")
    private String cover;
    @JsonProperty("cover_width")
    private Integer coverWidth;
    @JsonProperty("cover_height")
    private Integer coverHeight;
    @JsonProperty("account_url")
    private String accountUrl;
    @JsonProperty("account_id")
    private Integer accountId;
    @JsonProperty("privacy")
    private String privacy;
    @JsonProperty("layout")
    private String layout;
    @JsonProperty("views")
    private Integer views;
    @JsonProperty("link")
    private String link;
    @JsonProperty("ups")
    private Integer ups;
    @JsonProperty("downs")
    private Integer downs;
    @JsonProperty("points")
    private Integer points;
    @JsonProperty("score")
    private Integer score;
    @JsonProperty("is_album")
    private Boolean isAlbum;
    @JsonProperty("vote")
    private Object vote;
    @JsonProperty("favorite")
    private Boolean favorite;
    @JsonProperty("nsfw")
    private Boolean nsfw;
    @JsonProperty("section")
    private String section;
    @JsonProperty("comment_count")
    private Integer commentCount;
    @JsonProperty("favorite_count")
    private Integer favoriteCount;
    @JsonProperty("topic")
    private String topic;
    @JsonProperty("topic_id")
    private Integer topicId;
    @JsonProperty("images_count")
    private Integer imagesCount;
    @JsonProperty("in_gallery")
    private Boolean inGallery;
    @JsonProperty("is_ad")
    private Boolean isAd;
    @JsonProperty("tags")
    private List<Tag> tags = null;
    @JsonProperty("ad_type")
    private Integer adType;
    @JsonProperty("ad_url")
    private String adUrl;
    @JsonProperty("in_most_viral")
    private Boolean inMostViral;
    @JsonProperty("include_album_ads")
    private Boolean includeAlbumAds;
    @JsonProperty("images")
    private List<Image> images = null;
    @JsonProperty("ad_config")
    private AdConfig adConfig;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("description")
    public Object getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(Object description) {
        this.description = description;
    }

    @JsonProperty("datetime")
    public Integer getDatetime() {
        return datetime;
    }

    @JsonProperty("datetime")
    public void setDatetime(Integer datetime) {
        this.datetime = datetime;
    }

    @JsonProperty("cover")
    public String getCover() {
        return cover;
    }

    @JsonProperty("cover")
    public void setCover(String cover) {
        this.cover = cover;
    }

    @JsonProperty("cover_width")
    public Integer getCoverWidth() {
        return coverWidth;
    }

    @JsonProperty("cover_width")
    public void setCoverWidth(Integer coverWidth) {
        this.coverWidth = coverWidth;
    }

    @JsonProperty("cover_height")
    public Integer getCoverHeight() {
        return coverHeight;
    }

    @JsonProperty("cover_height")
    public void setCoverHeight(Integer coverHeight) {
        this.coverHeight = coverHeight;
    }

    @JsonProperty("account_url")
    public String getAccountUrl() {
        return accountUrl;
    }

    @JsonProperty("account_url")
    public void setAccountUrl(String accountUrl) {
        this.accountUrl = accountUrl;
    }

    @JsonProperty("account_id")
    public Integer getAccountId() {
        return accountId;
    }

    @JsonProperty("account_id")
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    @JsonProperty("privacy")
    public String getPrivacy() {
        return privacy;
    }

    @JsonProperty("privacy")
    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    @JsonProperty("layout")
    public String getLayout() {
        return layout;
    }

    @JsonProperty("layout")
    public void setLayout(String layout) {
        this.layout = layout;
    }

    @JsonProperty("views")
    public Integer getViews() {
        return views;
    }

    @JsonProperty("views")
    public void setViews(Integer views) {
        this.views = views;
    }

    @JsonProperty("link")
    public String getLink() {
        return link;
    }

    @JsonProperty("link")
    public void setLink(String link) {
        this.link = link;
    }

    @JsonProperty("ups")
    public Integer getUps() {
        return ups;
    }

    @JsonProperty("ups")
    public void setUps(Integer ups) {
        this.ups = ups;
    }

    @JsonProperty("downs")
    public Integer getDowns() {
        return downs;
    }

    @JsonProperty("downs")
    public void setDowns(Integer downs) {
        this.downs = downs;
    }

    @JsonProperty("points")
    public Integer getPoints() {
        return points;
    }

    @JsonProperty("points")
    public void setPoints(Integer points) {
        this.points = points;
    }

    @JsonProperty("score")
    public Integer getScore() {
        return score;
    }

    @JsonProperty("score")
    public void setScore(Integer score) {
        this.score = score;
    }

    @JsonProperty("is_album")
    public Boolean getIsAlbum() {
        return isAlbum;
    }

    @JsonProperty("is_album")
    public void setIsAlbum(Boolean isAlbum) {
        this.isAlbum = isAlbum;
    }

    @JsonProperty("vote")
    public Object getVote() {
        return vote;
    }

    @JsonProperty("vote")
    public void setVote(Object vote) {
        this.vote = vote;
    }

    @JsonProperty("favorite")
    public Boolean getFavorite() {
        return favorite;
    }

    @JsonProperty("favorite")
    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }

    @JsonProperty("nsfw")
    public Boolean getNsfw() {
        return nsfw;
    }

    @JsonProperty("nsfw")
    public void setNsfw(Boolean nsfw) {
        this.nsfw = nsfw;
    }

    @JsonProperty("section")
    public String getSection() {
        return section;
    }

    @JsonProperty("section")
    public void setSection(String section) {
        this.section = section;
    }

    @JsonProperty("comment_count")
    public Integer getCommentCount() {
        return commentCount;
    }

    @JsonProperty("comment_count")
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    @JsonProperty("favorite_count")
    public Integer getFavoriteCount() {
        return favoriteCount;
    }

    @JsonProperty("favorite_count")
    public void setFavoriteCount(Integer favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    @JsonProperty("topic")
    public String getTopic() {
        return topic;
    }

    @JsonProperty("topic")
    public void setTopic(String topic) {
        this.topic = topic;
    }

    @JsonProperty("topic_id")
    public Integer getTopicId() {
        return topicId;
    }

    @JsonProperty("topic_id")
    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    @JsonProperty("images_count")
    public Integer getImagesCount() {
        return imagesCount;
    }

    @JsonProperty("images_count")
    public void setImagesCount(Integer imagesCount) {
        this.imagesCount = imagesCount;
    }

    @JsonProperty("in_gallery")
    public Boolean getInGallery() {
        return inGallery;
    }

    @JsonProperty("in_gallery")
    public void setInGallery(Boolean inGallery) {
        this.inGallery = inGallery;
    }

    @JsonProperty("is_ad")
    public Boolean getIsAd() {
        return isAd;
    }

    @JsonProperty("is_ad")
    public void setIsAd(Boolean isAd) {
        this.isAd = isAd;
    }

    @JsonProperty("tags")
    public List<Tag> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @JsonProperty("ad_type")
    public Integer getAdType() {
        return adType;
    }

    @JsonProperty("ad_type")
    public void setAdType(Integer adType) {
        this.adType = adType;
    }

    @JsonProperty("ad_url")
    public String getAdUrl() {
        return adUrl;
    }

    @JsonProperty("ad_url")
    public void setAdUrl(String adUrl) {
        this.adUrl = adUrl;
    }

    @JsonProperty("in_most_viral")
    public Boolean getInMostViral() {
        return inMostViral;
    }

    @JsonProperty("in_most_viral")
    public void setInMostViral(Boolean inMostViral) {
        this.inMostViral = inMostViral;
    }

    @JsonProperty("include_album_ads")
    public Boolean getIncludeAlbumAds() {
        return includeAlbumAds;
    }

    @JsonProperty("include_album_ads")
    public void setIncludeAlbumAds(Boolean includeAlbumAds) {
        this.includeAlbumAds = includeAlbumAds;
    }

    @JsonProperty("images")
    public List<Image> getImages() {
        return images;
    }

    @JsonProperty("images")
    public void setImages(List<Image> images) {
        this.images = images;
    }

    @JsonProperty("ad_config")
    public AdConfig getAdConfig() {
        return adConfig;
    }

    @JsonProperty("ad_config")
    public void setAdConfig(AdConfig adConfig) {
        this.adConfig = adConfig;
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
