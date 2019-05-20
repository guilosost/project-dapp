package aiss.model.repository;

import java.util.Collection;

import aiss.model.Video;

public interface VideoRepository {

	// Video

	public void addVideo(Video i);

	public Collection<Video> getAllVideos();

	public Video getVideo(String id);

	public void updateVideo(Video v);

	public void deleteVideo(String id);

	public Collection<Video> getVideosByQuery(String query);

}
