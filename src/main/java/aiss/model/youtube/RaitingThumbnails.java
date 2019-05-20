
package aiss.model.youtube;

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
    "default",
    "medium",
    "high",
    "standard",
    "maxres"
})
public class RaitingThumbnails {

    @JsonProperty("default")
    private Default _default;
    @JsonProperty("medium")
    private Medium medium;
    @JsonProperty("high")
    private High high;
    @JsonProperty("standard")
    private Standard standard;
    @JsonProperty("maxres")
    private Maxres maxres;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("default")
    public Default getDefault() {
        return _default;
    }

    @JsonProperty("default")
    public void setDefault(Default _default) {
        this._default = _default;
    }

    @JsonProperty("medium")
    public Medium getMedium() {
        return medium;
    }

    @JsonProperty("medium")
    public void setMedium(Medium medium) {
        this.medium = medium;
    }

    @JsonProperty("high")
    public High getHigh() {
        return high;
    }

    @JsonProperty("high")
    public void setHigh(High high) {
        this.high = high;
    }

    @JsonProperty("standard")
    public Standard getStandard() {
        return standard;
    }

    @JsonProperty("standard")
    public void setStandard(Standard standard) {
        this.standard = standard;
    }

    @JsonProperty("maxres")
    public Maxres getMaxres() {
        return maxres;
    }

    @JsonProperty("maxres")
    public void setMaxres(Maxres maxres) {
        this.maxres = maxres;
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
