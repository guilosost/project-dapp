
package aiss.model.twitter;

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
    "h",
    "resize",
    "w"
})
public class Small {

    @JsonProperty("h")
    private Integer h;
    @JsonProperty("resize")
    private String resize;
    @JsonProperty("w")
    private Integer w;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("h")
    public Integer getH() {
        return h;
    }

    @JsonProperty("h")
    public void setH(Integer h) {
        this.h = h;
    }

    @JsonProperty("resize")
    public String getResize() {
        return resize;
    }

    @JsonProperty("resize")
    public void setResize(String resize) {
        this.resize = resize;
    }

    @JsonProperty("w")
    public Integer getW() {
        return w;
    }

    @JsonProperty("w")
    public void setW(Integer w) {
        this.w = w;
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
