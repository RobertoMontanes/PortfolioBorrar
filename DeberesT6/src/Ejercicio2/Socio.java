package Ejercicio2;

public class Socio {
	private String nombre;
	private String dni;
	private String direccion;
	private String telefono;

	public Socio(String nombre, String dni, String direccion, String telefono) {
		this.nombre = nombre;
		this.dni = dni;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Socio{" + "nombre='" + nombre + '\'' + ", dni='" + dni + '\'' + ", direccion='" + direccion + '\''
				+ ", telefono='" + telefono + '\'' + '}';
	}
}
