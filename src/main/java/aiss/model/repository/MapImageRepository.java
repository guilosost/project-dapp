package aiss.model.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import aiss.model.Image;

public class MapImageRepository implements ImageRepository {
	Map<String, Image> imageMap;
	private static MapImageRepository instance = null;
	private int index = 0;

	public static MapImageRepository getInstance() {
		if (instance == null) {
			instance = new MapImageRepository();
			instance.init();
		}
		return instance;
	}

	public void init() {
		imageMap = new HashMap<String, Image>();

		// Create images
		Image im1 = new Image();
		im1.setAutor("Banksy");
		im1.setId(String.valueOf(index));
		im1.setTitulo("Graffiti");
		addImage(im1);

		Image im2 = new Image();
		im2.setAutor("Pepe");
		im2.setId(String.valueOf(index));
		im2.setTitulo("Flores");
		addImage(im2);

		Image im3 = new Image();
		im3.setAutor("Juan");
		im3.setId(String.valueOf(index));
		im3.setTitulo("Barcos");
		addImage(im3);
	}

	public void addImage(Image i) {
		imageMap.put(i.getId(), i);
		index++;
	}

	public Collection<Image> getAllImages() {
		return imageMap.values();
	}

	public Image getImage(String id) {
		return imageMap.get(id);
	}

	public void updateImage(Image i) {
		Image image = imageMap.get(i.getId());
		image.setTitulo(i.getTitulo());
		image.setAutor(i.getAutor());
		image.setId(i.getId());
		imageMap.put(i.getId(), image);

	}

	public void deleteImage(String id) {
		imageMap.remove(id);
	}

	public Collection<Image> getImagesAutor(String autor) {
		List<Image> lista = new ArrayList<>();
		Collection<Image> mapImages = imageMap.values();
		for (Image i : mapImages) {
			if (i.getAutor().equals(autor)) {
				lista.add(i);
			}
		}
		return lista;
	}

	public Collection<Image> getImagesByQuery(String query) {
		List<Image> lista = new ArrayList<>();
		Collection<Image> mapImages = imageMap.values();
		for (Image i : mapImages) {
			if (i.getTitulo().contains(query)) {
				lista.add(i);
			}
		}
		return lista;
	}

}
