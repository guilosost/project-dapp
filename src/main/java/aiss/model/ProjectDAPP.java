package aiss.model;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import aiss.api.resources.ImageResource;
import aiss.api.resources.VideoResource;

public class ProjectDAPP extends Application {
	private Set<Object> singletons = new HashSet<Object>();
	private Set<Class<?>> classes = new HashSet<Class<?>>();

	// Loads all resources that are implemented in the application
	// so that they can be found by RESTEasy
	public ProjectDAPP() {
		singletons.add(ImageResource.getInstance());
		singletons.add(VideoResource.getInstance());
	}

	public Set<Object> getSingletons() {
		return singletons;
	}

	public Set<Class<?>> getClasses() {
		return classes;
	}

}
