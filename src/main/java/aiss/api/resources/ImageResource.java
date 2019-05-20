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
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import org.jboss.resteasy.spi.BadRequestException;

import aiss.model.Image;
import aiss.model.repository.ImageRepository;
import aiss.model.repository.MapImageRepository;
import aiss.model.repository.VideoRepository;
import javassist.NotFoundException;

@Path("/images")
public class ImageResource {
	public static ImageResource instance = null;
	ImageRepository imageRepository;
	VideoRepository videoRepository;

	private ImageResource() {
		imageRepository = MapImageRepository.getInstance();
	}

	public static ImageResource getInstance() {
		if (instance == null)
			instance = new ImageResource();
		return instance;
	}

	@GET
	@Path("/allImages")
	@Produces("application/json")
	public Collection<Image> getAllImages() {
		return imageRepository.getAllImages();
	}

	@GET
	@Path("/image/{query}")
	@Produces("application/json")
	public Collection<Image> getImagesByQuery(@PathParam("query") String query) {
		return imageRepository.getImagesByQuery(query);
	}

	@GET
	@Path("/imageId/{id}")
	@Produces("application/json")
	public Image get(@PathParam("id") String id) throws NotFoundException {
		Image b = imageRepository.getImage(id);
		if (b == null) {
			throw new NotFoundException("The image with ID = " + id + " was not found");
		}
		return b;
	}

	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Response addImage(@Context UriInfo uriInfo, Image image) {
		if (image.getId() == null || "".equals(image.getId())) {
			throw new BadRequestException("The id cannot be null");
		}
		imageRepository.addImage(image);

		UriBuilder ub = uriInfo.getAbsolutePathBuilder().path(this.getClass(), "get");
		URI uri = ub.build(image.getId());
		ResponseBuilder resp = Response.created(uri);
		resp.entity(image);
		return resp.build();
	}

	@PUT
	@Consumes("application/json")
	public Response updateImage(Image image) throws NotFoundException {
		Image oldImage = imageRepository.getImage(image.getId());
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
	@Path("/imageId/{imageId}")
	public Response removeImage(@PathParam("imageId") String id) throws NotFoundException {
		Image toberemoved = imageRepository.getImage(id);
		if (toberemoved == null) {
			throw new NotFoundException("The image with ID = " + id + " was not found");
		} else {
			imageRepository.deleteImage(id);
		}
		return Response.noContent().build();
	}

}
