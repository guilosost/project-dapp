package aiss.model.resources;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

import aiss.model.resource.YoutubeResource;
import aiss.model.youtube.RaitingItem;
import aiss.model.youtube.VideoItem;
import aiss.model.youtube.YoutubeRatedVideoGet;
import aiss.model.youtube.YoutubeSearch;

public class YoutubeTest {
	@Test
	public void getYoutubeTest() throws UnsupportedEncodingException {
		String query = "star wars";
		YoutubeResource datos = new YoutubeResource(
				"ya29.GlsPB8LJieqYPdIrEcwPjOdy_jaF1Jp2c2yVztNtYwX921_aUxjLFzxUfhkbozCrJtdsoSvlnijwAmf3rlyiPPVUyIGMZkRjSeNa4z1YuYB4uqzOyGyqpk_Bb-AY");
		YoutubeSearch youtubeSearch = datos.searchYoutubeVideos(query, "");

		assertNotNull("The search returned null", youtubeSearch);
		assertNotNull("The search returned null", youtubeSearch.getVideoItems());
		assertFalse("The number of videos of " + query + " is zero", youtubeSearch.getVideoItems().size() == 0);

		System.out.println(
				"The search for " + query + "'s videos returned " + youtubeSearch.getVideoItems().size() + " datas.");

		for (VideoItem l : youtubeSearch.getVideoItems()) {
			System.out.println(l.getVideoSnippet().getTitle());
		}
		
		YoutubeRatedVideoGet likedVideos = datos.getLikedVideos();
		
		assertNotNull("The search returned null", likedVideos);
		assertNotNull("The search returned null", likedVideos.getItems());
		assertFalse("The number of liked videos is zero", likedVideos.getItems().size() == 0);

		System.out.println(
				"The search for liked videos returned " + likedVideos.getItems().size() + " datas.");
		int i = 0;
		for (RaitingItem l : likedVideos.getItems()) {
			System.out.println(l.getSnippet().getTitle());
			i++;
			if(i>5) {
				break;
		}
	}
	}
	
	

}
