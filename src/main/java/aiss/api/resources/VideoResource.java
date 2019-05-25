package aiss.api.resources;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import org.jboss.resteasy.spi.BadRequestException;

import aiss.model.Image;
import aiss.model.ListItems;
import aiss.model.Video;
import aiss.model.repository.MapVideoRepository;
import aiss.model.repository.VideoRepository;
import javassist.NotFoundException;

@Path("/videos")
public class VideoResource {
	public static VideoResource instance = null;
	VideoRepository videoRepository;

	private VideoResource() {
		videoRepository = MapVideoRepository.getInstance();
	}

	public static VideoResource getInstance() {
		if (instance == null)
			instance = new VideoResource();
		return instance;
	}

	@GET
	@Path("/allVideos")
	@Produces("application/json")
	public ListItems<Video> getAllVideos(@QueryParam("startIndex") @DefaultValue("0") int startIndex,
			@QueryParam("maxItems") @DefaultValue("5") int maxItems) {
		List<Video> results = new ArrayList<>(videoRepository.getAllVideos());

		maxItems = maxItems <= 10 ? maxItems : 10;
		// Si al sumarle el máximo de items por página al índice inicial supera
		// el número total de items habrá que paginar y se mostrarán maxItems items.
		// Sino, se mostrarán los resultados obtenidos.
		int endIndex = startIndex + maxItems < results.size() ? startIndex + maxItems : results.size();
		// Por cada página se mostrará una sublista de los items.
		ListItems<Video> res = new ListItems<Video>(results.size(), startIndex, maxItems,
				results.subList(startIndex, endIndex));

		return res;
	}

	@GET
	@Path("/video/{query}")
	@Produces("application/json")
	public Collection<Video> getVideosByQuery(@PathParam("query") String query) {
		return videoRepository.getVideosByQuery(query);
	}

	@GET
	@Path("/videoId/{id}")
	@Produces("application/json")
	public Video get(@PathParam("id") String id) throws NotFoundException {
		Video b = videoRepository.getVideo(id);
		if (b == null) {
			throw new NotFoundException("The video with ID = " + id + " was not found");
		}
		return b;
	}

	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Response addVideo(@Context UriInfo uriInfo, Video video) {
		if (video.getId() == null || "".equals(video.getId())) {
			throw new BadRequestException("The id cannot be null");
		}
		videoRepository.addVideo(video);

		UriBuilder ub = uriInfo.getAbsolutePathBuilder().path(this.getClass(), "get");
		URI uri = ub.build(video.getId());
		ResponseBuilder resp = Response.created(uri);
		resp.entity(video);
		return resp.build();
	}

	@PUT
	@Consumes("application/json")
	public Response updateVideo(Video video) throws NotFoundException {
		Video oldVideo = videoRepository.getVideo(video.getId());
		if (oldVideo == null) {
			throw new NotFoundException("The image with ID = " + video.getId() + " was not found");
		}

		if (video.getTitulo() != null) {
			oldVideo.setTitulo(video.getTitulo());
		}

		if (video.getAutor() != null) {
			oldVideo.setAutor(video.getAutor());
		}

		if (video.getId() != null) {
			oldVideo.setId(video.getId());
		}

		return Response.noContent().build();
	}

	@DELETE
	@Path("/videoId/{videoId}")
	public Response removeVideo(@PathParam("videoId") String id) throws NotFoundException {
		Video toberemoved = videoRepository.getVideo(id);
		if (toberemoved == null) {
			throw new NotFoundException("The video with ID = " + id + " was not found");
		} else {
			videoRepository.deleteVideo(id);
		}
		return Response.noContent().build();
	}

}
