
package aiss.model.unsplash;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "custom",
    "aggregated"
})
public class Tags {

    @JsonProperty("custom")
    private List<Object> custom = null;
    @JsonProperty("aggregated")
    private List<Object> aggregated = null;

    @JsonProperty("custom")
    public List<Object> getCustom() {
        return custom;
    }

    @JsonProperty("custom")
    public void setCustom(List<Object> custom) {
        this.custom = custom;
    }

    @JsonProperty("aggregated")
    public List<Object> getAggregated() {
        return aggregated;
    }

    @JsonProperty("aggregated")
    public void setAggregated(List<Object> aggregated) {
        this.aggregated = aggregated;
    }

}
