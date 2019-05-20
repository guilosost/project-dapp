package aiss.model;

import java.util.Collection;

public class Multimedia {

	private String id;
	private Collection<Video> listVideo;
	private Collection<Image> listImage;

	public Multimedia() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Collection<Video> getListVideo() {
		return listVideo;
	}

	public void setListVideo(Collection<Video> listVideo) {
		this.listVideo = listVideo;
	}

	public Collection<Image> getListImage() {
		return listImage;
	}

	public void setListImage(Collection<Image> listImage) {
		this.listImage = listImage;
	}

}
