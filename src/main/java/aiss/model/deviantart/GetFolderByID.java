
package aiss.model.deviantart;

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
    "has_more",
    "next_offset",
    "results"
})
public class GetFolderByID {

    @JsonProperty("has_more")
    private Boolean hasMore;
    @JsonProperty("next_offset")
    private Object nextOffset;
    @JsonProperty("results")
    private List<DeviantArtResult> results = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("has_more")
    public Boolean getHasMore() {
        return hasMore;
    }

    @JsonProperty("has_more")
    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }

    @JsonProperty("next_offset")
    public Object getNextOffset() {
        return nextOffset;
    }

    @JsonProperty("next_offset")
    public void setNextOffset(Object nextOffset) {
        this.nextOffset = nextOffset;
    }

    @JsonProperty("results")
    public List<DeviantArtResult> getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(List<DeviantArtResult> results) {
        this.results = results;
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
