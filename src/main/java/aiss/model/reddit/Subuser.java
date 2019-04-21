
package aiss.model.reddit;

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
    "default_set",
    "user_is_contributor",
    "banner_img",
    "disable_contributor_requests",
    "user_is_banned",
    "free_form_reports",
    "community_icon",
    "show_media",
    "icon_color",
    "user_is_muted",
    "display_name",
    "header_img",
    "title",
    "over_18",
    "icon_size",
    "primary_color",
    "icon_img",
    "description",
    "header_size",
    "restrict_posting",
    "restrict_commenting",
    "subscribers",
    "is_default_icon",
    "link_flair_position",
    "display_name_prefixed",
    "key_color",
    "name",
    "is_default_banner",
    "url",
    "banner_size",
    "user_is_moderator",
    "public_description",
    "link_flair_enabled",
    "subreddit_type",
    "user_is_subscriber"
})
public class Subuser {

    @JsonProperty("default_set")
    private Boolean defaultSet;
    @JsonProperty("user_is_contributor")
    private Boolean userIsContributor;
    @JsonProperty("banner_img")
    private String bannerImg;
    @JsonProperty("disable_contributor_requests")
    private Boolean disableContributorRequests;
    @JsonProperty("user_is_banned")
    private Boolean userIsBanned;
    @JsonProperty("free_form_reports")
    private Boolean freeFormReports;
    @JsonProperty("community_icon")
    private String communityIcon;
    @JsonProperty("show_media")
    private Boolean showMedia;
    @JsonProperty("icon_color")
    private String iconColor;
    @JsonProperty("user_is_muted")
    private Boolean userIsMuted;
    @JsonProperty("display_name")
    private String displayName;
    @JsonProperty("header_img")
    private Object headerImg;
    @JsonProperty("title")
    private String title;
    @JsonProperty("over_18")
    private Boolean over18;
    @JsonProperty("icon_size")
    private List<Integer> iconSize = null;
    @JsonProperty("primary_color")
    private String primaryColor;
    @JsonProperty("icon_img")
    private String iconImg;
    @JsonProperty("description")
    private String description;
    @JsonProperty("header_size")
    private Object headerSize;
    @JsonProperty("restrict_posting")
    private Boolean restrictPosting;
    @JsonProperty("restrict_commenting")
    private Boolean restrictCommenting;
    @JsonProperty("subscribers")
    private Integer subscribers;
    @JsonProperty("is_default_icon")
    private Boolean isDefaultIcon;
    @JsonProperty("link_flair_position")
    private String linkFlairPosition;
    @JsonProperty("display_name_prefixed")
    private String displayNamePrefixed;
    @JsonProperty("key_color")
    private String keyColor;
    @JsonProperty("name")
    private String name;
    @JsonProperty("is_default_banner")
    private Boolean isDefaultBanner;
    @JsonProperty("url")
    private String url;
    @JsonProperty("banner_size")
    private Object bannerSize;
    @JsonProperty("user_is_moderator")
    private Boolean userIsModerator;
    @JsonProperty("public_description")
    private String publicDescription;
    @JsonProperty("link_flair_enabled")
    private Boolean linkFlairEnabled;
    @JsonProperty("subreddit_type")
    private String subredditType;
    @JsonProperty("user_is_subscriber")
    private Boolean userIsSubscriber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("default_set")
    public Boolean getDefaultSet() {
        return defaultSet;
    }

    @JsonProperty("default_set")
    public void setDefaultSet(Boolean defaultSet) {
        this.defaultSet = defaultSet;
    }

    @JsonProperty("user_is_contributor")
    public Boolean getUserIsContributor() {
        return userIsContributor;
    }

    @JsonProperty("user_is_contributor")
    public void setUserIsContributor(Boolean userIsContributor) {
        this.userIsContributor = userIsContributor;
    }

    @JsonProperty("banner_img")
    public String getBannerImg() {
        return bannerImg;
    }

    @JsonProperty("banner_img")
    public void setBannerImg(String bannerImg) {
        this.bannerImg = bannerImg;
    }

    @JsonProperty("disable_contributor_requests")
    public Boolean getDisableContributorRequests() {
        return disableContributorRequests;
    }

    @JsonProperty("disable_contributor_requests")
    public void setDisableContributorRequests(Boolean disableContributorRequests) {
        this.disableContributorRequests = disableContributorRequests;
    }

    @JsonProperty("user_is_banned")
    public Boolean getUserIsBanned() {
        return userIsBanned;
    }

    @JsonProperty("user_is_banned")
    public void setUserIsBanned(Boolean userIsBanned) {
        this.userIsBanned = userIsBanned;
    }

    @JsonProperty("free_form_reports")
    public Boolean getFreeFormReports() {
        return freeFormReports;
    }

    @JsonProperty("free_form_reports")
    public void setFreeFormReports(Boolean freeFormReports) {
        this.freeFormReports = freeFormReports;
    }

    @JsonProperty("community_icon")
    public String getCommunityIcon() {
        return communityIcon;
    }

    @JsonProperty("community_icon")
    public void setCommunityIcon(String communityIcon) {
        this.communityIcon = communityIcon;
    }

    @JsonProperty("show_media")
    public Boolean getShowMedia() {
        return showMedia;
    }

    @JsonProperty("show_media")
    public void setShowMedia(Boolean showMedia) {
        this.showMedia = showMedia;
    }

    @JsonProperty("icon_color")
    public String getIconColor() {
        return iconColor;
    }

    @JsonProperty("icon_color")
    public void setIconColor(String iconColor) {
        this.iconColor = iconColor;
    }

    @JsonProperty("user_is_muted")
    public Boolean getUserIsMuted() {
        return userIsMuted;
    }

    @JsonProperty("user_is_muted")
    public void setUserIsMuted(Boolean userIsMuted) {
        this.userIsMuted = userIsMuted;
    }

    @JsonProperty("display_name")
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty("display_name")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @JsonProperty("header_img")
    public Object getHeaderImg() {
        return headerImg;
    }

    @JsonProperty("header_img")
    public void setHeaderImg(Object headerImg) {
        this.headerImg = headerImg;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("over_18")
    public Boolean getOver18() {
        return over18;
    }

    @JsonProperty("over_18")
    public void setOver18(Boolean over18) {
        this.over18 = over18;
    }

    @JsonProperty("icon_size")
    public List<Integer> getIconSize() {
        return iconSize;
    }

    @JsonProperty("icon_size")
    public void setIconSize(List<Integer> iconSize) {
        this.iconSize = iconSize;
    }

    @JsonProperty("primary_color")
    public String getPrimaryColor() {
        return primaryColor;
    }

    @JsonProperty("primary_color")
    public void setPrimaryColor(String primaryColor) {
        this.primaryColor = primaryColor;
    }

    @JsonProperty("icon_img")
    public String getIconImg() {
        return iconImg;
    }

    @JsonProperty("icon_img")
    public void setIconImg(String iconImg) {
        this.iconImg = iconImg;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("header_size")
    public Object getHeaderSize() {
        return headerSize;
    }

    @JsonProperty("header_size")
    public void setHeaderSize(Object headerSize) {
        this.headerSize = headerSize;
    }

    @JsonProperty("restrict_posting")
    public Boolean getRestrictPosting() {
        return restrictPosting;
    }

    @JsonProperty("restrict_posting")
    public void setRestrictPosting(Boolean restrictPosting) {
        this.restrictPosting = restrictPosting;
    }

    @JsonProperty("restrict_commenting")
    public Boolean getRestrictCommenting() {
        return restrictCommenting;
    }

    @JsonProperty("restrict_commenting")
    public void setRestrictCommenting(Boolean restrictCommenting) {
        this.restrictCommenting = restrictCommenting;
    }

    @JsonProperty("subscribers")
    public Integer getSubscribers() {
        return subscribers;
    }

    @JsonProperty("subscribers")
    public void setSubscribers(Integer subscribers) {
        this.subscribers = subscribers;
    }

    @JsonProperty("is_default_icon")
    public Boolean getIsDefaultIcon() {
        return isDefaultIcon;
    }

    @JsonProperty("is_default_icon")
    public void setIsDefaultIcon(Boolean isDefaultIcon) {
        this.isDefaultIcon = isDefaultIcon;
    }

    @JsonProperty("link_flair_position")
    public String getLinkFlairPosition() {
        return linkFlairPosition;
    }

    @JsonProperty("link_flair_position")
    public void setLinkFlairPosition(String linkFlairPosition) {
        this.linkFlairPosition = linkFlairPosition;
    }

    @JsonProperty("display_name_prefixed")
    public String getDisplayNamePrefixed() {
        return displayNamePrefixed;
    }

    @JsonProperty("display_name_prefixed")
    public void setDisplayNamePrefixed(String displayNamePrefixed) {
        this.displayNamePrefixed = displayNamePrefixed;
    }

    @JsonProperty("key_color")
    public String getKeyColor() {
        return keyColor;
    }

    @JsonProperty("key_color")
    public void setKeyColor(String keyColor) {
        this.keyColor = keyColor;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("is_default_banner")
    public Boolean getIsDefaultBanner() {
        return isDefaultBanner;
    }

    @JsonProperty("is_default_banner")
    public void setIsDefaultBanner(Boolean isDefaultBanner) {
        this.isDefaultBanner = isDefaultBanner;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("banner_size")
    public Object getBannerSize() {
        return bannerSize;
    }

    @JsonProperty("banner_size")
    public void setBannerSize(Object bannerSize) {
        this.bannerSize = bannerSize;
    }

    @JsonProperty("user_is_moderator")
    public Boolean getUserIsModerator() {
        return userIsModerator;
    }

    @JsonProperty("user_is_moderator")
    public void setUserIsModerator(Boolean userIsModerator) {
        this.userIsModerator = userIsModerator;
    }

    @JsonProperty("public_description")
    public String getPublicDescription() {
        return publicDescription;
    }

    @JsonProperty("public_description")
    public void setPublicDescription(String publicDescription) {
        this.publicDescription = publicDescription;
    }

    @JsonProperty("link_flair_enabled")
    public Boolean getLinkFlairEnabled() {
        return linkFlairEnabled;
    }

    @JsonProperty("link_flair_enabled")
    public void setLinkFlairEnabled(Boolean linkFlairEnabled) {
        this.linkFlairEnabled = linkFlairEnabled;
    }

    @JsonProperty("subreddit_type")
    public String getSubredditType() {
        return subredditType;
    }

    @JsonProperty("subreddit_type")
    public void setSubredditType(String subredditType) {
        this.subredditType = subredditType;
    }

    @JsonProperty("user_is_subscriber")
    public Boolean getUserIsSubscriber() {
        return userIsSubscriber;
    }

    @JsonProperty("user_is_subscriber")
    public void setUserIsSubscriber(Boolean userIsSubscriber) {
        this.userIsSubscriber = userIsSubscriber;
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
