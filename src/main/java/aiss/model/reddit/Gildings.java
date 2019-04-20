
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
    "gid_1",
    "gid_2",
    "gid_3"
})
public class Gildings {

    @JsonProperty("gid_1")
    private Integer gid1;
    @JsonProperty("gid_2")
    private Integer gid2;
    @JsonProperty("gid_3")
    private Integer gid3;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("gid_1")
    public Integer getGid1() {
        return gid1;
    }

    @JsonProperty("gid_1")
    public void setGid1(Integer gid1) {
        this.gid1 = gid1;
    }

    @JsonProperty("gid_2")
    public Integer getGid2() {
        return gid2;
    }

    @JsonProperty("gid_2")
    public void setGid2(Integer gid2) {
        this.gid2 = gid2;
    }

    @JsonProperty("gid_3")
    public Integer getGid3() {
        return gid3;
    }

    @JsonProperty("gid_3")
    public void setGid3(Integer gid3) {
        this.gid3 = gid3;
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
