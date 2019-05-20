package aiss.api.resources;

import java.util.Collection;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import aiss.model.Multimedia;
import aiss.model.repository.MapMultimediaRepository;
import aiss.model.repository.MultimediaRepository;

@Path("/m")
public class MultimediaResource {
	public static MultimediaResource instance = null;
	MultimediaRepository repository;

	private MultimediaResource() {
		repository = MapMultimediaRepository.getInstance();
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
	public Collection<Multimedia> getAll() {
		return repository.getAll();
	}

	@GET
	@Path("/all/{query}")
	@Produces("application/json")
	public Collection<Multimedia> getAllByQuery(@PathParam("query") String query) {
		return repository.getMultimediaByQuery(query);
	}

}
