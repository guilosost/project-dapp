package aiss.model;

public class Image {

	private String id;
	private String url;
	private String titulo;
	private String autor;
	private String fechaPub;

	public Image() {

	}

	public Image(String id, String titulo, String autor) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
	}

	public Image(String id, String url, String titulo, String autor, String fechaPub) {
		super();
		this.id = id;
		this.url = url;
		this.titulo = titulo;
		this.autor = autor;
		this.fechaPub = fechaPub;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
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

	public String getFechaPub() {
		return fechaPub;
	}

	public void setFechaPub(String fechaPub) {
		this.fechaPub = fechaPub;
	}

}
