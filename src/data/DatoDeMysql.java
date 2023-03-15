package data;

public class DatoDeMysql {
	
	private Long id;
	private String nombre;
	private Double saldo;
	private boolean active;
	private String dni;
	private String nacionalidad;
	
	
	public DatoDeMysql(Long id, String nombre, Double saldo, boolean active, String dni, String nacionalidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.saldo = saldo;
		this.active = active;
		this.dni = dni;
		this.nacionalidad = nacionalidad;
	}
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
	
	

}
