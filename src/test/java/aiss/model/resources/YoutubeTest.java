//package aiss.model.resources;
//
//import java.io.UnsupportedEncodingException;
//import java.util.List;
//
//import org.junit.Test;
//
//import aiss.model.resource.YoutubeResource;
//import aiss.model.youtube.GetUserVideos;
//import aiss.model.youtube.GetUserVideosItem;
//import aiss.model.youtube.StatisticsItem;
//import aiss.model.youtube.UserStatistics;
//
//public class YoutubeTest {
//	@Test
//	public void getYoutubeTest() throws UnsupportedEncodingException {
//		YoutubeResource datos = new YoutubeResource(
//				"ya29.GlsQBxElWFT6I5A-qWTjnsAOOvFWVC0J5qlac-wSc4n9OEc5ioWaS4nvSUUsDU1GMOeZkvad5_Nwi0oTVKzB6Opr0bVGb9dnV_MChng2XkVxEsSO-S58rQrwABpb");
//
//		// Search
////		String query = "star wars";
////		YoutubeSearch youtubeSearch = datos.searchYoutubeVideos(query, "");
////		assertNotNull("The search returned null", youtubeSearch);
////		assertNotNull("The search returned null", youtubeSearch.getVideoItems());
////		assertFalse("The number of videos of " + query + " is zero", youtubeSearch.getVideoItems().size() == 0);
////
////		System.out.println(
////				"The search for " + query + "'s videos returned " + youtubeSearch.getVideoItems().size() + " datas.");
////
////		for (VideoItem l : youtubeSearch.getVideoItems()) {
////			System.out.println(l.getVideoSnippet().getTitle());
////		}
////
////		// Liked videos
////		YoutubeRatedVideoGet likedVideos = datos.getLikedVideos();
////		assertNotNull("The search returned null", likedVideos);
////		assertNotNull("The search returned null", likedVideos.getItems());
////
////		System.out.println("The search for liked Youtube videos returned " + likedVideos.getItems().size() + " datas.");
////		int i = 0;
////		for (RaitingItem l : likedVideos.getItems()) {
////			System.out.println(l.getSnippet().getTitle());
////			i++;
////			if (i > 5) {
////				break;
////			}
////		}
////
////		// Disliked videos
////		YoutubeRatedVideoGet dislikedVideos = datos.getDislikedVideos();
////		assertNotNull("The search returned null", dislikedVideos);
////		assertNotNull("The search returned null", dislikedVideos.getItems());
////
////		System.out.println(
////				"The search for disliked Youtube videos returned " + dislikedVideos.getItems().size() + " datas.");
////		i = 0;
////		for (RaitingItem l : dislikedVideos.getItems()) {
////			System.out.println(l.getSnippet().getTitle());
////			i++;
////			if (i > 5) {
////				break;
////			}
////		}
////
////		// Own Videos
////		GetUserVideos userVideos = datos.getOwnYoutubeVideos();
////		assertNotNull("The search returned null", userVideos);
////		assertNotNull("The search returned null", userVideos.getItems());
////
////		System.out.println("This user have " + userVideos.getItems().size() + " videos uploaded");
////
////		for (GetUserVideosItem vi : userVideos.getItems()) {
////			System.out.println(vi.getSnippet().getTitle());
////		}
////
////		// Viewest Video
////		GetUserVideosItem viewestVideo = datos.getMostViewedVideo();
////		assertNotNull("The search returned null", viewestVideo);
////		System.out.println("Vídeo más visto: " + viewestVideo.getSnippet().getTitle());
//
//		// Stats
//		GetUserVideos youtubeVideos = datos.getOwnYoutubeVideos();
//		UserStatistics youtubeStatistics = datos.getUserStatistics();
//
//		List<String> stats = datos.getStats();
//		String youtubeUsername = stats.get(0);
//		String youtubeSubscribers = stats.get(6);
//		String youtubeLikes = stats.get(2);
//		String youtubeDislikes = stats.get(3);
//		String youtubeComments = stats.get(4);
//		String youtubeViews = stats.get(5);
//		System.out.println("Username: " + youtubeUsername);
//		System.out.println("Subs: " + youtubeSubscribers);
//		System.out.println("Likes: " + youtubeLikes);
//		System.out.println("Dislikes: " + youtubeDislikes);
//		System.out.println("Comments: " + youtubeComments);
//		System.out.println("Views: " + youtubeViews);
//
//		// Sacando mejor vídeo
//		Integer viewsBestVideo = 0, resultViews = 0;
//		StatisticsItem youtubeMostViewed = youtubeStatistics.getItems().get(0);
//		for (StatisticsItem mv : youtubeStatistics.getItems()) {
//			viewsBestVideo = Integer.valueOf(mv.getStatistics().getViewCount());
//			resultViews = Integer.valueOf(youtubeMostViewed.getStatistics().getViewCount());
//
//			if (viewsBestVideo > resultViews) {
//				youtubeMostViewed = mv;
//			}
//		}
//
//		String youtubeMostViewedTitle = "";
//		for (GetUserVideosItem gi : youtubeVideos.getItems()) {
//			if (youtubeMostViewed.getId().equals(gi.getId().getVideoId())) {
//				youtubeMostViewedTitle = gi.getSnippet().getTitle();
//			}
//		}
//		
//		System.out.println("Vídeo más visto: " + youtubeMostViewedTitle);
//		System.out.println("ID: " + youtubeMostViewed.getId());
//	}
//
//}
