
package aiss.model.unsplash;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "raw",
    "full",
    "regular",
    "small",
    "thumb"
})
public class Urls {

    @JsonProperty("raw")
    private String raw;
    @JsonProperty("full")
    private String full;
    @JsonProperty("regular")
    private String regular;
    @JsonProperty("small")
    private String small;
    @JsonProperty("thumb")
    private String thumb;

    @JsonProperty("raw")
    public String getRaw() {
        return raw;
    }

    @JsonProperty("raw")
    public void setRaw(String raw) {
        this.raw = raw;
    }

    @JsonProperty("full")
    public String getFull() {
        return full;
    }

    @JsonProperty("full")
    public void setFull(String full) {
        this.full = full;
    }

    @JsonProperty("regular")
    public String getRegular() {
        return regular;
    }

    @JsonProperty("regular")
    public void setRegular(String regular) {
        this.regular = regular;
    }

    @JsonProperty("small")
    public String getSmall() {
        return small;
    }

    @JsonProperty("small")
    public void setSmall(String small) {
        this.small = small;
    }

    @JsonProperty("thumb")
    public String getThumb() {
        return thumb;
    }

    @JsonProperty("thumb")
    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

}
