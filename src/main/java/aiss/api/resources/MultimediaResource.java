package aiss.api.resources;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import aiss.model.Image;
import aiss.model.ListItems;
import aiss.model.Multimedia;
import aiss.model.repository.MapMultimediaRepository;
import aiss.model.repository.MultimediaRepository;

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
	public ListItems<Multimedia> getAll(@QueryParam("startIndex") @DefaultValue("0") int startIndex,
			@QueryParam("maxItems") @DefaultValue("5") int maxItems) {
		List<Multimedia> results = new ArrayList<>(multiRepository.getAll());

		maxItems = maxItems <= 10 ? maxItems : 10;
		// Si al sumarle el máximo de items por página al índice inicial supera
		// el número total de items habrá que paginar y se mostrarán maxItems items.
		// Sino, se mostrarán los resultados obtenidos.
		int endIndex = startIndex + maxItems < results.size() ? startIndex + maxItems : results.size();
		// Por cada página se mostrará una sublista de los items.
		ListItems<Multimedia> res = new ListItems<Multimedia>(results.size(), startIndex, maxItems,
				results.subList(startIndex, endIndex));

		return res;
	}

	@GET
	@Path("/all/{query}")
	@Produces("application/json")
	public Collection<Multimedia> getAllByQuery(@PathParam("query") String query) {
		return multiRepository.getMultimediaByQuery(query);
	}

}
