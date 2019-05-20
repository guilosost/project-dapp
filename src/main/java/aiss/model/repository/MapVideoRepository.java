package aiss.model.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import aiss.model.Image;
import aiss.model.Video;

public class MapVideoRepository implements VideoRepository {

	Map<String, Video> videoMap;
	private static MapVideoRepository instance = null;
	private int index = 0;

	public static MapVideoRepository getInstance() {
		if (instance == null) {
			instance = new MapVideoRepository();
			instance.init();
		}
		return instance;
	}

	private void init() {
		videoMap = new HashMap<String, Video>();

		// Create videos
		Video v1 = new Video();
		v1.setAutor("Chains of Agony");
		v1.setId(String.valueOf(index));
		v1.setTitulo("Gonzalo");
		addVideo(v1);

		Video v2 = new Video();
		v2.setAutor("Charly Sinewan");
		v2.setId(String.valueOf(index));
		v2.setTitulo("El mundo en moto");
		addVideo(v2);

		Video v3 = new Video();
		v3.setAutor("Luis H");
		v3.setId(String.valueOf(index));
		v3.setTitulo("Montañas");
		addVideo(v3);

	}

	@Override
	public void addVideo(Video i) {
		// TODO Auto-generated method stub
		videoMap.put(i.getId(), i);
		index++;
	}

	@Override
	public Collection<Video> getAllVideos() {
		// TODO Auto-generated method stub
		return videoMap.values();
	}

	@Override
	public Video getVideo(String id) {
		// TODO Auto-generated method stub
		return videoMap.get(id);
	}

	@Override
	public void updateVideo(Video v) {
		// TODO Auto-generated method stub
		Video video = videoMap.get(v.getId());
		video.setTitulo(v.getTitulo());
		video.setAutor(v.getAutor());
		video.setId(v.getId());
		videoMap.put(video.getId(), video);
	}

	@Override
	public void deleteVideo(String id) {
		// TODO Auto-generated method stub
		videoMap.remove(id);
	}

	@Override
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
