//package aiss.model.resources;
//
//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertNotNull;
//
//import java.io.UnsupportedEncodingException;
//
//import org.junit.Test;
//
//import aiss.model.deviantart.DeviantArtResult;
//import aiss.model.deviantart.DeviantArtUser;
//import aiss.model.deviantart.GetFolderByID;
//import aiss.model.deviantart.SearchDeviantArt;
//import aiss.model.resource.DeviantArtResource;
//
//
//public class DeviantArtTest {
//
//	@Test
//	public void getPhotosTest() throws UnsupportedEncodingException {
//		String query = "photo";
//		DeviantArtResource datos = new DeviantArtResource("2a1958a4c31c6adf807f7f5baf6c0ecbe21e7b979eda603265");
//		
//		//Search
//		SearchDeviantArt daSearch = datos.getDeviantArtImages(query, 0);
//		
//		assertNotNull("The search returned null", daSearch);
//		assertNotNull("The search returned null", daSearch.getResults());
//		assertFalse("The number of photos of " + query + " is zero", daSearch.getResults().size() == 0);
//		
//		System.out.println(
//		"The search for " + query + "'s photos returned " + daSearch.getResults().size()
//		+ " files.");
//		
//		for(DeviantArtResult r : daSearch.getResults()) {
//			System.out.println(r.getTitle());
//		}
//		
//		//User
//		DeviantArtUser user = datos.getDeviantArtUserInfo();
//		
//		assertNotNull("The search returned null", user);
//		assertNotNull("The search returned null", user.getUser());
//		
//		System.out.println("Usuario: " + user.getUser().getUsername());
//		
//		//Stats
//		SearchDeviantArt stats = datos.getDeviantArtStats();
//		
//		assertNotNull("The search returned null", stats);
//		assertNotNull("The search returned null", stats.getResults());
//		assertFalse("The number of user photos is zero", stats.getResults().size() == 0);
//		
//		System.out.println("El usuario tiene " + stats.getResults().size() + " fotos:");
//		for(DeviantArtResult r : stats.getResults()) {
//			System.out.println(r.getTitle());
//		}
//		
//		//Favs
//		GetFolderByID folder = datos.getDeviantArtFavs();
//		assertNotNull("The search returned null", folder);
//		assertNotNull("The search returned null", folder.getResults());
//		assertFalse("The number of user fav photos is zero", folder.getResults().size() == 0);
//		
//		System.out.println("Imágenes favoritas:");
//		for(DeviantArtResult r : folder.getResults()) {
//			System.out.println(r.getDeviationid());
//		}
//		
//	}
//}
