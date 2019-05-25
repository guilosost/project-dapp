package aiss.model;

import java.util.Map;

public class Multimedia {

	private String id;
	private Map<String, Video> videos;
	private Map<String, Image> images;

	public Multimedia() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Map<String, Video> getVideos() {
		return videos;
	}

	public void setVideos(Map<String, Video> videos) {
		this.videos = videos;
	}

	public Map<String, Image> getImages() {
		return images;
	}

	public void setImages(Map<String, Image> images) {
		this.images = images;
	}

}
