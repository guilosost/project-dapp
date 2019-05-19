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
		String query = "star+wars";
		DailymotionResource datos = new DailymotionResource("ZjEBCQYEAF5WCk1dBAVMGRQZHEQWTgUBEQlWBUxPUQZa\r\n" + 
				"\r\n" + 
				"");
		DailymotionSearch dailySearch = datos.getDailymotionVideos(query);

		assertNotNull("The search returned null", dailySearch);
		assertNotNull("The search returned null", dailySearch.getList());
		assertFalse("The number of videos of " + query + " is zero", dailySearch.getList().size() == 0);

		System.out.println("The search for " + query + "'s videos returned " + dailySearch.getList().size() + " datas.");

		for (List l : dailySearch.getList()) {
			System.out.println(l.getId());
		}
		
		DailymotionUserStats dailyStats = datos.getDailymotionStats();
		assertNotNull("The search returned null", dailyStats);
		
		System.out.println("Username: " + dailyStats.getUsername());
		System.out.println("Total Videos: " + dailyStats.getVideosTotal());
		System.out.println("Total Views: " + dailyStats.getViewsTotal());
		
		DailymotionSearch dailyFavs = datos.getLikedVideos();
		
		assertNotNull("The search returned null", dailyFavs);
		assertNotNull("The search returned null", dailyFavs.getList());
		
		System.out.println("The search for " + query + "'s fav videos returned " + dailyFavs.getList().size() + " datas.");

		for (List l : dailyFavs.getList()) {
			System.out.println(l.getId());
		}
	}
}
