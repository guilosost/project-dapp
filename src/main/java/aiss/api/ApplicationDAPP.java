package aiss.api;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import aiss.api.resources.ImageResource;
import aiss.api.resources.MultimediaResource;
import aiss.api.resources.VideoResource;

public class ApplicationDAPP extends Application {
	private Set<Object> singletons = new HashSet<Object>();
	private Set<Class<?>> classes = new HashSet<Class<?>>();

	// Loads all resources that are implemented in the application
	// so that they can be found by RESTEasy
	public ApplicationDAPP() {
//		singletons.add(ImageResource.getInstance());
//		singletons.add(VideoResource.getInstance());
		singletons.add(MultimediaResource.getInstance());
	}

	public Set<Object> getSingletons() {
		return singletons;
	}

	public Set<Class<?>> getClasses() {
		return classes;
	}

}
