package aiss.model.resources;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

import aiss.model.deviantart.DeviantArtUser;
import aiss.model.deviantart.GetFolderByID;
import aiss.model.deviantart.DeviantArtResult;
import aiss.model.deviantart.SearchDeviantArt;
import aiss.model.resource.DeviantArtResource;


public class DeviantArtTest {

	@Test
	public void getPhotosTest() throws UnsupportedEncodingException {
		String query = "photo";
		DeviantArtResource datos = new DeviantArtResource("8f2f3bb692b95cbc922e09c1ed032a238feb9f1b8c954af9a6");
		
		//Search
		SearchDeviantArt daSearch = datos.getDeviantArtImages(query);
		
		assertNotNull("The search returned null", daSearch);
		assertNotNull("The search returned null", daSearch.getResults());
		assertFalse("The number of photos of " + query + " is zero", daSearch.getResults().size() == 0);
		
		System.out.println(
		"The search for " + query + "'s photos returned " + daSearch.getResults().size()
		+ " files.");
		
		for(DeviantArtResult r : daSearch.getResults()) {
			System.out.println(r.getUrl());
		}
		
		//User
		DeviantArtUser user = datos.getDeviantArtUserInfo();
		
		assertNotNull("The search returned null", user);
		assertNotNull("The search returned null", user.getUser());
		
		System.out.println("Usuario: " + user.getUser().getUsername());
		System.out.println(user.getUser().getUsericon());
		
		//Stats
		SearchDeviantArt stats = datos.getDeviantArtStats();
		
		assertNotNull("The search returned null", stats);
		assertNotNull("The search returned null", stats.getResults());
		assertFalse("The number of user photos is zero", stats.getResults().size() == 0);
		
		System.out.println("El usuario tiene " + stats.getResults().size() + " fotos");
		for(DeviantArtResult r : stats.getResults()) {
			System.out.println(r.getTitle() + "\n");
		}
		
		//Favs
		GetFolderByID folder = datos.getDeviantArtFavs();
		assertNotNull("The search returned null", folder);
		assertNotNull("The search returned null", folder.getResults());
		assertFalse("The number of user photos is zero", folder.getResults().size() == 0);
		
		for(DeviantArtResult r : folder.getResults()) {
			System.out.println(r.getDeviationid());
		}
		
	}
}
