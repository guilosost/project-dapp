package aiss.model.resource;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.resource.ClientResource;

import aiss.model.youtube.ChannelStats;
import aiss.model.youtube.ChannelVideosItem;
import aiss.model.youtube.GetUserVideos;
import aiss.model.youtube.GetUserVideosItem;
import aiss.model.youtube.SearchChannelVideos;
import aiss.model.youtube.StatisticsItem;
import aiss.model.youtube.UserStatistics;
import aiss.model.youtube.YoutubeRatedVideoGet;
import aiss.model.youtube.YoutubeSearch;

public class YoutubeResource {

	private static final Logger log = Logger.getLogger(YoutubeResource.class.getName());
	private final String access_token;

	public YoutubeResource(String access_token) {
		this.access_token = access_token;
	}

	public YoutubeSearch searchYoutubeVideos(String query, String nextPage) throws UnsupportedEncodingException {
		// Poner parámetro de entrada en formato correcto
		String search = URLEncoder.encode(query, "UTF-8");

		// Crear la URL
		// https://www.googleapis.com/youtube/v3/search?part=snippet&q=dogs&maxresult=10
		String uri = "https://www.googleapis.com/youtube/v3/search?part=snippet&q=" + search + "&pageToken=" + nextPage
				+ "&maxResults=5&access_token=" + access_token;

		log.log(Level.FINE, "Youtube URI: " + uri);

		// Hacer petición al servicio REST (devuelve objeto JSON)
		ClientResource cr = new ClientResource(uri);

		// Convertir JSON en .Java
		YoutubeSearch youtubeSearch = cr.get(YoutubeSearch.class);

		return youtubeSearch;
	}

	public YoutubeRatedVideoGet getLikedVideos() throws UnsupportedEncodingException {
		// Crear la URL https://api.dailymotion.com/videos?search=star+wars&limit=10
		String uri = "https://www.googleapis.com/youtube/v3/videos?part=snippet&maxResults=21&myRating=like&access_token="
				+ access_token;

		log.log(Level.FINE, "Youtube Liked Videos URI: " + uri);

		// Hacer petición al servicio REST (devuelve objeto JSON)
		ClientResource cr = new ClientResource(uri);

		// Convertir JSON en .Java
		YoutubeRatedVideoGet youtubeLikedVideos = cr.get(YoutubeRatedVideoGet.class);

		return youtubeLikedVideos;
	}

	public YoutubeRatedVideoGet getDislikedVideos() throws UnsupportedEncodingException {
		// Crear la URL https://api.dailymotion.com/videos?search=star+wars&limit=10
		String uri = "https://www.googleapis.com/youtube/v3/videos?part=snippet&maxResults=21&myRating=dislike&access_token="
				+ access_token;

		log.log(Level.FINE, "Youtube Disliked Videos URI: " + uri);

		// Hacer petición al servicio REST (devuelve objeto JSON)
		ClientResource cr = new ClientResource(uri);

		// Convertir JSON en .Java
		YoutubeRatedVideoGet youtubeDislikedVideos = cr.get(YoutubeRatedVideoGet.class);

		return youtubeDislikedVideos;
	}

//	public ChannelStats getChannelStats() throws UnsupportedEncodingException { // UCQ2pMpd2K2yHS6q40G9oJGQ
//		String uri = "https://www.googleapis.com/youtube/v3/channels?part=statistics&id=UCAW-NpUFkMyCNrvRSSGIvDQ"
//				+ "&key=AIzaSyB9D0D-rCyoI_nOqtMhn_u1F0BPv2g_odo";
//
//		log.log(Level.FINE, "Youtube ChannelStats URI: " + uri);
//
//		ClientResource cr = new ClientResource(uri);
//
//		ChannelStats channelStats = cr.get(ChannelStats.class);
//
//		return channelStats;
//	}

	public GetUserVideos getOwnYoutubeVideos() throws UnsupportedEncodingException {
		String uri = "https://www.googleapis.com/youtube/v3/search?part=snippet&forMine=true&type=video"
				+ "&access_token=" + access_token;

		ClientResource cr = new ClientResource(uri);
		GetUserVideos userVideos = cr.get(GetUserVideos.class);

		return userVideos;
	}

	public UserStatistics getUserStatistics() throws UnsupportedEncodingException {
		String ids = "";

		for (GetUserVideosItem vv : getOwnYoutubeVideos().getItems()) {
			ids = ids + vv.getId().getVideoId() + ",";
		}

		String uri = "https://www.googleapis.com/youtube/v3/videos?part=statistics&id=" + ids + "&access_token="
				+ access_token;

		ClientResource cr = new ClientResource(uri);
		UserStatistics userStatistics = cr.get(UserStatistics.class);

		return userStatistics;
	}

	public Integer getAllLikes() throws UnsupportedEncodingException {
		Integer likes = 0;

		for (StatisticsItem st : getUserStatistics().getItems()) {
			likes += Integer.valueOf(st.getStatistics().getLikeCount());
		}

		return likes;
	}

	public Integer getAllDislikes() throws UnsupportedEncodingException {
		Integer dislikes = 0;

		for (StatisticsItem st : getUserStatistics().getItems()) {
			dislikes += Integer.valueOf(st.getStatistics().getDislikeCount());
		}

		return dislikes;
	}

	public Integer getAllViews() throws UnsupportedEncodingException {
		Integer views = 0;

		for (StatisticsItem st : getUserStatistics().getItems()) {
			views += Integer.valueOf(st.getStatistics().getViewCount());
		}

		return views;
	}

	public Integer getAllComments() throws UnsupportedEncodingException {
		Integer comments = 0;

		for (StatisticsItem st : getUserStatistics().getItems()) {
			comments += Integer.valueOf(st.getStatistics().getCommentCount());
		}

		return comments;
	}

	public String getUserUsername() throws UnsupportedEncodingException {
		return getOwnYoutubeVideos().getItems().get(0).getSnippet().getChannelTitle();
	}

	public String getUserId() throws UnsupportedEncodingException {
		return getOwnYoutubeVideos().getItems().get(0).getSnippet().getChannelId();
	}

	public GetUserVideosItem getMostViewedVideo() throws UnsupportedEncodingException {
//		String uri = "https://www.googleapis.com/youtube/v3/search?part=snippet%2Cid&channelId=" + getUserId()
//				+ "&order=viewCount&key=AIzaSyB9D0D-rCyoI_nOqtMhn_u1F0BPv2g_odo";
//
//		log.log(Level.FINE, "Youtube Most Viewed Video URI: " + uri);
//
//		ClientResource cr = new ClientResource(uri);
//
//		SearchChannelVideos channelVideos = cr.get(SearchChannelVideos.class);

		Integer views = 0, resultViews = 0;
		StatisticsItem result = getUserStatistics().getItems().get(0);
		for (StatisticsItem mv : getUserStatistics().getItems()) {
			views = Integer.valueOf(mv.getStatistics().getViewCount());
			resultViews = Integer.valueOf(result.getStatistics().getViewCount());
			if (views < resultViews) {
				result = mv;
			}
		}

		GetUserVideosItem resultVideo = getOwnYoutubeVideos().getItems().get(0);
		for (GetUserVideosItem gi : getOwnYoutubeVideos().getItems()) {
			if (result.getId() == gi.getId().getVideoId()) {
				resultVideo = gi;
			}
		}

		// channelVideos.getItems().get(1);
		return resultVideo;
	}
}
