package aiss.model.resource;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.resource.ClientResource;

import aiss.model.deviantart.Folder;
import aiss.model.deviantart.DeviantArtUser;
import aiss.model.deviantart.GetFolderByID;
import aiss.model.deviantart.SearchDeviantArt;

public class DeviantArtResource {

	private static final Logger log = Logger.getLogger(DeviantArtResource.class.getName());

	private final String access_token;

	public DeviantArtResource(String access_token) {
		this.access_token = access_token;
	}

	public SearchDeviantArt getDeviantArtImages(String query) throws UnsupportedEncodingException {

		// Poner parámetro de entrada en formato correcto
		String search = URLEncoder.encode(query, "UTF-8");

		// Crear la URL https://www.deviantart.com/api/v1/oauth2/browse/
		// tags?tag=nature&limit=2&access_token=Alph4num3r1ct0k3nv4lu3
		String uri = "https://www.deviantart.com/api/v1/oauth2/browse/tags?tag=" + search + "&limit=5&access_token="
				+ access_token;

		log.log(Level.FINE, "DeviantArt URI: " + uri);

		// Hacer petición al servicio REST (devuelve objeto JSON)
		ClientResource cr = new ClientResource(uri);

		// Convertir JSON en .Java
		SearchDeviantArt deviantArtSearch = cr.get(SearchDeviantArt.class);

		return deviantArtSearch;
	}
	
	public SearchDeviantArt getDeviantArtStats() throws UnsupportedEncodingException {

		// Crear la URL GET https://www.deviantart.com/api/v1/oauth2/gallery/
		// all?username=migyanari&mature_content=false

		String uri = "https://www.deviantart.com/api/v1/oauth2/gallery/all?username=" + getDeviantArtUserInfo().getUser().getUsername()
				+ "&mature_content=false&access_token=" + access_token;

		log.log(Level.FINE, "DeviantArt URI: " + uri);

		// Hacer petición al servicio REST (devuelve objeto JSON)
		ClientResource cr = new ClientResource(uri);

		// Convertir JSON en .Java
		SearchDeviantArt deviantArtSearch = cr.get(SearchDeviantArt.class);

		return deviantArtSearch;
	}
	
	public GetFolderByID getDeviantArtFavs() throws UnsupportedEncodingException {

		// Crear la URL https://www.deviantart.com/api/v1/oauth2/collections/09A2E495-5D12-9F8B-D319-F97BAC80E7CC
		// ?username=migyanari&mature_content=false
		
		DeviantArtUser user = getDeviantArtUserInfo();
		log.log(Level.FINE, "Folder: " + user.getFolders().get(0).getName());
		Folder result = user.getFolders().get(0);
		for(Folder f : user.getFolders()) {
			log.log(Level.FINE, "Folder: " + f.getName());
			if(f.getName() == "Featured") {
				result = f;
			}
		}
		String uri = "https://www.deviantart.com/api/v1/oauth2/collections/" + result.getFolderid()
				+ "?username=" + user.getUser().getUsername() + "&mature_content=false&access_token=" + access_token;

		log.log(Level.FINE, "DeviantArt Folder URI: " + uri);

		// Hacer petición al servicio REST (devuelve objeto JSON)
		ClientResource cr = new ClientResource(uri);

		// Convertir JSON en .Java
		GetFolderByID deviantFavFolder = cr.get(GetFolderByID.class);

		return deviantFavFolder;
	}

	public DeviantArtUser getDeviantArtUserInfo() throws UnsupportedEncodingException {

		// Crear la URL GET GET https://www.deviantart.com/api/v1/oauth2/user/profile/
		// ?ext_collections=false&ext_galleries=false&mature_content=true

		String uri = "https://www.deviantart.com/api/v1/oauth2/user/profile/?ext_collections=true&ext_galleries=false&mature_content=false&access_token=" + access_token;
		log.log(Level.FINE, "DeviantArt User URI: " + uri);

		// Hacer petición al servicio REST (devuelve objeto JSON)
		ClientResource cr = new ClientResource(uri);

		// Convertir JSON en .Java
		DeviantArtUser deviantArtUserInfo = cr.get(DeviantArtUser.class);

		return deviantArtUserInfo;
	}
}
