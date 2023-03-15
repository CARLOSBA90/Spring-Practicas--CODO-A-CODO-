package modelo;

public class Articulo {

   public Articulo() {
		super();
	}

public Articulo(long id, String titulo, double duracion, String autor, String path_imagen) {
		super();
		this.id = (int) id;
		this.titulo = titulo;
		this.duracion = duracion;
		this.autor = autor;
		this.path_imagen = path_imagen;
	}
   


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Double getDuracion() {
		return duracion;
	}
	public void setDuracion(Double duracion) {
		this.duracion = duracion;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getPath_imagen() {
		return path_imagen;
	}
	public void setPath_imagen(String path_imagen) {
		this.path_imagen = path_imagen;
	}
private Integer id;
   private String titulo;
   private Double duracion;
   private String autor;
   private String path_imagen;
}
