package aiss.model.resource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import aiss.model.unsplash.AccessToken;
import aiss.model.unsplash.SearchUnsplashPhotos;
import aiss.model.unsplash.UnsplashUser;

public class UnsplashResource {

	private static final Logger log = Logger.getLogger(UnsplashResource.class.getName());

	private final String access_token;
	private String name;
	private final String uri = "https://api.unsplash.com/";

	public UnsplashResource(String access_token) {
		this.access_token = access_token;
	}

//	public List<SearchUnsplashPhotos> getImages() {
//		log.info(this.access_token);
//		List<SearchUnsplashPhotos> images = new ArrayList<>();
//		ClientResource cr = null;
//
//		try {
//			cr = new ClientResource(uri + "users/" + name + "/photos/" + "?access_token=" + access_token);
//			log.info(uri + "?access_token=" + access_token);
//			SearchUnsplashPhotos[] s = cr.get(SearchUnsplashPhotos[].class);
//			// log.info("--> result" +s[0].getId());
//			if (s.length > 0) {
//				images = Arrays.asList(s);
//			}
//
//		} catch (ResourceException re) {
//			log.warning("Error when retrieving all images: " + cr.getResponse().getStatus());
//		}
//
//		return images;
//	}

	public SearchUnsplashPhotos getUnsplashImages(String query) throws UnsupportedEncodingException {

		// Poner parámetro de entrada en formato correcto
		String search = URLEncoder.encode(query, "UTF-8");

		// Crear la URL
		// https://api.unsplash.com/search/photos?page=1&query=nature&per_page=5&access_token=Alph4num3r1ct0k3nv4lu3
		String uri = "https://api.unsplash.com/search/photos?page=1&query=" + search + "&per_page=5&client_id="
				+ "f2bf65c4a4fdb6a286ba98495ef14b36607d81f2305783f0ebe97f0aa28d8cf0";

		log.log(Level.FINE, "Unsplash URI: " + uri);

		// Hacer petición al servicio REST (devuelve objeto JSON)
		ClientResource cr = new ClientResource(uri);

		// Convertir JSON en .Java
		SearchUnsplashPhotos unsplashSearch = cr.get(SearchUnsplashPhotos.class);

		return unsplashSearch;
	}

	public void addPhotoToCollection(String photoId, String collectionId) throws IOException {

		String data = "photo_id=" + photoId;
		System.out.println("data in addPhotoToCollection***" + data);
		System.out.println(access_token);
		// URL obj = new
		// URL("https://api.unsplash.com/collections?access_token="+"ac7494081a0483fcbb270238435de2c60bb413fb34c496443c6e93f46eaeaa40");
		URL obj = new URL("https://api.unsplash.com/collections/" + collectionId + "/add?access_token=" + access_token);
		HttpURLConnection postConnection = (HttpURLConnection) obj.openConnection();

		postConnection.setRequestMethod("POST");

		postConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

		// postConnection.setRequestProperty("title", "adefgh");
//       postConnection.setRequestProperty("User-agent", "adefgh");
		postConnection.setDoOutput(true);
		OutputStream os = postConnection.getOutputStream();
		OutputStreamWriter wr = new OutputStreamWriter(os);
		wr.write(data);
		wr.flush();
		wr.close();
		int responseCode = postConnection.getResponseCode();
		System.out.println("POST Response Code :  " + responseCode);
		System.out.println("POST Response Message : " + postConnection.getResponseMessage());

		if (responseCode == HttpURLConnection.HTTP_CREATED) { // success
			BufferedReader in = new BufferedReader(new InputStreamReader(postConnection.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			// print result
			System.out.println(response.toString());
		} else {
			System.out.println("POST NOT WORKED");
		}
	}

	public SearchUnsplashPhotos getUnsplashStats() throws UnsupportedEncodingException {

		// Crear la URL GET https://api.unsplash.com/stats/total

		String uri = "https://api.unsplash.com/stats/total?access_token=" + access_token;

		log.log(Level.FINE, "Unsplash URI: " + uri);
		log.log(Level.FINE, "Access Token: " + getAccessToken());

		// Hacer petición al servicio REST (devuelve objeto JSON)
		ClientResource cr = new ClientResource(uri);

		// Convertir JSON en .Java
		SearchUnsplashPhotos unsplashSearch = cr.get(SearchUnsplashPhotos.class);

		return unsplashSearch;
	}

	public UnsplashUser getUnsplashUserInfo() throws UnsupportedEncodingException {

		// Crear la URL GET GET https://api.unsplash.com/me

		String uri = "https://api.unsplash.com/me?access_token=" + access_token;
		log.log(Level.FINE, "Unsplash URI: " + uri);

		// Hacer petición al servicio REST (devuelve objeto JSON)
		ClientResource cr = new ClientResource(uri);

		// Convertir JSON en .Java
		UnsplashUser unsplashUserInfo = cr.get(UnsplashUser.class);

		return unsplashUserInfo;
	}

	public String getAccessToken() throws UnsupportedEncodingException {

		String url = "https://unsplash.com/oauth/token?client_id=f2bf65c4a4fdb6a286ba98495ef14b36607d81f2305783f0ebe97f0aa28d8cf0&"
				+ "client_secret=0fc50688e19388e6f6ca71c849676e7d52fb7c4b663cb25d43cfe2487954f4a1&redirect_uri=urn:ietf:wg:oauth:2.0:oob&code="
				+ access_token + "&grant_type=authorization_code";
		log.log(Level.FINE, "El access viene de :" + url);

		String result = "";
		ClientResource cr = null;

		try {
			cr = new ClientResource(url);
			cr.setEntityBuffering(true);
			result = cr.post("", AccessToken.class).getAccessToken();

		} catch (ResourceException re) {
			// ToDo: print useful log information before returning
			log.warning("Error when creatin a Access Token: " + cr.getResponse().getStatus());
		}
		return result;
	}

	public void POSTRequest(String title) throws IOException {
		// final String POST_PARAMS = "{\n" + "\"title2000\": 101,\"" + "\n}";
		String data = "title=" + title + "&private=true";
//        System.out.println(data);
		System.out.println(access_token);
		// URL obj = new
		// URL("https://api.unsplash.com/collections?access_token="+"ac7494081a0483fcbb270238435de2c60bb413fb34c496443c6e93f46eaeaa40");
		URL obj = new URL("https://api.unsplash.com/collections?access_token=" + access_token);
		HttpURLConnection postConnection = (HttpURLConnection) obj.openConnection();

		postConnection.setRequestMethod("POST");

		postConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

		// postConnection.setRequestProperty("title", "adefgh");
		// postConnection.setRequestProperty("User-agent", "adefgh");
		postConnection.setDoOutput(true);
		OutputStream os = postConnection.getOutputStream();
		OutputStreamWriter wr = new OutputStreamWriter(os);
		wr.write(data);
		wr.flush();
		wr.close();
		int responseCode = postConnection.getResponseCode();
		System.out.println("POST Response Code :  " + responseCode);
		System.out.println("POST Response Message : " + postConnection.getResponseMessage());

		if (responseCode == HttpURLConnection.HTTP_CREATED) { // success
			BufferedReader in = new BufferedReader(new InputStreamReader(postConnection.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			// print result
			System.out.println(response.toString());
		} else {
			System.out.println("POST NOT WORKED");
		}
	}

}
