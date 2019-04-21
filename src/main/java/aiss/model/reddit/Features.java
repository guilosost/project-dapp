
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
    "richtext_previews",
    "do_not_track",
    "chat_subreddit",
    "seq_randomize_sort",
    "sequence",
    "email_verification",
    "show_amp_link",
    "mweb_xpromo_revamp_v2",
    "mweb_xpromo_interstitial_comments_android",
    "mweb_xpromo_interstitial_comments_ios",
    "spez_modal",
    "mweb_xpromo_modal_listing_click_daily_dismissible_ios",
    "chat_rollout",
    "chat_subreddit_notification_ftux",
    "chat_group_rollout",
    "chat_reddar_reports",
    "mweb_xpromo_modal_listing_click_daily_dismissible_android",
    "default_srs_holdout",
    "chat_user_settings",
    "dual_write_user_prefs"
})
public class Features {

    @JsonProperty("richtext_previews")
    private Boolean richtextPreviews;
    @JsonProperty("do_not_track")
    private Boolean doNotTrack;
    @JsonProperty("chat_subreddit")
    private Boolean chatSubreddit;
    @JsonProperty("seq_randomize_sort")
    private Boolean seqRandomizeSort;
    @JsonProperty("sequence")
    private Boolean sequence;
    @JsonProperty("email_verification")
    private EmailVerification emailVerification;
    @JsonProperty("show_amp_link")
    private Boolean showAmpLink;
    @JsonProperty("mweb_xpromo_revamp_v2")
    private MwebXpromoRevampV2 mwebXpromoRevampV2;
    @JsonProperty("mweb_xpromo_interstitial_comments_android")
    private Boolean mwebXpromoInterstitialCommentsAndroid;
    @JsonProperty("mweb_xpromo_interstitial_comments_ios")
    private Boolean mwebXpromoInterstitialCommentsIos;
    @JsonProperty("spez_modal")
    private Boolean spezModal;
    @JsonProperty("mweb_xpromo_modal_listing_click_daily_dismissible_ios")
    private Boolean mwebXpromoModalListingClickDailyDismissibleIos;
    @JsonProperty("chat_rollout")
    private Boolean chatRollout;
    @JsonProperty("chat_subreddit_notification_ftux")
    private Boolean chatSubredditNotificationFtux;
    @JsonProperty("chat_group_rollout")
    private Boolean chatGroupRollout;
    @JsonProperty("chat_reddar_reports")
    private Boolean chatReddarReports;
    @JsonProperty("mweb_xpromo_modal_listing_click_daily_dismissible_android")
    private Boolean mwebXpromoModalListingClickDailyDismissibleAndroid;
    @JsonProperty("default_srs_holdout")
    private DefaultSrsHoldout defaultSrsHoldout;
    @JsonProperty("chat_user_settings")
    private Boolean chatUserSettings;
    @JsonProperty("dual_write_user_prefs")
    private Boolean dualWriteUserPrefs;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("richtext_previews")
    public Boolean getRichtextPreviews() {
        return richtextPreviews;
    }

    @JsonProperty("richtext_previews")
    public void setRichtextPreviews(Boolean richtextPreviews) {
        this.richtextPreviews = richtextPreviews;
    }

    @JsonProperty("do_not_track")
    public Boolean getDoNotTrack() {
        return doNotTrack;
    }

    @JsonProperty("do_not_track")
    public void setDoNotTrack(Boolean doNotTrack) {
        this.doNotTrack = doNotTrack;
    }

    @JsonProperty("chat_subreddit")
    public Boolean getChatSubreddit() {
        return chatSubreddit;
    }

    @JsonProperty("chat_subreddit")
    public void setChatSubreddit(Boolean chatSubreddit) {
        this.chatSubreddit = chatSubreddit;
    }

    @JsonProperty("seq_randomize_sort")
    public Boolean getSeqRandomizeSort() {
        return seqRandomizeSort;
    }

    @JsonProperty("seq_randomize_sort")
    public void setSeqRandomizeSort(Boolean seqRandomizeSort) {
        this.seqRandomizeSort = seqRandomizeSort;
    }

    @JsonProperty("sequence")
    public Boolean getSequence() {
        return sequence;
    }

    @JsonProperty("sequence")
    public void setSequence(Boolean sequence) {
        this.sequence = sequence;
    }

    @JsonProperty("email_verification")
    public EmailVerification getEmailVerification() {
        return emailVerification;
    }

    @JsonProperty("email_verification")
    public void setEmailVerification(EmailVerification emailVerification) {
        this.emailVerification = emailVerification;
    }

    @JsonProperty("show_amp_link")
    public Boolean getShowAmpLink() {
        return showAmpLink;
    }

    @JsonProperty("show_amp_link")
    public void setShowAmpLink(Boolean showAmpLink) {
        this.showAmpLink = showAmpLink;
    }

    @JsonProperty("mweb_xpromo_revamp_v2")
    public MwebXpromoRevampV2 getMwebXpromoRevampV2() {
        return mwebXpromoRevampV2;
    }

    @JsonProperty("mweb_xpromo_revamp_v2")
    public void setMwebXpromoRevampV2(MwebXpromoRevampV2 mwebXpromoRevampV2) {
        this.mwebXpromoRevampV2 = mwebXpromoRevampV2;
    }

    @JsonProperty("mweb_xpromo_interstitial_comments_android")
    public Boolean getMwebXpromoInterstitialCommentsAndroid() {
        return mwebXpromoInterstitialCommentsAndroid;
    }

    @JsonProperty("mweb_xpromo_interstitial_comments_android")
    public void setMwebXpromoInterstitialCommentsAndroid(Boolean mwebXpromoInterstitialCommentsAndroid) {
        this.mwebXpromoInterstitialCommentsAndroid = mwebXpromoInterstitialCommentsAndroid;
    }

    @JsonProperty("mweb_xpromo_interstitial_comments_ios")
    public Boolean getMwebXpromoInterstitialCommentsIos() {
        return mwebXpromoInterstitialCommentsIos;
    }

    @JsonProperty("mweb_xpromo_interstitial_comments_ios")
    public void setMwebXpromoInterstitialCommentsIos(Boolean mwebXpromoInterstitialCommentsIos) {
        this.mwebXpromoInterstitialCommentsIos = mwebXpromoInterstitialCommentsIos;
    }

    @JsonProperty("spez_modal")
    public Boolean getSpezModal() {
        return spezModal;
    }

    @JsonProperty("spez_modal")
    public void setSpezModal(Boolean spezModal) {
        this.spezModal = spezModal;
    }

    @JsonProperty("mweb_xpromo_modal_listing_click_daily_dismissible_ios")
    public Boolean getMwebXpromoModalListingClickDailyDismissibleIos() {
        return mwebXpromoModalListingClickDailyDismissibleIos;
    }

    @JsonProperty("mweb_xpromo_modal_listing_click_daily_dismissible_ios")
    public void setMwebXpromoModalListingClickDailyDismissibleIos(Boolean mwebXpromoModalListingClickDailyDismissibleIos) {
        this.mwebXpromoModalListingClickDailyDismissibleIos = mwebXpromoModalListingClickDailyDismissibleIos;
    }

    @JsonProperty("chat_rollout")
    public Boolean getChatRollout() {
        return chatRollout;
    }

    @JsonProperty("chat_rollout")
    public void setChatRollout(Boolean chatRollout) {
        this.chatRollout = chatRollout;
    }

    @JsonProperty("chat_subreddit_notification_ftux")
    public Boolean getChatSubredditNotificationFtux() {
        return chatSubredditNotificationFtux;
    }

    @JsonProperty("chat_subreddit_notification_ftux")
    public void setChatSubredditNotificationFtux(Boolean chatSubredditNotificationFtux) {
        this.chatSubredditNotificationFtux = chatSubredditNotificationFtux;
    }

    @JsonProperty("chat_group_rollout")
    public Boolean getChatGroupRollout() {
        return chatGroupRollout;
    }

    @JsonProperty("chat_group_rollout")
    public void setChatGroupRollout(Boolean chatGroupRollout) {
        this.chatGroupRollout = chatGroupRollout;
    }

    @JsonProperty("chat_reddar_reports")
    public Boolean getChatReddarReports() {
        return chatReddarReports;
    }

    @JsonProperty("chat_reddar_reports")
    public void setChatReddarReports(Boolean chatReddarReports) {
        this.chatReddarReports = chatReddarReports;
    }

    @JsonProperty("mweb_xpromo_modal_listing_click_daily_dismissible_android")
    public Boolean getMwebXpromoModalListingClickDailyDismissibleAndroid() {
        return mwebXpromoModalListingClickDailyDismissibleAndroid;
    }

    @JsonProperty("mweb_xpromo_modal_listing_click_daily_dismissible_android")
    public void setMwebXpromoModalListingClickDailyDismissibleAndroid(Boolean mwebXpromoModalListingClickDailyDismissibleAndroid) {
        this.mwebXpromoModalListingClickDailyDismissibleAndroid = mwebXpromoModalListingClickDailyDismissibleAndroid;
    }

    @JsonProperty("default_srs_holdout")
    public DefaultSrsHoldout getDefaultSrsHoldout() {
        return defaultSrsHoldout;
    }

    @JsonProperty("default_srs_holdout")
    public void setDefaultSrsHoldout(DefaultSrsHoldout defaultSrsHoldout) {
        this.defaultSrsHoldout = defaultSrsHoldout;
    }

    @JsonProperty("chat_user_settings")
    public Boolean getChatUserSettings() {
        return chatUserSettings;
    }

    @JsonProperty("chat_user_settings")
    public void setChatUserSettings(Boolean chatUserSettings) {
        this.chatUserSettings = chatUserSettings;
    }

    @JsonProperty("dual_write_user_prefs")
    public Boolean getDualWriteUserPrefs() {
        return dualWriteUserPrefs;
    }

    @JsonProperty("dual_write_user_prefs")
    public void setDualWriteUserPrefs(Boolean dualWriteUserPrefs) {
        this.dualWriteUserPrefs = dualWriteUserPrefs;
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
