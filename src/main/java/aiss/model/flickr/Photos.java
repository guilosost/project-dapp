
package aiss.model.flickr;

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
    "page",
    "pages",
    "perpage",
    "total",
    "photo"
})
public class Photos {

    @JsonProperty("page")
    private Integer page;
    @JsonProperty("pages")
    private Integer pages;
    @JsonProperty("perpage")
    private Integer perpage;
    @JsonProperty("total")
    private String total;
    @JsonProperty("photo")
    private List<Photo> photo = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("page")
    public Integer getPage() {
        return page;
    }

    @JsonProperty("page")
    public void setPage(Integer page) {
        this.page = page;
    }

    @JsonProperty("pages")
    public Integer getPages() {
        return pages;
    }

    @JsonProperty("pages")
    public void setPages(Integer pages) {
        this.pages = pages;
    }

    @JsonProperty("perpage")
    public Integer getPerpage() {
        return perpage;
    }

    @JsonProperty("perpage")
    public void setPerpage(Integer perpage) {
        this.perpage = perpage;
    }

    @JsonProperty("total")
    public String getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(String total) {
        this.total = total;
    }

    @JsonProperty("photo")
    public List<Photo> getPhoto() {
        return photo;
    }

    @JsonProperty("photo")
    public void setPhoto(List<Photo> photo) {
        this.photo = photo;
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
