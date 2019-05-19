package aiss.model.resources;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

import aiss.model.resource.YoutubeResource;
import aiss.model.youtube.VideoItem;
import aiss.model.youtube.YoutubeSearch;

public class YoutubeTest {
	@Test
	public void getDailymotionTest() throws UnsupportedEncodingException {
		String query = "star wars";
		YoutubeResource datos = new YoutubeResource("ya29.GlsOB7HR9F-ZNmaLqvHXUJgxYbO4t2iAj7I0-F18i1lWlJBaveomY5VtH2IdJQj1AT9YFGeFvms1R772-3dFJ4O1vqnri7fmkGbzLTVi00_izcGmMw7b-obN8uxa");
		YoutubeSearch dailySearch = datos.searchYoutubeVideos(query);

		assertNotNull("The search returned null", dailySearch);
		assertNotNull("The search returned null", dailySearch.getItems());
		assertFalse("The number of videos of " + query + " is zero", dailySearch.getItems().size() == 0);

		System.out.println("The search for " + query + "'s videos returned " + dailySearch.getItems().size() + " datas.");

		for (VideoItem l : dailySearch.getItems()) {
			System.out.println(l.getSnippet().getTitle());
		}
	}

}
