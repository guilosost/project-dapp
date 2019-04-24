package aiss.model.resource;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.resource.ClientResource;

import aiss.model.unsplash.SearchUnsplashPhotos;
import aiss.model.unsplash.UnsplashUser;

public class UnsplashResource {

	private static final Logger log = Logger.getLogger(UnsplashResource.class.getName());

	private final String access_token;

	public UnsplashResource(String access_token) {
		this.access_token = access_token;
	}

	public SearchUnsplashPhotos getUnsplashImages(String query) throws UnsupportedEncodingException {

		// Poner parámetro de entrada en formato correcto
		String search = URLEncoder.encode(query, "UTF-8");

		// Crear la URL
		// https://api.unsplash.com/search/photos?page=1&query=nature&per_page=5&access_token=Alph4num3r1ct0k3nv4lu3
		String uri = "https://api.unsplash.com/search/photos?page=1&query=" + search + "&per_page=5&access_token="
				+ "6cf067d06b0f174422f76814feec4e3782e756bd41a9460a42b2d0383035fa08";

		log.log(Level.FINE, "Unsplash URI: " + uri);

		// Hacer petición al servicio REST (devuelve objeto JSON)
		ClientResource cr = new ClientResource(uri);

		// Convertir JSON en .Java
		SearchUnsplashPhotos unsplashSearch = cr.get(SearchUnsplashPhotos.class);

		return unsplashSearch;
	}

	public SearchUnsplashPhotos getUnsplashStats() throws UnsupportedEncodingException {

		// Crear la URL GET https://api.unsplash.com/stats/total

		String uri = "https://api.unsplash.com/stats/total?access_token=" + access_token;

		log.log(Level.FINE, "Unsplash URI: " + uri);

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

	public static String getAccessToken(String code) throws UnsupportedEncodingException {
		String res = "";

		String url = "https://unsplash.com/oauth/token?clientId=f2bf65c4a4fdb6a286ba98495ef14b36607d81f2305783f0ebe97f0aa28d8cf0&"
				+ "client_secret=0fc50688e19388e6f6ca71c849676e7d52fb7c4b663cb25d43cfe2487954f4a1&code=" + code
				+ "&grant_type=authorization_code";

		String urlParameters = "client_id=f2bf65c4a4fdb6a286ba98495ef14b36607d81f2305783f0ebe97f0aa28d8cf0&"
				+ "client_secret=0fc50688e19388e6f6ca71c849676e7d52fb7c4b663cb25d43cfe2487954f4a1&"
				+ "redirect_uri=urn:ietf:wg:oauth:2.0:oob&code=" + code + "grant_type=authorization_code";
		res = excutePost("https://unsplash.com/oauth/token", urlParameters);
		log.log(Level.INFO, "String del POST" + res);
		return res;
	}

	public static String excutePost(String targetURL, String urlParameters) {
		URL url;
		HttpURLConnection connection = null;
		try {
			// Create connection
			url = new URL(targetURL);
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

			connection.setRequestProperty("Content-Length", "" + Integer.toString(urlParameters.getBytes().length));
			connection.setRequestProperty("Content-Language", "en-US");

			connection.setUseCaches(false);
			connection.setDoInput(true);
			connection.setDoOutput(true);

			// Send request
			DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
			wr.writeBytes(urlParameters);
			wr.flush();
			wr.close();

			// Get Response
			InputStream is = connection.getInputStream();
			BufferedReader rd = new BufferedReader(new InputStreamReader(is));
			String line;
			StringBuffer response = new StringBuffer();
			while ((line = rd.readLine()) != null) {
				response.append(line);
				response.append('\r');
			}
			rd.close();
			return response.toString();

		} catch (Exception e) {

			e.printStackTrace();
			return null;

		} finally {

			if (connection != null) {
				connection.disconnect();
			}
		}
	}

}
