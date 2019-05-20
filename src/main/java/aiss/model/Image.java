package aiss.model;

import javax.ws.rs.Path;


public class Image {

	private String id;
	private String titulo;
	private String autor;

	public Image() {

	}

	public Image(String id, String titulo, String autor) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

}
