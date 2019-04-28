package aiss.model.resources;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

import aiss.model.resource.UnsplashResource;
import aiss.model.unsplash.SearchUnsplashPhotos;
import aiss.model.unsplash.UnsplashResult;

public class UnsplashTest {

	@Test
	public void getPhotosTest() throws UnsupportedEncodingException {
		String query = "photo";
		UnsplashResource datos = new UnsplashResource(
				"936584f8c3ad037209479a3b66eadfb1ac046cf3db77656270e90cfb3ac90553");
		SearchUnsplashPhotos uSearch = datos.getUnsplashImages(query);
		String ac = datos.getAccessToken();
		
		System.out.println(ac);

		assertNotNull("The search returned null", uSearch);
		assertNotNull("The search returned null", uSearch.getResults());
		assertFalse("The number of photos of " + query + " is zero", uSearch.getResults().size() == 0);

//		UnsplashUser user = datos.getUnsplashUserInfo();
//
//		assertNotNull("The search returned null", user);
//		assertNotNull("The search returned null", user.getName());
//
//		System.out.println("Usuario: " + user.getUsername());
//
//		SearchUnsplashPhotos stats = datos.getUnsplashStats();
//
//		assertNotNull("The search returned null", stats);
//		assertNotNull("The search returned null", stats.getResults());
//		assertFalse("The number of user photos is zero", stats.getResults().size() == 0);
//
//		System.out.println("El usuario tiene " + stats.getResults().size() + " fotos");
//		for (UnsplashResult r : stats.getResults()) {
//			System.out.println(r.getId() + "\n");
//		}

		System.out.println("The search for " + query + "'s photos returned " + uSearch.getResults().size() + " files.");

		for (UnsplashResult r : uSearch.getResults()) {
			System.out.println(r.getLinks().getHtml());
		}
	}
}
