
package aiss.model.reddit;

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
    "is_employee",
    "has_visited_new_profile",
    "is_friend",
    "pref_no_profanity",
    "has_external_account",
    "pref_geopopular",
    "pref_show_trending",
    "subuser",
    "is_sponsor",
    "gold_expiration",
    "has_gold_subscription",
    "num_friends",
    "features",
    "has_android_subscription",
    "verified",
    "new_modmail_exists",
    "pref_autoplay",
    "coins",
    "has_paypal_subscription",
    "has_subscribed_to_premium",
    "id",
    "has_stripe_subscription",
    "over_18",
    "is_gold",
    "is_mod",
    "suspension_expiration_utc",
    "has_verified_email",
    "is_suspended",
    "pref_video_autoplay",
    "in_redesign_beta",
    "icon_img",
    "has_mod_mail",
    "pref_nightmode",
    "hide_from_robots",
    "modhash",
    "link_karma",
    "force_password_reset",
    "inbox_count",
    "pref_top_karma_subreddits",
    "has_mail",
    "pref_show_snoovatar",
    "name",
    "pref_clickgadget",
    "created",
    "gold_creddits",
    "created_utc",
    "has_ios_subscription",
    "pref_show_twitter",
    "in_beta",
    "comment_karma",
    "has_subscribed"
})
public class Datauser {

    @JsonProperty("is_employee")
    private Boolean isEmployee;
    @JsonProperty("has_visited_new_profile")
    private Boolean hasVisitedNewProfile;
    @JsonProperty("is_friend")
    private Boolean isFriend;
    @JsonProperty("pref_no_profanity")
    private Boolean prefNoProfanity;
    @JsonProperty("has_external_account")
    private Boolean hasExternalAccount;
    @JsonProperty("pref_geopopular")
    private Object prefGeopopular;
    @JsonProperty("pref_show_trending")
    private Boolean prefShowTrending;
    @JsonProperty("subuser")
    private Subuser subuser;
    @JsonProperty("is_sponsor")
    private Boolean isSponsor;
    @JsonProperty("gold_expiration")
    private Object goldExpiration;
    @JsonProperty("has_gold_subscription")
    private Boolean hasGoldSubscription;
    @JsonProperty("num_friends")
    private Integer numFriends;
    @JsonProperty("features")
    private Features features;
    @JsonProperty("has_android_subscription")
    private Boolean hasAndroidSubscription;
    @JsonProperty("verified")
    private Boolean verified;
    @JsonProperty("new_modmail_exists")
    private Object newModmailExists;
    @JsonProperty("pref_autoplay")
    private Boolean prefAutoplay;
    @JsonProperty("coins")
    private Integer coins;
    @JsonProperty("has_paypal_subscription")
    private Boolean hasPaypalSubscription;
    @JsonProperty("has_subscribed_to_premium")
    private Boolean hasSubscribedToPremium;
    @JsonProperty("id")
    private String id;
    @JsonProperty("has_stripe_subscription")
    private Boolean hasStripeSubscription;
    @JsonProperty("over_18")
    private Boolean over18;
    @JsonProperty("is_gold")
    private Boolean isGold;
    @JsonProperty("is_mod")
    private Boolean isMod;
    @JsonProperty("suspension_expiration_utc")
    private Object suspensionExpirationUtc;
    @JsonProperty("has_verified_email")
    private Boolean hasVerifiedEmail;
    @JsonProperty("is_suspended")
    private Boolean isSuspended;
    @JsonProperty("pref_video_autoplay")
    private Boolean prefVideoAutoplay;
    @JsonProperty("in_redesign_beta")
    private Boolean inRedesignBeta;
    @JsonProperty("icon_img")
    private String iconImg;
    @JsonProperty("has_mod_mail")
    private Boolean hasModMail;
    @JsonProperty("pref_nightmode")
    private Boolean prefNightmode;
    @JsonProperty("hide_from_robots")
    private Boolean hideFromRobots;
    @JsonProperty("modhash")
    private String modhash;
    @JsonProperty("link_karma")
    private Integer linkKarma;
    @JsonProperty("force_password_reset")
    private Boolean forcePasswordReset;
    @JsonProperty("inbox_count")
    private Integer inboxCount;
    @JsonProperty("pref_top_karma_subreddits")
    private Boolean prefTopKarmaSubreddits;
    @JsonProperty("has_mail")
    private Boolean hasMail;
    @JsonProperty("pref_show_snoovatar")
    private Boolean prefShowSnoovatar;
    @JsonProperty("name")
    private String name;
    @JsonProperty("pref_clickgadget")
    private Integer prefClickgadget;
    @JsonProperty("created")
    private Double created;
    @JsonProperty("gold_creddits")
    private Integer goldCreddits;
    @JsonProperty("created_utc")
    private Double createdUtc;
    @JsonProperty("has_ios_subscription")
    private Boolean hasIosSubscription;
    @JsonProperty("pref_show_twitter")
    private Boolean prefShowTwitter;
    @JsonProperty("in_beta")
    private Boolean inBeta;
    @JsonProperty("comment_karma")
    private Integer commentKarma;
    @JsonProperty("has_subscribed")
    private Boolean hasSubscribed;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("is_employee")
    public Boolean getIsEmployee() {
        return isEmployee;
    }

    @JsonProperty("is_employee")
    public void setIsEmployee(Boolean isEmployee) {
        this.isEmployee = isEmployee;
    }

    @JsonProperty("has_visited_new_profile")
    public Boolean getHasVisitedNewProfile() {
        return hasVisitedNewProfile;
    }

    @JsonProperty("has_visited_new_profile")
    public void setHasVisitedNewProfile(Boolean hasVisitedNewProfile) {
        this.hasVisitedNewProfile = hasVisitedNewProfile;
    }

    @JsonProperty("is_friend")
    public Boolean getIsFriend() {
        return isFriend;
    }

    @JsonProperty("is_friend")
    public void setIsFriend(Boolean isFriend) {
        this.isFriend = isFriend;
    }

    @JsonProperty("pref_no_profanity")
    public Boolean getPrefNoProfanity() {
        return prefNoProfanity;
    }

    @JsonProperty("pref_no_profanity")
    public void setPrefNoProfanity(Boolean prefNoProfanity) {
        this.prefNoProfanity = prefNoProfanity;
    }

    @JsonProperty("has_external_account")
    public Boolean getHasExternalAccount() {
        return hasExternalAccount;
    }

    @JsonProperty("has_external_account")
    public void setHasExternalAccount(Boolean hasExternalAccount) {
        this.hasExternalAccount = hasExternalAccount;
    }

    @JsonProperty("pref_geopopular")
    public Object getPrefGeopopular() {
        return prefGeopopular;
    }

    @JsonProperty("pref_geopopular")
    public void setPrefGeopopular(Object prefGeopopular) {
        this.prefGeopopular = prefGeopopular;
    }

    @JsonProperty("pref_show_trending")
    public Boolean getPrefShowTrending() {
        return prefShowTrending;
    }

    @JsonProperty("pref_show_trending")
    public void setPrefShowTrending(Boolean prefShowTrending) {
        this.prefShowTrending = prefShowTrending;
    }

    @JsonProperty("subuser")
    public Subuser getSubuser() {
        return subuser;
    }

    @JsonProperty("subuser")
    public void setSubuser(Subuser subuser) {
        this.subuser = subuser;
    }

    @JsonProperty("is_sponsor")
    public Boolean getIsSponsor() {
        return isSponsor;
    }

    @JsonProperty("is_sponsor")
    public void setIsSponsor(Boolean isSponsor) {
        this.isSponsor = isSponsor;
    }

    @JsonProperty("gold_expiration")
    public Object getGoldExpiration() {
        return goldExpiration;
    }

    @JsonProperty("gold_expiration")
    public void setGoldExpiration(Object goldExpiration) {
        this.goldExpiration = goldExpiration;
    }

    @JsonProperty("has_gold_subscription")
    public Boolean getHasGoldSubscription() {
        return hasGoldSubscription;
    }

    @JsonProperty("has_gold_subscription")
    public void setHasGoldSubscription(Boolean hasGoldSubscription) {
        this.hasGoldSubscription = hasGoldSubscription;
    }

    @JsonProperty("num_friends")
    public Integer getNumFriends() {
        return numFriends;
    }

    @JsonProperty("num_friends")
    public void setNumFriends(Integer numFriends) {
        this.numFriends = numFriends;
    }

    @JsonProperty("features")
    public Features getFeatures() {
        return features;
    }

    @JsonProperty("features")
    public void setFeatures(Features features) {
        this.features = features;
    }

    @JsonProperty("has_android_subscription")
    public Boolean getHasAndroidSubscription() {
        return hasAndroidSubscription;
    }

    @JsonProperty("has_android_subscription")
    public void setHasAndroidSubscription(Boolean hasAndroidSubscription) {
        this.hasAndroidSubscription = hasAndroidSubscription;
    }

    @JsonProperty("verified")
    public Boolean getVerified() {
        return verified;
    }

    @JsonProperty("verified")
    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    @JsonProperty("new_modmail_exists")
    public Object getNewModmailExists() {
        return newModmailExists;
    }

    @JsonProperty("new_modmail_exists")
    public void setNewModmailExists(Object newModmailExists) {
        this.newModmailExists = newModmailExists;
    }

    @JsonProperty("pref_autoplay")
    public Boolean getPrefAutoplay() {
        return prefAutoplay;
    }

    @JsonProperty("pref_autoplay")
    public void setPrefAutoplay(Boolean prefAutoplay) {
        this.prefAutoplay = prefAutoplay;
    }

    @JsonProperty("coins")
    public Integer getCoins() {
        return coins;
    }

    @JsonProperty("coins")
    public void setCoins(Integer coins) {
        this.coins = coins;
    }

    @JsonProperty("has_paypal_subscription")
    public Boolean getHasPaypalSubscription() {
        return hasPaypalSubscription;
    }

    @JsonProperty("has_paypal_subscription")
    public void setHasPaypalSubscription(Boolean hasPaypalSubscription) {
        this.hasPaypalSubscription = hasPaypalSubscription;
    }

    @JsonProperty("has_subscribed_to_premium")
    public Boolean getHasSubscribedToPremium() {
        return hasSubscribedToPremium;
    }

    @JsonProperty("has_subscribed_to_premium")
    public void setHasSubscribedToPremium(Boolean hasSubscribedToPremium) {
        this.hasSubscribedToPremium = hasSubscribedToPremium;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("has_stripe_subscription")
    public Boolean getHasStripeSubscription() {
        return hasStripeSubscription;
    }

    @JsonProperty("has_stripe_subscription")
    public void setHasStripeSubscription(Boolean hasStripeSubscription) {
        this.hasStripeSubscription = hasStripeSubscription;
    }

    @JsonProperty("over_18")
    public Boolean getOver18() {
        return over18;
    }

    @JsonProperty("over_18")
    public void setOver18(Boolean over18) {
        this.over18 = over18;
    }

    @JsonProperty("is_gold")
    public Boolean getIsGold() {
        return isGold;
    }

    @JsonProperty("is_gold")
    public void setIsGold(Boolean isGold) {
        this.isGold = isGold;
    }

    @JsonProperty("is_mod")
    public Boolean getIsMod() {
        return isMod;
    }

    @JsonProperty("is_mod")
    public void setIsMod(Boolean isMod) {
        this.isMod = isMod;
    }

    @JsonProperty("suspension_expiration_utc")
    public Object getSuspensionExpirationUtc() {
        return suspensionExpirationUtc;
    }

    @JsonProperty("suspension_expiration_utc")
    public void setSuspensionExpirationUtc(Object suspensionExpirationUtc) {
        this.suspensionExpirationUtc = suspensionExpirationUtc;
    }

    @JsonProperty("has_verified_email")
    public Boolean getHasVerifiedEmail() {
        return hasVerifiedEmail;
    }

    @JsonProperty("has_verified_email")
    public void setHasVerifiedEmail(Boolean hasVerifiedEmail) {
        this.hasVerifiedEmail = hasVerifiedEmail;
    }

    @JsonProperty("is_suspended")
    public Boolean getIsSuspended() {
        return isSuspended;
    }

    @JsonProperty("is_suspended")
    public void setIsSuspended(Boolean isSuspended) {
        this.isSuspended = isSuspended;
    }

    @JsonProperty("pref_video_autoplay")
    public Boolean getPrefVideoAutoplay() {
        return prefVideoAutoplay;
    }

    @JsonProperty("pref_video_autoplay")
    public void setPrefVideoAutoplay(Boolean prefVideoAutoplay) {
        this.prefVideoAutoplay = prefVideoAutoplay;
    }

    @JsonProperty("in_redesign_beta")
    public Boolean getInRedesignBeta() {
        return inRedesignBeta;
    }

    @JsonProperty("in_redesign_beta")
    public void setInRedesignBeta(Boolean inRedesignBeta) {
        this.inRedesignBeta = inRedesignBeta;
    }

    @JsonProperty("icon_img")
    public String getIconImg() {
        return iconImg;
    }

    @JsonProperty("icon_img")
    public void setIconImg(String iconImg) {
        this.iconImg = iconImg;
    }

    @JsonProperty("has_mod_mail")
    public Boolean getHasModMail() {
        return hasModMail;
    }

    @JsonProperty("has_mod_mail")
    public void setHasModMail(Boolean hasModMail) {
        this.hasModMail = hasModMail;
    }

    @JsonProperty("pref_nightmode")
    public Boolean getPrefNightmode() {
        return prefNightmode;
    }

    @JsonProperty("pref_nightmode")
    public void setPrefNightmode(Boolean prefNightmode) {
        this.prefNightmode = prefNightmode;
    }

    @JsonProperty("hide_from_robots")
    public Boolean getHideFromRobots() {
        return hideFromRobots;
    }

    @JsonProperty("hide_from_robots")
    public void setHideFromRobots(Boolean hideFromRobots) {
        this.hideFromRobots = hideFromRobots;
    }

    @JsonProperty("modhash")
    public String getModhash() {
        return modhash;
    }

    @JsonProperty("modhash")
    public void setModhash(String modhash) {
        this.modhash = modhash;
    }

    @JsonProperty("link_karma")
    public Integer getLinkKarma() {
        return linkKarma;
    }

    @JsonProperty("link_karma")
    public void setLinkKarma(Integer linkKarma) {
        this.linkKarma = linkKarma;
    }

    @JsonProperty("force_password_reset")
    public Boolean getForcePasswordReset() {
        return forcePasswordReset;
    }

    @JsonProperty("force_password_reset")
    public void setForcePasswordReset(Boolean forcePasswordReset) {
        this.forcePasswordReset = forcePasswordReset;
    }

    @JsonProperty("inbox_count")
    public Integer getInboxCount() {
        return inboxCount;
    }

    @JsonProperty("inbox_count")
    public void setInboxCount(Integer inboxCount) {
        this.inboxCount = inboxCount;
    }

    @JsonProperty("pref_top_karma_subreddits")
    public Boolean getPrefTopKarmaSubreddits() {
        return prefTopKarmaSubreddits;
    }

    @JsonProperty("pref_top_karma_subreddits")
    public void setPrefTopKarmaSubreddits(Boolean prefTopKarmaSubreddits) {
        this.prefTopKarmaSubreddits = prefTopKarmaSubreddits;
    }

    @JsonProperty("has_mail")
    public Boolean getHasMail() {
        return hasMail;
    }

    @JsonProperty("has_mail")
    public void setHasMail(Boolean hasMail) {
        this.hasMail = hasMail;
    }

    @JsonProperty("pref_show_snoovatar")
    public Boolean getPrefShowSnoovatar() {
        return prefShowSnoovatar;
    }

    @JsonProperty("pref_show_snoovatar")
    public void setPrefShowSnoovatar(Boolean prefShowSnoovatar) {
        this.prefShowSnoovatar = prefShowSnoovatar;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("pref_clickgadget")
    public Integer getPrefClickgadget() {
        return prefClickgadget;
    }

    @JsonProperty("pref_clickgadget")
    public void setPrefClickgadget(Integer prefClickgadget) {
        this.prefClickgadget = prefClickgadget;
    }

    @JsonProperty("created")
    public Double getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(Double created) {
        this.created = created;
    }

    @JsonProperty("gold_creddits")
    public Integer getGoldCreddits() {
        return goldCreddits;
    }

    @JsonProperty("gold_creddits")
    public void setGoldCreddits(Integer goldCreddits) {
        this.goldCreddits = goldCreddits;
    }

    @JsonProperty("created_utc")
    public Double getCreatedUtc() {
        return createdUtc;
    }

    @JsonProperty("created_utc")
    public void setCreatedUtc(Double createdUtc) {
        this.createdUtc = createdUtc;
    }

    @JsonProperty("has_ios_subscription")
    public Boolean getHasIosSubscription() {
        return hasIosSubscription;
    }

    @JsonProperty("has_ios_subscription")
    public void setHasIosSubscription(Boolean hasIosSubscription) {
        this.hasIosSubscription = hasIosSubscription;
    }

    @JsonProperty("pref_show_twitter")
    public Boolean getPrefShowTwitter() {
        return prefShowTwitter;
    }

    @JsonProperty("pref_show_twitter")
    public void setPrefShowTwitter(Boolean prefShowTwitter) {
        this.prefShowTwitter = prefShowTwitter;
    }

    @JsonProperty("in_beta")
    public Boolean getInBeta() {
        return inBeta;
    }

    @JsonProperty("in_beta")
    public void setInBeta(Boolean inBeta) {
        this.inBeta = inBeta;
    }

    @JsonProperty("comment_karma")
    public Integer getCommentKarma() {
        return commentKarma;
    }

    @JsonProperty("comment_karma")
    public void setCommentKarma(Integer commentKarma) {
        this.commentKarma = commentKarma;
    }

    @JsonProperty("has_subscribed")
    public Boolean getHasSubscribed() {
        return hasSubscribed;
    }

    @JsonProperty("has_subscribed")
    public void setHasSubscribed(Boolean hasSubscribed) {
        this.hasSubscribed = hasSubscribed;
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
