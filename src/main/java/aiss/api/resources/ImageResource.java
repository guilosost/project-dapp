package aiss.api.resources;

import aiss.model.repository.ImageRepository;
import aiss.model.repository.MapImageRepository;

public class ImageResource {
	public static ImageResource instance = null;
	ImageRepository repository;

	private ImageResource() {
		repository = MapImageRepository.getInstance();
	}

}
