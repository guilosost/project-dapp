
package aiss.model.unsplash;

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
    "self",
    "html",
    "download",
    "download_location"
})
public class Links {

    @JsonProperty("self")
    private String self;
    @JsonProperty("html")
    private String html;
    @JsonProperty("download")
    private String download;
    @JsonProperty("download_location")
    private String downloadLocation;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("self")
    public String getSelf() {
        return self;
    }

    @JsonProperty("self")
    public void setSelf(String self) {
        this.self = self;
    }

    @JsonProperty("html")
    public String getHtml() {
        return html;
    }

    @JsonProperty("html")
    public void setHtml(String html) {
        this.html = html;
    }

    @JsonProperty("download")
    public String getDownload() {
        return download;
    }

    @JsonProperty("download")
    public void setDownload(String download) {
        this.download = download;
    }

    @JsonProperty("download_location")
    public String getDownloadLocation() {
        return downloadLocation;
    }

    @JsonProperty("download_location")
    public void setDownloadLocation(String downloadLocation) {
        this.downloadLocation = downloadLocation;
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
