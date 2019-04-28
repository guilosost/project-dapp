package aiss.model.resources;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

import aiss.model.imgur.Datum;
import aiss.model.imgur.Image;
import aiss.model.imgur.ImgurGallerySearch;
import aiss.model.resource.ImgurResource;

public class ImgurTest {
	@Test
	public void getPhotosTest() throws UnsupportedEncodingException {
		String query = "star_wars";
		ImgurResource datos = new ImgurResource("");
		ImgurGallerySearch iSearch = datos.getImgurGallery(query);

		assertNotNull("The search returned null", iSearch);
		assertNotNull("The search returned null", iSearch.getData());
		assertFalse("The number of photos of " + query + " is zero", iSearch.getData().size() == 0);

		System.out.println("The search for " + query + "'s photos returned " + iSearch.getData().size() + " datas.");

		for (Datum r : iSearch.getData()) {
			for(Image i : r.getImages()) {
				System.out.println(i.getLink());
			}
		}
	}

}
