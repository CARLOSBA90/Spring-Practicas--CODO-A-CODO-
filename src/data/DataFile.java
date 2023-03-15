package data;

public class DataFile {

	private Long id;
	private String nombre;
	private Double saldo;
	private boolean active;
	private String dni;
	private String nacionalidad;
	private String FileArchivo;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String getFileArchivo() {
		return FileArchivo;
	}
	public void setFileArchivo(String fileArchivo) {
		FileArchivo = fileArchivo;
	}
	
	
}
