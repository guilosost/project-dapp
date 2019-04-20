
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
    "approved_at_utc",
    "subreddit",
    "selftext",
    "author_fullname",
    "saved",
    "mod_reason_title",
    "gilded",
    "clicked",
    "title",
    "link_flair_richtext",
    "subreddit_name_prefixed",
    "hidden",
    "pwls",
    "link_flair_css_class",
    "downs",
    "thumbnail_height",
    "hide_score",
    "name",
    "quarantine",
    "link_flair_text_color",
    "author_flair_background_color",
    "subreddit_type",
    "ups",
    "domain",
    "media_embed",
    "thumbnail_width",
    "author_flair_template_id",
    "is_original_content",
    "user_reports",
    "secure_media",
    "is_reddit_media_domain",
    "is_meta",
    "category",
    "secure_media_embed",
    "link_flair_text",
    "can_mod_post",
    "score",
    "approved_by",
    "thumbnail",
    "edited",
    "author_flair_css_class",
    "author_flair_richtext",
    "gildings",
    "post_hint",
    "content_categories",
    "is_self",
    "mod_note",
    "created",
    "link_flair_type",
    "wls",
    "banned_by",
    "author_flair_type",
    "contest_mode",
    "selftext_html",
    "likes",
    "suggested_sort",
    "banned_at_utc",
    "view_count",
    "archived",
    "no_follow",
    "is_crosspostable",
    "pinned",
    "over_18",
    "preview",
    "media_only",
    "can_gild",
    "spoiler",
    "locked",
    "author_flair_text",
    "visited",
    "num_reports",
    "distinguished",
    "subreddit_id",
    "mod_reason_by",
    "removal_reason",
    "link_flair_background_color",
    "id",
    "is_robot_indexable",
    "report_reasons",
    "author",
    "num_crossposts",
    "num_comments",
    "send_replies",
    "whitelist_status",
    "mod_reports",
    "author_patreon_flair",
    "author_flair_text_color",
    "permalink",
    "parent_whitelist_status",
    "stickied",
    "url",
    "subreddit_subscribers",
    "created_utc",
    "media",
    "is_video"
})
public class Data_ {

    @JsonProperty("approved_at_utc")
    private Object approvedAtUtc;
    @JsonProperty("subreddit")
    private String subreddit;
    @JsonProperty("selftext")
    private String selftext;
    @JsonProperty("author_fullname")
    private String authorFullname;
    @JsonProperty("saved")
    private Boolean saved;
    @JsonProperty("mod_reason_title")
    private Object modReasonTitle;
    @JsonProperty("gilded")
    private Integer gilded;
    @JsonProperty("clicked")
    private Boolean clicked;
    @JsonProperty("title")
    private String title;
    @JsonProperty("link_flair_richtext")
    private List<LinkFlairRichtext> linkFlairRichtext = null;
    @JsonProperty("subreddit_name_prefixed")
    private String subredditNamePrefixed;
    @JsonProperty("hidden")
    private Boolean hidden;
    @JsonProperty("pwls")
    private Integer pwls;
    @JsonProperty("link_flair_css_class")
    private String linkFlairCssClass;
    @JsonProperty("downs")
    private Integer downs;
    @JsonProperty("thumbnail_height")
    private Object thumbnailHeight;
    @JsonProperty("hide_score")
    private Boolean hideScore;
    @JsonProperty("name")
    private String name;
    @JsonProperty("quarantine")
    private Boolean quarantine;
    @JsonProperty("link_flair_text_color")
    private String linkFlairTextColor;
    @JsonProperty("author_flair_background_color")
    private String authorFlairBackgroundColor;
    @JsonProperty("subreddit_type")
    private String subredditType;
    @JsonProperty("ups")
    private Integer ups;
    @JsonProperty("domain")
    private String domain;
    @JsonProperty("media_embed")
    private MediaEmbed mediaEmbed;
    @JsonProperty("thumbnail_width")
    private Object thumbnailWidth;
    @JsonProperty("author_flair_template_id")
    private Object authorFlairTemplateId;
    @JsonProperty("is_original_content")
    private Boolean isOriginalContent;
    @JsonProperty("user_reports")
    private List<Object> userReports = null;
    @JsonProperty("secure_media")
    private Object secureMedia;
    @JsonProperty("is_reddit_media_domain")
    private Boolean isRedditMediaDomain;
    @JsonProperty("is_meta")
    private Boolean isMeta;
    @JsonProperty("category")
    private Object category;
    @JsonProperty("secure_media_embed")
    private SecureMediaEmbed secureMediaEmbed;
    @JsonProperty("link_flair_text")
    private String linkFlairText;
    @JsonProperty("can_mod_post")
    private Boolean canModPost;
    @JsonProperty("score")
    private Integer score;
    @JsonProperty("approved_by")
    private Object approvedBy;
    @JsonProperty("thumbnail")
    private String thumbnail;
    @JsonProperty("edited")
    private Double edited;
    @JsonProperty("author_flair_css_class")
    private String authorFlairCssClass;
    @JsonProperty("author_flair_richtext")
    private List<Object> authorFlairRichtext = null;
    @JsonProperty("gildings")
    private Gildings gildings;
    @JsonProperty("post_hint")
    private String postHint;
    @JsonProperty("content_categories")
    private Object contentCategories;
    @JsonProperty("is_self")
    private Boolean isSelf;
    @JsonProperty("mod_note")
    private Object modNote;
    @JsonProperty("created")
    private Double created;
    @JsonProperty("link_flair_type")
    private String linkFlairType;
    @JsonProperty("wls")
    private Integer wls;
    @JsonProperty("banned_by")
    private Object bannedBy;
    @JsonProperty("author_flair_type")
    private String authorFlairType;
    @JsonProperty("contest_mode")
    private Boolean contestMode;
    @JsonProperty("selftext_html")
    private String selftextHtml;
    @JsonProperty("likes")
    private Object likes;
    @JsonProperty("suggested_sort")
    private String suggestedSort;
    @JsonProperty("banned_at_utc")
    private Object bannedAtUtc;
    @JsonProperty("view_count")
    private Object viewCount;
    @JsonProperty("archived")
    private Boolean archived;
    @JsonProperty("no_follow")
    private Boolean noFollow;
    @JsonProperty("is_crosspostable")
    private Boolean isCrosspostable;
    @JsonProperty("pinned")
    private Boolean pinned;
    @JsonProperty("over_18")
    private Boolean over18;
    @JsonProperty("preview")
    private Preview preview;
    @JsonProperty("media_only")
    private Boolean mediaOnly;
    @JsonProperty("can_gild")
    private Boolean canGild;
    @JsonProperty("spoiler")
    private Boolean spoiler;
    @JsonProperty("locked")
    private Boolean locked;
    @JsonProperty("author_flair_text")
    private Object authorFlairText;
    @JsonProperty("visited")
    private Boolean visited;
    @JsonProperty("num_reports")
    private Object numReports;
    @JsonProperty("distinguished")
    private Object distinguished;
    @JsonProperty("subreddit_id")
    private String subredditId;
    @JsonProperty("mod_reason_by")
    private Object modReasonBy;
    @JsonProperty("removal_reason")
    private Object removalReason;
    @JsonProperty("link_flair_background_color")
    private String linkFlairBackgroundColor;
    @JsonProperty("id")
    private String id;
    @JsonProperty("is_robot_indexable")
    private Boolean isRobotIndexable;
    @JsonProperty("report_reasons")
    private Object reportReasons;
    @JsonProperty("author")
    private String author;
    @JsonProperty("num_crossposts")
    private Integer numCrossposts;
    @JsonProperty("num_comments")
    private Integer numComments;
    @JsonProperty("send_replies")
    private Boolean sendReplies;
    @JsonProperty("whitelist_status")
    private String whitelistStatus;
    @JsonProperty("mod_reports")
    private List<Object> modReports = null;
    @JsonProperty("author_patreon_flair")
    private Boolean authorPatreonFlair;
    @JsonProperty("author_flair_text_color")
    private String authorFlairTextColor;
    @JsonProperty("permalink")
    private String permalink;
    @JsonProperty("parent_whitelist_status")
    private String parentWhitelistStatus;
    @JsonProperty("stickied")
    private Boolean stickied;
    @JsonProperty("url")
    private String url;
    @JsonProperty("subreddit_subscribers")
    private Integer subredditSubscribers;
    @JsonProperty("created_utc")
    private Double createdUtc;
    @JsonProperty("media")
    private Object media;
    @JsonProperty("is_video")
    private Boolean isVideo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("approved_at_utc")
    public Object getApprovedAtUtc() {
        return approvedAtUtc;
    }

    @JsonProperty("approved_at_utc")
    public void setApprovedAtUtc(Object approvedAtUtc) {
        this.approvedAtUtc = approvedAtUtc;
    }

    @JsonProperty("subreddit")
    public String getSubreddit() {
        return subreddit;
    }

    @JsonProperty("subreddit")
    public void setSubreddit(String subreddit) {
        this.subreddit = subreddit;
    }

    @JsonProperty("selftext")
    public String getSelftext() {
        return selftext;
    }

    @JsonProperty("selftext")
    public void setSelftext(String selftext) {
        this.selftext = selftext;
    }

    @JsonProperty("author_fullname")
    public String getAuthorFullname() {
        return authorFullname;
    }

    @JsonProperty("author_fullname")
    public void setAuthorFullname(String authorFullname) {
        this.authorFullname = authorFullname;
    }

    @JsonProperty("saved")
    public Boolean getSaved() {
        return saved;
    }

    @JsonProperty("saved")
    public void setSaved(Boolean saved) {
        this.saved = saved;
    }

    @JsonProperty("mod_reason_title")
    public Object getModReasonTitle() {
        return modReasonTitle;
    }

    @JsonProperty("mod_reason_title")
    public void setModReasonTitle(Object modReasonTitle) {
        this.modReasonTitle = modReasonTitle;
    }

    @JsonProperty("gilded")
    public Integer getGilded() {
        return gilded;
    }

    @JsonProperty("gilded")
    public void setGilded(Integer gilded) {
        this.gilded = gilded;
    }

    @JsonProperty("clicked")
    public Boolean getClicked() {
        return clicked;
    }

    @JsonProperty("clicked")
    public void setClicked(Boolean clicked) {
        this.clicked = clicked;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("link_flair_richtext")
    public List<LinkFlairRichtext> getLinkFlairRichtext() {
        return linkFlairRichtext;
    }

    @JsonProperty("link_flair_richtext")
    public void setLinkFlairRichtext(List<LinkFlairRichtext> linkFlairRichtext) {
        this.linkFlairRichtext = linkFlairRichtext;
    }

    @JsonProperty("subreddit_name_prefixed")
    public String getSubredditNamePrefixed() {
        return subredditNamePrefixed;
    }

    @JsonProperty("subreddit_name_prefixed")
    public void setSubredditNamePrefixed(String subredditNamePrefixed) {
        this.subredditNamePrefixed = subredditNamePrefixed;
    }

    @JsonProperty("hidden")
    public Boolean getHidden() {
        return hidden;
    }

    @JsonProperty("hidden")
    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    @JsonProperty("pwls")
    public Integer getPwls() {
        return pwls;
    }

    @JsonProperty("pwls")
    public void setPwls(Integer pwls) {
        this.pwls = pwls;
    }

    @JsonProperty("link_flair_css_class")
    public String getLinkFlairCssClass() {
        return linkFlairCssClass;
    }

    @JsonProperty("link_flair_css_class")
    public void setLinkFlairCssClass(String linkFlairCssClass) {
        this.linkFlairCssClass = linkFlairCssClass;
    }

    @JsonProperty("downs")
    public Integer getDowns() {
        return downs;
    }

    @JsonProperty("downs")
    public void setDowns(Integer downs) {
        this.downs = downs;
    }

    @JsonProperty("thumbnail_height")
    public Object getThumbnailHeight() {
        return thumbnailHeight;
    }

    @JsonProperty("thumbnail_height")
    public void setThumbnailHeight(Object thumbnailHeight) {
        this.thumbnailHeight = thumbnailHeight;
    }

    @JsonProperty("hide_score")
    public Boolean getHideScore() {
        return hideScore;
    }

    @JsonProperty("hide_score")
    public void setHideScore(Boolean hideScore) {
        this.hideScore = hideScore;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("quarantine")
    public Boolean getQuarantine() {
        return quarantine;
    }

    @JsonProperty("quarantine")
    public void setQuarantine(Boolean quarantine) {
        this.quarantine = quarantine;
    }

    @JsonProperty("link_flair_text_color")
    public String getLinkFlairTextColor() {
        return linkFlairTextColor;
    }

    @JsonProperty("link_flair_text_color")
    public void setLinkFlairTextColor(String linkFlairTextColor) {
        this.linkFlairTextColor = linkFlairTextColor;
    }

    @JsonProperty("author_flair_background_color")
    public String getAuthorFlairBackgroundColor() {
        return authorFlairBackgroundColor;
    }

    @JsonProperty("author_flair_background_color")
    public void setAuthorFlairBackgroundColor(String authorFlairBackgroundColor) {
        this.authorFlairBackgroundColor = authorFlairBackgroundColor;
    }

    @JsonProperty("subreddit_type")
    public String getSubredditType() {
        return subredditType;
    }

    @JsonProperty("subreddit_type")
    public void setSubredditType(String subredditType) {
        this.subredditType = subredditType;
    }

    @JsonProperty("ups")
    public Integer getUps() {
        return ups;
    }

    @JsonProperty("ups")
    public void setUps(Integer ups) {
        this.ups = ups;
    }

    @JsonProperty("domain")
    public String getDomain() {
        return domain;
    }

    @JsonProperty("domain")
    public void setDomain(String domain) {
        this.domain = domain;
    }

    @JsonProperty("media_embed")
    public MediaEmbed getMediaEmbed() {
        return mediaEmbed;
    }

    @JsonProperty("media_embed")
    public void setMediaEmbed(MediaEmbed mediaEmbed) {
        this.mediaEmbed = mediaEmbed;
    }

    @JsonProperty("thumbnail_width")
    public Object getThumbnailWidth() {
        return thumbnailWidth;
    }

    @JsonProperty("thumbnail_width")
    public void setThumbnailWidth(Object thumbnailWidth) {
        this.thumbnailWidth = thumbnailWidth;
    }

    @JsonProperty("author_flair_template_id")
    public Object getAuthorFlairTemplateId() {
        return authorFlairTemplateId;
    }

    @JsonProperty("author_flair_template_id")
    public void setAuthorFlairTemplateId(Object authorFlairTemplateId) {
        this.authorFlairTemplateId = authorFlairTemplateId;
    }

    @JsonProperty("is_original_content")
    public Boolean getIsOriginalContent() {
        return isOriginalContent;
    }

    @JsonProperty("is_original_content")
    public void setIsOriginalContent(Boolean isOriginalContent) {
        this.isOriginalContent = isOriginalContent;
    }

    @JsonProperty("user_reports")
    public List<Object> getUserReports() {
        return userReports;
    }

    @JsonProperty("user_reports")
    public void setUserReports(List<Object> userReports) {
        this.userReports = userReports;
    }

    @JsonProperty("secure_media")
    public Object getSecureMedia() {
        return secureMedia;
    }

    @JsonProperty("secure_media")
    public void setSecureMedia(Object secureMedia) {
        this.secureMedia = secureMedia;
    }

    @JsonProperty("is_reddit_media_domain")
    public Boolean getIsRedditMediaDomain() {
        return isRedditMediaDomain;
    }

    @JsonProperty("is_reddit_media_domain")
    public void setIsRedditMediaDomain(Boolean isRedditMediaDomain) {
        this.isRedditMediaDomain = isRedditMediaDomain;
    }

    @JsonProperty("is_meta")
    public Boolean getIsMeta() {
        return isMeta;
    }

    @JsonProperty("is_meta")
    public void setIsMeta(Boolean isMeta) {
        this.isMeta = isMeta;
    }

    @JsonProperty("category")
    public Object getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(Object category) {
        this.category = category;
    }

    @JsonProperty("secure_media_embed")
    public SecureMediaEmbed getSecureMediaEmbed() {
        return secureMediaEmbed;
    }

    @JsonProperty("secure_media_embed")
    public void setSecureMediaEmbed(SecureMediaEmbed secureMediaEmbed) {
        this.secureMediaEmbed = secureMediaEmbed;
    }

    @JsonProperty("link_flair_text")
    public String getLinkFlairText() {
        return linkFlairText;
    }

    @JsonProperty("link_flair_text")
    public void setLinkFlairText(String linkFlairText) {
        this.linkFlairText = linkFlairText;
    }

    @JsonProperty("can_mod_post")
    public Boolean getCanModPost() {
        return canModPost;
    }

    @JsonProperty("can_mod_post")
    public void setCanModPost(Boolean canModPost) {
        this.canModPost = canModPost;
    }

    @JsonProperty("score")
    public Integer getScore() {
        return score;
    }

    @JsonProperty("score")
    public void setScore(Integer score) {
        this.score = score;
    }

    @JsonProperty("approved_by")
    public Object getApprovedBy() {
        return approvedBy;
    }

    @JsonProperty("approved_by")
    public void setApprovedBy(Object approvedBy) {
        this.approvedBy = approvedBy;
    }

    @JsonProperty("thumbnail")
    public String getThumbnail() {
        return thumbnail;
    }

    @JsonProperty("thumbnail")
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    @JsonProperty("edited")
    public Double getEdited() {
        return edited;
    }

    @JsonProperty("edited")
    public void setEdited(Double edited) {
        this.edited = edited;
    }

    @JsonProperty("author_flair_css_class")
    public String getAuthorFlairCssClass() {
        return authorFlairCssClass;
    }

    @JsonProperty("author_flair_css_class")
    public void setAuthorFlairCssClass(String authorFlairCssClass) {
        this.authorFlairCssClass = authorFlairCssClass;
    }

    @JsonProperty("author_flair_richtext")
    public List<Object> getAuthorFlairRichtext() {
        return authorFlairRichtext;
    }

    @JsonProperty("author_flair_richtext")
    public void setAuthorFlairRichtext(List<Object> authorFlairRichtext) {
        this.authorFlairRichtext = authorFlairRichtext;
    }

    @JsonProperty("gildings")
    public Gildings getGildings() {
        return gildings;
    }

    @JsonProperty("gildings")
    public void setGildings(Gildings gildings) {
        this.gildings = gildings;
    }

    @JsonProperty("post_hint")
    public String getPostHint() {
        return postHint;
    }

    @JsonProperty("post_hint")
    public void setPostHint(String postHint) {
        this.postHint = postHint;
    }

    @JsonProperty("content_categories")
    public Object getContentCategories() {
        return contentCategories;
    }

    @JsonProperty("content_categories")
    public void setContentCategories(Object contentCategories) {
        this.contentCategories = contentCategories;
    }

    @JsonProperty("is_self")
    public Boolean getIsSelf() {
        return isSelf;
    }

    @JsonProperty("is_self")
    public void setIsSelf(Boolean isSelf) {
        this.isSelf = isSelf;
    }

    @JsonProperty("mod_note")
    public Object getModNote() {
        return modNote;
    }

    @JsonProperty("mod_note")
    public void setModNote(Object modNote) {
        this.modNote = modNote;
    }

    @JsonProperty("created")
    public Double getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(Double created) {
        this.created = created;
    }

    @JsonProperty("link_flair_type")
    public String getLinkFlairType() {
        return linkFlairType;
    }

    @JsonProperty("link_flair_type")
    public void setLinkFlairType(String linkFlairType) {
        this.linkFlairType = linkFlairType;
    }

    @JsonProperty("wls")
    public Integer getWls() {
        return wls;
    }

    @JsonProperty("wls")
    public void setWls(Integer wls) {
        this.wls = wls;
    }

    @JsonProperty("banned_by")
    public Object getBannedBy() {
        return bannedBy;
    }

    @JsonProperty("banned_by")
    public void setBannedBy(Object bannedBy) {
        this.bannedBy = bannedBy;
    }

    @JsonProperty("author_flair_type")
    public String getAuthorFlairType() {
        return authorFlairType;
    }

    @JsonProperty("author_flair_type")
    public void setAuthorFlairType(String authorFlairType) {
        this.authorFlairType = authorFlairType;
    }

    @JsonProperty("contest_mode")
    public Boolean getContestMode() {
        return contestMode;
    }

    @JsonProperty("contest_mode")
    public void setContestMode(Boolean contestMode) {
        this.contestMode = contestMode;
    }

    @JsonProperty("selftext_html")
    public String getSelftextHtml() {
        return selftextHtml;
    }

    @JsonProperty("selftext_html")
    public void setSelftextHtml(String selftextHtml) {
        this.selftextHtml = selftextHtml;
    }

    @JsonProperty("likes")
    public Object getLikes() {
        return likes;
    }

    @JsonProperty("likes")
    public void setLikes(Object likes) {
        this.likes = likes;
    }

    @JsonProperty("suggested_sort")
    public String getSuggestedSort() {
        return suggestedSort;
    }

    @JsonProperty("suggested_sort")
    public void setSuggestedSort(String suggestedSort) {
        this.suggestedSort = suggestedSort;
    }

    @JsonProperty("banned_at_utc")
    public Object getBannedAtUtc() {
        return bannedAtUtc;
    }

    @JsonProperty("banned_at_utc")
    public void setBannedAtUtc(Object bannedAtUtc) {
        this.bannedAtUtc = bannedAtUtc;
    }

    @JsonProperty("view_count")
    public Object getViewCount() {
        return viewCount;
    }

    @JsonProperty("view_count")
    public void setViewCount(Object viewCount) {
        this.viewCount = viewCount;
    }

    @JsonProperty("archived")
    public Boolean getArchived() {
        return archived;
    }

    @JsonProperty("archived")
    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    @JsonProperty("no_follow")
    public Boolean getNoFollow() {
        return noFollow;
    }

    @JsonProperty("no_follow")
    public void setNoFollow(Boolean noFollow) {
        this.noFollow = noFollow;
    }

    @JsonProperty("is_crosspostable")
    public Boolean getIsCrosspostable() {
        return isCrosspostable;
    }

    @JsonProperty("is_crosspostable")
    public void setIsCrosspostable(Boolean isCrosspostable) {
        this.isCrosspostable = isCrosspostable;
    }

    @JsonProperty("pinned")
    public Boolean getPinned() {
        return pinned;
    }

    @JsonProperty("pinned")
    public void setPinned(Boolean pinned) {
        this.pinned = pinned;
    }

    @JsonProperty("over_18")
    public Boolean getOver18() {
        return over18;
    }

    @JsonProperty("over_18")
    public void setOver18(Boolean over18) {
        this.over18 = over18;
    }

    @JsonProperty("preview")
    public Preview getPreview() {
        return preview;
    }

    @JsonProperty("preview")
    public void setPreview(Preview preview) {
        this.preview = preview;
    }

    @JsonProperty("media_only")
    public Boolean getMediaOnly() {
        return mediaOnly;
    }

    @JsonProperty("media_only")
    public void setMediaOnly(Boolean mediaOnly) {
        this.mediaOnly = mediaOnly;
    }

    @JsonProperty("can_gild")
    public Boolean getCanGild() {
        return canGild;
    }

    @JsonProperty("can_gild")
    public void setCanGild(Boolean canGild) {
        this.canGild = canGild;
    }

    @JsonProperty("spoiler")
    public Boolean getSpoiler() {
        return spoiler;
    }

    @JsonProperty("spoiler")
    public void setSpoiler(Boolean spoiler) {
        this.spoiler = spoiler;
    }

    @JsonProperty("locked")
    public Boolean getLocked() {
        return locked;
    }

    @JsonProperty("locked")
    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    @JsonProperty("author_flair_text")
    public Object getAuthorFlairText() {
        return authorFlairText;
    }

    @JsonProperty("author_flair_text")
    public void setAuthorFlairText(Object authorFlairText) {
        this.authorFlairText = authorFlairText;
    }

    @JsonProperty("visited")
    public Boolean getVisited() {
        return visited;
    }

    @JsonProperty("visited")
    public void setVisited(Boolean visited) {
        this.visited = visited;
    }

    @JsonProperty("num_reports")
    public Object getNumReports() {
        return numReports;
    }

    @JsonProperty("num_reports")
    public void setNumReports(Object numReports) {
        this.numReports = numReports;
    }

    @JsonProperty("distinguished")
    public Object getDistinguished() {
        return distinguished;
    }

    @JsonProperty("distinguished")
    public void setDistinguished(Object distinguished) {
        this.distinguished = distinguished;
    }

    @JsonProperty("subreddit_id")
    public String getSubredditId() {
        return subredditId;
    }

    @JsonProperty("subreddit_id")
    public void setSubredditId(String subredditId) {
        this.subredditId = subredditId;
    }

    @JsonProperty("mod_reason_by")
    public Object getModReasonBy() {
        return modReasonBy;
    }

    @JsonProperty("mod_reason_by")
    public void setModReasonBy(Object modReasonBy) {
        this.modReasonBy = modReasonBy;
    }

    @JsonProperty("removal_reason")
    public Object getRemovalReason() {
        return removalReason;
    }

    @JsonProperty("removal_reason")
    public void setRemovalReason(Object removalReason) {
        this.removalReason = removalReason;
    }

    @JsonProperty("link_flair_background_color")
    public String getLinkFlairBackgroundColor() {
        return linkFlairBackgroundColor;
    }

    @JsonProperty("link_flair_background_color")
    public void setLinkFlairBackgroundColor(String linkFlairBackgroundColor) {
        this.linkFlairBackgroundColor = linkFlairBackgroundColor;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("is_robot_indexable")
    public Boolean getIsRobotIndexable() {
        return isRobotIndexable;
    }

    @JsonProperty("is_robot_indexable")
    public void setIsRobotIndexable(Boolean isRobotIndexable) {
        this.isRobotIndexable = isRobotIndexable;
    }

    @JsonProperty("report_reasons")
    public Object getReportReasons() {
        return reportReasons;
    }

    @JsonProperty("report_reasons")
    public void setReportReasons(Object reportReasons) {
        this.reportReasons = reportReasons;
    }

    @JsonProperty("author")
    public String getAuthor() {
        return author;
    }

    @JsonProperty("author")
    public void setAuthor(String author) {
        this.author = author;
    }

    @JsonProperty("num_crossposts")
    public Integer getNumCrossposts() {
        return numCrossposts;
    }

    @JsonProperty("num_crossposts")
    public void setNumCrossposts(Integer numCrossposts) {
        this.numCrossposts = numCrossposts;
    }

    @JsonProperty("num_comments")
    public Integer getNumComments() {
        return numComments;
    }

    @JsonProperty("num_comments")
    public void setNumComments(Integer numComments) {
        this.numComments = numComments;
    }

    @JsonProperty("send_replies")
    public Boolean getSendReplies() {
        return sendReplies;
    }

    @JsonProperty("send_replies")
    public void setSendReplies(Boolean sendReplies) {
        this.sendReplies = sendReplies;
    }

    @JsonProperty("whitelist_status")
    public String getWhitelistStatus() {
        return whitelistStatus;
    }

    @JsonProperty("whitelist_status")
    public void setWhitelistStatus(String whitelistStatus) {
        this.whitelistStatus = whitelistStatus;
    }

    @JsonProperty("mod_reports")
    public List<Object> getModReports() {
        return modReports;
    }

    @JsonProperty("mod_reports")
    public void setModReports(List<Object> modReports) {
        this.modReports = modReports;
    }

    @JsonProperty("author_patreon_flair")
    public Boolean getAuthorPatreonFlair() {
        return authorPatreonFlair;
    }

    @JsonProperty("author_patreon_flair")
    public void setAuthorPatreonFlair(Boolean authorPatreonFlair) {
        this.authorPatreonFlair = authorPatreonFlair;
    }

    @JsonProperty("author_flair_text_color")
    public String getAuthorFlairTextColor() {
        return authorFlairTextColor;
    }

    @JsonProperty("author_flair_text_color")
    public void setAuthorFlairTextColor(String authorFlairTextColor) {
        this.authorFlairTextColor = authorFlairTextColor;
    }

    @JsonProperty("permalink")
    public String getPermalink() {
        return permalink;
    }

    @JsonProperty("permalink")
    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    @JsonProperty("parent_whitelist_status")
    public String getParentWhitelistStatus() {
        return parentWhitelistStatus;
    }

    @JsonProperty("parent_whitelist_status")
    public void setParentWhitelistStatus(String parentWhitelistStatus) {
        this.parentWhitelistStatus = parentWhitelistStatus;
    }

    @JsonProperty("stickied")
    public Boolean getStickied() {
        return stickied;
    }

    @JsonProperty("stickied")
    public void setStickied(Boolean stickied) {
        this.stickied = stickied;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("subreddit_subscribers")
    public Integer getSubredditSubscribers() {
        return subredditSubscribers;
    }

    @JsonProperty("subreddit_subscribers")
    public void setSubredditSubscribers(Integer subredditSubscribers) {
        this.subredditSubscribers = subredditSubscribers;
    }

    @JsonProperty("created_utc")
    public Double getCreatedUtc() {
        return createdUtc;
    }

    @JsonProperty("created_utc")
    public void setCreatedUtc(Double createdUtc) {
        this.createdUtc = createdUtc;
    }

    @JsonProperty("media")
    public Object getMedia() {
        return media;
    }

    @JsonProperty("media")
    public void setMedia(Object media) {
        this.media = media;
    }

    @JsonProperty("is_video")
    public Boolean getIsVideo() {
        return isVideo;
    }

    @JsonProperty("is_video")
    public void setIsVideo(Boolean isVideo) {
        this.isVideo = isVideo;
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
