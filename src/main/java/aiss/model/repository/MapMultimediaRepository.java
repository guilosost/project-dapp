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

		// Create videos
		Video v1 = new Video();
		v1.setAutor("Chains of Agony");
		v1.setId(String.valueOf(videoIndex));
		v1.setTitulo("Gonzalo");
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

		Multimedia m = new Multimedia();
		m.setId(String.valueOf(mIndex));
		m.setListImage(imageMap.values());
		m.setListVideo(videoMap.values());
		addMultimedia(m);

	}

	public Collection<Multimedia> getAll() {
		return multimediaMap.values();
	}

	public Collection<Multimedia> getMultimediaByQuery(String query) {
		Multimedia m = new Multimedia();
		List<Multimedia> lista = new ArrayList<>();
		List<Image> listaI = new ArrayList<>();
		List<Video> listaV = new ArrayList<>();
		Collection<Multimedia> mapMultimedia = multimediaMap.values();
		for (Multimedia mu : mapMultimedia) {
			Collection<Image> i = mu.getListImage();
			Collection<Video> v = mu.getListVideo();
			for (Image im : i) {
				if (im.getTitulo().contains(query)) {
					listaI.add(im);
				}
			}
			for (Video vi : v) {
				if (vi.getTitulo().contains(query)) {
					listaV.add(vi);
				}
			}
		}
		m.setListImage(listaI);
		m.setListVideo(listaV);
		lista.add(m);
		return lista;
	}

	public void addMultimedia(Multimedia m) {
		multimediaMap.put(m.getId(), m);
		mIndex++;
	}

	public void addImage(Image i) {
		imageMap.put(i.getId(), i);
		imageIndex++;
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

	public void addVideo(Video i) {
		// TODO Auto-generated method stub
		videoMap.put(i.getId(), i);
		videoIndex++;
	}

	public Collection<Video> getAllVideos() {
		// TODO Auto-generated method stub
		return videoMap.values();
	}

	public Video getVideo(String id) {
		// TODO Auto-generated method stub
		return videoMap.get(id);
	}

	public void updateVideo(Video v) {
		// TODO Auto-generated method stub
		Video video = videoMap.get(v.getId());
		video.setTitulo(v.getTitulo());
		video.setAutor(v.getAutor());
		video.setId(v.getId());
		videoMap.put(video.getId(), video);
	}

	public void deleteVideo(String id) {
		// TODO Auto-generated method stub
		videoMap.remove(id);
	}

	public Collection<Video> getVideosByQuery(String query) {
		// TODO Auto-generated method stub
		List<Video> lista = new ArrayList<>();
		Collection<Video> mapVideos = videoMap.values();
		for (Video v : mapVideos) {
			if (v.getTitulo().contains(query)) {
				lista.add(v);
			}
		}
		return lista;
	}

}
