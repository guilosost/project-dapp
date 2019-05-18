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
		DailymotionResource datos = new DailymotionResource("N3FVVEMfXU4EVQZHG14cQRlIBwVbVBoCG1AAVlAeDRAS");
		DailymotionSearch dailySearch = datos.getDailymotionVideos(query);

		assertNotNull("The search returned null", dailySearch);
		assertNotNull("The search returned null", dailySearch.getList());
		assertFalse("The number of photos of " + query + " is zero", dailySearch.getList().size() == 0);

		System.out.println("The search for " + query + "'s photos returned " + dailySearch.getList().size() + " datas.");

		for (List l : dailySearch.getList()) {
			System.out.println(l.getId());
		}
		
		DailymotionUserStats dailyStats = datos.getDailymotionStats();
		assertNotNull("The search returned null", dailyStats);
		
		System.out.println("Username: " + dailyStats.getUsername());
		System.out.println("Total Videos: " + dailyStats.getVideosTotal());
		System.out.println("Total Views: " + dailyStats.getViewsTotal());
	}
}
