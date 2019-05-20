package aiss.model.repository;

import java.util.Collection;

import aiss.model.Image;

public interface ImageRepository {

	// Image
	public void addImage(Image i);

	public Collection<Image> getAllImages();

	public Image getImage(String id);

	public void updateImage(Image i);

	public void deleteImage(String id);

	public Collection<Image> getImagesAutor(String autor);

	public Collection<Image> getImagesByQuery(String query);

}
