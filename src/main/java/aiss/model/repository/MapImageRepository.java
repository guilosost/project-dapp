package aiss.model.repository;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import aiss.model.Image;

public class MapImageRepository {
	Map<String, Image> imageMap;
	private static MapImageRepository instance = null;
	private int index = 0;

	public static MapImageRepository getInstance() {
		if (instance == null) {
			instance = MapImageRepository.getInstance();
			instance.init();
		}
		return instance;
	}

	public void init() {
		imageMap = new HashMap<String, Image>();

		// Create images
		Image im1 = new Image();
		im1.setAutor("Banksy");
		im1.setId("1234");
		im1.setTitulo("Graffiti");
		im1.setUrl("url");
		im1.setFechaPub("20/05/2019");
		addImage(im1);

//		Book lpdt = new Book();
//		lpdt.setTitle("Los pilares de la Tierra");
//		lpdt.setAuthor("Ken Follett");
//		lpdt.setIsbn("9788401328510");
//		lpdt.setRating(8);
//		lpdt.setPrecio(24.90);
//		addBook(lpdt);

	}

	public void addImage(Image i) {
		imageMap.put(i.getId(), i);
	}

	public Collection<Image> getAllImages() {
		return imageMap.values();
	}

	public Image getImage(String id) {
		return imageMap.get(id);
	}

	public void updateImage(Image i) {
		imageMap.put(i.getId(), i);
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

}
