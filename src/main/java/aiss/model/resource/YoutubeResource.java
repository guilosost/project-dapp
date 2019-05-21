package aiss.model.resource;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.resource.ClientResource;

import aiss.model.youtube.ChannelStats;
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

	public ChannelStats getChannelStats() throws UnsupportedEncodingException { // UCQ2pMpd2K2yHS6q40G9oJGQ
		String uri = "https://www.googleapis.com/youtube/v3/channels?part=statistics&id=UCAW-NpUFkMyCNrvRSSGIvDQ"
				+ "&key=AIzaSyB9D0D-rCyoI_nOqtMhn_u1F0BPv2g_odo";

		log.log(Level.FINE, "Youtube ChannelStats URI: " + uri);

		ClientResource cr = new ClientResource(uri);

		ChannelStats channelStats = cr.get(ChannelStats.class);

		return channelStats;
	}

//	public ChannelList getWatchLaterVideos() throws UnsupportedEncodingException {
//		String uri = "https://www.googleapis.com/youtube/v3/playlistItems?part=contentDetails&maxResults=20"
//				+ "&playlistId=WL&key=AIzaSyB9D0D-rCyoI_nOqtMhn_u1F0BPv2g_odo";
//
//		log.log(Level.FINE, "Youtube Watch Later List URI: " + uri);
//
//		ClientResource cr = new ClientResource(uri);
//
//		ChannelList watchLaterVideos = cr.get(ChannelList.class);
//
//		return watchLaterVideos;
//
//	}

}
