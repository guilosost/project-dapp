package aiss.model.resources;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

import aiss.model.resource.UnsplashResource;
import aiss.model.unsplash.Result;
import aiss.model.unsplash.SearchUnsplashPhotos;
import aiss.model.unsplash.UnsplashUser;

public class UnsplashTest {

	@Test
	public void getPhotosTest() throws UnsupportedEncodingException {
		String query = "photo";
		UnsplashResource datos = new UnsplashResource(
				"d92b0da750428c099076f42dab906492c2abfca702adb6df524986224814bd1b");
		SearchUnsplashPhotos uSearch = datos.getUnsplashImages(query);

		assertNotNull("The search returned null", uSearch);
		assertNotNull("The search returned null", uSearch.getResults());
		assertFalse("The number of photos of " + query + " is zero", uSearch.getResults().size() == 0);

		UnsplashUser user = datos.getUnsplashUserInfo();

		assertNotNull("The search returned null", user);
		assertNotNull("The search returned null", user.getName());

		System.out.println("Usuario: " + user.getUsername());

		SearchUnsplashPhotos stats = datos.getUnsplashStats();

		assertNotNull("The search returned null", stats);
		assertNotNull("The search returned null", stats.getResults());
		assertFalse("The number of user photos is zero", stats.getResults().size() == 0);

		System.out.println("El usuario tiene " + stats.getResults().size() + " fotos");
		for (Result r : stats.getResults()) {
			System.out.println(r.getId() + "\n");
		}

		System.out.println("The search for " + query + "'s photos returned " + uSearch.getResults().size() + " files.");

		for (Result r : uSearch.getResults()) {
			System.out.println(r.getLinks().getPhotos());
		}
	}
}
