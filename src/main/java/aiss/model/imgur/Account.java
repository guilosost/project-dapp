
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
    "id",
    "url",
    "bio",
    "avatar",
    "reputation",
    "reputation_name",
    "created",
    "pro_expiration",
    "user_follow"
})
public class Account {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("url")
    private String url;
    @JsonProperty("bio")
    private Object bio;
    @JsonProperty("avatar")
    private Object avatar;
    @JsonProperty("reputation")
    private Integer reputation;
    @JsonProperty("reputation_name")
    private String reputationName;
    @JsonProperty("created")
    private Integer created;
    @JsonProperty("pro_expiration")
    private Boolean proExpiration;
    @JsonProperty("user_follow")
    private UserFollow userFollow;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("bio")
    public Object getBio() {
        return bio;
    }

    @JsonProperty("bio")
    public void setBio(Object bio) {
        this.bio = bio;
    }

    @JsonProperty("avatar")
    public Object getAvatar() {
        return avatar;
    }

    @JsonProperty("avatar")
    public void setAvatar(Object avatar) {
        this.avatar = avatar;
    }

    @JsonProperty("reputation")
    public Integer getReputation() {
        return reputation;
    }

    @JsonProperty("reputation")
    public void setReputation(Integer reputation) {
        this.reputation = reputation;
    }

    @JsonProperty("reputation_name")
    public String getReputationName() {
        return reputationName;
    }

    @JsonProperty("reputation_name")
    public void setReputationName(String reputationName) {
        this.reputationName = reputationName;
    }

    @JsonProperty("created")
    public Integer getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(Integer created) {
        this.created = created;
    }

    @JsonProperty("pro_expiration")
    public Boolean getProExpiration() {
        return proExpiration;
    }

    @JsonProperty("pro_expiration")
    public void setProExpiration(Boolean proExpiration) {
        this.proExpiration = proExpiration;
    }

    @JsonProperty("user_follow")
    public UserFollow getUserFollow() {
        return userFollow;
    }

    @JsonProperty("user_follow")
    public void setUserFollow(UserFollow userFollow) {
        this.userFollow = userFollow;
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
