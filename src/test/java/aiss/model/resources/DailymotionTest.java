package aiss.model.resources;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

import aiss.model.dailymotion.DailymotionSearch;
import aiss.model.dailymotion.DailymotionUserStats;
import aiss.model.dailymotion.List;
import aiss.model.resource.DailymotionResource;

public class DailymotionTest {
	@Test
	public void getDailymotionTest() throws UnsupportedEncodingException {
		// Search
		String query = "star+wars";
		DailymotionResource datos = new DailymotionResource("dzBbAU8GVEkLWEBaBBdZSUQcHxITGEABF0peDFUZC1dJ");
		DailymotionSearch dailySearch = datos.getDailymotionVideos(query, 1);

		assertNotNull("The search returned null", dailySearch);
		assertNotNull("The search returned null", dailySearch.getList());
		assertFalse("The number of videos of " + query + " is zero", dailySearch.getList().size() == 0);

		System.out.println("The search for " + query + "'s videos returned " + dailySearch.getList().size() + " datas.");

		for (List l : dailySearch.getList()) {
			System.out.println(l.getTitle().substring(0, 30));
		}
		
		// User stats
		DailymotionUserStats dailyStats = datos.getDailymotionStats();
		assertNotNull("The search returned null", dailyStats);
		
		System.out.println("Username: " + dailyStats.getUsername());
		System.out.println("Total Videos: " + dailyStats.getVideosTotal());
		System.out.println("Total Views: " + dailyStats.getViewsTotal());
		
		// Total Likes
		System.out.println("Total Likes: " + datos.getDailymotionTotalLikes());
		
		// Best video
		List bestVideo = datos.getBestOwnVideo();
		assertNotNull("The search of the best video returned null", bestVideo);

		System.out.println("Best Own Video Title: " + bestVideo.getTitle());
		
		// Liked videos
		DailymotionSearch dailyFavs = datos.getLikedVideos();
		
		assertNotNull("The search returned null", dailyFavs);
		assertNotNull("The search returned null", dailyFavs.getList());
		
		System.out.println("The search for fav videos returned " + dailyFavs.getList().size() + " datas.");

		for (List l : dailyFavs.getList()) {
			System.out.println(l.getTitle().subSequence(0, 30));
		}
		
		// WatchLater videos
				DailymotionSearch dailyWT = datos.getWatchLaterVideos();
				
				assertNotNull("The search returned null", dailyWT);
				assertNotNull("The search returned null", dailyWT.getList());
				
				System.out.println("The search for watch later videos returned " + dailyWT.getList().size() + " datas.");

				for (List l : dailyWT.getList()) {
					System.out.println(l.getTitle().subSequence(0, 30));
				}

	}
}
