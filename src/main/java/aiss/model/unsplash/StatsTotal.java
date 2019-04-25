
package aiss.model.unsplash;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "total_photos",
    "photo_downloads",
    "photos",
    "downloads",
    "views",
    "likes",
    "photographers",
    "pixels",
    "downloads_per_second",
    "views_per_second",
    "developers",
    "applications",
    "requests"
})
public class StatsTotal {

    @JsonProperty("total_photos")
    private Integer totalPhotos;
    @JsonProperty("photo_downloads")
    private Integer photoDownloads;
    @JsonProperty("photos")
    private Integer photos;
    @JsonProperty("downloads")
    private Integer downloads;
    @JsonProperty("views")
    private Integer views;
    @JsonProperty("likes")
    private Integer likes;
    @JsonProperty("photographers")
    private Integer photographers;
    @JsonProperty("pixels")
    private Integer pixels;
    @JsonProperty("downloads_per_second")
    private Integer downloadsPerSecond;
    @JsonProperty("views_per_second")
    private Integer viewsPerSecond;
    @JsonProperty("developers")
    private Integer developers;
    @JsonProperty("applications")
    private Integer applications;
    @JsonProperty("requests")
    private Integer requests;

    @JsonProperty("total_photos")
    public Integer getTotalPhotos() {
        return totalPhotos;
    }

    @JsonProperty("total_photos")
    public void setTotalPhotos(Integer totalPhotos) {
        this.totalPhotos = totalPhotos;
    }

    @JsonProperty("photo_downloads")
    public Integer getPhotoDownloads() {
        return photoDownloads;
    }

    @JsonProperty("photo_downloads")
    public void setPhotoDownloads(Integer photoDownloads) {
        this.photoDownloads = photoDownloads;
    }

    @JsonProperty("photos")
    public Integer getPhotos() {
        return photos;
    }

    @JsonProperty("photos")
    public void setPhotos(Integer photos) {
        this.photos = photos;
    }

    @JsonProperty("downloads")
    public Integer getDownloads() {
        return downloads;
    }

    @JsonProperty("downloads")
    public void setDownloads(Integer downloads) {
        this.downloads = downloads;
    }

    @JsonProperty("views")
    public Integer getViews() {
        return views;
    }

    @JsonProperty("views")
    public void setViews(Integer views) {
        this.views = views;
    }

    @JsonProperty("likes")
    public Integer getLikes() {
        return likes;
    }

    @JsonProperty("likes")
    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    @JsonProperty("photographers")
    public Integer getPhotographers() {
        return photographers;
    }

    @JsonProperty("photographers")
    public void setPhotographers(Integer photographers) {
        this.photographers = photographers;
    }

    @JsonProperty("pixels")
    public Integer getPixels() {
        return pixels;
    }

    @JsonProperty("pixels")
    public void setPixels(Integer pixels) {
        this.pixels = pixels;
    }

    @JsonProperty("downloads_per_second")
    public Integer getDownloadsPerSecond() {
        return downloadsPerSecond;
    }

    @JsonProperty("downloads_per_second")
    public void setDownloadsPerSecond(Integer downloadsPerSecond) {
        this.downloadsPerSecond = downloadsPerSecond;
    }

    @JsonProperty("views_per_second")
    public Integer getViewsPerSecond() {
        return viewsPerSecond;
    }

    @JsonProperty("views_per_second")
    public void setViewsPerSecond(Integer viewsPerSecond) {
        this.viewsPerSecond = viewsPerSecond;
    }

    @JsonProperty("developers")
    public Integer getDevelopers() {
        return developers;
    }

    @JsonProperty("developers")
    public void setDevelopers(Integer developers) {
        this.developers = developers;
    }

    @JsonProperty("applications")
    public Integer getApplications() {
        return applications;
    }

    @JsonProperty("applications")
    public void setApplications(Integer applications) {
        this.applications = applications;
    }

    @JsonProperty("requests")
    public Integer getRequests() {
        return requests;
    }

    @JsonProperty("requests")
    public void setRequests(Integer requests) {
        this.requests = requests;
    }

}
