package aiss.api.resources;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import org.jboss.resteasy.spi.BadRequestException;

import aiss.model.Image;
import aiss.model.ListItems;
import aiss.model.Multimedia;
import aiss.model.Video;
import aiss.model.repository.MapMultimediaRepository;
import aiss.model.repository.MultimediaRepository;
import javassist.NotFoundException;

@Path("/m")
public class MultimediaResource {
	public static MultimediaResource instance = null;
	MultimediaRepository multiRepository;

	private MultimediaResource() {
		multiRepository = MapMultimediaRepository.getInstance();
	}

	public static MultimediaResource getInstance() {
		if (instance == null) {
			instance = new MultimediaResource();
		}
		return instance;
	}

	@GET
	@Path("/all")
	@Produces("application/json")
	public ListItems<Multimedia> getAll() {
		List<Multimedia> results = new ArrayList<>(multiRepository.getAll());
		ListItems<Multimedia> res = new ListItems<Multimedia>(results.size(), results);

		return res;
	}

	@GET
	@Path("/all/query/{query}")
	@Produces("application/json")
	public Collection<Multimedia> getAllByQuery(@PathParam("query") String query) {
		return multiRepository.getMultimediaByQuery(query);
	}
	
	@GET
	@Path("/all/author/{author}")
	@Produces("application/json")
	public Collection<Multimedia> getAllByAuthor(@PathParam("author") String author) {
		return multiRepository.getMultimediaAutor(author);
	}

	@GET
	@Path("/images")
	@Produces("application/json")
	public ListItems<Image> getAllImages() {
		List<Image> results = new ArrayList<>(multiRepository.getAllImages());
		ListItems<Image> res = new ListItems<Image>(results.size(), results);

		return res;
	}

	@GET
	@Path("/images/page/{page}")
	@Produces("application/json")
	public ListItems<Image> getImagesByPage(@PathParam("page") int page) {
		List<Image> results = new ArrayList<>(multiRepository.getAllImages());
		int limit = 5;

		if (page * limit > results.size()) {
			page = 1;
		} else if (page < 0) {
			page = 0;
		}

		// Si al sumarle el máximo de items por página al índice inicial supera
		// el número total de items habrá que paginar y se mostrarán maxItems items.
		// Sino, se mostrarán los resultados obtenidos.
		Integer endIndex = page * limit + limit < results.size() ? page * limit + limit : results.size();
		// Por cada página se mostrará una sublista de los items.
		ListItems<Image> res = new ListItems<Image>(results.size(), page, limit,
				results.subList(page * limit, endIndex));

		return res;
	}

	@GET
	@Path("/images/query/{query}")
	@Produces("application/json")
	public Collection<Image> getImagesByQuery(@PathParam("query") String query) {
		return multiRepository.getImagesByQuery(query);
	}

	@GET
	@Path("/images/author/{author}")
	@Produces("application/json")
	public Collection<Image> getImagesByAuthor(@PathParam("author") String author) {
		return multiRepository.getImagesAutor(author);
	}

	@GET
	@Path("/images/id/{id}")
	@Produces("application/json")
	public Image getImageById(@PathParam("id") String id) throws NotFoundException {
		Image b = multiRepository.getImage(id);
		if (b == null) {
			throw new NotFoundException("The image with ID = " + id + " was not found");
		}
		return b;
	}

	@POST
	@Path("/addImage")
	@Consumes("application/json")
	@Produces("application/json")
	public Response addImage(@Context UriInfo uriInfo, Image image) {
		if (image.getId() == null || "".equals(image.getId())) {
			throw new BadRequestException("The id cannot be null");
		}
		boolean exc = false;
		for (Image m : multiRepository.getAllImages()) {
			if (m.getId().equals(image.getId())) {
				exc = true;
				break;
			}
		}
		if (exc == true) {
			throw new IllegalArgumentException("La ID que intenta introducir ya está en uso.");
		} else {
			multiRepository.addImage(image);
		}

		UriBuilder ub = uriInfo.getAbsolutePathBuilder().path(this.getClass(), "get");
		URI uri = ub.build(image.getId());
		ResponseBuilder resp = Response.created(uri);
		resp.entity(image);
		return resp.build();
	}

	@PUT
	@Path("/updateImage")
	@Consumes("application/json")
	public Response updateImage(Image image) throws NotFoundException {
		Image oldImage = multiRepository.getImage(image.getId());
		if (oldImage == null) {
			throw new NotFoundException("The image with ID = " + image.getId() + " was not found");
		}

		if (image.getTitulo() != null) {
			oldImage.setTitulo(image.getTitulo());
		}

		if (image.getAutor() != null) {
			oldImage.setAutor(image.getAutor());
		}

		if (image.getId() != null) {
			oldImage.setId(image.getId());
		}

		return Response.noContent().build();
	}

	@DELETE
	@Path("/deleteImage/{imageId}")
	public Response removeImage(@PathParam("imageId") String id) throws NotFoundException {
		Image toberemoved = multiRepository.getImage(id);
		if (toberemoved == null) {
			throw new NotFoundException("The image with ID = " + id + " was not found");
		} else {
			multiRepository.deleteImage(id);
		}
		return Response.noContent().build();
	}

	@GET
	@Path("/videos")
	@Produces("application/json")
	public ListItems<Video> getAllVideos() {
		List<Video> results = new ArrayList<>(multiRepository.getAllVideos());
		ListItems<Video> res = new ListItems<Video>(results.size(), results);

		return res;
	}

	@GET
	@Path("/videos/page/{page}")
	@Produces("application/json")
	public ListItems<Video> getVideosByPage(@PathParam("page") int page) {
		List<Video> results = new ArrayList<>(multiRepository.getAllVideos());
		int limit = 5;
		
		if (page * limit > results.size()) {
			page = 1;
		} else if (page < 0) {
			page = 0;
		}
		
		// Si al sumarle el máximo de items por página al índice inicial supera
		// el número total de items habrá que paginar y se mostrarán maxItems items.
		// Sino, se mostrarán los resultados obtenidos.
		Integer endIndex = page * limit + limit < results.size() ? page * limit + limit : results.size();
		// Por cada página se mostrará una sublista de los items.
		ListItems<Video> res = new ListItems<Video>(results.size(), page, limit,
				results.subList(page * limit, endIndex));

		return res;
	}

	@GET
	@Path("/videos/query/{query}")
	@Produces("application/json")
	public Collection<Video> getVideosByQuery(@PathParam("query") String query) {
		return multiRepository.getVideosByQuery(query);
	}

	@GET
	@Path("/videos/author/{author}")
	@Produces("application/json")
	public Collection<Video> getVideosByAuthor(@PathParam("author") String author) {
		return multiRepository.getVideosAutor(author);
	}

	@GET
	@Path("/videos/id/{id}")
	@Produces("application/json")
	public Video getVideoById(@PathParam("id") String id) throws NotFoundException {
		Video b = multiRepository.getVideo(id);
		if (b == null) {
			throw new NotFoundException("The video with ID = " + id + " was not found");
		}
		return b;
	}

	@POST
	@Path("/addVideo")
	@Consumes("application/json")
	@Produces("application/json")
	public Response addVideo(@Context UriInfo uriInfo, Video video) {
		if (video.getId() == null || "".equals(video.getId())) {
			throw new BadRequestException("The id cannot be null");
		}

		boolean exc = false;
		for (Video v : multiRepository.getAllVideos()) {
			if (v.getId().equals(video.getId())) {
				exc = true;
				break;
			}
		}
		if (exc == true) {
			throw new IllegalArgumentException("La ID que intenta introducir ya está en uso.");
		} else {
			multiRepository.addVideo(video);
		}

		UriBuilder ub = uriInfo.getAbsolutePathBuilder().path(this.getClass(), "get");
		URI uri = ub.build(video.getId());
		ResponseBuilder resp = Response.created(uri);
		resp.entity(video);
		return resp.build();
	}

	@PUT
	@Path("/updateVideo")
	@Consumes("application/json")
	public Response updateVideo(Video video) throws NotFoundException {
		Video oldVideo = multiRepository.getVideo(video.getId());
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
	@Path("/deleteVideo/{videoId}")
	public Response removeVideo(@PathParam("videoId") String id) throws NotFoundException {
		Video toberemoved = multiRepository.getVideo(id);
		if (toberemoved == null) {
			throw new NotFoundException("The video with ID = " + id + " was not found");
		} else {
			multiRepository.deleteVideo(id);
		}
		return Response.noContent().build();
	}

}
