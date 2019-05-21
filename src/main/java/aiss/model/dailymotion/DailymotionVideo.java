package aiss.model.dailymotion;

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
    "id",
    "likes_total",
    "owner.url",
    "owner.username",
    "title",
    "views_last_day",
    "views_last_month",
    "views_last_week",
    "views_total"
})
public class DailymotionVideo {

    @JsonProperty("id")
    private String id;
    @JsonProperty("likes_total")
    private Integer likesTotal;
    @JsonProperty("owner.url")
    private String ownerUrl;
    @JsonProperty("owner.username")
    private String ownerUsername;
    @JsonProperty("title")
    private String title;
    @JsonProperty("views_last_day")
    private Integer viewsLastDay;
    @JsonProperty("views_last_month")
    private Integer viewsLastMonth;
    @JsonProperty("views_last_week")
    private Integer viewsLastWeek;
    @JsonProperty("views_total")
    private Integer viewsTotal;
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

    @JsonProperty("likes_total")
    public Integer getLikesTotal() {
        return likesTotal;
    }

    @JsonProperty("likes_total")
    public void setLikesTotal(Integer likesTotal) {
        this.likesTotal = likesTotal;
    }

    @JsonProperty("owner.url")
    public String getOwnerUrl() {
        return ownerUrl;
    }

    @JsonProperty("owner.url")
    public void setOwnerUrl(String ownerUrl) {
        this.ownerUrl = ownerUrl;
    }

    @JsonProperty("owner.username")
    public String getOwnerUsername() {
        return ownerUsername;
    }

    @JsonProperty("owner.username")
    public void setOwnerUsername(String ownerUsername) {
        this.ownerUsername = ownerUsername;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("views_last_day")
    public Integer getViewsLastDay() {
        return viewsLastDay;
    }

    @JsonProperty("views_last_day")
    public void setViewsLastDay(Integer viewsLastDay) {
        this.viewsLastDay = viewsLastDay;
    }

    @JsonProperty("views_last_month")
    public Integer getViewsLastMonth() {
        return viewsLastMonth;
    }

    @JsonProperty("views_last_month")
    public void setViewsLastMonth(Integer viewsLastMonth) {
        this.viewsLastMonth = viewsLastMonth;
    }

    @JsonProperty("views_last_week")
    public Integer getViewsLastWeek() {
        return viewsLastWeek;
    }

    @JsonProperty("views_last_week")
    public void setViewsLastWeek(Integer viewsLastWeek) {
        this.viewsLastWeek = viewsLastWeek;
    }

    @JsonProperty("views_total")
    public Integer getViewsTotal() {
        return viewsTotal;
    }

    @JsonProperty("views_total")
    public void setViewsTotal(Integer viewsTotal) {
        this.viewsTotal = viewsTotal;
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
