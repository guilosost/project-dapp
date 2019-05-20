package aiss.model.repository;

import java.util.Collection;

import aiss.model.Multimedia;

public interface MultimediaRepository {

	public Collection<Multimedia> getAll();

	public Collection<Multimedia> getMultimediaByQuery(String query);

	public void addMultimedia(Multimedia m);

	public void init();

}
