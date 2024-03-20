package proyecto.yollicalli.model;

public class Usuario {

	private String nombre;
	private String email;
	private String telefono;
	private String contrasena;
	private int id;
	private static int total=0;

	public Usuario(String nombre, String email, String telefono, String contrasena) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.telefono = telefono;
		this.contrasena = contrasena;
		Usuario.total++;
		id=Usuario.total;
	}//constructor

	public Usuario() {
		Usuario.total++;
		id=Usuario.total;
	}//constructor vacio

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}//getters and setters

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", email=" + email + ", telefono=" + telefono + ", contrasena=" + contrasena
				+ ", id=" + id + "]";
	}//tostring
}