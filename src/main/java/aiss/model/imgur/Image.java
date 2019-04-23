
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
    "type",
    "animated",
    "width",
    "height",
    "size",
    "views",
    "bandwidth",
    "vote",
    "favorite",
    "nsfw",
    "section",
    "account_url",
    "account_id",
    "is_ad",
    "in_most_viral",
    "tags",
    "ad_type",
    "ad_url",
    "in_gallery",
    "deletehash",
    "name",
    "link"
})
public class Image {

    @JsonProperty("id")
    private String id;
    @JsonProperty("title")
    private Object title;
    @JsonProperty("description")
    private Object description;
    @JsonProperty("datetime")
    private Integer datetime;
    @JsonProperty("type")
    private String type;
    @JsonProperty("animated")
    private Boolean animated;
    @JsonProperty("width")
    private Integer width;
    @JsonProperty("height")
    private Integer height;
    @JsonProperty("size")
    private Integer size;
    @JsonProperty("views")
    private Integer views;
    @JsonProperty("bandwidth")
    private Integer bandwidth;
    @JsonProperty("vote")
    private Object vote;
    @JsonProperty("favorite")
    private Boolean favorite;
    @JsonProperty("nsfw")
    private Object nsfw;
    @JsonProperty("section")
    private Object section;
    @JsonProperty("account_url")
    private Object accountUrl;
    @JsonProperty("account_id")
    private Integer accountId;
    @JsonProperty("is_ad")
    private Boolean isAd;
    @JsonProperty("in_most_viral")
    private Boolean inMostViral;
    @JsonProperty("tags")
    private List<Object> tags = null;
    @JsonProperty("ad_type")
    private Integer adType;
    @JsonProperty("ad_url")
    private String adUrl;
    @JsonProperty("in_gallery")
    private Boolean inGallery;
    @JsonProperty("deletehash")
    private String deletehash;
    @JsonProperty("name")
    private String name;
    @JsonProperty("link")
    private String link;
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
    public Object getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(Object title) {
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

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("animated")
    public Boolean getAnimated() {
        return animated;
    }

    @JsonProperty("animated")
    public void setAnimated(Boolean animated) {
        this.animated = animated;
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

    @JsonProperty("size")
    public Integer getSize() {
        return size;
    }

    @JsonProperty("size")
    public void setSize(Integer size) {
        this.size = size;
    }

    @JsonProperty("views")
    public Integer getViews() {
        return views;
    }

    @JsonProperty("views")
    public void setViews(Integer views) {
        this.views = views;
    }

    @JsonProperty("bandwidth")
    public Integer getBandwidth() {
        return bandwidth;
    }

    @JsonProperty("bandwidth")
    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
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
    public Object getNsfw() {
        return nsfw;
    }

    @JsonProperty("nsfw")
    public void setNsfw(Object nsfw) {
        this.nsfw = nsfw;
    }

    @JsonProperty("section")
    public Object getSection() {
        return section;
    }

    @JsonProperty("section")
    public void setSection(Object section) {
        this.section = section;
    }

    @JsonProperty("account_url")
    public Object getAccountUrl() {
        return accountUrl;
    }

    @JsonProperty("account_url")
    public void setAccountUrl(Object accountUrl) {
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

    @JsonProperty("is_ad")
    public Boolean getIsAd() {
        return isAd;
    }

    @JsonProperty("is_ad")
    public void setIsAd(Boolean isAd) {
        this.isAd = isAd;
    }

    @JsonProperty("in_most_viral")
    public Boolean getInMostViral() {
        return inMostViral;
    }

    @JsonProperty("in_most_viral")
    public void setInMostViral(Boolean inMostViral) {
        this.inMostViral = inMostViral;
    }

    @JsonProperty("tags")
    public List<Object> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<Object> tags) {
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

    @JsonProperty("in_gallery")
    public Boolean getInGallery() {
        return inGallery;
    }

    @JsonProperty("in_gallery")
    public void setInGallery(Boolean inGallery) {
        this.inGallery = inGallery;
    }

    @JsonProperty("deletehash")
    public String getDeletehash() {
        return deletehash;
    }

    @JsonProperty("deletehash")
    public void setDeletehash(String deletehash) {
        this.deletehash = deletehash;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("link")
    public String getLink() {
        return link;
    }

    @JsonProperty("link")
    public void setLink(String link) {
        this.link = link;
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
