package aiss.model.resources;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

import aiss.model.deviantart.DeviantArtUser;
import aiss.model.deviantart.DeviantArtResult;
import aiss.model.deviantart.SearchDeviantArt;
import aiss.model.resource.DeviantArtResource;


public class DeviantArtTest {

	@Test
	public void getPhotosTest() throws UnsupportedEncodingException {
		String query = "photo";
		DeviantArtResource datos = new DeviantArtResource("fae8c9e43dcc9b4ec081f54e5d4539bf8c264920b0708c6440");
		SearchDeviantArt daSearch = datos.getDeviantArtImages(query);

		assertNotNull("The search returned null", daSearch);
		assertNotNull("The search returned null", daSearch.getResults());
		assertFalse("The number of photos of " + query + " is zero", daSearch.getResults().size() == 0);
		
		DeviantArtUser user = datos.getDeviantArtUserInfo();
		
		assertNotNull("The search returned null", user);
		assertNotNull("The search returned null", user.getUser());
		
		System.out.println("Usuario: " + user.getUser().getUsername());
		
		SearchDeviantArt stats = datos.getDeviantArtStats();
		
		assertNotNull("The search returned null", stats);
		assertNotNull("The search returned null", stats.getResults());
		assertFalse("The number of user photos is zero", stats.getResults().size() == 0);
		
		System.out.println("El usuario tiene " + stats.getResults().size() + " fotos");
		for(DeviantArtResult r : stats.getResults()) {
			System.out.println(r.getTitle() + "\n");
		}

		System.out.println(
		"The search for " + query + "'s photos returned " + daSearch.getResults().size()
		+ " files.");
		
		for(DeviantArtResult r : daSearch.getResults()) {
			System.out.println(r.getUrl());
		}
	}
}
