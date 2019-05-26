package aiss.model.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import aiss.model.Image;
import aiss.model.Multimedia;
import aiss.model.Video;

public class MapMultimediaRepository implements MultimediaRepository {
	Map<String, Multimedia> multimediaMap;
	Map<String, Image> imageMap;
	Map<String, Video> videoMap;
	private static MapMultimediaRepository instance = null;
	private int imageIndex = 0;
	private int videoIndex = 0;
	private int mIndex = 0;

	public static MapMultimediaRepository getInstance() {
		if (instance == null) {
			instance = new MapMultimediaRepository();
			instance.init();
		}
		return instance;
	}

	public void init() {
		multimediaMap = new HashMap<>();
		imageMap = new HashMap<>();
		videoMap = new HashMap<>();

		// Create images
		Image im1 = new Image();
		im1.setAutor("Banksy");
		im1.setId(String.valueOf(imageIndex));
		im1.setTitulo("Graffiti");
		addImage(im1);

		Image im2 = new Image();
		im2.setAutor("Pepe");
		im2.setId(String.valueOf(imageIndex));
		im2.setTitulo("Flores");
		addImage(im2);

		Image im3 = new Image();
		im3.setAutor("Juan");
		im3.setId(String.valueOf(imageIndex));
		im3.setTitulo("Barcos");
		addImage(im3);

		Image im4 = new Image();
		im4.setAutor("Luis");
		im4.setId(String.valueOf(imageIndex));
		im4.setTitulo("Océano");
		addImage(im4);

		Image im5 = new Image();
		im5.setAutor("Álvaro");
		im5.setId(String.valueOf(imageIndex));
		im5.setTitulo("Cascada");
		addImage(im5);

		Image im6 = new Image();
		im6.setAutor("Miguel");
		im6.setId(String.valueOf(imageIndex));
		im6.setTitulo("CSS");
		addImage(im6);
		
		Image im7 = new Image();
		im7.setAutor("Guillermo");
		im7.setId(String.valueOf(imageIndex));
		im7.setTitulo("Prueba 1");
		addImage(im7);

		// Create videos
		Video v1 = new Video();
		v1.setAutor("Gonzalo");
		v1.setId(String.valueOf(videoIndex));
		v1.setTitulo("Chains of Agony");
		addVideo(v1);

		Video v2 = new Video();
		v2.setAutor("Charly Sinewan");
		v2.setId(String.valueOf(videoIndex));
		v2.setTitulo("El mundo en moto");
		addVideo(v2);

		Video v3 = new Video();
		v3.setAutor("Luis H");
		v3.setId(String.valueOf(videoIndex));
		v3.setTitulo("Montañas");
		addVideo(v3);

		Video v4 = new Video();
		v4.setAutor("Alejandro");
		v4.setId(String.valueOf(videoIndex));
		v4.setTitulo("Lagos");
		addVideo(v4);

		Video v5 = new Video();
		v5.setAutor("Sara");
		v5.setId(String.valueOf(videoIndex));
		v5.setTitulo("Sagres");
		addVideo(v5);

		Video v6 = new Video();
		v6.setAutor("Victoria");
		v6.setId(String.valueOf(videoIndex));
		v6.setTitulo("New Zelland");
		addVideo(v6);
		
		Video v7 = new Video();
		v7.setAutor("Guillermo");
		v7.setId(String.valueOf(videoIndex));
		v7.setTitulo("Prueba 2");
		addVideo(v7);

		Multimedia m = new Multimedia();
		m.setId(String.valueOf(mIndex));
		m.setImages(imageMap);
		m.setVideos(videoMap);
		addMultimedia(m);

	}

	public Collection<Multimedia> getAll() {
		return multimediaMap.values();
	}

	public Collection<Multimedia> getMultimediaByQuery(String query) {
		Multimedia m = new Multimedia();
		Map<String, Multimedia> lista = new HashMap<>();
		Map<String, Image> listaI = new HashMap<>();
		Map<String, Video> listaV = new HashMap<>();
		Collection<Multimedia> mapMultimedia = multimediaMap.values();
		for (Multimedia mu : mapMultimedia) {
			Collection<Image> i = mu.getImages().values();
			Collection<Video> v = mu.getVideos().values();
			for (Image im : i) {
				if (im.getTitulo().toLowerCase().contains(query.toLowerCase())) {
					listaI.put(im.getId(), im);
				}
			}
			for (Video vi : v) {
				if (vi.getTitulo().toLowerCase().contains(query.toLowerCase())) {
					listaV.put(vi.getId(), vi);
				}
			}
		}
		m.setImages(listaI);
		m.setVideos(listaV);
		lista.put(m.getId(), m);
		return lista.values();
	}
	
	public Collection<Multimedia> getMultimediaAutor(String autor) {
		Multimedia m = new Multimedia();
		Map<String, Multimedia> lista = new HashMap<>();
		Map<String, Image> listaI = new HashMap<>();
		Map<String, Video> listaV = new HashMap<>();
		Collection<Multimedia> mapMultimedia = multimediaMap.values();
		for (Multimedia mu : mapMultimedia) {
			Collection<Image> i = mu.getImages().values();
			Collection<Video> v = mu.getVideos().values();
			for (Image im : i) {
				if (im.getAutor().toLowerCase().contains(autor.toLowerCase())) {
					listaI.put(im.getId(), im);
				}
			}
			for (Video vi : v) {
				if (vi.getAutor().toLowerCase().contains(autor.toLowerCase())) {
					listaV.put(vi.getId(), vi);
				}
			}
		}
		m.setImages(listaI);
		m.setVideos(listaV);
		lista.put(m.getId(), m);
		return lista.values();
	}

	public void addMultimedia(Multimedia m) {
		multimediaMap.put(m.getId(), m);
		mIndex++;
	}

	public Collection<Image> getAllImages() {
		return multimediaMap.get("0").getImages().values();
	}

	public Image getImage(String id) {
		return imageMap.get(id);
	}

	public void addImage(Image i) {
		imageMap.put(i.getId(), i);
		imageIndex++;
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
			if (i.getAutor().toLowerCase().contains(autor.toLowerCase())) {
				lista.add(i);
			}
		}
		return lista;
	}

	public Collection<Image> getImagesByQuery(String query) {
		List<Image> lista = new ArrayList<>();
		Collection<Image> mapImages = multimediaMap.get("0").getImages().values();
		for (Image i : mapImages) {
			if (i.getTitulo().toLowerCase().contains(query.toLowerCase())) {
				lista.add(i);
			}
		}
		return lista;
	}

	public Collection<Video> getAllVideos() {
		return multimediaMap.get("0").getVideos().values();
	}

	public Video getVideo(String id) {
		return videoMap.get(id);
	}

	public void addVideo(Video i) {
		videoMap.put(i.getId(), i);
		videoIndex++;
	}

	public void updateVideo(Video v) {
		Video video = videoMap.get(v.getId());
		video.setTitulo(v.getTitulo());
		video.setAutor(v.getAutor());
		video.setId(v.getId());
		videoMap.put(video.getId(), video);
	}

	public void deleteVideo(String id) {
		videoMap.remove(id);
	}

	public Collection<Video> getVideosAutor(String autor) {
		List<Video> lista = new ArrayList<>();
		Collection<Video> mapVideos = videoMap.values();
		for (Video v : mapVideos) {
			if (v.getAutor().toLowerCase().contains(autor.toLowerCase())) {
				lista.add(v);
			}
		}
		return lista;
	}

	public Collection<Video> getVideosByQuery(String query) {
		List<Video> lista = new ArrayList<>();
		Collection<Video> mapVideos = videoMap.values();
		for (Video v : mapVideos) {
			if (v.getTitulo().toLowerCase().contains(query.toLowerCase())) {
				lista.add(v);
			}
		}
		return lista;
	}

}
