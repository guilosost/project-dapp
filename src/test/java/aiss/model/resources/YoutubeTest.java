package aiss.model.resources;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

import aiss.model.resource.YoutubeResource;
import aiss.model.youtube.GetUserVideos;
import aiss.model.youtube.RaitingItem;
import aiss.model.youtube.VideoItem;
import aiss.model.youtube.YoutubeRatedVideoGet;
import aiss.model.youtube.YoutubeSearch;

public class YoutubeTest {
	@Test
	public void getYoutubeTest() throws UnsupportedEncodingException {
		YoutubeResource datos = new YoutubeResource(
				"ya29.GlsQB5JvLosCRlA5IHbUQAKRWNwO5mRQrdbTiB1QGBtuCTfmm9JxOZ-9yB8HBILpca9Pdcii3p__C1vuO_VBxPzbjOeSAV3BmVGfDsCXaUBJwl6aqLSnkl4UYxrA");
		
		// Search
		String query = "star wars";
		YoutubeSearch youtubeSearch = datos.searchYoutubeVideos(query, "");
		assertNotNull("The search returned null", youtubeSearch);
		assertNotNull("The search returned null", youtubeSearch.getVideoItems());
		assertFalse("The number of videos of " + query + " is zero", youtubeSearch.getVideoItems().size() == 0);

		System.out.println(
				"The search for " + query + "'s videos returned " + youtubeSearch.getVideoItems().size() + " datas.");

		for (VideoItem l : youtubeSearch.getVideoItems()) {
			System.out.println(l.getVideoSnippet().getTitle());
		}

		// Liked videos
		YoutubeRatedVideoGet likedVideos = datos.getLikedVideos();
		assertNotNull("The search returned null", likedVideos);
		assertNotNull("The search returned null", likedVideos.getItems());

		System.out.println("The search for liked Youtube videos returned " + likedVideos.getItems().size() + " datas.");
		int i = 0;
		for (RaitingItem l : likedVideos.getItems()) {
			System.out.println(l.getSnippet().getTitle());
			i++;
			if (i > 5) {
				break;
			}
		}
		
		// Disliked videos
				YoutubeRatedVideoGet dislikedVideos = datos.getDislikedVideos();
				assertNotNull("The search returned null", dislikedVideos);
				assertNotNull("The search returned null", dislikedVideos.getItems());

				System.out.println("The search for disliked Youtube videos returned " + dislikedVideos.getItems().size() + " datas.");
				i = 0;
				for (RaitingItem l : dislikedVideos.getItems()) {
					System.out.println(l.getSnippet().getTitle());
					i++;
					if (i > 5) {
						break;
					}
				}
				
		// Own Videos
				GetUserVideos userVideos = datos.getOwnYoutubeVideos();
				assertNotNull("The search returned null", userVideos);
				assertNotNull("The search returned null", userVideos.getItems());
				
				System.out.println("This user have " + userVideos.getItems().size() + " videos uploaded");
				
				for(VideoItem vi : userVideos.getItems()) {
					System.out.println(vi.getVideoSnippet().getTitle());
				}
	}

}
