package aiss.model.repository;

import java.util.Collection;

import aiss.model.Image;
import aiss.model.Multimedia;
import aiss.model.Video;

public interface MultimediaRepository {

	public Collection<Multimedia> getAll();

	public Collection<Image> getAllImages();

	public Image getImage(String id);

	public void addImage(Image i);

	public void updateImage(Image i);

	public void deleteImage(String id);

	public Collection<Image> getImagesAutor(String autor);

	public Collection<Image> getImagesByQuery(String query);

	public Collection<Video> getAllVideos();

	public Video getVideo(String id);

	public void addVideo(Video i);

	public void updateVideo(Video v);

	public void deleteVideo(String id);

	public Collection<Video> getVideosByQuery(String query);

	public Collection<Multimedia> getMultimediaByQuery(String query);

	public void addMultimedia(Multimedia m);

	public void init();

}
