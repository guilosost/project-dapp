package aiss.api.resources;

import java.net.URI;
import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.jboss.resteasy.spi.BadRequestException;

import aiss.model.Video;
import aiss.model.repository.MapVideoRepository;
import aiss.model.repository.VideoRepository;
import javassist.NotFoundException;

@Path("/videos")
public class VideoResource {
	public static VideoResource instance = null;
	VideoRepository repository;

	private VideoResource() {
		repository = MapVideoRepository.getInstance();
	}

	public static VideoResource getInstance() {
		if (instance == null)
			instance = new VideoResource();
		return instance;
	}

	@GET
	@Path("/allVideos")
	@Produces("application/json")
	public Collection<Video> getAllVideos() {
		return repository.getAllVideos();
	}

	@GET
	@Path("/video/{query}")
	@Produces("application/json")
	public Collection<Video> getVideosByQuery(@PathParam("query") String query) {
		return repository.getVideosByQuery(query);
	}

	@GET
	@Path("/videoId/{id}")
	@Produces("application/json")
	public Video get(@PathParam("id") String id) throws NotFoundException {
		Video b = repository.getVideo(id);
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
		repository.addVideo(video);

		UriBuilder ub = uriInfo.getAbsolutePathBuilder().path(this.getClass(), "get");
		URI uri = ub.build(video.getId());
		ResponseBuilder resp = Response.created(uri);
		resp.entity(video);
		return resp.build();
	}

	@PUT
	@Consumes("application/json")
	public Response updateVideo(Video video) throws NotFoundException {
		Video oldVideo = repository.getVideo(video.getId());
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
		Video toberemoved = repository.getVideo(id);
		if (toberemoved == null) {
			throw new NotFoundException("The video with ID = " + id + " was not found");
		} else {
			repository.deleteVideo(id);
		}
		return Response.noContent().build();
	}

}
