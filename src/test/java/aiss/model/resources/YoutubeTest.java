package aiss.model.resources;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

import aiss.model.resource.YoutubeResource;
import aiss.model.youtube.Item;
import aiss.model.youtube.YoutubeSearch;

public class YoutubeTest {
	@Test
	public void getDailymotionTest() throws UnsupportedEncodingException {
		String query = "star wars";
		YoutubeResource datos = new YoutubeResource("ya29.GlsNB8gOxFr0MTZtcd2_MhuKVYMz3wwXzewQ6GL1nOfpF8a0-beUpugsiWuLnw3uDKQOjcJgEgGZeYvAoALPCEoIRceLNfbpiugswovvpOmHDI44nUyMcbeQdHMr");
		YoutubeSearch dailySearch = datos.searchYoutubeVideos(query);

		assertNotNull("The search returned null", dailySearch);
		assertNotNull("The search returned null", dailySearch.getItems());
		assertFalse("The number of videos of " + query + " is zero", dailySearch.getItems().size() == 0);

		System.out.println("The search for " + query + "'s videos returned " + dailySearch.getItems().size() + " datas.");

		for (Item l : dailySearch.getItems()) {
			System.out.println(l.getSnippet().getTitle());
		}
	}

}
